package com.example.kotlindemo

/**
 *@auther:苗文婷
 *@Date: 2020/5/12
 *@Time:19:24
 *@Description:${DESCRIPTION}
 * */
/*class Girll(name:String):Presenter(name) {
    override fun eat() {
        println("${name}小口吃")
    }
}*/

class Girll(name:String) :Presenter(name){
    override fun eat(){
        println("${name}娃娃的小口吃")
    }

    override fun sleep() {
        println("${name}睡觉不打呼噜")
    }
}