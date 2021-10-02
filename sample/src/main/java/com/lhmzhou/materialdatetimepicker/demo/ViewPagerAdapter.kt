package com.lhmzhou.materialdatetimepicker.demo

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.lhmzhou.materialdatetimepicker.demo.fragment.DatePickerFragment
import com.lhmzhou.materialdatetimepicker.demo.fragment.TimePickerFragment

internal class ViewPagerAdapter(fragmentManager: FragmentManager, lifeCycle: Lifecycle) : FragmentStateAdapter(fragmentManager, lifeCycle) {

    override fun getItemCount(): Int = 2
    override fun createFragment(position: Int): Fragment = when (position) {
        0 -> TimePickerFragment()
        else -> DatePickerFragment()
    }
}
