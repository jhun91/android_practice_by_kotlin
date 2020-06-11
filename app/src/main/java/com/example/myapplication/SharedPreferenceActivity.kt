package com.example.myapplication

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_shared_preference.*

class SharedPreferenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preference)

        //ShardPreference에 저장하는 방법
        val shardPreference = getSharedPreferences("sp1", Context.MODE_PRIVATE)
        //MODE
        // - MODE_PRIVATE : 생성한 application에서만 사용 가능
        // - MODE_WORLD_READABLE  : 다른 application 사용 가능 -> 읽을수만 있다.
        // - MODE_WORLD_WRITEABLE : 다른 application 사용 가능 -> 기록도 가능하다.
        // - MODE_MULTI_PROCESS : 이미 호출되어 사용중인지 체크
        // - MODE_APPEND : 기존 preference에 신규로 추가

        val editor: SharedPreferences.Editor = shardPreference.edit()
        editor.putString("hello", "안녕하세요")
        //editor.commit()

        //sp1 -> SharedPreference
        //      (Key,Value) -> ("Hello", "안녕하세요")R
        //sp2 -> SharedPreference
        //      (Key,Value) -> ("Hello", "안녕하세요11")

        save_btn.setOnClickListener {
            val editor: SharedPreferences.Editor = shardPreference.edit()
            editor.putString("hello", "안녕하세요")
            editor.putString("goodbye", "안녕히가세요")
            editor.commit()
        }

        load_button.setOnClickListener {
            //ShardPreference에 값을 불러오는 방법
            val sharedPreference = getSharedPreferences("sp1", Context.MODE_PRIVATE)
            val value1 = shardPreference.getString("hello", "데이터 없음")
            val value2 = shardPreference.getString("goodbye", "데이터 없음")

            Log.d("key-value", "Value : $value1")
            Log.d("key-value", "Value : $value2")

        }

        delete_button.setOnClickListener {
            val sharedPreference = getSharedPreferences("sp1", Context.MODE_PRIVATE)
            val editor = shardPreference.edit()
            editor.remove("hello")
            editor.commit()

        }


        delete_all.setOnClickListener {
            val sharedPreference = getSharedPreferences("sp1", Context.MODE_PRIVATE)
            val editor = shardPreference.edit()
            editor.clear()
            editor.commit()
        }
    }
}