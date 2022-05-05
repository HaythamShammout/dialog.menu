package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val comp:Button =findViewById(R.id.button)
        comp.setOnClickListener{
            var dia = compDialog()
            dia.show(supportFragmentManager,"compare dialog")
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.first_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.item1-> Toast.makeText(this, "item 1 selected ", Toast.LENGTH_SHORT).show()
            androidx.core.R.id.item2->Toast.makeText(this,"item 2 selected ",Toast.LENGTH_SHORT).show()
            androidx.core.R.id.item3->Toast.makeText(this,"item 2 selected ",Toast.LENGTH_SHORT).show()
        }
        return true
    }

}