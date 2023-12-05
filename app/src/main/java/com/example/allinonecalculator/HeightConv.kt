package com.example.allinonecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

class HeightConv : AppCompatActivity() {
    private val data= arrayOf("Meter","Foot","Inch")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_height_conv)
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
            }else if (item1=="Meter" && item2 == "Foot"){
                val addnum1= from.text.toString().toDouble()
                val result=addnum1 * 3.281
                to.text=result.toString()
            }else if (item1=="Foot" && item2 == "Meter"){
                val addnum1= from.text.toString().toDouble()
                val result=addnum1 / 3.281
                to.text=result.toString()
            }else if (item1=="Meter" && item2 == "Inch"){
                val addnum1= from.text.toString().toDouble()
                val result=addnum1 * 39.37
                to.text=result.toString()
            }else if (item1=="Inch" && item2 == "Meter"){
                val addnum1= from.text.toString().toDouble()
                val result=addnum1 / 39.37
                to.text=result.toString()
            }else if (item1=="Foot" && item2 == "Inch"){
                val addnum1= from.text.toString().toDouble()
                val result=addnum1 * 12
                to.text=result.toString()
            }else if (item1=="Inch" && item2 == "Foot"){
                val addnum1= from.text.toString().toDouble()
                val result=addnum1 / 12
                to.text=result.toString()
            }
        }

    }
}