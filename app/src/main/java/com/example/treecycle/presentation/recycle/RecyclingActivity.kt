package com.example.treecycle.presentation.recycle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.treecycle.databinding.ActivityRecyclingBinding

class RecyclingActivity : AppCompatActivity() {
    private val binding: ActivityRecyclingBinding by lazy {
        ActivityRecyclingBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}