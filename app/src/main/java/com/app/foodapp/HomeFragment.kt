package com.app.foodapp

import android.app.SearchManager
import android.content.Context
import android.os.Bundle
import android.view.*
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.getSystemService
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_home.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {

    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as AppCompatActivity).setSupportActionBar(toolbar)
        (activity as AppCompatActivity).title=""
        setHasOptionsMenu(true)
        toolbar.setNavigationOnClickListener {

        }
                recycler1.apply {
    adapter= RecyclerViewAdapter(this@HomeFragment.requireContext()).also {
        it.submitList(MockData.geyAllGadgets())
    }
    layoutManager= LinearLayoutManager(this@HomeFragment.requireContext(),
        RecyclerView.HORIZONTAL,false)

}

        recycler2.apply {
            adapter= RecyclerViewAdapterSecond(this@HomeFragment.requireContext()).also {
                it.submitList(MockData2.geyAllGadgets())
            }
            layoutManager= LinearLayoutManager(this@HomeFragment.requireContext(),
                RecyclerView.HORIZONTAL,false)

        }

    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.barsearch,menu)
        val search = menu?.findItem(R.id.search_notes_folder)
        val searchView= search?.actionView as SearchView
        searchView.queryHint="Search food..."
        super.onCreateOptionsMenu(menu, inflater)
    }


}