package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userField: EditText = findViewById(R.id.userField)
        val buttonClick: Button = findViewById(R.id.buttonClick)
        val resultView: TextView = findViewById(R.id.resultView)

        val numberList: NumberList = NumberList()
        resultView.setText(numberList.getBasicListToText())

        buttonClick.setOnClickListener {
            if(!userField.text.isEmpty()) {
                val number = userField.text.toString().toInt()
                resultView.setText(numberList.getUpdatedListToText(number))
            }
        }
    }
}