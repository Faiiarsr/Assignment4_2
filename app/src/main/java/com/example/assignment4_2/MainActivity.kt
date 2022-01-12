package com.example.assignment4_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener{
            var a1 = p1.text.toString()
            var a2 = p2.text.toString()
            var a3 = p3.text.toString()
            var a4 = p4.text.toString()
            var a5 = p5.text.toString()
            var b1 = c1.text.toString()
            var b2 = c2.text.toString()
            var b3 = c3.text.toString()
            var b4 = c4.text.toString()
            var b5 = c5.text.toString()

            if (b1.isEmpty() || b2.isEmpty() || b3.isEmpty() || b4.isEmpty() || b5.isEmpty())
                return@setOnClickListener Toast.makeText(this@MainActivity, "Please Input All Text Box Before Press OK !!!", Toast.LENGTH_SHORT).show()

            if (a1.isEmpty() || a2.isEmpty() || a3.isEmpty() || a4.isEmpty() || a5.isEmpty())
                return@setOnClickListener Toast.makeText(this@MainActivity, "Please Input All Text Box Before Press OK !!!", Toast.LENGTH_SHORT).show()

            if (s1.text.isEmpty() || s2.text.isEmpty() || s3.text.isEmpty() || s4.text.isEmpty() || s5.text.isEmpty())
                return@setOnClickListener Toast.makeText(this@MainActivity, "Please Input All Text Box Before Press OK !!!", Toast.LENGTH_SHORT).show()

            var total = b1.toInt() + b2.toInt() + b3.toInt() + b4.toInt() + b5.toInt()
            textView7.text = total.toString()

            var total1 = 0.0
            total1 += (b1.toDouble() * a1.toDouble())
            total1 += (b2.toDouble() * a2.toDouble())
            total1 += (b3.toDouble() * a3.toDouble())
            total1 += (b4.toDouble() * a4.toDouble())
            total1 += (b5.toDouble() * a5.toDouble())
            textView8.text = String.format("%.2f", total1 / total)
        }
        button2.setOnClickListener {
            c1.text.clear()
            c2.text.clear()
            c3.text.clear()
            c4.text.clear()
            c5.text.clear()
            p1.text.clear()
            p2.text.clear()
            p3.text.clear()
            p4.text.clear()
            p5.text.clear()
            s1.text.clear()
            s2.text.clear()
            s3.text.clear()
            s4.text.clear()
            s5.text.clear()
            textView7.text = ""
            textView8.text = ""
        }
    }
    }
