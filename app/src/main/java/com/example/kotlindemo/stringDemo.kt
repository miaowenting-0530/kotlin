package com.example.kotlindemo

/**
 *@auther:苗文婷
 *@Date: 2020/5/12
 *@Time:10:45
 *@Description:${DESCRIPTION}
 * */
class stringDemo {
}

fun main(args: Array<String>) {
    var str1 = "张三"
    var str2 = "李四"
    //==判断两个字符串是否相等
    //== 等价于 .equals
    println(str1==str2)
    println(str1.equals(str2))
    println(str1.equals(str2,true))
                                    //true 忽略字母大小写 false不忽略字母大小写

}