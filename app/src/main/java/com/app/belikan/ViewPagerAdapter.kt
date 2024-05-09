package com.app.belikan

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class ViewPagerAdapter(fragmentManager: FragmentManager) : FragmentStatePagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment {
        // Return the Fragment based on the position
        return when (position) {
            0 -> FavoriteFishFragment()
            1 -> FavoriteStoreFragment()
            else -> throw IllegalArgumentException("Invalid position $position")
        }
    }

    override fun getCount(): Int {
        // Return the number of fragments
        return 2
    }
}
