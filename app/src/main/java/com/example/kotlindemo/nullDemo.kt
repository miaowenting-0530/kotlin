package com.example.kotlindemo

/**
 *@auther:苗文婷
 *@Date: 2020/5/12
 *@Time:10:54
 *@Description:${DESCRIPTION}
 * */
fun main(args: Array<String>) {
    var res = heat("水")
    println(res)
    var res1 = heat(null)
    print(res1)
}
//加问号代表的是参数可以为空
fun heat(str:String?):String{
    return "热"+str
}