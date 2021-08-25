package com.example.orderapp_085.fragments

import android.app.Activity.RESULT_OK
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.orderapp_085.NameChangeActivity
import com.example.orderapp_085.R
import kotlinx.android.synthetic.main.fragment_my_info.*

class MyInfoFragment : Fragment() {

    val REQ_FOR_NICKNAME = 1000

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_info, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        nickChange_Btn.setOnClickListener {
            val intent = Intent(requireContext(), NameChangeActivity::class.java)
            startActivityForResult(intent, REQ_FOR_NICKNAME)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == REQ_FOR_NICKNAME) {
            if (resultCode == RESULT_OK) {
                val newNickName = data?.getStringExtra("nickName")
                myNick_Txt.text = newNickName
            }
        }
    }
}