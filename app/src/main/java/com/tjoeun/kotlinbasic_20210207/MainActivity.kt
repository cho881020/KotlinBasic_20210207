package com.tjoeun.kotlinbasic_20210207

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sendBtn.setOnClickListener {

//            Ctrl + / 로 이 줄을 주석으로.
//            sendBtn이 눌리면 실행해줄 코드.

            Log.d("메인화면", "전송버튼 눌림")

        }

    }

}