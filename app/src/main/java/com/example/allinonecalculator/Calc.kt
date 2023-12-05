package com.example.allinonecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Calc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc)
        AddngTwoNumbers()
    }
    fun AddngTwoNumbers(){
        val num1=findViewById<EditText>(R.id.Number1)
        val num2=findViewById<EditText>(R.id.Number2)
        val addbtn=findViewById<Button>(R.id.AddBTN)
        val subbtn=findViewById<Button>(R.id.SubtractBTN)
        val multibtn=findViewById<Button>(R.id.MultiplyBTN)
        val DivBTN=findViewById<Button>(R.id.DivideBTN)
        var Clearbtn=findViewById<Button>(R.id.ClearBTN)

        addbtn.setOnClickListener{
            val check1= num1.text.toString()
            val check2= num2.text.toString()
            if(check1.isEmpty() || check2.isEmpty() ){
                Toast.makeText(this,"values cannot be empty",Toast.LENGTH_SHORT).show()
            }else{
                val addnum1= num1.text.toString().toDouble()
                val addnum2= num2.text.toString().toDouble()
                val result=addnum1+addnum2
                Toast.makeText(this,"$result",Toast.LENGTH_SHORT).show()
        }}
        subbtn.setOnClickListener{
            val check1= num1.text.toString()
            val check2= num2.text.toString()
            if(check1.isEmpty() || check2.isEmpty() ){
                Toast.makeText(this,"values cannot be empty",Toast.LENGTH_SHORT).show()
            }else{
                val addnum1= num1.text.toString().toDouble()
                val addnum2= num2.text.toString().toDouble()
                val result=addnum1-addnum2
                Toast.makeText(this,"$result",Toast.LENGTH_SHORT).show()
            }}
        multibtn.setOnClickListener{
            val check1= num1.text.toString()
            val check2= num2.text.toString()
            if(check1.isEmpty() || check2.isEmpty() ){
                Toast.makeText(this,"values cannot be empty",Toast.LENGTH_SHORT).show()
            }else{
                val addnum1= num1.text.toString().toDouble()
                val addnum2= num2.text.toString().toDouble()
                val result=addnum1*addnum2
                Toast.makeText(this,"$result",Toast.LENGTH_SHORT).show()
            }}
        DivBTN.setOnClickListener{
            val check1= num1.text.toString()
            val check2= num2.text.toString()
            if(check1.isEmpty() || check2.isEmpty() ){
                Toast.makeText(this,"values cannot be empty",Toast.LENGTH_SHORT).show()
            }else{
                val addnum1= num1.text.toString().toDouble()
                val addnum2= num2.text.toString().toDouble()
                if (addnum2==0.0){
                    android.widget.Toast.makeText(this,"You can not divide by 0", android.widget.Toast.LENGTH_SHORT).show()
                }else{
                    val result=addnum1/addnum2
                    Toast.makeText(this,"$result",Toast.LENGTH_SHORT).show()
                }
            }}


        Clearbtn.setOnClickListener{
            num1.setText("");
            num2.setText("");
            Toast.makeText(this,"Cleared",Toast.LENGTH_SHORT).show()
        }
    }
}