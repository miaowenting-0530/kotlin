package com.example.kotlindemo

/**
 *@auther:苗文婷
 *@Date: 2020/5/12
 *@Time:10:00
 *@Description:${DESCRIPTION}
 * */
fun main(args: Array<String>) {
    var a = 3
    var b = 5
    //将数值转为字符串打印${}
    print("${a}和${b}较大的值为 ${returnBig(a,b)}");
}
fun returnBig(a:Int,b:Int):Int{
    if(a>b) return a else return b

}