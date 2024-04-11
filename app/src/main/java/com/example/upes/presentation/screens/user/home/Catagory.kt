package com.example.upes.presentation.screens.user.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.upes.R
import com.example.upes.adapter.CatagoryAdapter
import com.example.upes.model.BlogResModelItem


class Catagory : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

//phishing
        val data = ArrayList<BlogResModelItem>()
        data.add(
            BlogResModelItem(
                "Clara Cypher",
                "Clara is a cybersecurity enthusiast passionate about online safety education. She enjoys writing clear and concise guides to help people navigate the ever-evolving digital landscape.",
                "Phishing! It's a word that strikes fear in the hearts of internet users everywhere. But what exactly is phishing, and how can you protect yourself? In this blog, we'll break down the basics of phishing scams, common red flags to watch out for, and some simple steps you can take to stay safe online.",
                "phishing",
                "Different types of phishing attacks"
            )
        )
        data.add(
            BlogResModelItem(
                "Alex Antiphish",
                "Clara is a cybersecurity enthusiast passionate about online safety education. She enjoys writing clear and concise guides to help people navigate the ever-evolving digital landscape.",
                "Phishing! It's a word that strikes fear in the hearts of internet users everywhere. But what exactly is phishing, and how can you protect yourself? In this blog, we'll break down the basics of phishing scams, common red flags to watch out for, and some simple steps you can take to stay safe online.",
                "phishing",
                "Phishing awareness"
            )
        )
        data.add(
            BlogResModelItem(
                "Alex Antiphish",
                "Clara is a cybersecurity enthusiast passionate about online safety education. She enjoys writing clear and concise guides to help people navigate the ever-evolving digital landscape.",
                "Phishing! It's a word that strikes fear in the hearts of internet users everywhere. But what exactly is phishing, and how can you protect yourself? In this blog, we'll break down the basics of phishing scams, common red flags to watch out for, and some simple steps you can take to stay safe online.",
                "phishing",
                "Phishing awareness"
            )
        )
        data.add(
            BlogResModelItem(
                "Alex Antiphish",
                "Clara is a cybersecurity enthusiast passionate about online safety education. She enjoys writing clear and concise guides to help people navigate the ever-evolving digital landscape.",
                "Phishing! It's a word that strikes fear in the hearts of internet users everywhere. But what exactly is phishing, and how can you protect yourself? In this blog, we'll break down the basics of phishing scams, common red flags to watch out for, and some simple steps you can take to stay safe online.",
                "phishing",
                "Phishing awareness"
            )
        )
        data.add(
            BlogResModelItem(
                "Alex Antiphish",
                "Clara is a cybersecurity enthusiast passionate about online safety education. She enjoys writing clear and concise guides to help people navigate the ever-evolving digital landscape.",
                "Phishing! It's a word that strikes fear in the hearts of internet users everywhere. But what exactly is phishing, and how can you protect yourself? In this blog, we'll break down the basics of phishing scams, common red flags to watch out for, and some simple steps you can take to stay safe online.",
                "phishing",
                "Phishing awareness"
            )
        )

         val recycler= view?.findViewById<RecyclerView>(R.id.recycler_view)
        recycler?.layoutManager=LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)

        recycler?.adapter= CatagoryAdapter(data,requireContext())

        return inflater.inflate(R.layout.fragment_catagory, container, false)
    }

}