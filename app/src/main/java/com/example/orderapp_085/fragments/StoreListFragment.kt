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
import kotlinx.android.synthetic.main.fragment_store_list.*

class StoreListFragment : Fragment() {

    private lateinit var storeAdapter: StoreListAdapter
    private val mPizzaStores = ArrayList<StoreData>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_store_list, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        mPizzaStores.add(
            StoreData(
                "피자헛",
                "https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Fk.kakaocdn.net%2Fdn%2FnkQca%2FbtqwVT4rrZo%2FymhFqW9uRbzrmZTxUU1QC1%2Fimg.jpg",
                "1588-5588",
                "https://www.pizzahut.co.kr/main"
            )
        )
        mPizzaStores.add(
            StoreData(
                "파파존스",
                "http://mblogthumb2.phinf.naver.net/20160530_65/ppanppane_1464617766007O9b5u_PNG/%C6%C4%C6%C4%C1%B8%BD%BA_%C7%C7%C0%DA_%B7%CE%B0%ED_%284%29.png?type=w800",
                "1577-8080",
                "https://pji.co.kr/?NaPm=ct%3Dksr9j0z1%7Cci%3Dcheckout%7Ctr%3Dds%7Ctrx%3D%7Chk%3D49703e482db0e4ec93ae9b8dda2d271b6a8dc238"
            )
        )
        mPizzaStores.add(
            StoreData(
                "미스터피자",
                "https://post-phinf.pstatic.net/MjAxODEyMDVfMzYg/MDAxNTQzOTYxOTA4NjM3.8gsStnhxz7eEc9zpt5nmSRZmI-Pzpl4NJvHYU-Dlgmcg.7Vpgk0lopJ5GoTav3CUDqmXi2-_67S5AXD0AGbbR6J4g.JPEG/IMG_1641.jpg?type=w1200",
                "1577-0077",
                "https://www.mrpizza.co.kr/index?NaPm=ct%3Dksr9inhj%7Cci%3Dcheckout%7Ctr%3Dds%7Ctrx%3D%7Chk%3D466a313bdc1e0144e871a002e2e5e94466abab66"
            )
        )
        mPizzaStores.add(
            StoreData(
                "도미노피자",
                "https://pbs.twimg.com/profile_images/1098371010548555776/trCrCTDN_400x400.png",
                "1577-3082",
                "https://web.dominos.co.kr/main"
            )
        )

        storeAdapter = StoreListAdapter(requireContext(), R.layout.store_list_item, mPizzaStores)

        store_listView.adapter = storeAdapter

        store_listView.setOnItemClickListener { _, _, position, _ ->

            val clickedPizzaStore = mPizzaStores[position]

            val intent = Intent(requireContext(), ViewStoreDetailActivity::class.java)
            intent.putExtra("store", clickedPizzaStore)
            startActivity(intent)
        }
    }
}