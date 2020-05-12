package com.example.kotlindemo

/**
 *@auther:苗文婷
 *@Date: 2020/5/12
 *@Time:19:59
 *@Description:${DESCRIPTION}
 * */
class SmallHead :IWashBowl by BigHead(){
    override fun xiwan() {
        println("大头爸爸在洗碗,赚了十块")
        BigHead().xiwan()
        println("看着儿子八万洗完了")
    }
}