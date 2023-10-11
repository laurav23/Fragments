package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.fragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.fragment1Btn.setOnClickListener(){

            replaceFragment(Fragment1())

        }

        binding.fragment2Btn.setOnClickListener{

            replaceFragment(Fragment2())

        }

    }

    private fun replaceFragment(Fragment:Fragment) {

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer,Fragment)
        fragmentTransaction.commit()

    }
}