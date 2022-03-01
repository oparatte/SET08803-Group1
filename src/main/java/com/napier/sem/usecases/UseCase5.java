package com.napier.sem.usecases;

import com.napier.sem.dao.Country;
import com.napier.sem.utils.DBUtils;

import java.util.ArrayList;

public class UseCase5 {

    /**
     * Generate a report with the top N populated countries in a continent,
     * where N is provided by a planner, so that they can plan organisation resource allocation
     */
    public void printCountryPopulationReportDESC(String Continent, int number){
        //Get an instance of the DB Utilities
        DBUtils dbUtils = new DBUtils();

        //Connect to the Database;
        dbUtils.connect();

        //Prepare the SQL Query for the Use Case
        String query = "SELECT * FROM country INNER JOIN city ON country.Capital=city.ID"
                        +" WHERE country.Continent = '"+Continent+"'"
                        +" ORDER BY country.Population DESC"
                        +" LIMIT "+number+" ";

        //Put the result of the query into the Data Object Array
        ArrayList<Country> countries = dbUtils.populateCountryArrayList(dbUtils.getResultSet(query));

        //Generate the Report
        System.out.println("UC 5 Report on Top N populated countries in a continent");
        System.out.println(String.format("%-15s %-30s %-15s %-30s","Code","Country ","Continent","Population"));
        for (Country con : countries)
        {
            String record = String.format("%-15s %-30s %-15s %-30s",con.getCode(),con.getName(),con.getContinent(),con.getPopulation());
            System.out.println(record);
        }
        //Disconnect from the Database
        dbUtils.disconnect();
    }

}