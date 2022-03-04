package com.napier.sem.usecases;

import com.napier.sem.dao.Country;
import com.napier.sem.utils.DBUtils;

import java.util.ArrayList;

public class UseCase18 {


    /**
     * Generates a report with all the capital cities in a continent,
     * organised by largest population to smallest
     */
    public void printCountryPopulationReportDESC(String Continent){
        //Get an instance of the DB Utilities
        DBUtils dbUtils = new DBUtils();
        //Connect to the Database;
        dbUtils.connect();

        //Prepare the SQL Query for the Use Case
        String query = "SELECT * FROM country INNER JOIN city ON country.Capital=city.ID "
                + "WHERE country.Continent = '"+Continent+"'"
                + " ORDER BY country.population DESC";

        //Put the result of the query into the Data Object Array
        ArrayList<Country> countries = dbUtils.populateCountryArrayList(dbUtils.getResultSet(query));

        //Generate the Report
        System.out.println("UC 18 Report on Capital Cities in "+Continent+" by Population");
        System.out.println(String.format("%-30s %-30s %-15s","Name","Country", "Population"));
        for (Country con : countries)
        {
            String record = String.format("%-30s %-30s %-15s",con.getCapital(),con.getName(),con.getPopulation());
            System.out.println(record);
        }
        //Disconnect from the Database
        dbUtils.disconnect();
    }



}
