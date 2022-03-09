package com.napier.sem.usecases;

import com.napier.sem.utils.DBUtils;

import java.sql.ResultSet;

public class UseCase29 {

    /**
     * Generates a report with the total population of a Continent where the Continent is provided by the user.
     */
    public void printRegionPopulation(String Continent){
        try{
            //Get an instance of the DB Utilities
            DBUtils dbUtils = new DBUtils();
            //Connect to the Database;
            dbUtils.connect();

            //Prepare the SQL Query for the Use Case
            String query = "SELECT SUM(population) as sum_population FROM country "
                    +"WHERE country.Region = '"+Continent+"'";

            //Generate the Report
            ResultSet rst = dbUtils.getResultSet(query);

            System.out.println("UC 29 Report on Population of "+Continent+"");

            rst.next();
            long population = rst.getLong(1);
            System.out.println("Total Population of "+Continent+" = " +population+ "\n");

            //Disconnect from the Database
            dbUtils.disconnect();
        }

        catch(Exception exc){
            System.out.println(exc.getMessage());
        }

    }

}