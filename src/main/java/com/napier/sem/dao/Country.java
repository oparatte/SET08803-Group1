package com.napier.sem.dao;


public class Country {
    String code;
    String name;
    String localName;
    String governmentForm;
    String continent;
    String region;
    String headOfState;
    String surfaceArea;
    String indepYear;
    String capital;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    public String getGovernmentForm() {
        return governmentForm;
    }

    public void setGovernmentForm(String governmentForm) {
        this.governmentForm = governmentForm;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getHeadOfState() {
        return headOfState;
    }

    public void setHeadOfState(String headOfState) {
        this.headOfState = headOfState;
    }

    public String getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(String surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public String getIndepYear() {
        return indepYear;
    }

    public void setIndepYear(String indepYear) {
        this.indepYear = indepYear;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(String lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    public String getGnp() {
        return gnp;
    }

    public void setGnp(String gnp) {
        this.gnp = gnp;
    }

    public String getGnpOld() {
        return gnpOld;
    }

    public void setGnpOld(String gnpOld) {
        this.gnpOld = gnpOld;
    }

    String code2;
    String population;
    String lifeExpectancy;
    String gnp;
    String gnpOld;


    @Override
    public String toString() {
        return "Country{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", localName='" + localName + '\'' +
                ", governmentForm='" + governmentForm + '\'' +
                ", continent='" + continent + '\'' +
                ", region='" + region + '\'' +
                ", headOfState='" + headOfState + '\'' +
                ", surfaceArea='" + surfaceArea + '\'' +
                ", indepYear='" + indepYear + '\'' +
                ", capital='" + capital + '\'' +
                ", code2='" + code2 + '\'' +
                ", population='" + population + '\'' +
                ", lifeExpectancy='" + lifeExpectancy + '\'' +
                ", gnp='" + gnp + '\'' +
                ", gnpOld='" + gnpOld + '\'' +
                '}';
    }
}
