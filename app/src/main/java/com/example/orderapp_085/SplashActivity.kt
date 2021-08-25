package com.example.orderapp_085

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        setValues()
        setUpEvents()
    }

    override fun setValues() {
        Glide.with(mContext)
            .load(R.raw.icon_4)
            .into(loading_Img)

        val myHandler = Handler(Looper.getMainLooper())
        myHandler.postDelayed({
            val intent = Intent(mContext, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000)
    }

    override fun setUpEvents() {

    }
}