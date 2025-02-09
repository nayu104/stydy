package com.example.friend

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView


class friend : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.friend) // レイアウトを適用

        var Name : EditText = findViewById(R.id.MyName)
        var add : ImageButton = findViewById(R.id.addBotton)
        var Back : ImageButton = findViewById(R.id.back)
        var a = 0

        add.setOnClickListener {
            val intent = Intent(this, addFriend::class.java)//ここで遷移先設定
            // （this＝現在の場所,addFriend::class.java＝遷移先::javaのクラス型で渡す
            // Intentはjavaじゃないと駄々こねる
            startActivity(intent)//ここで遷移実行

        }

    }
}

