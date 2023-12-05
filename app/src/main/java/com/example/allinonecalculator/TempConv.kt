package com.example.allinonecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

class TempConv : AppCompatActivity() {
    private val data= arrayOf("Celsuis","fahrenheit","kelvin")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_temp_conv)
        val from=findViewById<EditText>(R.id.et_firstConversion)
        val to=findViewById<TextView>(R.id.et_secondConversion)
        val spinner=findViewById<Spinner>(R.id.spinner_firstConversion)
        val calcbtn=findViewById<Button>(R.id.buttonCalc)
        val arrayAdapter = ArrayAdapter<String> (this,android.R.layout.simple_spinner_dropdown_item,data)
        spinner.adapter=arrayAdapter
        val spinner2=findViewById<Spinner>(R.id.spinner_secondConversion)
        val arrayAdapter2= ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,data)
        spinner2.adapter=arrayAdapter2
        calcbtn.setOnClickListener{
            val item1= spinner.selectedItem.toString()
            val item2= spinner2.selectedItem.toString()
            if (item1==item2) {
                Toast.makeText(this,"Change one of the units", Toast.LENGTH_SHORT).show()
            }else if (item1=="Celsuis" && item2 == "fahrenheit"){
                val addnum1= from.text.toString().toDouble()
                val result= ((addnum1 * (5/9)) +32)
                to.text=result.toString()
            }else if (item1=="fahrenheit" && item2 == "Celsuis"){
                val addnum1= from.text.toString().toDouble()
                val result=((addnum1 - 32) * (5/9))
                to.text=result.toString()
            }else if (item1=="Celsuis" && item2 == "kelvin"){
                val addnum1= from.text.toString().toDouble()
                val result=addnum1 + 273.15
                to.text=result.toString()
            }else if (item1=="kelvin" && item2 == "Celsuis"){
                val addnum1= from.text.toString().toDouble()
                val result=addnum1 - 273.15
                to.text=result.toString()
            }else if (item1=="fahrenheit" && item2 == "kelvin"){
                val addnum1= from.text.toString().toDouble()
                val result=((addnum1 * (5/9)) +32) + 273.15
                to.text=result.toString()
            }else if (item1=="kelvin" && item2 == "fahrenheit"){
                val addnum1= from.text.toString().toDouble()
                val result=((addnum1 * (5/9)) +32) - 273.15
                to.text=result.toString()
            }
        }

    }
}