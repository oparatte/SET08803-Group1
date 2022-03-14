package com.napier.sem.usecases;

import com.napier.sem.dao.Country;
import com.napier.sem.utils.DBUtils;

import java.sql.ResultSet;
import java.util.ArrayList;

public class UseCase32 {
    /**
     *The number of people speaking Chinese, English, Hindi, Spanish and Arabic sorted from
     *greatest number to smallest and including the percentage of the world population
     */
    public void printLanguageReport(){
        try{
            //Get an instance of the DB Utilities
            DBUtils dbUtils = new DBUtils();
            //Connect to the Database;
            dbUtils.connect();

            String query1 = "SELECT SUM(population) as sum_population FROM country";
            ResultSet rst = dbUtils.getResultSet(query1);
            rst.next();
            long population = rst.getLong(1);

            //Prepare the SQL Query for the Use Case
            String query2 = "SELECT countrylanguage.Language, "
                    +"ROUND(SUM(countrylanguage.Percentage / 100 * country.Population)) AS languageCount, "
                    +"ROUND((((SUM(countrylanguage.Percentage / 100 * country.Population))/"+population+")*100),2) "
                    +"AS languagePercentage "
                    +"FROM countrylanguage INNER JOIN country ON countrylanguage.CountryCode=country.Code "
                    +"WHERE countrylanguage.language = 'Chinese' "
                    +"OR countrylanguage.language = 'English' "
                    +"OR countrylanguage.language = 'Hindi' "
                    +"OR countrylanguage.language = 'Spanish' "
                    +"OR countrylanguage.language = 'Arabic' "
                    +"GROUP BY countrylanguage.Language "
                    +"ORDER BY languageCount DESC";

            //Put the result of the query into the Data Object Array
            ArrayList<Country> countries = dbUtils.populateCountryArrayList(dbUtils.getResultSet(query2));

            //Generate the Report
            System.out.println("UC 32 Report on Languages");
            System.out.println(String.format("%-30s %-30s %-15s","Language","Population", "Percentage"));
            for (Country con : countries)
            {
                String record = String.format("%-30s %-30s %-15s",con.getLanguage(),con.getLanguageCount(),con.getLanguagePercentage());
                System.out.println(record);
            }
            //Disconnect from the Database
            dbUtils.disconnect();
        }

        catch(Exception exc){
            System.out.println(exc.getMessage());
        }

    }

}