package com.akobir.telegram.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.Fragment
import com.akobir.telegram.R
import com.google.android.material.switchmaterial.SwitchMaterial

class NotificationsFragment : Fragment() {

    private lateinit var switch: SwitchMaterial
    private lateinit var switch2: SwitchMaterial
    private lateinit var switch3: SwitchMaterial

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_notifications, container, false)
        initViews(view)
        return view
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    private fun initViews(view: View) {
        switch = view.findViewById(R.id.switchMaterial)
        switch.thumbDrawable = getResources().getDrawable(R.drawable.custom_thumb)
        switch.trackDrawable = getResources().getDrawable(R.drawable.custom_track)
        switch2 = view.findViewById(R.id.switchMaterial2)
        switch2.thumbDrawable = getResources().getDrawable(R.drawable.custom_thumb)
        switch2.trackDrawable = getResources().getDrawable(R.drawable.custom_track)
        switch3 = view.findViewById(R.id.switchMaterial3)
        switch3.thumbDrawable = getResources().getDrawable(R.drawable.custom_thumb)
        switch3.trackDrawable = getResources().getDrawable(R.drawable.custom_track)
    }
}