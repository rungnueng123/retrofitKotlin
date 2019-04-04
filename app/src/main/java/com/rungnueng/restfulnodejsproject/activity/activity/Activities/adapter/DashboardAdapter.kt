package com.rungnueng.restfulnodejsproject.activity.activity.Activities.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rungnueng.restfulnodejsproject.R
import com.rungnueng.restfulnodejsproject.activity.activity.Activities.dao.StyleDao
import kotlinx.android.synthetic.main.style_list_item.view.*

class DashboardAdapter(val styleList: List<StyleDao>, val context: Context) :
    RecyclerView.Adapter<DashboardAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.style_list_item,
                parent, false
            )
        )
    }

    override fun getItemCount(): Int {
        return styleList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        holder.itemView.txt_id.text = styleList.get(position).id
//        holder.itemView.txt_name.text = styleList.get(position).name
//        holder.itemView.txt_desc.text = styleList.get(position).desc
        holder.itemView.txt_id.text = styleList.get(position).title
        holder.itemView.txt_name.text = styleList.get(position).body
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)

}