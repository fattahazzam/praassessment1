package com.afs.praassessmentazzam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.afs.praassessmentazzam.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
        super.onCreate(savedInstanceState)

        val navController = this.findNavController(
            R.id.fragmentKita)
        NavigationUI.setupActionBarWithNavController(this,navController)

//         val binding : ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.fragmentKita)
        return super.onSupportNavigateUp()
    }


}
