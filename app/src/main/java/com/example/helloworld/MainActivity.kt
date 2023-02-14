package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.helloworld.R.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView
    lateinit var diceImage2 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
        val rollButton: Button = findViewById(id.roll_button)
        diceImage = findViewById(id.dice_image)
        diceImage2 = findViewById(id.dice_new_image)
        rollButton.setOnClickListener { rollDice() }
        val countUpButton: Button = findViewById(id.count_up_button)
        countUpButton.setOnClickListener{ countUp() }
        val resetButton: Button = findViewById(id.reset_button)
        resetButton.setOnClickListener { reset() }
    }

    private fun rollDice() {
        diceImage.setImageResource(getRandomImage())
        diceImage2.setImageResource(getRandomImage())
    }

    private fun getRandomImage() : Int {
        return when ((1..6).random()) {
            1 -> drawable.dice_1
            2 -> drawable.dice_2
            3 -> drawable.dice_3
            4 -> drawable.dice_4
            5 -> drawable.dice_5
            else -> drawable.dice_6
        }
    }

    private fun countUp(){
//        val resultText: TextView = findViewById(R.id.result_text)
//        if(resultText.text.toString() == "Hello World!"){
//            resultText.text = "1"
//        }else if (resultText.text.toString().toInt() < 6){
//            val resultInt = resultText.text.toString().toInt()+1
//            resultText.text = resultInt.toString()
//        }
    }

    private fun reset(){
//        val resultText: TextView = findViewById(R.id.result_text)
//        resultText.text = "0"
    }
}