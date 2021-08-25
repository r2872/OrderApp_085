package com.example.orderapp_085.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.orderapp_085.R
import com.example.orderapp_085.datas.StoreData

class StoreListAdapter(
    private val mContext: Context,
    resId: Int,
    private val mList: List<StoreData>
) : ArrayAdapter<StoreData>(mContext, resId, mList) {

    private val mInflater: LayoutInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView

        if (tempRow == null) {
            tempRow = mInflater.inflate(R.layout.store_list_item, null)
        }

        val row = tempRow!!

        val data = mList[position]

        val logoImg = row.findViewById<ImageView>(R.id.logo_Img)
        val storeTxt = row.findViewById<TextView>(R.id.store_txt)

        Glide.with(mContext)
            .load(data.imgUri)
            .into(logoImg)

        storeTxt.text = data.name

        return row
    }


}