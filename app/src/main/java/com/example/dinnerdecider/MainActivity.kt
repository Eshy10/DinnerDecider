package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // array list of the menu

        val input =  arrayListOf("Fried chicken","Jellof Rice","Fried Rice","Yam and Egg ","White Soup","Efo Riro", "Ofada and Stew", "Afang Soup", "Goat meat")

        // calling on the button using the id to add new menu to the list and also the menu added
        button_add.setOnClickListener(){
            val edit = input_menu.text.toString()
            if (edit.isEmpty()){
                Toast.makeText(this, "Please Add Your Food", Toast.LENGTH_SHORT).show()
            } else {
                input.add(edit)
            }
            input_menu.text.clear()



            }
        //random selection of the menu while clicking the button decide

        button_decide.setOnClickListener{
            menu_text.text = input.random().toString()

        }




    }
}
