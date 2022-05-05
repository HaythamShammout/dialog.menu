package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.*

class compDialog {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val cancelbt: Button=view.findViewById(R.id.cancelBT)
        val submitbt: Button=view.findViewById(R.id.submitBT)
        cancelbt.setOnClickListener{
            dismiss()
        }
        submitbt.setOnClickListener{
            val num1:TextView=view.findViewById(R.id.editTextNumber)
            val num2:TextView=view.findViewById(R.id.editTextNumber2)
            if(num1.toString().toFloat()>num2.toString().toFloat()){
                Toast.makeText(context,"num1 > num2",Toast.LENGTH_LONG).show()
            }
            else if (num2.toString().toFloat()>num1.toString().toFloat()){
                Toast.makeText(context,"num2 > num1",Toast.LENGTH_LONG).show()
            }
            else
                Toast.makeText(context,"num2 = num1",Toast.LENGTH_LONG).show()
        }
    }
}