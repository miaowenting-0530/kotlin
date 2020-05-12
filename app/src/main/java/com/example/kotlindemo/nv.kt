package com.example.kotlindemo

/**
 *@auther:苗文婷
 *@Date: 2020/5/12
 *@Time:21:11
 *@Description:${DESCRIPTION}
 * */
 data class nv(var name:String,var age:Int,var hight:Int,var address:String){

}
var fcwr = listOf<nv>(
    nv("哈哈",19,170,"山西"),
    nv("huhu",23,170,"usgu"),
    nv("哈哈2",19,170,"山西2"),
    nv("哈哈3",19,170,"山西3"),
    nv("哈哈4",19,170,"山西4")
)
fun filterGirlsbyaddress(address: String){
    var shanxi = ArrayList<nv>()
    for (g in fcwr){
        if (g.address==address){
            shanxi.add(g)
        }
    }
    for ( s in shanxi){
        println(s)
    }
}