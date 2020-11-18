package com.example.learnkotlin_functionprograme.K1

class CountryApp_new {
    fun filterCountries(countries : List<Country> , check:(Country)-> Boolean)
            :List<Country> {
        val res = mutableListOf<Country>()
        for(c in countries){
            if(check(c)){
                res.add(c)
            }
        }
        return  res
    }

}

fun main(){

    val countryList = listOf<Country>(
        Country("ENGGG","EN",10002),
        Country("china","CN",120002)
    )
    val objCountryCheck = CountryCheck()

    val objCountryApp_new = CountryApp_new()
    val returnCountryList1 = objCountryApp_new.filterCountries(countryList,objCountryCheck::isBigEuropeanCountry)

    val returnCountryList2 = objCountryApp_new.filterCountries(countryList,
            fun(country:Country):Boolean{
                return country.continient == "EU" && country.population > 10000
            }
    )

    val returnCountryList3 = objCountryApp_new.filterCountries(countryList,
            {
                country -> country.continient == "EU" && country.population > 10000
            }
    )

}