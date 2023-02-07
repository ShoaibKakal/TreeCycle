package com.example.treecycle.data.util

import com.example.treecycle.R
import com.example.treecycle.presentation.education.adapter.Chapter


data class ChapterCard(val hashTag: String, val content: String)

val homeBanners = arrayListOf(R.drawable.img_test_banner, R.drawable.img_test_banner)
val educationBanners =
    arrayListOf(R.drawable.img_education_test_banner, R.drawable.img_education_test_banner)
val climateChangeChapters = arrayListOf<Chapter>(
    Chapter(1, "Introduction", 70),
    Chapter(2, "Reason of Climate Change", 0),
    Chapter(3, "Impact of Climate Change", 0),
    Chapter(4, "Climate and Financial Markets", 0),
)

val chapterCards = arrayListOf(
    ChapterCard(
        "#Climate",
        content = "Climate change refers to the long-term shift in the Earth's climate patterns and temperatures, primarily caused by human activities such as deforestation, burning of fossil fuels and other greenhouse gas emissions. The impacts of climate change are wide-ranging and can be seen in more frequent and intense weather events, rising sea levels, melting glaciers, and ocean acidification. These changes pose a significant threat to human health, wildlife, and the environment."
    ),
    ChapterCard(
        "#Big_Issue",
        "Climate change is causing global temperature to rise leading to melting glaciers, rising sea levels, and more frequent and intense heat waves.\n\nClimate change is increasing the frequency and severity of extreme weather events, such as hurricane, droughts, and floods, which can heave devastating impacts on communities and ecosystems"
    ),

    )
