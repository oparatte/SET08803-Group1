package com.napier.sem.usecases;

import com.napier.sem.dao.Country;
import com.napier.sem.utils.DBUtils;

import java.util.ArrayList;

public class UseCase6 {

    /**
     * Generate a report with the top N populated countries in a region,
     * where N is provided by the user
     */
    public void printCountryPopulationReportDESC(String Region, int number){
        //Get an instance of the DB Utilities
        DBUtils dbUtils = new DBUtils();

        //Connect to the Database;
        dbUtils.connect();

        //Prepare the SQL Query for the Use Case
        String query = "SELECT * FROM country INNER JOIN city ON country.Capital=city.ID"
                +" WHERE country.Region = '"+Region+"'"
                +" ORDER BY country.Population DESC"
                +" LIMIT "+number+" ";

        //Put the result of the query into the Data Object Array
        ArrayList<Country> countries = dbUtils.populateCountryArrayList(dbUtils.getResultSet(query));

        //Generate the Report
        System.out.println("UC 6 Report on Top N populated countries in a region");
        System.out.println(String.format("%-15s %-30s %-15s %-30s","Code","Country ","Region","Population"));
        for (Country con : countries)
        {
            String record = String.format("%-15s %-30s %-15s %-30s",con.getCode(),con.getName(),con.getRegion(),con.getPopulation());
            System.out.println(record);
        }
        //Disconnect from the Database
        dbUtils.disconnect();
    }

}