package com.rungnueng.restfulnodejsproject.activity.activity.Activities.activities

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import com.rungnueng.restfulnodejsproject.R

class LoginActivity : AppCompatActivity() {

    var user = ""
    var pass = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLogin: Button = findViewById(R.id.btn_login)
        val edtUser = findViewById<EditText>(R.id.edt_username)
        val edtPass = findViewById<EditText>(R.id.edt_pass)
        btnLogin.setOnClickListener {
            user = edtUser.text.toString()
            pass = edtPass.text.toString()
            val intent = Intent(this, DashboardActivity::class.java)
            intent.putExtra("user", user)
            intent.putExtra("pass", pass)
            startActivity(intent)

        }

    }
}
