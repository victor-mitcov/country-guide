package com.example.countryguide;

import java.util.ArrayList;
import java.util.Arrays;

public class CountriesDataManager {
    protected ArrayList<String> countriesList;
    protected ArrayList<String> countriesDescriptions;

    CountriesDataManager () {
         countriesList = new ArrayList<String>(Arrays.asList(
             "Moldova",
             "Russia",
             "USA"
         ));

         String moldovaDescription = "Republic of Moldova is the country location of which is defined by geographers like ‘South-East Europe’. " +
                 "However if to be above the battle Republic of Moldova is really situated in Central Europe being equally distant from Ural " +
                 "Mountains on the East and Atlantic ocean on the West as well as from Mediterranean on the South and Scandinavia on the North of Europe. " +
                 "Thereby, Moldova is nodal point for both ‘East-West’ and ‘South-North’. Thus, Moldova is mediating between the states of Central and East Europe." +
                 " The capital of Republic of Moldova is called Chisinau.";

         String russiaDescription = "Russia is the largest country in the world. Its area is 17 098.242 thousand square km. The state is located in eastern Europe and northern Asia.\n" +
                 "From north to south the country stretches for over 4,000 km; from west to east – for almost 10,000 km. Russia borders on 16 countries. In the south-east - with North Korea (DPRK), " +
                 "in the south with China, Mongolia, Kazakhstan, Azerbaijan and Georgia; in the south-west - with Ukraine, in the west with Belarus, " +
                 "Latvia, Estonia, Finland and Norway; the Kaliningrad Region borders on Lithuania and Poland.";

         String usaDescription = "The United States of America (USA) is a federal constitutional republic made up of 50 states (48 continental states, plus Alaska and Hawaii the two newest states) " +
                 "and one federal district - Washington, D.C., the capital district. The country is situated in the central southern part of North America almost entirely in the western hemisphere." +
                 " The USA is washed by the Atlantic Ocean in the east and by the Pacific Ocean in the west. The mainland United States borders Canada to the north and Mexico to the south. " +
                 "The state of Alaska is in the northwest of the continent with Canada to its east, and the state of Hawaii is in the mid-Pacific. The largest state is Alaska, the smallest - " +
                 "Rhode Island. Apart from the political states of the USA, the country also has territories outside which are \"insular areas\". ";

         countriesDescriptions = new ArrayList<String>(Arrays.asList(
             moldovaDescription,
             russiaDescription,
             usaDescription
         ));
    }

    public ArrayList<String> getCountriesList(){
        return countriesList;
    }

    public ArrayList<String> getCountriesDescriptions(){
        return countriesDescriptions;
    }
}
