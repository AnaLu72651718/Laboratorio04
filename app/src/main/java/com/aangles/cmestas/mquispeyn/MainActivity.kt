package com.aangles.cmestas.mquispeyn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initUI()
    }

        fun initUI(){
            registro.setOnClickListener{ accessToDetail()

        }

    }

        fun accessToDetail() {
            if(periodo.text.toString().isNotEmpty()){


       }

    }
}