package com.example.fragmentsapp

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.fragmentsapp.databinding.FragmentRedBinding


class RedFragment : Fragment() {

    private var listener: OnFragmentActionsListener? = null

    private lateinit var binding: FragmentRedBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnFragmentActionsListener) {
            listener = context
            binding = FragmentRedBinding.inflate(layoutInflater)

            binding.btnPlus.setOnClickListener { listener?.onClickFragmentButton() }

        }
    }



    override fun onDetach() {
        super.onDetach()
        listener = null
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.btnPlus.setOnClickListener { listener?.onClickFragmentButton() }
        super.onViewCreated(view, savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        binding = FragmentRedBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }


}