package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.calc.*

class Test : AppCompatActivity() {

    private var firstValue: String = "0"
    var secondValue: String = "0"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calc)

        num1.setOnClickListener {
            firstValue += "1"
            result.text = firstValue
            Log.d("value", firstValue)
        }
        num2.setOnClickListener {
            firstValue += "2"
            result.text = firstValue
            Log.d("value", firstValue)
        }
        num3.setOnClickListener {
            firstValue += "3"
            result.text = firstValue
            Log.d("value", firstValue)
        }
        num4.setOnClickListener {
            firstValue += "4"
            result.text = firstValue
            Log.d("value", firstValue)
        }
        num5.setOnClickListener {
            firstValue += "5"
            result.text = firstValue
            Log.d("value", firstValue)
        }
        num6.setOnClickListener {
            firstValue += "6"
            result.text = firstValue
            Log.d("value", firstValue)
        }
        num7.setOnClickListener {
            firstValue += "7"
            result.text = firstValue
            Log.d("value", firstValue)
        }
        num8.setOnClickListener {
            firstValue += "8"
            result.text = firstValue
            Log.d("value", firstValue)
        }
        num9.setOnClickListener {
            firstValue += "9"
            result.text = firstValue
            Log.d("value", firstValue)
        }
        num0.setOnClickListener {
            firstValue += "0"
            result.text = firstValue
            Log.d("value", firstValue)
        }
        numCa.setOnClickListener {
            firstValue = "0"
            secondValue = "0"
            result.text = "0"
        }
        numPlus.setOnClickListener {
            secondValue = (firstValue.toInt() + secondValue.toInt()).toString()
            firstValue = "0"
            result.text = secondValue
        }

    }
}