package com.example.orderapp_085.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.orderapp_085.R
import com.example.orderapp_085.ViewStoreDetailActivity
import com.example.orderapp_085.adapters.StoreListAdapter
import com.example.orderapp_085.datas.StoreData
import kotlinx.android.synthetic.main.fragment_chicken.*
import kotlinx.android.synthetic.main.fragment_store_list.*

class ChickenStoreListFragment : Fragment() {

    private lateinit var storeAdapter: StoreListAdapter
    private val mChickenStores = ArrayList<StoreData>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_chicken, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        mChickenStores.clear()

        mChickenStores.add(
            StoreData(
                "BBQ",
                "https://mblogthumb-phinf.pstatic.net/20160507_48/ppanppane_1462548783875D8ezv_PNG/Untitled-1-35.png?type=w800",
                "1588-5588",
                "https://www.bbq.co.kr/main.asp"
            )
        )
        mChickenStores.add(
            StoreData(
                "교촌치킨",
                "https://image.news1.kr/system/photos/2012/1/30/68763/article.png?1327907438",
                "1577-8080",
                "http://www.kyochon.com/main/"
            )
        )
        mChickenStores.add(
            StoreData(
                "굽네치킨",
                "https://lh3.googleusercontent.com/bjPAPRs6b0rosczsCsnJaRVCE5xcM5Dq7kZvZ-pAUCIqBgZ3ZDERjnJSi1W0NhcWg00",
                "1577-0077",
                "http://www.goobne.co.kr/"
            )
        )
        mChickenStores.add(
            StoreData(
                "네네치킨",
                "https://blog.kakaocdn.net/dn/exLM42/btqwP7n6Me6/m2gfQtrk82t7iFVZkMLLH0/img.jpg",
                "1577-3082",
                "https://nenechicken.com/17_new/index.asp"
            )
        )

        storeAdapter = StoreListAdapter(requireContext(), R.layout.store_list_item, mChickenStores)

        chicken_list.adapter = storeAdapter

        chicken_list.setOnItemClickListener { _, _, position, _ ->

            val clickedPizzaStore = mChickenStores[position]

            val intent = Intent(requireContext(), ViewStoreDetailActivity::class.java)
            intent.putExtra("store", clickedPizzaStore)
            startActivity(intent)
        }

    }
}