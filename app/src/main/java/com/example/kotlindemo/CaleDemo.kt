package com.example.kotlindemo

/**
 *@auther:苗文婷
 *@Date: 2020/5/12
 *@Time:15:25
 *@Description:${DESCRIPTION}
 * */
fun main(args: Array<String>) {
    println("请输入一个数子")
    var num = readLine();
    println("请输入第二个数字");
    var num2 = readLine()

    var num3:Int = num!!.toInt()
    var num4:Int = num2!!.toInt()

    print("${num}+${num2}=${num3+num4}")
}