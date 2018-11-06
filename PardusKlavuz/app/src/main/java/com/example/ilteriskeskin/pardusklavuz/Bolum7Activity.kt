package com.example.ilteriskeskin.pardusklavuz

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Bolum7Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bolum7)
    }

    fun geri(view: View) {
        val i = Intent(this, Bolum6Activity::class.java)
        startActivity(i)
    }

    fun ileri(view: View) {
        val i = Intent(this, Bolum7Activity::class.java)
        startActivity(i)
    }

    fun home(view: View) {
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }
}