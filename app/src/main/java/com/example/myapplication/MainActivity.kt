package com.example.myapplication

import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
companion object {
    lateinit var sp: SharedPreferences
    lateinit var edit: SharedPreferences.Editor
}
    lateinit var txt: TextView
    lateinit var plus: ImageView
    var i = 1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sp = getSharedPreferences("mynamee", MODE_PRIVATE)
        edit = sp.edit()

        i= sp.getInt("value",1)

        txt = findViewById(R.id.txt)
        plus = findViewById(R.id.plus)
        txt.setText(i.toString())

        plus.setOnClickListener {

            i++;
            edit.putInt("value",i)
            edit.apply()
            txt.setText(i.toString())


        }



    }
}