package com.example.kotlindemo

/**
 *@auther:苗文婷
 *@Date: 2020/5/12
 *@Time:20:46
 *@Description:${DESCRIPTION}
 * */
 fun bibao():()->Unit{ //返回值是一个函数 接收参数为空 返回值类型也是空
    var a = 3
    return fun(){
        a++
        println(a)
    }
/*    fun test2(){

    }*/
}
fun main(args: Array<String>) {
    var t = bibao()
    t()
    t()
    t()
}