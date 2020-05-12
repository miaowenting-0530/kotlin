package com.example.kotlindemo

/**
 *@auther:苗文婷
 *@Date: 2020/5/12
 *@Time:11:17
 *@Description:${DESCRIPTION}
 * */
fun loopandRange() {

}
fun main(args: Array<String>) {
    //区间 1。。100

    var nums = 1..100//声明数组1。。100 闭区间[1-100]
    var sum = 0
    for (i in nums){
        sum = sum+i;

    }
    println(sum)
    var num2 = 1 until 100 //前闭后开区间 [1-100)
    var num3 = 1..16
    //跳步执行循环
    for (a in num3.step(2)){
        println(a)
    }
    //反转
    var num4 = num3.reversed();
    for (j in num4){
        print(j)
    }
    //数组中有多少内容
  var num5 =   num4.count();

}