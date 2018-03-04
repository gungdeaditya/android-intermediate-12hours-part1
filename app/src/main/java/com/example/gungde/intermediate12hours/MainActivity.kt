package com.example.gungde.intermediate12hours

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

import com.example.gungde.intermediate12hours.adapter.ListAdapter
import com.example.gungde.intermediate12hours.model.Social

import java.util.ArrayList

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var mAdapter: ListAdapter? = null
    private val socials = ArrayList<Social>()

    private val images = intArrayOf(R.drawable.ic_facebook, R.drawable.ic_instagram, R.drawable.ic_googleplus, R.drawable.ic_line, R.drawable.ic_linkedin, R.drawable.ic_twitter, R.drawable.ic_whatsapp, R.drawable.ic_youtube)
    private val titles = arrayOf("Facebook", "Instagram", "Google Plus", "Line", "Linkedin", "Twitter", "Whatsapp", "Youtube")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setRecyclerView()
    }

    private fun setRecyclerView() {
        list.layoutManager = LinearLayoutManager(this)
        for (i in 0..images.size - 1) {
            val social = Social(images[i], titles[i])
            socials.add(social)
        }

        mAdapter = ListAdapter(socials)
        list.adapter = mAdapter
    }
}
