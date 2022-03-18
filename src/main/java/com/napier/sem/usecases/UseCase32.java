package com.napier.sem.usecases;
import com.napier.sem.utils.DBUtils;
import java.sql.ResultSet;

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

            /**Generate SQL Query 1 to get population of the world from database*/
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

            /** Generate the report */
            System.out.println("UC 32 Report on 5 languages sorted from greatest to smallest");
            ResultSet resultSet = dbUtils.getResultSet(query2);
            System.out.println(String.format("%-15s %-15s %-6s","Language","Count","Population"));

            while (resultSet.next()){
                String Language = resultSet.getString("language");
                String languageCount = resultSet.getString("languageCount");
                String languagePercentage = resultSet.getString("languagePercentage");

                System.out.println(String.format("%-15s %-15s %-6s",""+Language+"",""+languageCount+"",""+languagePercentage+"%"));
            }
        } //end of try block

        catch(Exception exc){
            System.out.println(exc.getMessage());
        }

    } //end of printLanguageReport

}