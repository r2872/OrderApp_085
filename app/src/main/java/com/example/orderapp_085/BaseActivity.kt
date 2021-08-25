package com.example.orderapp_085

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {
    val mContext = this

    abstract fun setValues()

    abstract fun setUpEvents()

}