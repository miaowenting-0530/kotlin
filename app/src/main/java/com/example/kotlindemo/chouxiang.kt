package com.example.kotlindemo

/**
 *@auther:苗文婷
 *@Date: 2020/5/12
 *@Time:19:26
 *@Description:${DESCRIPTION}
 * */
fun main(args: Array<String>) {
    var man = Boy("张三")
    var man2 = Boy("张三1")
    var man3 = Boy("张三1")
    man.eat()
    var woman = Girll("李四")
    var woman2 = Girll("李四1")
    woman.eat()
    var houselist = listOf<Presenter>(man,man2,man3,woman,woman2)

    for (h in houselist){
        h.sleep()
    }

}