package com.infnet.at_interfaces_a.ui.formacao

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.infnet.at_interfaces_a.databinding.FragmentFormacaoBinding

class FormacaoFragment : Fragment() {

private var _binding: FragmentFormacaoBinding? = null
  // This property is only valid between onCreateView and
  // onDestroyView.
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    val formacaoViewModel =
            ViewModelProvider(this).get(FormacaoViewModel::class.java)

    _binding = FragmentFormacaoBinding.inflate(inflater, container, false)
    val root: View = binding.root

    val formacao: TextView = binding.txtGraduacao
    formacaoViewModel.formacao.observe(viewLifecycleOwner) {
      formacao.text = it
    }
    return root
  }

override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}