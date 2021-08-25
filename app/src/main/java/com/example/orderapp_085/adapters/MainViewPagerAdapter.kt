package com.example.orderapp_085.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.orderapp_085.fragments.ChickenStoreListFragment
import com.example.orderapp_085.fragments.MyInfoFragment
import com.example.orderapp_085.fragments.StoreListFragment

class MainViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence {
        return when (position) {
            0 -> "피자 주문"
            1 -> "치킨 주문"
            else -> "내 정보"
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> StoreListFragment()
            1 -> ChickenStoreListFragment()
            else -> MyInfoFragment()
        }
    }
}