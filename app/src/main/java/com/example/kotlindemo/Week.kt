package com.example.kotlindemo

/**
 *@auther:苗文婷
 *@Date: 2020/5/12
 *@Time:20:09
 *@Description:${DESCRIPTION}
 * */
 //星期
enum class Week {
    星期一,星期二,星期三,星期四,星期五,星期六,星期日
}

fun main(args: Array<String>) {
    println(Week.星期一.ordinal)
}