package com.napier.sem.usecases;

import com.napier.sem.dao.Country;
import com.napier.sem.utils.DBUtils;

import java.sql.ResultSet;
import java.util.ArrayList;

public class UseCase41 {

    /**
     * Generates a report with the total population of the world
     */
    public void printWorldPopulation(){
        //Get an instance of the DB Utilities
        DBUtils dbUtils = new DBUtils();
        //Connect to the Database;
        dbUtils.connect();

        //Prepare the SQL Query for the Use Case
        String query = "SELECT SUM(population) as sum_population FROM country";

        //Generate the Report
        System.out.println("UC 41 Report on Population of world");
        System.out.println("Population of world: ");

        ResultSet rst = dbUtils.getResultSet(query);

        System.out.println(rst);

        //Disconnect from the Database
        dbUtils.disconnect();
    }



}