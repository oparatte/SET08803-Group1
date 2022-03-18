package com.napier.sem.usecases;
import com.napier.sem.utils.DBUtils;
import java.sql.ResultSet;

public class UseCase24 {

    /**
     *Generate report on population of people, people living in cities,
     *and people not living in cities in each Region
     */
    public void printPopulationInCityByRegion() {
        try {
            //Get an instance of the DB Utilities
            DBUtils dbUtils = new DBUtils();
            //Connect to the Database;
            dbUtils.connect();

            //Prepare the SQL Query for the Use Case
            String query = "SELECT country.Region, "
                    +"SUM(city.Population) AS inCity, "
                    +"SUM(country.Population - city.Population) AS outCity "
                    +"FROM country LEFT JOIN city ON country.Code = city.CountryCode "
                    +"GROUP BY country.Region "
                    +"ORDER BY country.Region";

            /** Generate the report */
            System.out.println("UC 24 Report on Persons living in and out of cities for each Region\n");
            ResultSet resultSet = dbUtils.getResultSet(query);
            System.out.println(String.format("%-35s %-20s %-6s","Region","People in cities","People not in cities"));

            while (resultSet.next()){
                String region = resultSet.getString("region");
                String inCity = resultSet.getString("inCity");
                String outCity = resultSet.getString("outCity");

                System.out.println(String.format("%-35s %-20s %-6s",""+region+"",""+inCity+"",""+outCity+""));
            }



        } //End of try block

        catch(Exception exc){
            System.out.println(exc.getMessage());
        }
    }
}
