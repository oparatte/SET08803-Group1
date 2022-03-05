package com.napier.sem.usecases;

import com.napier.sem.dao.Country;
import com.napier.sem.utils.DBUtils;

import java.util.ArrayList;

public class UseCase21 {

    /**
     * Generates a report with the top N capital cities in a continent,
     * organised by largest population to smallest
     */
    public void printCountryPopulationReportDESC(String Continent, int number){
        //Get an instance of the DB Utilities
        DBUtils dbUtils = new DBUtils();
        //Connect to the Database;
        dbUtils.connect();

        //Prepare the SQL Query for the Use Case
        String query = "SELECT * FROM country INNER JOIN city ON country.Capital=city.ID "
                + " WHERE country.Continent = '"+Continent+"'"
                + " ORDER BY country.population DESC"
                + " LIMIT "+number+" ";;

        //Put the result of the query into the Data Object Array
        ArrayList<Country> countries = dbUtils.populateCountryArrayList(dbUtils.getResultSet(query));

        //Generate the Report
        System.out.println("UC 21 Report with the top "+number+" capitals in "+Continent+"");
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
