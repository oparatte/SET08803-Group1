package com.napier.sem;

import com.napier.sem.usecases.UseCase1;
import com.napier.sem.usecases.UseCase2;


public class App
{

    public static void main(String[] args) {

        //Execute UseCase 1
        UseCase1 useCase1 = new UseCase1();
        useCase1.printCountryPopulationReportDESC();

        //Execute UseCase 2
        UseCase2 useCase2 = new UseCase2();
        useCase2.printCountryPopulationReportDESC();

    }

}