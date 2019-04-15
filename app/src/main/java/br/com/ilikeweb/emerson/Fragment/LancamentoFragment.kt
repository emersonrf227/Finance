package br.com.ilikeweb.emerson.Fragment

import android.annotation.SuppressLint
import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast





class LancamentoFragment : Fragment() {


    @SuppressLint("WrongViewCast")
    @Override
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(br.com.ilikeweb.emerson.R.layout.fragment_lancamento, container, false)
        val button = view.findViewById(br.com.ilikeweb.emerson.R.id.addReceita) as Button



        button.setOnClickListener { Toast.makeText(getContext(), "Tocado", Toast.LENGTH_LONG).show() }

        return view


    }





}