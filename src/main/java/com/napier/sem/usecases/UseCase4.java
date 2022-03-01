package com.napier.sem.usecases;

import com.napier.sem.dao.Country;
import com.napier.sem.utils.DBUtils;

import java.util.ArrayList;

public class UseCase4 {


    /**
     * Generates a report with the top N populated countries in the world,
     * organised by largest population to smallest
     */
    public void printCountryPopulationReportDESC(int number){
        //Get an instance of the DB Utilities
        DBUtils dbUtils = new DBUtils();
        //Connect to the Database;
        dbUtils.connect();

        //Prepare the SQL Query for the Use Case
        String query = "SELECT * FROM country INNER JOIN city ON country.Capital=city.ID "
                        + "ORDER BY country.population DESC "
                        +" LIMIT "+number+" ";

        //Put the result of the query into the Data Object Array
        ArrayList<Country> countries = dbUtils.populateCountryArrayList(dbUtils.getResultSet(query));

        //Generate the Report
        System.out.println("UC 4 Report on top 10 populated countries in the world");
        System.out.println(String.format("%-15s %-30s %-15s %-30s %-15s %-15s","Code","Country ","Continent","Region","Population","Capital"));
        for (Country con : countries)
        {
            String record = String.format("%-15s %-30s %-15s %-30s %-15s %-15s",con.getCode(),con.getName(),con.getContinent(),
                    con.getRegion(),con.getPopulation(), con.getCapital());
            System.out.println(record);
        }
        //Disconnect from the Database
        dbUtils.disconnect();
    }



}