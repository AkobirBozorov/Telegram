package com.akobir.telegram.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.akobir.telegram.R
import com.akobir.telegram.adapter.ContactAdapter
import com.akobir.telegram.model.Chat

class ContactFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_contact, container, false)
        initViews(view)
        return view
    }

    private fun initViews(view: View) {
        recyclerView = view.findViewById(R.id.recyclerViewContact)
        recyclerView.layoutManager = GridLayoutManager(context, 1)
        refreshAdapter(getAllChats())
    }
    private fun refreshAdapter(chats: ArrayList<Chat>) {
        val adapter = context?.let { ContactAdapter(it, chats) }
        recyclerView.adapter = adapter
    }

    private fun getAllChats():ArrayList<Chat>{
        val chats: ArrayList<Chat> = ArrayList()
        chats.add(Chat(R.drawable.im_user_3, "Ava Max", "online"))
        chats.add(Chat(R.drawable.im_user_1, "Ariana Grande", "last seen 30 minutes ago"))
        chats.add(Chat(R.drawable.im_user_2, "Selena Gomez", "last seen 1 hour ago"))
        chats.add(Chat(R.drawable.im_user_3, "Ava Max", "last seen recently"))
        chats.add(Chat(R.drawable.im_user_1, "Ariana Grande", "last seen 30 minutes ago"))
        chats.add(Chat(R.drawable.im_user_2, "Selena Gomez", "last seen 1 hour ago"))
        chats.add(Chat(R.drawable.im_user_3, "Ava Max", "online"))
        chats.add(Chat(R.drawable.im_user_1, "Ariana Grande", "last seen 30 minutes ago"))
        chats.add(Chat(R.drawable.im_user_2, "Selena Gomez", "last seen 1 hour ago"))
        chats.add(Chat(R.drawable.im_user_3, "Ava Max", "last seen recently"))
        return chats
    }
}