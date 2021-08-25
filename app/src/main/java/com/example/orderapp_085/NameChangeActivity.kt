package com.example.orderapp_085


import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_name_change.*

class NameChangeActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name_change)

        setValues()
        setUpEvents()
    }

    override fun setValues() {

    }

    override fun setUpEvents() {
        save_Btn.setOnClickListener {
            val inputNickName = putNick_Edt.text.toString()

            val resultIntent = Intent()
            resultIntent.putExtra("nickName", inputNickName)
            setResult(RESULT_OK, resultIntent)
            finish()
        }
    }
}