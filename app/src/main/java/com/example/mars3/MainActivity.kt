package com.example.mars3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {~g

    val marsGravity = 0.38

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val weight: EditText = findViewById(R.id.hint_weight_edit_text)
        val weightButton: Button = findViewById(R.id.show_weight_button)
        val resultText: TextView = findViewById(R.id.result_text_view)

        weightButton.setOnClickListener {

            var result = calculateWeight(weight.text.toString().toDouble())

            resultText.text = result.toString()


        }


    }


    fun calculateWeight(userWeight: Double): Double {


        return userWeight * marsGravity

    }


}