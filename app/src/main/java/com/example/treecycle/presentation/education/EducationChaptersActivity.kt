package com.example.treecycle.presentation.education

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.treecycle.data.util.climateChangeChapters
import com.example.treecycle.databinding.ActivityEducationChaptersBinding
import com.example.treecycle.presentation.education.adapter.ChapterAdapter

class EducationChaptersActivity : AppCompatActivity() {
    private val binding: ActivityEducationChaptersBinding by lazy {
        ActivityEducationChaptersBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.rvChapters.adapter = ChapterAdapter(climateChangeChapters)
    }
}