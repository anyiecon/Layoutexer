package com.anye.layoutexer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iniciarComponentes()
    }
    private  fun iniciarComponentes(){
        val btnLinear: Button= findViewById(R.id.button)
        val btnTable: Button=findViewById(R.id.button2)
        val btnGrid: Button=findViewById(R.id.button3)
        val btnRelative: Button=findViewById(R.id.button4)
        val btnFrame: Button=findViewById(R.id.button5)
        val btnScroll: Button=findViewById(R.id.button6)
        val btnEjemplo: Button=findViewById(R.id.button7)

        btnLinear.setOnClickListener{onClick(1)}
        btnTable.setOnClickListener{onClick(2)}
        btnGrid.setOnClickListener{onClick(3)}
        btnRelative.setOnClickListener{onClick(4)}
        btnFrame.setOnClickListener{onClick(5)}
        btnScroll.setOnClickListener{onClick(6)}
        btnEjemplo.setOnClickListener{onClick(7)}

    }

    private fun onClick(newButton: Int){
        when(newButton){
            1->startActivity(Intent(this,Linear::class.java))
            2->startActivity(Intent(this,Table::class.java))
            3->startActivity(Intent(this,Grid::class.java))
            4->startActivity(Intent(this,Relative::class.java))
            5->startActivity(Intent(this,Frame::class.java))
            6->startActivity(Intent(this,Scroll::class.java))
            7->startActivity(Intent(this,Ejemplo::class.java))

        }

    }
}