package com.napier.sem.usecases;

import com.napier.sem.dao.City;
import com.napier.sem.dao.Country;
import com.napier.sem.utils.DBUtils;

import java.util.ArrayList;

public class UseCase9 {


    /**
     * Generates a report with all the countries in a region,
     * organised by largest population to smallest
     */
    public void printCountryPopulationReportDESC(String Region){
        //Get an instance of the DB Utilities
        DBUtils dbUtils = new DBUtils();
        //Connect to the Database;
        dbUtils.connect();

        //Prepare the SQL Query for the Use Case
        String query = "SELECT * FROM country INNER JOIN city ON country.Capital=city.ID "
                + "WHERE country.Region = '"+Region+"'"
                + "ORDER BY country.population DESC";

        //Put the result of the query into the Data Object Array
        ArrayList<City> cities = dbUtils.populateCityArrayList(dbUtils.getResultSet(query));

        //Generate the Report
        System.out.println("UC 9 Report on Cities in a Region organised by Population descending");
        System.out.println(String.format("%-15s %-30s %-15s","City","Population","Capital"));
        for (City con : cities)
        {
            String record = String.format("%-15s %-30s %-15s",con.getName(),con.getPopulation(),
                    con.getCountry());
            System.out.println(record);
        }
        //Disconnect from the Database
        dbUtils.disconnect();
    }



}