package org.mihetteofil;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Country> countries = new HashSet<>();

        // Adăugăm țări și orașe în set
        Country france = new Country("France");
        france.addCity(new City("Paris"));
        france.addCity(new City("Marseille"));
        france.addCity(new City("Lyon"));
        countries.add(france);

        Country germany = new Country("Germany");
        germany.addCity(new City("Berlin"));
        germany.addCity(new City("Munich"));
        germany.addCity(new City("Hamburg"));
        countries.add(germany);

        Country italy = new Country("Italy");
        italy.addCity(new City("Rome"));
        italy.addCity(new City("Milan"));
        countries.add(italy);

        Country vatican = new Country("Vatican");
        countries.add(vatican);

        // Afișăm țările și orașele aferente
        for (Country country : countries) {
            System.out.println("Country: " + country.getName());
            Set<City> cities = country.getCities();
            if (cities.isEmpty()) {
                System.out.println("\tThis country has no cities.");
            } else {
                for (City city : cities) {
                    System.out.println("\tCity: " + city.getName());
                }
            }
        }
    }
}

class Country {
    private String name;
    private Set<City> cities;

    public Country(String name) {
        this.name = name;
        this.cities = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void addCity(City city) {
        cities.add(city);
    }

    public Set<City> getCities() {
        return new HashSet<>(cities);
    }
}

class City {
    private String name;

    public City(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}