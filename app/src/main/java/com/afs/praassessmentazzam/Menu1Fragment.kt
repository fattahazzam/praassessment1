package com.afs.praassessmentazzam

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.afs.praassessmentazzam.databinding.FragmentMenu1Binding
import java.lang.Exception

/**
 * A simple [Fragment] subclass.
 */
class Menu1Fragment : Fragment() {
    lateinit var binding: FragmentMenu1Binding
    var jumlah : Int = 0
    var hasilKue : String = ""
    var harga : Int = 0
    var nama : String = ""

    val KEY_NAMA = "isi key"


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_menu1,container,false)

        if (savedInstanceState !=null){

        }

        binding.btPlus.setOnClickListener{
            jumlah = binding.tnNilai.text.toString().toInt() + 1
            binding.tnNilai.setText(jumlah.toString())
        }
        binding.btMinus.setOnClickListener{
            jumlah = binding.tnNilai.text.toString().toInt() -1
            binding.tnNilai.setText(jumlah.toString())
        }
//        binding.btBeli.setOnClickListener{
//
//        }
        binding.btShare.setOnClickListener{
            val mIntent =Intent(Intent.ACTION_SEND)

            mIntent.data = Uri.parse("mailto : ")
            mIntent.type = "text/plain"

            mIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("fattahazzam@gmail.com"))
            mIntent.putExtra(Intent.EXTRA_EMAIL, "jawaban")
            mIntent.putExtra(Intent.EXTRA_TEXT,"")
            try {
                startActivity(Intent.createChooser(mIntent,"Choose email client..."))
            }catch (e:Exception){

            }
        }
    }



    override fun onSaveInstanceState(outState: Bundle) {
        outState.putString(KEY_NAMA,nama)
        super.onSaveInstanceState(outState)
    }

}
