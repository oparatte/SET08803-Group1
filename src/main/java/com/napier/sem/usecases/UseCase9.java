package com.napier.sem.usecases;

import com.napier.sem.dao.City;
import com.napier.sem.utils.DBUtils;

import java.util.ArrayList;

public class UseCase9 {

    /**
     * Generates a report with all the cities in a region,
     * organised by largest population to smallest
     */
    public void printCityPopulationReportDESC(String Region){
        //Get an instance of the DB Utilities
        DBUtils dbUtils = new DBUtils();
        //Connect to the Database;
        dbUtils.connect();

        //Prepare the SQL Query for the Use Case
        String query = "SELECT city.*, country.Name as Country FROM city INNER JOIN country ON city.CountryCode=country.Code "
                + "WHERE region.Name = '"+Region+"'"
                + " ORDER BY city.population DESC";

        //Put the result of the query into the Data Object Array
        ArrayList<City> cities = dbUtils.populateCityArrayList(dbUtils.getResultSet(query));

        //Generate the Report
        System.out.println("UC 9 Report on cities in "+Region+" by population");
        System.out.println(String.format("%-30s %-30s %-30s %-15s","Name","Region","District","Population"));
        for (City city : cities)
        {
            String record = String.format("%-30s %-30s %-30s %-15s",city.getName(),city.getRegion(),
                    city.getDistrict(),city.getPopulation());
            System.out.println(record);
        }
        //Disconnect from the Database
        dbUtils.disconnect();
    }

}
