package com.example.atv1_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.atv1_android.R.layout
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
    }

        fun onSubmit(view: View){
            val currentYear = Calendar.getInstance().get(Calendar.YEAR)
            tvAge.text = "age: " + (currentYear - colocarIdade.text.toString().toInt())
        }
}
