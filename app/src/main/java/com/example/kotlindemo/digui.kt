package com.example.kotlindemo

/**
 *@auther:苗文婷
 *@Date: 2020/5/12
 *@Time:15:36
 *@Description:${DESCRIPTION}
 * */
fun main(args: Array<String>) {
    //阶乘
    println("请输入一个数字")
    var num = readLine();
    var nums:Int = num!!.toInt();
    println(fact(nums))

}
fun fact(num:Int): Int {
    if (num==1){
        return 1
    }else{
        return num* fact(num-1)
    }
}