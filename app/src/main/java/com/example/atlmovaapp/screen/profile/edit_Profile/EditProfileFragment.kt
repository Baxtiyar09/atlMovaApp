package com.example.atlmovaapp.screen.profile.edit_Profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.atlmovaapp.databinding.FragmentEditProfileBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class EditProfileFragment : Fragment() {
    private lateinit var binding: FragmentEditProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEditProfileBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.backIcon.setOnClickListener {
            findNavController().popBackStack()
        }

        binding.UpdateButton.setOnClickListener {
            Toast.makeText(requireContext(), "Yenilik  əlavə olundu ✅", Toast.LENGTH_SHORT).show()
            lifecycleScope.launch {
                delay(1000)
                findNavController().popBackStack()
            }
        }
    }
}