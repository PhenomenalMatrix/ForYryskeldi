package com.example.popularmove

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.RecyclerView

class MainFragment : Fragment() {

    private var adapter: MainAdapater = MainAdapater()
    private lateinit var recycler:RecyclerView
    private lateinit var viewModel: MainViewModel

    companion object {
        fun newInstance() = MainFragment()

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        recycler = view.findViewById(R.id.rv)
        viewModel.fetchList().observe(viewLifecycleOwner, Observer {
            adapter.addItem(it)
        })
        recycler.adapter = adapter
    }

}