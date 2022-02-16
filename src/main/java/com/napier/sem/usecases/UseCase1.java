package com.napier.sem.usecases;

import com.napier.sem.dao.Country;
import com.napier.sem.utils.DBUtils;

import java.util.ArrayList;

public class UseCase1 {


    /**
     * Generates a report with all the countries in the world,
     * organised by largest population to smallest
     */
    public void printCountryPopulationReportDESC(){
        //Get an instance of the DB Utilities
        DBUtils dbUtils = new DBUtils();
        //Connect to the Database;
        dbUtils.connect();

        //Prepare the SQL Query for the Use Case
        String query = "Select * FROM country ORDER BY population DESC";

        //Put the result of the query into the Data Object Array
        ArrayList<Country> countries = dbUtils.populateCountryArrayList(dbUtils.getResultSet(query));

        //Generate the Report
        System.out.println("UC 1 Report on Countries by Population");
        System.out.println(String.format("%-30s %-15s","Country ", "Population"));
        for (Country con : countries)
        {
            String record = String.format("%-30s %-15s",con.getName(),con.getPopulation());
            System.out.println(record);
        }
        //Disconnect from the Database
        dbUtils.disconnect();
    }



}
