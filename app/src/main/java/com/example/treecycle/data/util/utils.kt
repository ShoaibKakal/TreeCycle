package com.example.treecycle.data.util

import com.example.treecycle.R
import com.example.treecycle.presentation.education.adapter.Chapter
import com.example.treecycle.presentation.recycle.adapter.RecycleItem


const val YOUTUBE_API_KEY = "AIzaSyC7RHZgkGcA28CynZz64dZCfnmD4SDeCss"

data class ChapterCard(val hashTag: String, val content: String)

val homeBanners = arrayListOf(R.drawable.img_test_banner, R.drawable.img_test_banner)
val educationBanners =
    arrayListOf(R.drawable.img_education_test_banner, R.drawable.img_education_test_banner)
val doYouKnowBanners = arrayListOf(R.drawable.img_info_banner_test, R.drawable.img_info_banner_test)

/* Chapter Cards for Climate change education. */
val chapterCards = arrayListOf(
    ChapterCard(
        "What is Climate Change ?",
        content = "Climate change refers to the long-term shift in the Earth's climate patterns and temperatures, primarily caused by human activities such as deforestation, burning of fossil fuels and other greenhouse gas emissions. The impacts of climate change are wide-ranging and can be seen in more frequent and intense weather events, rising sea levels, melting glaciers, and ocean acidification. These changes pose a significant threat to human health, wildlife, and the environment."
    ),
    ChapterCard(
        "Climate Change is a big issue",
        "1. Rising temperatures: Climate change is causing global temperatures to rise, " +
                "leading to melting glaciers, rising sea levels, and more frequent and intense heat " +
                "waves.\n" +
                "2. Extreme weather events: Climate change is increasing the frequency and severity " +
                "of extreme weather events, such as hurricanes, droughts, and floods, which can " +
                "have devastating impacts on communities and ecosystems."
    ),
    ChapterCard(
        "Climate Change is a big issue",
        "3. Loss of biodiversity: Climate change is causing widespread changes in " +
                "ecosystems, including loss of habitats and species extinction, which can have " +
                "far-reaching impacts on the planet's biodiversity.\n" +
                "4. Threats to food security: Changes in weather patterns and increased frequency " +
                "of extreme weather events can disrupt food production, putting pressure on " +
                "global food supplies and potentially causing food shortages."
    ),
    ChapterCard(
        "Climate Change is a big issue",
        "5. Economic impacts: Climate change can have significant economic impacts " +
                "including increased costs of natural disasters, reduced productivity, and " +
                "decreased economic growth.\n" +
                "6. Public health impacts: Climate change can have serious impacts on public " +
                "health, including increased air pollution, spread of disease through insects and " +
                "pests, and heat stress.\n" +
                "7. Intergenerational injustice: Climate change is affecting the planet for " +
                "generations to come, and future generations will bear the brunt of its impacts " +
                "unless action is taken now."
    )
)
val chapter2Cards = arrayListOf(
    ChapterCard(
        "Reason of Climate Change",
        content = "Climate science is the study of the Earth's climate and how it changes over time.\n" +
                "It involves the observation, measurement, and analysis of various climate factors,\n" +
                "including temperature, precipitation, atmospheric circulation, and greenhouse\n" +
                "gas concentrations, to understand how the climate system works and how it is\n" +
                "influenced by natural and human factors."
    ),
    ChapterCard(
        "Why is the climate changing ?",
        "1. Greenhouse gas emissions: The main cause of climate change is the release of\n" +
                "greenhouse gasses, such as carbon dioxide, into the atmosphere. This is mainly " +
                "due to the burning of fossil fuels, deforestation, and other human activities. \n" +
                "" +
                "2. Trapping heat: Greenhouse gasses trap heat from the sun and cause the planet\n" +
                "to warm, leading to changes in climate patterns and global temperatures.\n" +
                "\n" +
                "3. Melting glaciers and rising sea levels: The warming of the planet is causing\n" +
                "melting of glaciers, which is leading to rising sea levels and increased risk of\n" +
                "flooding."
    ),
    ChapterCard(
        "Why is climate changing ?",
    "4. Intense heat waves: The warming of the planet is causing more frequent and\n" +
            "intense heat waves, which can have serious impacts on public health and food " +
            "production.\n" +
            "5. Extreme weather events: Climate change is increasing the frequency and severity" +
            "of extreme weather events, such as hurricanes, droughts, and floods, which can " +
            "have devastating impacts on communities and ecosystems."
    ),
    ChapterCard(
        "# Why is climate changing ?",
        "6. Changes in weather patterns: The warming of the ocean is causing changes in " +
                "weather patterns and increasing the frequency and severity of extreme weather " +
                "events.\n" +
                "7. Mitigation efforts: To address the impacts of climate change, it is important that " +
                "we take steps to reduce our greenhouse gas emissions and transition to a more " +
                "sustainable and low-carbon economy."
    )
)
val chapter3Cards = arrayListOf(
    ChapterCard(
        "Global Impact",
                "The burning of fossil fuels releases carbon dioxide into the atmosphere, which " +
                "traps heat and causes the planet to warm. This warming is leading to melting " +
                "glaciers, rising sea levels, and more frequent and intense heat waves, which are " +
                "causing widespread impacts on the planet's ecosystems and communities. In " +
                "addition, the warming of the ocean is causing changes in weather patterns and " +
                "increasing the frequency and severity of extreme weather events, such as " +
                "hurricanes, droughts, and floods."
    ),
    ChapterCard(
        "Facts and Figures",
        "1. The average global temperature has increased by about 1.1°C since the late 19th " +
                "century, with the majority of that increase taking place in the past few decades.\n" +
                "2. Sea levels have risen by about 8 inches (21 cm) since 1880, with almost half of " +
                "that rise occurring in the past 25 years.\n" +
                "3. The Arctic sea ice is declining rapidly, with the summer sea ice extent declining " +
                "by about 12% per decade since 1979."
    ),
    ChapterCard(
        "Facts and Figures",
        "4. Greenhouse gas concentrations, primarily carbon dioxide (CO2), are at their " +
                "highest levels in at least 800,000 years, with CO2 levels increasing by about 40% " +
                "since the pre-industrial era.\n" +
                "5. Human activities, such as burning fossil fuels and deforestation, are responsible " +
                "for over 70% of the increase in greenhouse gas concentrations.\n" +
                "6. The frequency and intensity of extreme weather events, such as heatwaves and " +
                "hurricanes, are increasing as a result of climate change."
    ),
    ChapterCard(
        "Facts and Figures",
        "7. Climate change is already affecting the world's oceans, leading to coral reef " +
                "die-off, ocean acidification, and changes in ocean currents and temperatures.\n" +
                "8. Climate change is also having a significant impact on wildlife, leading to range " +
                "shifts and species extinction.\n" +
                "9. The economic cost of climate change is estimated to be in the trillions of dollars,\n" +
                "with impacts ranging from decreased crop yields to increased infrastructure " +
                "damage from extreme weather events."
    )
)
val chapter4Cards = arrayListOf(
    ChapterCard(
        "Relationship of climate change and Financial Markets",
        "Climate change affects the financial market by creating new opportunities, " +
                "affecting business profits and changing investment strategies. It also involves " +
                "investment in low-carbon energy and climate change solutions, as well as " +
                "financial risks. This highlights the importance of considering the financial impact " +
                "of climate change in investment decisions."
    ),
    ChapterCard(
        "Impact on Financial Markets",
        "1. Carbon pricing: Climate change policies, such as carbon taxes and cap-and-trade " +
                "systems, can impact the financial market by creating new costs for businesses " +
                "and increasing the prices of goods and services that generate greenhouse gas " +
                "emissions. This can affect the profitability of companies and the prices of stocks " +
                "and bonds in the financial market.\n" +
                "2. Energy transition: The shift towards low-carbon energy sources, such as " +
                "renewable energy and electric vehicles, can disrupt traditional energy companies " +
                "and create opportunities for new companies and technologies in the financial " +
                "market."
    ),
    ChapterCard(
        "Impact on Financial Markets",
        "3. Infrastructure investments: The need to adapt to the impacts of climate change " +
                "and to transition to a low-carbon economy requires significant investments in " +
                "new infrastructure, such as renewable energy generation, energy efficient " +
                "buildings, and low-carbon transportation systems. These investments can create " +
                "opportunities for financial institutions and investors to support low-carbon " +
                "development and reap the benefits of a transition to a sustainable economy."
    ),
    ChapterCard(
        "Impact on Financial Markets",
        "4. Climate risks: Climate change poses significant risks to businesses and financial " +
                "institutions, including the impacts of more frequent and intense extreme weather " +
                "events, changes in the availability of natural resources, and shifts in consumer " +
                "preferences towards low-carbon products and services. Financial institutions and " +
                "investors need to understand these risks and incorporate them into their " +
                "investment strategies."
    ),
    ChapterCard(
        "Impact on Financial Markets",
        "5. Divestment: There is growing movement among investors and financial " +
                "institutions to divest from fossil fuels and to redirect investments towards " +
                "low-carbon and sustainable solutions. This can reduce the financial returns of " +
                "fossil fuel companies and increase the demand for low-carbon alternatives in the " +
                "financial market."
    )
)
val chapter5Cards = arrayListOf(
    ChapterCard(
        "Role of Individuals",
        "Overall, the actions of individuals can significantly contribute to the global effort " +
                "to address climate change and promote sustainable development.\n" +
                "This could have both positive and negative impacts."
    ),
    ChapterCard(
        "Positive Impact",
        "Positively, individuals can also help mitigate climate change by making lifestyle " +
                "changes, such as reducing energy consumption, using renewable energy sources, " +
                "reducing waste and choosing to buy environmentally-friendly products. They can " +
                "also advocate for policy changes, support renewable energy projects and raise " +
                "awareness about the importance of addressing climate change."
    ),
    ChapterCard(
        "Negative Impact",
        "Negatively, individuals contribute to climate change through their daily activities " +
                "such as burning fossil fuels for transportation, heating and electricity generation," +
                "deforestation and land-use change, and the production and consumption of " +
                "goods with high carbon footprints."
    ),
    ChapterCard(
        "Preventions as Individuals",
        "Individuals can make simple changes in their daily lives to reduce their carbon " +
                "footprint, such as conserving energy at home, eating a plant-based diet, and " +
                "reducing waste. It is also important for people to educate themselves and others " +
                "about the causes and impacts of climate change, and to advocate for " +
                "government action to address this global crisis. By taking action now, we can " +
                "help ensure a more sustainable and livable planet for future generations."
    ),

)
val chapter6Cards = arrayListOf(
    ChapterCard(
        "Nature-Based Solutions",
        "Nature-based solutions refer to the use of natural systems, such as forests, " +
                "wetlands, and oceans, to address and mitigate the impacts of climate change.\n" +
                "These solutions can play a critical role in reducing greenhouse gas emissions " +
                "and increasing carbon sequestration, as well as helping to adapt to the impacts " +
                "of climate change."
    ),
    ChapterCard(
        "Examples of Nature-Based Solutions",
        "1. Reforestation and forest conservation to store carbon and provide habitat for " +
                "wildlife.\n" +
                "2. Restoration of wetlands and other ecosystems that help to remove carbon from " +
                "the atmosphere and reduce the risk of flooding.\n" +
                "3. Management of soils and grasslands to enhance their carbon storage capacity " +
                "and improve soil health."
    ),
    ChapterCard(
        "Examples of Nature-Based Solutions",
        "4. Protection and restoration of coastal ecosystems, such as mangroves and coral " +
                "reefs, to protect against rising sea levels and storm surges.\n" +
                "5. Use of agroforestry and conservation agriculture to promote sustainable land use " +
                "and reduce greenhouse gas emissions from agriculture.\n" +
                "6. Nature-based solutions provide multiple benefits, including climate mitigation, " +
                "adaptation, biodiversity conservation, and sustainable livelihoods. They also " +
                "often involve local communities and stakeholders, making them an effective and " +
                "sustainable approach to addressing the challenges posed by climate change."
    ),
    ChapterCard(
        "Technology-Based Solutions",
        "Technical solutions refer to the use of technology to mitigate and adapt to the " +
                "impacts of climate change. Technical solutions aim to reduce greenhouse gas " +
                "emissions and increase energy efficiency, while also developing new " +
                "technologies that can help to reduce our dependence on fossil fuels and promote " +
                "the use of renewable energy sources."
    ),
    ChapterCard(
        "Examples of Technology-Based Solutions",
        "1. Renewable energy technologies, such as solar, wind, hydro, and geothermal " +
                "power, that provide clean and sustainable energy sources.\n" +
                "2. Energy efficiency technologies, such as building insulation and smart energy " +
                "systems, that help to reduce energy consumption and greenhouse gas " +
                "emissions.\n" +
                "3. Carbon capture and storage (CCS) technologies, which involve capturing carbon " +
                "dioxide from power plants and industrial processes and storing it underground to " +
                "prevent it from entering the atmosphere."
    ),
    ChapterCard(
        "Examples of Technology-Based Solutions",
        "4. Electric vehicles (EVs) and sustainable transportation technologies, such as " +
                "high-speed rail and bike-sharing systems, that reduce dependence on fossil fuels " +
                "for transportation.\n" +
                "5. Digital technologies, such as cloud computing and the Internet of Things (IoT), " +
                "that can help to optimize energy use and reduce emissions in various sectors.\n" +
                "6. Technical solutions play a critical role in addressing climate change and " +
                "transitioning to a low-carbon, sustainable future. However, they must be " +
                "implemented in conjunction with policies and regulations that promote " +
                "sustainable development, as well as public education and awareness programs " +
                "that encourage the adoption of clean technologies."
    ),
)
val chapter7Cards = arrayListOf(
    ChapterCard(
        "Global Impact in Future",
        "If we do not take action to address the impacts of climate change, the future of " +
                "our world will be vastly different from what we know today. Climate change is " +
                "expected to have severe and widespread consequences for human societies and " +
                "the natural world."
    ),
    ChapterCard(
        "Issues in Future",
        "1. Rising global temperatures, which will lead to more frequent and intense heat " +
                "waves, droughts, and wildfires.\n" +
                "2. Rising sea levels, which will cause widespread coastal flooding and displacement " +
                "of people living in low-lying areas.\n" +
                "3. Changes in precipitation patterns, which will lead to water scarcity in some " +
                "regions and increased flooding in others.\n" +
                "4. Increased frequency and severity of extreme weather events, such as hurricanes, " +
                "typhoons, and storms."
    ),
    ChapterCard(
        "Issues in Future",
        "5. Disruption of ecosystems and loss of biodiversity, as species struggle to adapt to " +
                "changing conditions.\n" +
                "6. Negative impacts on agriculture and food security, as crop yields decline and " +
                "food prices rise.\n" +
                "7. Spread of diseases as vectors such as mosquitoes move into new regions and " +
                "climates become more suitable for their survival."
    ),
    ChapterCard(
        "Issues in Future",
        "8. Without action, these consequences will become increasingly severe, causing " +
                "widespread social, economic, and environmental disruption. It is essential that " +
                "we act now to reduce greenhouse gas emissions, promote renewable energy, and " +
                "implement nature-based and technical solutions to address the impacts of " +
                "climate change and ensure a sustainable future for ourselves and future " +
                "generations."
    )
)

