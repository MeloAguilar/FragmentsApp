package com.example.fragmentsapp

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentsapp.databinding.FragmentBlueBinding


class BlueFragment : Fragment() {

    private var listener : OnFragmentActionsListener? = null
    private lateinit var binding:FragmentBlueBinding




    /**
     * Cuando se cree el fragmento si el padre es de tipo OnFragmentActionsListener
     *
     * nuestro contexto será el listener
     */
    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(context is OnFragmentActionsListener){
            listener = context
        }
    }


    /**
     *
     * Lo que se hará una vez se elimine el fragment del activity
     *
     */
    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    /**
     *
     * Lo que se hará una vez se cree la vista
     *
     */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnPlus.setOnClickListener { listener?.onClickFragmentButton() }
    }


    /**
     *
     * Lo que se hará para crear la vista
     *
     * Aquí se instanciará el binding
     *
     */
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        binding = FragmentBlueBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }


}