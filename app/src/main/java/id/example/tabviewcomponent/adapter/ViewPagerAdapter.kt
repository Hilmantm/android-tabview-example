package id.example.tabviewcomponent.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import id.example.tabviewcomponent.ui.BlankFragment1
import id.example.tabviewcomponent.ui.BlankFragment2


class ViewPagerAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> BlankFragment1()
            1 -> BlankFragment2()
            else -> BlankFragment1()
        }
    }

}