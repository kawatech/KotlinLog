package jp.techacademy.naoki.kawamata.kotlinlog

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log   // ここを追加

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val human = Human("直樹",62,"自転車")      // 名前をポチ、年齢3歳で、Dogのインスタンスを作る

        human.say()
        human.think()

    }



}
