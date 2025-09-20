package com.example.atlmovaapp.screen.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.atlmovaapp.R
import com.example.atlmovaapp.databinding.FragmentProfileBinding
import com.google.android.material.materialswitch.MaterialSwitch

class ProfileFragment : Fragment() {
    private lateinit var binding: FragmentProfileBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.premiumLayout.setOnClickListener {
            val action = ProfileFragmentDirections.actionProfileFragmentToSubscribePremiumFragment()
            findNavController().navigate(action)
        }


        binding.EditProfileView.setOnClickListener {
            findNavController().navigate(ProfileFragmentDirections.actionProfileFragmentToEditProfileFragment())
        }

        binding.NoficationView.setOnClickListener {
            findNavController().navigate(ProfileFragmentDirections.actionProfileFragmentToNotficationFragment())
        }

        binding.DownloadView.setOnClickListener {
            findNavController().navigate(ProfileFragmentDirections.actionProfileFragmentToProfileDownloadFragment())
        }

        binding.SecurityView.setOnClickListener {
            findNavController().navigate(ProfileFragmentDirections.actionProfileFragmentToSecurityFragment())
        }

        binding.LanguageView.setOnClickListener {
            findNavController().navigate(ProfileFragmentDirections.actionProfileFragmentToLanguageFragment())
        }

        binding.HelpCenterView.setOnClickListener {
            findNavController().navigate(ProfileFragmentDirections.actionProfileFragmentToHelpCenterFragment())
        }

        binding.PrivacyPolicyView.setOnClickListener {
            findNavController().navigate(ProfileFragmentDirections.actionProfileFragmentToPrivacyPolicyFragment())
        }

//        val darkModeSwitch = view.findViewById<MaterialSwitch>(R.id.switch8)
//
//        darkModeSwitch.setOnCheckedChangeListener { _, isChecked ->
//            if (isChecked) {
//                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
//            } else {
//                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
//            }
//        }

    }
}