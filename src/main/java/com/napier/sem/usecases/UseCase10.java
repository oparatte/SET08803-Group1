package com.napier.sem.usecases;

import com.napier.sem.dao.City;
import com.napier.sem.utils.DBUtils;

import java.util.ArrayList;

public class UseCase10 {

    /**
     * Generates a report with all the cities in a country,
     * organised by largest population to smallest
     */
    public void printCityPopulationReportDESC(String Country){
        //Get an instance of the DB Utilities
        DBUtils dbUtils = new DBUtils();
        //Connect to the Database;
        dbUtils.connect();

        //Prepare the SQL Query for the Use Case
        String query = "SELECT city.*, country.Name as Country FROM city INNER JOIN country ON city.CountryCode=country.Code "
                + "WHERE country.Name = '"+Country+"'"
                + " ORDER BY city.population DESC";

        //Put the result of the query into the Data Object Array
        ArrayList<City> cities = dbUtils.populateCityArrayList(dbUtils.getResultSet(query));

        //Generate the Report
        System.out.println("UC 10 Report on cities in "+Country+" by population");
        System.out.println(String.format("%-30s %-30s %-30s %-15s","Name","Country","District","Population"));
        for (City city : cities)
        {
            String record = String.format("%-30s %-30s %-30s %-15s",city.getName(),city.getCountry(),
                    city.getDistrict(),city.getPopulation());
            System.out.println(record);
        }
        //Disconnect from the Database
        dbUtils.disconnect();
    }

}