package com.tjoeun.kotlinbasic_20210207

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        전송버튼이 눌렸을때 할 일을 지정
        sendBtn.setOnClickListener {

//            Ctrl + / 로 이 줄을 주석으로.
//            sendBtn이 눌리면 실행해줄 코드.

            Log.d("메인화면", "전송버튼 눌림")

        }

//        로그 버튼이 눌리면 할일을 별도로 지정
        logBtn.setOnClickListener {
            Log.d("메인화면", "로그버튼 눌림")
        }

    }

}