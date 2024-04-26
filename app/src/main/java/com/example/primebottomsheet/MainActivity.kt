package com.example.primebottomsheet

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.example.primebottomsheet.databinding.ActivityMainBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val bottomSheetFragment = PrimeDialogFragment()
        binding.bottomSheetLauncher.setOnClickListener {
            //conditional check to avoid multiple instances of the bottom sheet hence preventing the crashing of the app
            if (!bottomSheetFragment.isAdded) {
                Toast.makeText(it.context, "Bottom Sheet Clicked", Toast.LENGTH_SHORT).show()
                bottomSheetFragment.show(supportFragmentManager, bottomSheetFragment.tag)
            }
        }

    }
}