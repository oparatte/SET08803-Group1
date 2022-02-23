package com.napier.sem.dao;

public class City {
    String ID;
    String Name;
    String CountryCode;
    String District;
    String Population;
    String Country;

    public String getID() { return ID;}

    public void setID(String ID) { this.ID = ID; }

    public String getName() {return Name;}

    public void setName(String Name) { this.Name = Name;}

    public String getCountryCode() {return CountryCode;}

    public void setCountryCode(String CountryCode) {this.CountryCode = CountryCode;}

    public String getDistrict() {return District;}

    public void setDistrict(String District) {this.District = District;}

    public String getPopulation() {return Population;}

    public void setPopulation(String Population) {this.Population = Population;}

    public String getCountry() {return Country;}

    public void setCountry(String County) {this.Country = Country;}

    @Override
    public String toString() {
        return "City{" +
                "ID='" + ID + '\'' +
                ", Name='" + Name + '\'' +
                ", CountryCode='" + CountryCode + '\'' +
                ", District='" + District + '\'' +
                ", Population='" + Population + '\'' +
                ", Country='" + Country + '\'' +
                '}';
    }

}