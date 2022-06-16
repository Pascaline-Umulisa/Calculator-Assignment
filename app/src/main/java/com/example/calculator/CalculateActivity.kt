package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class CalculateActivity : AppCompatActivity() {

    lateinit var tilFirst:TextInputLayout
    lateinit var tilSecond:TextInputLayout
    lateinit var etFirst:TextInputEditText
    lateinit var etSecond:TextInputEditText
    lateinit var btnAdd:Button
    lateinit var btnSub:Button
    lateinit var btnModulus:Button
    lateinit var btnDivide:Button
    lateinit var tvAnswer:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate)
        tilFirst=findViewById(R.id.tilFirst)
        tilSecond=findViewById(R.id.tilSecond)
        etFirst=findViewById(R.id.etFirst)
        etSecond=findViewById(R.id.etSecond)
        btnAdd=findViewById(R.id.btnAdd)
        btnSub=findViewById(R.id.btnSub)
        btnModulus=findViewById(R.id.btnModulus)
        btnDivide=findViewById(R.id.btnDivide)
        tvAnswer=findViewById(R.id.tvAnswer)

        btnAdd.setOnClickListener {
            addition()
        }
        btnSub.setOnClickListener {
            subtraction()
        }
        btnModulus.setOnClickListener {
            modulus()
        }
        btnDivide.setOnClickListener {
            division()
        }
    }
    fun addition(){
        var first=etFirst.text.toString()
        var second=etSecond.text.toString()
//        var answer=tvAnswer.text
        if (first.isBlank()){
            tilFirst.error="First number is required"
        }
        if(second.isBlank()){
            tilSecond.error="Second number is reqquired"
        }
        tvAnswer.text=first+second

    }
    fun subtraction(){
        var first=etFirst.text.toString()
        var second=etSecond.text.toString()
//        var answer=tvAnswer.text.toString()
        if (first.isBlank()){
            tilFirst.error="First number is required"
        }
        if (second.isBlank()){
            tilSecond.error="second number is required"
        }
        tvAnswer.text=first-second
    }
    fun modulus(){
        var first=etFirst.text.toString()
        var second=etSecond.text.toString()
//        var answer=tvAnswer.text.toString()
        if (first.isBlank()){
            tilFirst.error="First number is required"
        }
        if (second.isBlank()){
            tilSecond.error="second number is required"
        }
        tvAnswer.text=first%second
    }
    fun division(){
        var first=etFirst.text.toString()
        var second=etSecond.text.toString()
//        var answer=tvAnswer.text.toString()
        if (first.isBlank()){
            tilFirst.error="First number is required"
        }
        if (second.isBlank()){
            tilSecond.error="second number is required"
        }
        tvAnswer.text=first/second
    }

}