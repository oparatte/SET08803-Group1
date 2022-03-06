package com.napier.sem;

import com.napier.sem.usecases.*;

public class App
{

    public static void main(String[] args) {

        //Execute UseCase 1
        UseCase1 useCase1 = new UseCase1();
        useCase1.printCountryPopulationReportDESC();

        //Execute UseCase 2
        UseCase2 useCase2 = new UseCase2();
        useCase2.printCountryPopulationReportDESC("Europe");

        //Execute UseCase 3
        UseCase3 useCase3 = new UseCase3();
        useCase3.printCountryPopulationReportDESC("Caribbean");

        //Execute UseCase 4
        UseCase4 useCase4 = new UseCase4();
        useCase4.printCountryPopulationReportDESC(10);

        //Execute UseCase 5
        UseCase5 useCase5 = new UseCase5();
        useCase5.printCountryPopulationReportDESC("Oceania",10);

        //Execute UseCase 6 - Top N populated countries in a region where N is provided by the user
        UseCase6 useCase6 = new UseCase6();
        useCase6.printCountryPopulationReportDESC("Caribbean", 10);

        //Execute UseCase 7
        UseCase7 useCase7 = new UseCase7();
        useCase7.printCityPopulationReportDESC();

        //Execute UseCase 8
        UseCase8 useCase8 = new UseCase8();
        useCase8.printCityPopulationReportDESC("Asia");

        //Execute UseCase 9
        UseCase9 useCase9 = new UseCase9();
        useCase9.printCityPopulationReportDESC("Melanesia");

        //Execute UseCase 10
        UseCase10 useCase10 = new UseCase10();
        useCase10.printCityPopulationReportDESC("United Kingdom");

        //Execute UseCase 11
        UseCase11 useCase11 = new UseCase11();
        useCase11.printCityPopulationReportDESC("Punjab");

        //Execute UseCase 12
        UseCase12 useCase12 = new UseCase12();
        useCase12.printCityPopulationReportDESC(10);

        //Execute UseCase 13
        UseCase13 useCase13= new UseCase13();
        useCase13.printCityPopulationReportDESC("North America", 10);

        //Execute UseCase 14
        UseCase14 useCase14= new UseCase14();
        useCase14.printCityPopulationReportDESC("Southeast Asia", 10);

        //Execute UseCase 15
        UseCase15 useCase15= new UseCase15();
        useCase15.printCityPopulationReportDESC("Australia", 5);

        //Execute UseCase 16
        UseCase16 useCase16= new UseCase16();
        useCase16.printCityPopulationReportDESC("California", 5);

        //Execute UseCase 17
        UseCase17 useCase17 = new UseCase17();
        useCase17.printCountryPopulationReportDESC();

        //Execute UseCase 18
        UseCase18 useCase18 = new UseCase18();
        useCase18.printCountryPopulationReportDESC("Europe");

        //Execute UseCase 19
        UseCase19 useCase19 = new UseCase19();
        useCase19.printCountryPopulationReportDESC("South America");

        //Execute UseCase 20
        UseCase20 useCase20 = new UseCase20();
        useCase20.printCountryPopulationReportDESC(10);

        //Execute UseCase 21
        UseCase21 useCase21 = new UseCase21();
        useCase21.printCountryPopulationReportDESC("Africa", 10);
      
        //Execute UseCase 22
        UseCase22 useCase22 = new UseCase22();
        useCase22.printCountryPopulationReportDESC("Southern and Central Asia", 10);
      
        //Execute UseCase 26
        UseCase26 useCase26= new UseCase26();
        useCase26.printWorldPopulation();

    }

}
