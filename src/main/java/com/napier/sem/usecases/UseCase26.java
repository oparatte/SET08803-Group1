package com.napier.sem.usecases;

import com.napier.sem.utils.DBUtils;

import java.sql.ResultSet;

public class UseCase26 {

    /**
     * Generates a report with the total population of the world
     */
    public void printWorldPopulation(){
       try{
            //Get an instance of the DB Utilities
            DBUtils dbUtils = new DBUtils();
            //Connect to the Database;
            dbUtils.connect();

            //Prepare the SQL Query for the Use Case
            String query = "SELECT SUM(population) as sum_population FROM country";

            //Generate the Report
            ResultSet rst = dbUtils.getResultSet(query);

            System.out.println("UC 26 Report on Population of world");

            rst.next();
            long population = rst.getLong(1);
            System.out.println("Total Population of world = " +population+ "\n");

            //Disconnect from the Database
            dbUtils.disconnect();
        }

        catch(Exception exc){
            System.out.println(exc.getMessage());
        }

    }

}