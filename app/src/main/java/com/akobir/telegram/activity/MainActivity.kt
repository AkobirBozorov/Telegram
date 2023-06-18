package com.akobir.telegram.activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.akobir.telegram.R
import com.akobir.telegram.fragment.ChatFragment
import com.akobir.telegram.fragment.ContactFragment
import com.akobir.telegram.fragment.NotificationsFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_nav)
        bottomNavigationView.selectedItemId = R.id.menu_chats
        bottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.menu_contacts -> {
                    replaceFragment(ContactFragment())
                    true
                }
                R.id.menu_chats -> {
                    replaceFragment(ChatFragment())
                    true
                }
                R.id.menu_settings -> {
                    replaceFragment(NotificationsFragment())
                    true
                }
                else -> false
            }
        }
        replaceFragment(ChatFragment())
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}