package com.example.coctailapi.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.coctailapi.R
import com.example.coctailapi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      setContentView(binding.root)
   }
}