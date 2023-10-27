package com.example.colors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.example.colors.R.id.textView2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonViolet = findViewById<Button>(R.id.btnViolet)
        val buttonIndigo = findViewById<Button>(R.id.btnIndigo)
        val buttonBlue = findViewById<Button>(R.id.btnBlue)
        val buttonGreen = findViewById<Button>(R.id.btnGreen)
        val buttonYellow = findViewById<Button>(R.id.btnYellow)
        val buttonOrange = findViewById<Button>(R.id.btnOrange)
        val buttonRed = findViewById<Button>(R.id.btnRed)
        val layout = findViewById<LinearLayout>(R.id.LinearLayout)
        val text = findViewById<TextView>(textView2)

        buttonViolet.setOnClickListener{
            layout.setBackgroundResource(R.color.violet)

            Toast.makeText(applicationContext,"Violet",Toast.LENGTH_SHORT).show()
        }
        buttonIndigo.setOnClickListener{
            layout.setBackgroundResource(R.color.indigo)

            Toast.makeText(applicationContext,"Indigo",Toast.LENGTH_SHORT).show()
        }
        buttonBlue.setOnClickListener{
            layout.setBackgroundResource(R.color.blue)

            Toast.makeText(applicationContext,"Blue",Toast.LENGTH_SHORT).show()
        }
        buttonGreen.setOnClickListener{
            layout.setBackgroundResource(R.color.green)

            Toast.makeText(applicationContext,"Green",Toast.LENGTH_SHORT).show()
        }
        buttonYellow.setOnClickListener{
            layout.setBackgroundResource(R.color.yellow)

            Toast.makeText(applicationContext,"Yellow",Toast.LENGTH_SHORT).show()
        }
        buttonOrange.setOnClickListener{
            layout.setBackgroundResource(R.color.orange)

            Toast.makeText(applicationContext,"Orange",Toast.LENGTH_SHORT).show()
        }
        buttonRed.setOnClickListener{
            layout.setBackgroundResource(R.color.red)

            Toast.makeText(applicationContext,"Red",Toast.LENGTH_SHORT).show()
        }
    }
}