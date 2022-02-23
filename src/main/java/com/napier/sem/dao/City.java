package com.napier.sem.dao;

public class City {
    String ID;
    String Name;
    String CountryCode;
    String District;
    String Population;
    String County;

    public String getID() { return ID;}

    public void setID(String ID) { this.ID = ID; }

    public String getName() {
        return Name;
    }

    public void setName(String Name) { this.Name = Name;}

    public String getCountryCode() {return CountryCode;}

    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    public String getDistrict() {
        return District;
    }

    public String getPopulation() {
        return Population;
    }

    public void setPopulation(String Population) {
        this.Population = Population;
    }

    public String getCounty() {return County;}

    @Override
    public String toString() {
        return "City{" +
                "ID='" + ID + '\'' +
                ", Name='" + Name + '\'' +
                ", CountryCode='" + CountryCode + '\'' +
                ", District='" + District + '\'' +
                ", Population='" + Population + '\'' +
                ", County='" + County + '\'' +
                '}';
    }
}
