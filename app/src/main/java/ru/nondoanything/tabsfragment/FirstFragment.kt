package ru.nondoanything.tabsfragment

import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast


class FirstFragment : Fragment() {
    private var firstButton: Button? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_first, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        firstButton = view.findViewById<View>(R.id.firstButton) as Button
        firstButton!!.setOnClickListener {
            Toast.makeText(activity, R.string.first_fragment, Toast.LENGTH_LONG).show()
        }

    }
}