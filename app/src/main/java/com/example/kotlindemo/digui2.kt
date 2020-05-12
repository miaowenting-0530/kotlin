package com.example.kotlindemo

/**
 *@auther:苗文婷
 *@Date: 2020/5/12
 *@Time:15:45
 *@Description:${DESCRIPTION}
 * */
fun main(args: Array<String>) {
    //累加
    println("请输入一个数")
    var num = readLine();
    var num2:Int = num!!.toInt();
    println(ollAdd(num2))
}
fun ollAdd(num:Int) : Int{
    if (num ==1){
        return 1
    }else{
        return num+ ollAdd(num-1)
    }
}