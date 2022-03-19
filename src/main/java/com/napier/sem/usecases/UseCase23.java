package com.napier.sem.usecases;
import com.napier.sem.utils.DBUtils;
import java.sql.ResultSet;

public class UseCase23 {

    /**
     *Generate report on population of people, people living in cities,
     *and people not living in cities in each continent
     */
    public void printPopulationInCityByContinent() {
        try {
            //Get an instance of the DB Utilities
            DBUtils dbUtils = new DBUtils();
            //Connect to the Database;
            dbUtils.connect();

            //Prepare the SQL Query for the Use Case
            String query = "SELECT country.Continent, "
                    +"SUM(city.Population) AS inCity, "
                    +"SUM(DISTINCT(country.Population)) - SUM(city.Population) AS outCity "
                    +"FROM country LEFT JOIN city ON country.Code = city.CountryCode "
                    +"GROUP BY country.Continent "
                    +"ORDER BY country.Continent";

            /* Generate the report */
            System.out.println("UC 23 Report on Persons living in and out of cities for each Continent\n");
            ResultSet resultSet = dbUtils.getResultSet(query);
            System.out.println(String.format("%-15s %-20s %-6s","Continent","People in cities","People not in cities"));

            while (resultSet.next()){
                String continent = resultSet.getString("continent");
                String inCity = resultSet.getString("inCity");
                String outCity = resultSet.getString("outCity");

                System.out.println(String.format("%-15s %-20s %-6s",""+continent+"",""+inCity+"",""+outCity+""));
            }



        } //End of try block

        catch(Exception exc){
            System.out.println(exc.getMessage());
        }
    }
}
