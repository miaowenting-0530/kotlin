package com.example.kotlindemo

/**
 *@auther:苗文婷
 *@Date: 2020/5/12
 *@Time:9:37
 *@Description:${DESCRIPTION}
 * */
fun main(args: Array<String>) {
    /*根号 Math.sqrt
	N的n次方 Math.pow(N,n)*/
    var num1 = 4
    var num2 = 6
    println(num1>num2)
    //根号 Math.sqrt(5.0)
    var num3 = Math.sqrt(5.0)-Math.sqrt(4.0)
    var num4 = Math.sqrt(4.0)-Math.sqrt(3.0)
    println(num3<num4)
    println("num3="+num3)
    println("num4="+num4)
    var num5 = Math.pow(2.0,100.0)
    var num6 = Math.pow(3.0,75.0)
    println(num5>num6)
    println("num5="+num5)
    println("num6="+num6)

}