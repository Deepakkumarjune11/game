package com.example.game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var count=0
        val num:Int=700
var crct=Intent(this,correct::class.java)
        var wro=Intent(this,wrong::class.java)


        val guess=findViewById<TextInputLayout>(R.id.t1)?.editText?.text
        findViewById<TextView>(R.id.a1).setOnClickListener()
        {
            count=count+1
            if(guess.toString().toInt()==num && count<=12)
            {
               // findViewById<TextView>(R.id.a4).setText("You are right")
startActivity(crct)

            }
            else if(guess.toString().toInt()!=num && count<=12)
            {

                findViewById<TextView>(R.id.a4).setText("You haven't find the answer")

            }
            else
            {
                startActivity(wro)

            }

        }

    }
}