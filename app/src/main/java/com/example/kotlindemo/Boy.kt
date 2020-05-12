package com.example.kotlindemo

/**
 *@auther:苗文婷
 *@Date: 2020/5/12
 *@Time:19:19
 *@Description:${DESCRIPTION}
 * */
class Boy(name:String) :Presenter(name){
   override fun eat(){
        println("${name}娃娃的大口吃")
    }

    override fun sleep() {
        println("${name}睡觉打呼噜")
    }
}