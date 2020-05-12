package com.example.kotlindemo

/**
 *@auther:苗文婷
 *@Date: 2020/5/12
 *@Time:11:34
 *@Description:${DESCRIPTION}
 * */
fun main(args: Array<String>) {
    //list
    var lists = listOf("买鸡蛋","方便面","薯片","果冻")
    for ((i,e) in lists.withIndex()){
        print("$i$e")
    }
    //map
    var map = hashMapOf<String,String>()
    map["好"] = "Good"
    map["学习"] = "Study"
    map["上帝"] = "God"
    map["上"] = "up"
    println(map["好"])
    

}