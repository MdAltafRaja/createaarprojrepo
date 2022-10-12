package io.juspay.createaarproj

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MyActivity: AppCompatActivity() {



    lateinit var mylayout : ConstraintLayout
    lateinit var textView: TextView
    lateinit var button: Button

    fun taskPrint(){
        Log.d("Let it be","Its working")
        Log.d("Other","Comig from aar file function")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        mylayout= findViewById(R.id.mylayout)
        textView= findViewById(R.id.textView)
        button = findViewById(R.id.button)

        button.setOnClickListener {
            mylayout.setBackgroundColor(Color.RED)
            textView.setText("Welcome")
        }
    }
}