package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import utilities.DBUtils;

import java.sql.SQLException;

public class DBStepDefs {

    @Given("user connects to database")
    public void user_connects_to_database() {
        DBUtils.createConnection(); // using to create connection from the util class
    }
    @Given("user gets the {string} from {string} table")
    public void user_gets_the_from_table(String string, String string2) {
//                      select     *      from tp_customer
        String query = "Select "+string+" from "+string2+"";
        DBUtils.executeQuery(query);
    }
    @And("user reads all of the {string} column data")
    public void userReadsAllOfTheColumnData(String string) throws SQLException {
//        go to the next rwi cause 1st row do not have data, its just a headers
        DBUtils.getResultset().next();
//        we are currently in first row. This will return only first row data. It will return only single object fo return type will be object
        Object columnsData1 = DBUtils.getResultset().getObject(string);
        System.out.println(columnsData1);
        // got to the row2
        DBUtils.getResultset().next();
        Object columnsData2 = DBUtils.getResultset().getObject(string);
        System.out.println(columnsData2);
    }
}
