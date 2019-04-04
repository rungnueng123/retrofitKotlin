package com.rungnueng.restfulnodejsproject.activity.activity.Activities.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.google.gson.GsonBuilder
import com.rungnueng.restfulnodejsproject.R
import com.rungnueng.restfulnodejsproject.activity.activity.Activities.adapter.DashboardAdapter
import com.rungnueng.restfulnodejsproject.activity.activity.Activities.manager.ServiceAPI
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.internal.schedulers.IoScheduler
import kotlinx.android.synthetic.main.activity_dashboard.*
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val i = intent.extras ?: return
        val user = i.getString("user")
        val pass = i.getString("pass")
//        Toast.makeText(applicationContext, "$user/$pass",Toast.LENGTH_LONG).show()

        recycler.layoutManager = LinearLayoutManager(this) as RecyclerView.LayoutManager?
        val retrofit = Retrofit.Builder().addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
//            .baseUrl("http://10.10.30.92:3000/").build()
            .baseUrl("https://jsonplaceholder.typicode.com/").build()

        val styleApi = retrofit.create(ServiceAPI::class.java)

        var response = styleApi.getAllStyle(5)
//        var response = styleApi.getAllStyle(5)

        response.observeOn(AndroidSchedulers.mainThread()).subscribeOn(IoScheduler()).subscribe {
            recycler.adapter = DashboardAdapter(it, this)
        }

    }
}
