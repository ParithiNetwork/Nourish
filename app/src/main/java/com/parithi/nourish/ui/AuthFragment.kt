package com.parithi.nourish.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.parithi.nourish.R
import com.parithi.nourish.databinding.FragmentAuthBinding


class AuthFragment : Fragment() {

    private lateinit var binding: FragmentAuthBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_auth, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentAuthBinding.bind(view)

        val fragmentContainer = childFragmentManager.findFragmentById(R.id.auth_nav_host_fragment) as? NavHostFragment
        val navController = fragmentContainer?.let { findNavController(it) }
        if (navController != null) {
            binding.navView.setupWithNavController(navController)
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = AuthFragment()
    }
}