/* Chapters of climate  change education. */
val climateChangeChapters = arrayListOf<Chapter>(
    Chapter(1, "Introduction", 1, chapterCards),
    Chapter(2, "Reason of Climate Change", 0, chapter2Cards),
    Chapter(3, "Impact of Climate Change", 0, chapter3Cards),
    Chapter(4, "Climate and Financial Markets", 0, chapter4Cards),
    Chapter(5, "Role of Individuals in Climate Change", 0, chapter5Cards),
    Chapter(6, "Climate Change Solutions ", 0, chapter6Cards),
    Chapter(7, "Future of world", 0, chapter7Cards)
)

val testTipsAndArticles = arrayListOf(
    "Aerosols",
    "Newspaper",
    "Clothing",
    "Electrical Items",
    "Furniture",
    "Cosmetics",
    "Paper",
    "Plastic Bags"
)
val recycleItems = arrayListOf(
    RecycleItem("Aerosols", "Recyclable at home"),
    RecycleItem("Newspaper", "Recyclable at home"),
    RecycleItem("Clothing", "Recyclable at home"),
    RecycleItem("Electrical Items", "Recyclable at home"),
    RecycleItem("Furniture", "Recyclable at home"),
    RecycleItem("Cosmetics", "Recyclable at home"),
    RecycleItem("Paper", "Recyclable at home"),
    RecycleItem("Plastic Bags", "Recyclable at home")
)

val embedYoutubeVideos = arrayListOf(
    "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/n-GlRmOkDkw\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>",
    "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/DTJ9aP_Nmqo\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>"
)
