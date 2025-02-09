package com.example.friend

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class addFriend : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.addfriend) // レイアウトを適用

        var Back: ImageButton = findViewById(R.id.back)

        Back.setOnClickListener {
            val intent = Intent(this, friend::class.java)//ここで遷移先設定
            // （this＝現在の場所,addFriend::class.java＝遷移先::javaのクラス型で渡す
            // Intentはjavaじゃないと駄々こねる
            startActivity(intent)//ここで遷移実行
        }
    }
}