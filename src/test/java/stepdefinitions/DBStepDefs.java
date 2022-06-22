package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.SQLException;
import java.util.List;

public class DBStepDefs {

    @Given("user connects to database")
    public void user_connects_to_database() {
        DBUtils.createConnection(); // using to create connection from the util class
    }
    @Given("user gets the {string} from {string} table")
    public void user_gets_the_from_table(String column, String table) {
//                      select     *      from tp_customer
        String query = "Select "+column+" from "+table+"";
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

//        Iterate the ssn rows
        while(DBUtils.getResultset().next()){ // keep going to the next line if there is a data in next line
            Object nextColumnData = DBUtils.getResultset().getObject(string);
            System.out.println(nextColumnData);
        }
    }
    @Then("close the database connection")
    public void closeTheDatabaseConnection() {
        DBUtils.closeConnection();
    }
    @Then("verify {string} table {string} column contains {string} data")
    public void verifyTableColumnContainsData(String table, String column, String data) {

//        1. get the database column data in a list
//        getColumnData(String query, String column)-> returns a List of Column data
//        RETURNS login COLUMN DATA OF jhi_user TABLE
//        data  = scott                                            select * from jhi_user , login
        List<Object> allColumnData = DBUtils.getColumnData("select * from "+table+"",column);
        System.out.println(allColumnData);
//       2. Get the expected data in a list
//        List<Object> expectedData=new ArrayList<>();
//        expectedData.add(data);//adding the FF data in the list
//
//        3. compare if expected data is in the all column data list
//        Assert.assertTrue(allColumnData.containsAll(expectedData));
//        or simply
        Assert.assertTrue(allColumnData.contains(data));
//
//        list a = ['apple','orange','banana']     string b = orange
//        how do you check if list contains a sting?  a.contains(b)
    }


    @Then("read the row count of the {string} table")
    public void readTheRowCountOfTheTable(String table) throws Exception {
        int rowCount = DBUtils.getRowCount();
        System.out.println(table + " row count: " + rowCount);
    }

    @Then("read column name of {string} table")
    public void readColumnNameOfTable(String table) {
        String query = "Select * from "+table+"";
        List<String> columnName = DBUtils.getColumnNames(query);
        System.out.println(columnName);
    }
}
