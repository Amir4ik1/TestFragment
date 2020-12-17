package ru.nondoanything.tabsfragment

import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var firstFragment: Button? = null
    var secondFragment: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        firstFragment = findViewById<View>(R.id.firstFragment) as Button
        secondFragment = findViewById<View>(R.id.secondFragment) as Button


        firstFragment!!.setOnClickListener {
            loadFragment(FirstFragment())
        }

        secondFragment!!.setOnClickListener {
            loadFragment(SecondFragment())
        }
    }

    private fun loadFragment(fragment: Fragment) {
        val fm = supportFragmentManager
        val fragmentTransaction = fm.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.commit()
    }
}