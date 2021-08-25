package com.example.orderapp_085

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.orderapp_085.datas.StoreData
import kotlinx.android.synthetic.main.activity_view_store_detail.*

class ViewStoreDetailActivity : BaseActivity() {

    private lateinit var mStoreData: StoreData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store_detail)

        setValues()
        setUpEvents()
    }

    override fun setValues() {
        mStoreData = intent.getSerializableExtra("store") as StoreData

        store_txt.text = mStoreData.name
        phoneNum_Txt.text = mStoreData.phoneNum

        Glide.with(mContext)
            .load(mStoreData.imgUri)
            .into(logo_Img)
    }

    override fun setUpEvents() {
        call_Btn.setOnClickListener {
            val myUri = Uri.parse("tel:${mStoreData.phoneNum}")
            val myIntent = Intent(Intent.ACTION_DIAL, myUri)
            startActivity(myIntent)
        }

        startWeb_Btn.setOnClickListener {
            val myUri = Uri.parse(mStoreData.url)
            val myIntent = Intent(Intent.ACTION_VIEW, myUri)
            startActivity(myIntent)
        }

    }
}