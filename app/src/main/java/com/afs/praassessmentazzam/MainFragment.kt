package com.afs.praassessmentazzam

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.afs.praassessmentazzam.databinding.FragmentMainBinding

/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding:FragmentMainBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_main,container,false)
        binding.txmenusatu.setOnClickListener{
            view : View -> view.findNavController().navigate(
            R.id.action_mainFragment_to_menu1Fragment
        )
        }
        binding.btmenudua.setOnClickListener{
            view: View -> view.findNavController().navigate(
            R.id.action_mainFragment_to_menu2Fragment
        )
        }

        return binding.root

    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater?) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.menu.menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!,view!!.findNavController())
                ||super.onOptionsItemSelected(item)
    }

}
