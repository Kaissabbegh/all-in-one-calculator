package com.example.allinonecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import kotlin.text.format as format1

class WeightConv : AppCompatActivity() {
    private val data= arrayOf("Kg","Pound","Ounce")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weight_conv)
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
                Toast.makeText(this,"Change one of the units",Toast.LENGTH_SHORT).show()
            }else if (item1=="Kg" && item2 == "Pound"){
                val addnum1= from.text.toString().toDouble()
                val result=addnum1 * 2.20462
                to.text=result.toString()
            }else if (item1=="Pound" && item2 == "Kg"){
                val addnum1= from.text.toString().toDouble()
                val result=addnum1 / 2.20462
                to.text=result.toString()
            }else if (item1=="Kg" && item2 == "Ounce"){
                val addnum1= from.text.toString().toDouble()
                val result=addnum1 * 35.274
                to.text=result.toString()
            }else if (item1=="Ounce" && item2 == "Kg"){
                val addnum1= from.text.toString().toDouble()
                val result=addnum1 / 35.274
                to.text=result.toString()
            }else if (item1=="Pound" && item2 == "Ounce"){
                val addnum1= from.text.toString().toDouble()
                val result=addnum1 * 16
                to.text=result.toString()
            }else if (item1=="Ounce" && item2 == "Pound"){
                val addnum1= from.text.toString().toDouble()
                val result=addnum1 / 16
                to.text=result.toString()
            }
        }

    }
}