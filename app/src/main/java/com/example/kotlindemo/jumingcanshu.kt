package com.example.kotlindemo

/**
 *@auther:苗文婷
 *@Date: 2020/5/12
 *@Time:14:46
 *@Description:${DESCRIPTION}
 * */
fun main(args: Array<String>) {
    //获取长方形面积

   var cs =  getRectArea(3.0f,2.0f);
    var yz = yuanc(r = 4.0f)
    println(yz)

}
val pi = 3.14f
fun getRectArea(chang:Float,kuan:Float):Float {
    return chang*kuan
}
fun yuanc(PI:Float=pi,r:Float):Float{
    return 2*PI*r
}
fun yuans(PI:Float,d:Float):Float{
    return PI*d
}

fun yztj(PI:Float,r:Float,h:Float):Float{
    return PI*r*r*h
}
fun qiu(PI:Float,r:Float):Float{
    return 4*PI*r*r
}
