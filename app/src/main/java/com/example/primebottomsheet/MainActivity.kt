package com.example.primebottomsheet

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.primebottomsheet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val bottomSheetFragment = PrimeDialogFragment()
        binding.bottomSheetLauncher.setOnClickListener {
            Toast.makeText(it.context, "Bottom Sheet Clicked", Toast.LENGTH_SHORT).show()
            bottomSheetFragment.show(supportFragmentManager, bottomSheetFragment.tag)
        }


    }
}