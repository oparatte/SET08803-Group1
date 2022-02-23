package com.napier.sem.usecases;

import com.napier.sem.dao.City;
import com.napier.sem.dao.Country;
import com.napier.sem.utils.DBUtils;

import java.util.ArrayList;

public class UseCase7 {


    /**
     * Generates a report with all the cities in the world,
     * organised by largest population to smallest
     */
    public void printCityPopulationReportDESC(){
        //Get an instance of the DB Utilities
        DBUtils dbUtils = new DBUtils();
        //Connect to the Database;
        dbUtils.connect();

        //Prepare the SQL Query for the Use Case
        String query = "SELECT * FROM city INNER JOIN country ON city.CountryCode=country.Code "
                + " ORDER BY country.population DESC";

        //Put the result of the query into the Data Object Array
        ArrayList<City> cities = dbUtils.populateCityArrayList(dbUtils.getResultSet(query));

        //Generate the Report
        System.out.println("UC 7 Report on Cities by Population");
        System.out.println(String.format("%-15s %-30s %-15s %-30s %-15s %-15s","Name","Country ","District","Population"));
        for (City city : cities)
        {
            String record = String.format("%-15s %-30s %-15s %-30s %-15s %-15s",city.getName(),city.getCountryCode(),
                    city.getDistrict(),city.getPopulation());
            System.out.println(record);
        }
        //Disconnect from the Database
        dbUtils.disconnect();
    }



}
