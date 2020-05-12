package com.example.kotlindemo

/**
 *@auther:苗文婷
 *@Date: 2020/5/12
 *@Time:11:48
 *@Description:${DESCRIPTION}
 * */
fun main(args: Array<String>) {
   var sum =  add(4,6)
    println(sum)
    //表达式
    var i = {x:Int,y:Int->x+y}
    var j = i(3,5)
    print(j)

}
fun add(x:Int,y:Int):Int =  x+y


