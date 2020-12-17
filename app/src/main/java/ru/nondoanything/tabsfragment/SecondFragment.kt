package ru.nondoanything.tabsfragment

import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast


class SecondFragment : Fragment() {
    var secondButton: Button? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_second, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        secondButton = view.findViewById<View>(R.id.secondButton) as Button
        secondButton!!.setOnClickListener {
            Toast.makeText(activity, R.string.second_fragment, Toast.LENGTH_LONG).show()
        }

    }
}
