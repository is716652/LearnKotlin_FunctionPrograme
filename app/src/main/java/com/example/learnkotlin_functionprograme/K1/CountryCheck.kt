package com.example.learnkotlin_functionprograme.K1

class CountryCheck {
    fun isBigEuropeanCountry(country:Country):Boolean{
        //人口超1亿的欧洲国家
        return country.continient == "EU" && country.population > 10000

    }

    fun isBigEuropeanCountry1(country:Country):Boolean{
        //人口超1亿的欧洲国家
        return country.continient == "EU" && country.population < 5000

    }

    fun isBigEuropeanCountry2(country:Country):Boolean{
        //人口超1亿的欧洲国家
        return country.continient == "AR" && country.population > 10000

    }

}