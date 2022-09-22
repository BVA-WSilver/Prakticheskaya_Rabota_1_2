package com.gwsilver.prakticheskaya_rabota_1_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    val MyList = listOf('а', 'б', 'в')      // Коллекция с элементами
    val Empty_List = mutableListOf<Char>()  // Пустая коллекция

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var MyViwe = findViewById<TextView>(R.id.View_Text)


        for (s in MyList)                   // Этот цикл наполняет пустую коллекцию символами
            Empty_List.add(s)               // Из колекции с элементами


        MyViwe.text = Empty_List.toString() // Вывод на Экран
    }
}