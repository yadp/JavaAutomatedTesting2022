package com.company.Country;

import java.util.*;

public class MainCountry {

    public static void main(String[] args) {


        Set<Country> countrySet = new HashSet<>();

        countrySet.add(new Country("Germany","german","Berlin"));
        countrySet.add(new Country("France","french", "Paris"));
        countrySet.add(new Country("Spain", "spanish", "Madrid"));
        countrySet.add(new Country("Brazil", "Portuguese", "Brazil"));
        countrySet.add(new Country("Portugal", "Portuguese","Lisbon"));

        System.out.println(findCountryByLanguage(countrySet,"german"));

        System.out.println(findCountryByCapital(countrySet,"Berlin"));

        Map<String, Country> mapCountry = new HashMap<>();
        for(Country country: countrySet){
            mapCountry.put(country.getCountry(), country);
        }


        mapCountry.put("Germany", new Country("Germany", "new German", "new Berlin"));
        System.out.println(mapCountry);

    }

    public static Country findCountryByLanguage(Collection<Country> countries, String language){
        for (Country country:countries
             ) {
            if(country.getLanguage().equals(language)){
                return country;
            }
        }
        return null;
    }

    public static Country findCountryByCapital(Collection<Country> countries, String capital){
        for (Country country:countries) {
            if(country.getCapital().equals(capital)){
                return country;
            }
        }
        return null;

    }
}
