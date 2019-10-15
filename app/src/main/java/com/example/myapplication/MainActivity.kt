package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Create the UI
        //R = resources
        setContentView(R.layout.activity_main)
        //TODO Continue your work here
        //val = value, var = variable
        val buttonHelloWorld : Button = findViewById(R.id.buttonHelloWorld)
        val buttonReset : Button = findViewById(R.id.buttonReset)
        buttonHelloWorld.setOnClickListener { showMessage()  }
        buttonReset.setOnClickListener { notShowMessage()  }

    }

    private fun showMessage() {
        val textViewMessage : TextView = findViewById(R.id.textViewMessage)
        textViewMessage.setText("Hello Ng Jing Han")
    }

    private fun notShowMessage() {
        val textViewMessage : TextView = findViewById(R.id.textViewMessage)
        val text : TextView = findViewById(R.id.buttonHelloWorld)
        textViewMessage.set(text)
    }
}
