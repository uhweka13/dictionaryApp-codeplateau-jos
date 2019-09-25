package com.example.dictionaryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class editwordsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editwords)

        var btnEditWord = findViewById<Button>(R.id.bt_edittext_btn)

        btnEditWord.setOnClickListener(View.OnClickListener {
            backtomain()
        })
    }

    fun backtomain(){
        val toMainActivity = Intent(this, MainActivity::class.java)
        startActivity(toMainActivity)
        finish()
    }
}
