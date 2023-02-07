package com.example.treecycle.presentation.education

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.treecycle.data.util.chapterCards
import com.example.treecycle.databinding.ActivityEducationCardsBinding

class EducationCardsActivity : AppCompatActivity() {
    private val binding: ActivityEducationCardsBinding by lazy {
        ActivityEducationCardsBinding.inflate(layoutInflater)
    }

    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.tvHashtag.text = chapterCards[counter].hashTag
        binding.tvContent.text = chapterCards[counter].content

        binding.btnMarkAsRead.setOnClickListener {
            if (counter < chapterCards.size - 1) {
                counter++
                binding.tvHashtag.text = chapterCards[counter].hashTag
                binding.tvContent.text = chapterCards[counter].content
            } else {
                binding.llBgLayer1.visibility = View.VISIBLE
                binding.llBgLayer2.visibility = View.VISIBLE
                binding.btnPrev.isClickable = false
                binding.btnMarkAsRead.isClickable = false
            }
        }

        binding.btnPrev.setOnClickListener {
            if (counter > 0) {
                counter--
                binding.tvHashtag.text = chapterCards[counter].hashTag
                binding.tvContent.text = chapterCards[counter].content
            }
        }

        binding.btnContinueLearning.setOnClickListener {
            finish()
        }

    }

}