package com.company.Country;

public class Country {
    private String country;
    private String language;
    private String capital;

    public Country(String country, String language, String capital) {
        this.country = country;
        this.language = language;
        this.capital = capital;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "Country{" +
                "country='" + country + '\'' +
                ", language='" + language + '\'' +
                ", capital='" + capital + '\'' +
                '}';
    }
}
