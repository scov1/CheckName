package org.step.checkname

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.regex.Pattern

class MainActivity : AppCompatActivity() {


    lateinit var inputTxt:EditText
    lateinit var showTxt:TextView
    lateinit var btnCheck:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        inputTxt = findViewById(R.id.input_txt)
        showTxt = findViewById(R.id.show_txt)
        btnCheck = findViewById(R.id.status)

        btnCheck.setOnClickListener{
            if(Pattern.compile("[0-9]").matcher(inputTxt.text).find()){

                showTxt.setTextColor(Color.parseColor("#ed0231"))
                showTxt.text="Error,we have digits in our name!"
            }
            else{
                showTxt.setTextColor(Color.parseColor("#c2c1c7"))
                showTxt.text="Everithing looks fine!"
            }
        }
    }


}