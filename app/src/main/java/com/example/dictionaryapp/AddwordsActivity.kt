package com.example.dictionaryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class AddwordsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addwords)

        var addWords_btn = findViewById<Button>(R.id.bt_addwords_submit)

        addWords_btn.setOnClickListener(View.OnClickListener {
            backToMain()
        })

    }

    fun backToMain(){
        val toMainActivity = Intent(this, MainActivity::class.java)
        startActivity(toMainActivity)
        finish()
    }



}
