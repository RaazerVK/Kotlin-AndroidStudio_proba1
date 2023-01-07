package com.example.myfirstproject_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.example.myfirstproject_kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    //точка входа (условная) - то, что раньше было fun main


        // действия которые будут выполняться по щелку на кнопку
     binding.calcSumButton.setOnClickListener {

         //ввод данных
         val number1: Int = binding.number1EditText.text.toString().toInt()
         val number2: Int = binding.number2EditText.text.toString().toInt()

         //вычисление суммы
         val sum:Int = number1 + number2

         //вывод данных на экран
         binding.SumResultTextView.text = sum.toString()

     }
    }
}