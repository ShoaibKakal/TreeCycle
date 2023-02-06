package com.example.treecycle.presentation.home

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2
import com.example.treecycle.data.util.homeBanners
import com.example.treecycle.databinding.FragmentHomeBinding
import com.example.treecycle.presentation.home.adapter.SliderAdapter
import kotlin.math.abs

class HomeFragment : Fragment() {

    private lateinit var viewPager: ViewPager2
    private val sliderHandler = Handler(Looper.getMainLooper())

    private val binding: FragmentHomeBinding by lazy {
        FragmentHomeBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewPager = binding.viewPager2Home
        imageSlider()
    }


    private fun imageSlider() {

//        val compositePageTransformer = CompositePageTransformer().apply {
//            addTransformer(MarginPageTransformer(40))
//        }

        viewPager.apply {
            adapter = SliderAdapter(homeBanners, viewPager)
            offscreenPageLimit = 2
//            setPageTransformer(compositePageTransformer)
            registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
                    sliderHandler.removeCallbacks(sliderRunnable)
                    sliderHandler.postDelayed(sliderRunnable, 3000)
                }
            })
        }

    }


    override fun onPause() {
        super.onPause()
        sliderHandler.removeCallbacks(sliderRunnable)
    }

    override fun onResume() {
        super.onResume()
        sliderHandler.postDelayed(sliderRunnable, 3000)
    }

    private val sliderRunnable = kotlinx.coroutines.Runnable {

        kotlin.run {
            viewPager.currentItem = viewPager.currentItem + 1
        }
    }

}