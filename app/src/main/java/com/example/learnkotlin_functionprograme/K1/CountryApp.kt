package com.example.learnkotlin_functionprograme.K1

class CountryApp {
    //过滤国家的方法，只能获取欧洲的国家集合
    fun filterCountries(countries : List<Country>):List<Country>{
        val res = mutableListOf<Country>()
        for(c in res){
            if(c.continient == "EU"){
                res.add(c)
            }
        }
        return res
    }

    //可以获取参数提供的地区的国家的集合
    fun filterCountries(countries : List<Country>, continient:String)
            :List<Country>{
        val res = mutableListOf<Country>()
        for(c in res){
            if(c.continient == continient){
                res.add(c)
            }
        }
        return res
    }

    //可以获取参数提供的地区的国家的集合，且过滤制定人口数的国家
    fun filterCountries(countries : List<Country>,continient:String,population:Int)
            :List<Country>{
        val res = mutableListOf<Country>()
        for(c in res){
            if(c.continient == continient && c.population>population){
                res.add(c)
            }
        }
        return res
    }

    /*
    解耦
        解决问题的核心在于对filterCountries方法进行解耦，
        我们能否把所有的筛选逻辑行为都抽象成一个参数呢？
        传入一个类对象是一种解决方法，我们可以根据不同的筛选需求创建不同的子类，
        它们都各自实现了一个校验方法。
        然而，Shaw了解到Kotlin是支持高阶函数的，理论上我们同样可以把筛选的逻辑
        变成一个方法来传入，这种思路更加简单。
     */

    fun filterCountries1(countries : List<Country>,continient:String,population:Int)
            :List<Country>{
        val res = mutableListOf<Country>()
        val objCountryCheck = CountryCheck()
        for(c in res){
            if(objCountryCheck.isBigEuropeanCountry(c)){
                res.add(c)
            }
        }
        return res
    }
    fun filterCountries2(countries : List<Country>,continient:String,population:Int)
            :List<Country>{
        val res = mutableListOf<Country>()
        val objCountryCheck = CountryCheck()
        for(c in res){
            if(objCountryCheck.isBigEuropeanCountry1(c)){
                res.add(c)
            }
        }
        return res
    }
    fun filterCountries3(countries : List<Country>,continient:String,population:Int)
            :List<Country>{
        val res = mutableListOf<Country>()
        val objCountryCheck = CountryCheck()
        for(c in res){
            if(objCountryCheck.isBigEuropeanCountry2(c)){
                res.add(c)
            }
        }
        return res
    }




}