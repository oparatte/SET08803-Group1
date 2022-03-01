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

        //Execute UseCase 7
        UseCase7 useCase7 = new UseCase7();
        useCase7.printCityPopulationReportDESC();

        //Execute UseCase 8
        UseCase8 useCase8 = new UseCase8();
        useCase8.printCityPopulationReportDESC("Asia");

        //Execute UseCase 12
        UseCase12 useCase12 = new UseCase12();
        useCase12.printCityPopulationReportDESC(10);

        //Execute UseCase 13
        UseCase13 useCase13= new UseCase13();
        useCase13.printCityPopulationReportDESC("North America", 10);

        //Execute UseCase 26
        UseCase26 useCase26= new UseCase26();
        useCase26.printWorldPopulation();

    }

}
