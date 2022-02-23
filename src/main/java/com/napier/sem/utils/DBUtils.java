package com.napier.sem.utils;

import com.napier.sem.dao.City;
import com.napier.sem.dao.Country;

import java.sql.*;
import java.util.ArrayList;

public class DBUtils {

    /**
     * Connection to MySQL database.
     */
    private Connection con = null;


    /**
     * Connect to the MySQL database.
     */
    public void connect()
    {
        try
        {
            // Load Database driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Could not load SQL driver");
            System.exit(-1);
        }

        int retries = 10;
        for (int i = 0; i < retries; ++i)
        {
            System.out.println("Connecting to database...");
            try
            {
                // Wait a bit for db to start
                Thread.sleep(30000);
                // Connect to database
                con = DriverManager.getConnection("jdbc:mysql://db:3306/world?useSSL=false", "root", "password123");
                System.out.println("Successfully connected to the World DB");
                break;
            }
            catch (SQLException sqle)
            {
                System.out.println("Failed to connect to database attempt " + Integer.toString(i));
                System.out.println(sqle.getMessage());
            }
            catch (InterruptedException ie)
            {
                System.out.println("Thread interrupted? Should not happen.");
            }
        }
    }

    /**
     * Disconnect from the MySQL database.
     */
    public void disconnect()
    {
        if (con != null)
        {
            try
            {
                // Close connection
                con.close();
            }
            catch (Exception e)
            {
                System.out.println("Error closing connection to database");
            }
        }
    }

    /**
     * This method populates a Country Array from a
     * ResultSet that brings back the Country Table;
     * @param resultSet
     * @return
     */
    public ArrayList<Country> populateCountryArrayList(ResultSet resultSet){

        ArrayList<Country> countries = new ArrayList<Country>();
        try {
            while (resultSet.next()) {
                Country country = new Country();

                country.setName(resultSet.getString("country.Name"));
                country.setPopulation(resultSet.getString("country.Population"));
                country.setCode(resultSet.getString("country.Code"));
                country.setCapital(resultSet.getString("city.Name"));  //requires JOIN city ON country.Capital=city.ID
                country.setContinent(resultSet.getString("country.Continent"));
                country.setCode2(resultSet.getString("country.Code2"));
                country.setGovernmentForm(resultSet.getString("country.GovernmentForm"));
                country.setHeadOfState(resultSet.getString("country.HeadOfState"));
                country.setGnpOld(resultSet.getString("country.GNPOld"));
                country.setGnp(resultSet.getString("country.GNP"));
                country.setIndepYear(resultSet.getString("country.IndepYear"));
                country.setLifeExpectancy(resultSet.getString("country.LifeExpectancy"));
                country.setSurfaceArea(resultSet.getString("country.SurfaceArea"));
                country.setRegion(resultSet.getString("country.Region"));
                country.setLocalName(resultSet.getString("country.LocalName"));
                countries.add(country);
            }
        }catch (SQLException e){
            System.out.println("Error in populateCountryArrayList :");
            e.printStackTrace();
        }
        return countries;
    }

    /**
     * This method populates a City Array from a
     * ResultSet that brings back the City Table;
     * @param resultSet
     * @return
     */
    public ArrayList<City> populateCityArrayList(ResultSet resultSet){

        ArrayList<City> cities = new ArrayList<City>();
        try {
            while (resultSet.next()) {
                City city = new City();

                city.setName(resultSet.getString("city.Name"));
                city.setDistrict(resultSet.getString("city.District"));
                city.setPopulation(resultSet.getString("city.Population"));
                city.setCountryCode(resultSet.getString("city.CountryCode"));
                city.setCountry(resultSet.getString("country.Code"));  //requires JOIN country ON city.CountryCode=country.Code
                cities.add(city);
            }
        }catch (SQLException e){
            System.out.println("Error in populateCityArrayList :");
            e.printStackTrace();
        }
        return cities;
    }


    /**
     * Gets a Generic Result Set from a given query to the World DB
     * @param query
     * @return
     */
    public ResultSet getResultSet(String query){
        ResultSet resultSet =null;
        try {
            Statement stmt = con.createStatement();
            resultSet = stmt.executeQuery(query);
        } catch (SQLException e) {
            System.out.println("Error in getResultSet");
            e.printStackTrace();
        }
        return resultSet;

    }




}
