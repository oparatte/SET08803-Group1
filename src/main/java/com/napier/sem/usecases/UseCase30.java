package com.napier.sem.usecases;

import com.napier.sem.utils.DBUtils;

import java.sql.ResultSet;

public class UseCase30 {

    /**
     * Generates a report with the total population of a Continent where the Continent is provided by the user.
     */
    public void printDistrictPopulation(String District){
        try{
            //Get an instance of the DB Utilities
            DBUtils dbUtils = new DBUtils();
            //Connect to the Database;
            dbUtils.connect();

            //Prepare the SQL Query for the Use Case
            String query = "SELECT SUM(population) as sum_population FROM city "
                    +"WHERE city.district = '"+District+"'";

            //Generate the Report
            ResultSet rst = dbUtils.getResultSet(query);

            System.out.println("UC 30 Report on Population of "+District+"");

            rst.next();
            long population = rst.getLong(1);
            System.out.println("Population of "+District+" = " +population+ "\n");

            //Disconnect from the Database
            dbUtils.disconnect();
        }

        catch(Exception exc){
            System.out.println(exc.getMessage());
        }

    }

}