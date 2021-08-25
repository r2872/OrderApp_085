package com.example.orderapp_085

import android.os.Bundle
import com.example.orderapp_085.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    private lateinit var mainViewPagerAdapter: MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setValues()
        setUpEvents()
    }

    override fun setValues() {

    }

    override fun setUpEvents() {
        mainViewPagerAdapter = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mainViewPagerAdapter
        mainTabLayout.setupWithViewPager(mainViewPager)
    }
}