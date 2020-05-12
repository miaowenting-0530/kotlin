package com.example.kotlindemo

/**
 *@auther:苗文婷
 *@Date: 2020/5/12
 *@Time:20:15
 *@Description:${DESCRIPTION}
 * */

sealed class smallson {
    fun sayHello(){
        println("大家好！")
    }
    class xiaolv():smallson()
    class xiaoluozi():smallson()
}