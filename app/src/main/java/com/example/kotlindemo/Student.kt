package com.example.kotlindemo

import javax.security.auth.Subject

/**
 *@auther:苗文婷
 *@Date: 2020/5/11
 *@Time:8:57
 *@Description:${DESCRIPTION}
 * */

open class Student {
    /**  一、kotlin特点：
     *  1.（分号可加可不加）
     *  2.类型自动推导及类型检测（类型可声明可不声明）
     *  3.不加类型默认为public
     *二、声明变量
     *  1.变量：修饰符 var/val 名称：类型
     *
     *  2.var/val区别：var：变量值可更改
     *              val：变量值不可更改
     **/
     var name:String = "" //变量值可更改
     val age:Int = 0 //变量不可更改
    /**
     * 三、声明变量 fun 方法名称（参数）: 返回值类型
     *                                   没有返回值： Unit/省略返回值
     *   2.消除重载：参数给默认值
     * */
    //重载与返回值无关（）
   /* fun study(subject: String,money:Int):Int{
        return 50
    }*/
    //方法默认被publi final修饰/ so：被重写方法要加open
  open fun study(subject: String="Android",money:Int=20):Unit{
       /* for (i in 1..100){
            println(i)
        }
        print("===================")
        //跳不循环 每n步循环一次
        for (i in 30..60 step 2){
            println(i)
        }
        print("===================")
        //从上往下循环
        for (g in 20 downTo 10 step 2){
            println(g)
        }*/
        //foreach直接拿到元素
        val number = intArrayOf(1,2,3)
        for (i in number){
            print(i)
        }

        val arraylistOf = arrayListOf<String>("a","b","c")
        for (i in arraylistOf){
            print(i)
        }
        //获取角标
        for (a in number.iterator()){
            print(number[a]);
        }
        for (b in arraylistOf.indices){
            print(arraylistOf.get(b))
        }
        //if判断 必须有else if
        var aa :String = if (money>20)
            "哈哈哈"
        else "呜呜呜"
        print(aa);
    }

}