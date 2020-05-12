package com.example.kotlindemo

/**
 *@auther:苗文婷
 *@Date: 2020/5/12
 *@Time:11:01
 *@Description:${DESCRIPTION}
 * */
//10分满分9干的不错8分还可以7分还需努力6分刚好及格其他(需要加油啦)|
fun main(args: Array<String>) {
    graede(10)
    Day("蒙山大佛")
}
fun graede(score:Int){
    when(score){
        10 -> println("满分")
        9 -> println("9")
        8 -> println("8")
        7 -> println("7")
        6 -> println("6")
        else -> println("还需加油")
    }
}
fun Day(name:String){

    var diary = "今天天气晴朗，万里无云，我们去${name}游玩，首先映入眼帘的是,${name} ${numtoString(name.length)}个镐金大字"
    print(diary)

}
fun numtoString(num:Int):String{
   var numo =  when(num){
        1-> "一"
        2-> "二"
        3-> "三"
        4-> "四"
        5-> "五"
        else ->"忘了几"

    }
    return numo
}