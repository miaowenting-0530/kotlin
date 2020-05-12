package com.example.kotlindemo

/**
 *@auther:苗文婷
 *@Date: 2020/5/11
 *@Time:9:54
 *@Description:${DESCRIPTION}
 * */
//继承
class AndroidStudent :Student() {
    override fun study(subject: String, money: Int) {
        super.study(subject, money)
    }
}