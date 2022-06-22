package com.infnet.at_interfaces_a.ui.publicacoes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.infnet.at_interfaces_a.databinding.FragmentCursoBinding
import com.infnet.at_interfaces_a.databinding.FragmentPublicacaoBinding

class PublicacaoFragment : Fragment() {

private var _binding: FragmentPublicacaoBinding? = null
  // This property is only valid between onCreateView and
  // onDestroyView.
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    val publicacaoViewModel =
            ViewModelProvider(this).get(PublicacaoViewModel::class.java)

    _binding = FragmentPublicacaoBinding.inflate(inflater, container, false)
    val root: View = binding.root

    val publicacao: TextView = binding.txtPublicacao
      publicacaoViewModel.publicacao.observe(viewLifecycleOwner) {
          publicacao.text = it
    }
    return root
  }

override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}