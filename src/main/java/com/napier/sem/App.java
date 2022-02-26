package com.napier.sem;

import com.napier.sem.usecases.UseCase1;
import com.napier.sem.usecases.UseCase2;
import com.napier.sem.usecases.UseCase3;
import com.napier.sem.usecases.UseCase7;


public class App
{

    public static void main(String[] args) {

        //Execute UseCase 1
        UseCase1 useCase1 = new UseCase1();
        useCase1.printCountryPopulationReportDESC();

        //Execute UseCase 2
        UseCase2 useCase2 = new UseCase2();
        useCase2.printCountryPopulationReportDESC();

        //Execute UseCase 3
        UseCase3 useCase3 = new UseCase3();
        useCase3.printCountryPopulationReportDESC();

        //Execute UseCase 7
        UseCase7 useCase7 = new UseCase7();
        useCase7.printCityPopulationReportDESC();

    }

}
