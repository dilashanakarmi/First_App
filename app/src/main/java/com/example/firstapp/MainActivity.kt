package com.example.simplecalculator

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1 = findViewById<EditText>(R.id.editTextNumber1)
        val num2 = findViewById<EditText>(R.id.editTextNumber2)
        val result = findViewById<TextView>(R.id.resultText)

        val addBtn = findViewById<Button>(R.id.addBtn)
        val subBtn = findViewById<Button>(R.id.subBtn)
        val mulBtn = findViewById<Button>(R.id.mulBtn)
        val divBtn = findViewById<Button>(R.id.divBtn)

        addBtn.setOnClickListener {
            val sum = num1.text.toString().toDouble() + num2.text.toString().toDouble()
            result.text = "Result: $sum"
        }

        subBtn.setOnClickListener {
            val diff = num1.text.toString().toDouble() - num2.text.toString().toDouble()
            result.text = "Result: $diff"
        }

        mulBtn.setOnClickListener {
            val product = num1.text.toString().toDouble() * num2.text.toString().toDouble()
            result.text = "Result: $product"
        }

        divBtn.setOnClickListener {
            val divisor = num2.text.toString().toDouble()
            if (divisor != 0.0) {
                val quotient = num1.text.toString().toDouble() / divisor
                result.text = "Result: $quotient"
            } else {
                result.text = "Cannot divide by zero"
            }
        }
    }
}
