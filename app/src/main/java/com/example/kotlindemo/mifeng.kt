package com.example.kotlindemo

/**
 *@auther:苗文婷
 *@Date: 2020/5/12
 *@Time:20:19
 *@Description:${DESCRIPTION}
 * */
fun main(args: Array<String>) {
    var s:smallson = smallson.xiaolv()
    var s2:smallson = smallson.xiaoluozi()
    var s3:smallson = smallson.xiaolv()
    var list = listOf<smallson>(s,s2,s3)
    for (v in list){
        if (v is smallson.xiaoluozi){
            v.sayHello()
        }
    }


}