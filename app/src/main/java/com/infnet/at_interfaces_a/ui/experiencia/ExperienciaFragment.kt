package com.infnet.at_interfaces_a.ui.experiencia

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.infnet.at_interfaces_a.databinding.FragmentExperienciaBinding
import com.infnet.at_interfaces_a.databinding.FragmentFormacaoBinding

class ExperienciaFragment : Fragment() {

private var _binding: FragmentExperienciaBinding? = null
  // This property is only valid between onCreateView and
  // onDestroyView.
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    val experienciaViewModel =
            ViewModelProvider(this).get(ExperienciaViewModel::class.java)

    _binding = FragmentExperienciaBinding.inflate(inflater, container, false)
    val root: View = binding.root

    val experiencia: TextView = binding.txtExperiencia
      experienciaViewModel.experiencia.observe(viewLifecycleOwner) {
          experiencia.text = it
    }
    return root
  }

override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}