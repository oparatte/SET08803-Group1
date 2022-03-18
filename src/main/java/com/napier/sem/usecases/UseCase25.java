package com.napier.sem.usecases;
import com.napier.sem.utils.DBUtils;
import java.sql.ResultSet;

public class UseCase25 {

    /**
     *Generate report on population of people, people living in cities,
     *and people not living in cities in each country
     */
    public void printPopulationInCityByCountry() {
        try {
            //Get an instance of the DB Utilities
            DBUtils dbUtils = new DBUtils();
            //Connect to the Database;
            dbUtils.connect();

            //Prepare the SQL Query for the Use Case
            String query = "SELECT country.Name, "
                    +"SUM(city.Population) AS inCity, "
                    +"country.Population - SUM(city.Population) AS outCity "
                    +"FROM country INNER JOIN city ON country.Code = city.CountryCode "
                    +"GROUP BY country.name "
                    +"ORDER BY country.name";

            /** Generate the report */
            System.out.println("UC 25 Report on Persons living in and out of cities for each Country\n");
            ResultSet resultSet = dbUtils.getResultSet(query);
            System.out.println(String.format("%-35s %-20s %-6s","Country","People in cities","People not in cities"));

            while (resultSet.next()){
                String country = resultSet.getString("name");
                String inCity = resultSet.getString("inCity");
                String outCity = resultSet.getString("outCity");

                System.out.println(String.format("%-35s %-20s %-6s",""+country+"",""+inCity+"",""+outCity+""));
            }



        } //End of try block

        catch(Exception exc){
            System.out.println(exc.getMessage());
        }
    }
}
