package com.example.popularmove

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fm: FragmentTransaction = supportFragmentManager.beginTransaction()
        fm.replace(R.id.container_fr,MainFragment()).commit()
    }
}