package com.example.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
/**
 * （分号可写可不写）
 * 声明变量 java： 修饰符 类型 名称
 *          kotlin：修饰符 var/val 名称：类型
 *声明方法 kotlin：fun 方法名称（参数）: 返回值类型
 * 声明类  默认被public final 修饰（被继承时加open）
*/

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //new Student类
        var student:Student = Student();
        student.name = "哈哈"
        student.study();
        student.study("haha")
        student.study(money = 300)


    }
}
