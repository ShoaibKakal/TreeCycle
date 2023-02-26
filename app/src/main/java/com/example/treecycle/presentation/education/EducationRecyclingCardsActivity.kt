package com.example.treecycle.presentation.education

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.treecycle.R
import com.example.treecycle.data.util.ChapterCard
import com.example.treecycle.data.util.climateChangeChapters
import com.example.treecycle.data.util.recyclingChapters
import com.example.treecycle.databinding.ActivityEducationCardsBinding
import com.example.treecycle.databinding.ActivityEducationRecyclingCardsBinding

class EducationRecyclingCardsActivity : AppCompatActivity() {

    private val binding: ActivityEducationRecyclingCardsBinding by lazy {
        ActivityEducationRecyclingCardsBinding.inflate(layoutInflater)
    }

    var counter = 0
    lateinit var chapterCard: ArrayList<ChapterCard>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val bundle = intent?.extras
        val string = bundle?.getString("KEY").toString()

        for (cd in recyclingChapters){
            if(cd.name == string){
                chapterCard = cd.chapterCards
            }
        }

        Log.d("SecondScreenData", string)

        binding.tvHashtag.text = chapterCard[counter].hashTag
        binding.tvContent.text = chapterCard[counter].content

        binding.btnMarkAsRead.setOnClickListener {
            if (counter < chapterCard.size - 1) {
                counter++
                binding.tvHashtag.text = chapterCard[counter].hashTag
                binding.tvContent.text = chapterCard[counter].content
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
                binding.tvHashtag.text = chapterCard[counter].hashTag
                binding.tvContent.text = chapterCard[counter].content
            }
        }

        binding.btnContinueLearning.setOnClickListener {
            finish()
        }

    }
}