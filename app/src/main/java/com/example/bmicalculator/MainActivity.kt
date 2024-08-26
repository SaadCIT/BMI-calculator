package com.example.bmicalculator

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.bmicalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)


        setContentView(binding.root)

        binding.showbtn.setOnClickListener {

            val hight = binding.hightet.text.toString().toDouble()/100
            val weight = binding.wightet.text.toString().toDouble()

            val BMI = weight/(hight*hight)

            binding.BMItv.text = String.format("BMI is : %.2f", BMI)

            binding.BMItype.text = when(BMI){

                in 1.00..10.4 -> "Under Wight"
                in 10.5..25.5 -> "Perfect"
                in 25.6..30.50 -> "Over Weight"
                in 30.51..50.50 -> "Obesity"
                else -> "BMI is Invalid/Over"

            }


        }



    }
}