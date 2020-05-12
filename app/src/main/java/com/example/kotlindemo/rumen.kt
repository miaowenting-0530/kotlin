package com.example.kotlindemo

/**
 *@auther:苗文婷
 *@Date: 2020/5/12
 *@Time:15:53
 *@Description:${DESCRIPTION}
 * */
class Rect(var height:Int,var width:Int)

class Girl(var chactor:String,var voice:String){//看、静态
    fun smaile(){//动态方法
        println("给我笑！！！哈哈哈哈...")
    }
    fun cry(){
        println("哭个大头鬼！！不哭！！")
    }
}
fun main(args: Array<String>) {
    var rect01 = Rect(10,10)
    println("矩形高度:${rect01.height}")
    println("矩形宽度:${rect01.width}")

    var gilrs = Girl("可爱","御姐")
    println(gilrs.voice)

    gilrs.smaile()
    gilrs.cry()

}