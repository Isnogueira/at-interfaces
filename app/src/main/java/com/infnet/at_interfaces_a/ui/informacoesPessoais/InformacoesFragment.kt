package com.infnet.at_interfaces_a.ui.informacoesPessoais

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.infnet.at_interfaces_a.databinding.FragmentInformacoesBinding

class InformacoesFragment : Fragment() {

private var _binding: FragmentInformacoesBinding? = null
  // This property is only valid between onCreateView and
  // onDestroyView.
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    val informacoesViewModel =
            ViewModelProvider(this).get(InfomacoesViewModel::class.java)

    _binding = FragmentInformacoesBinding.inflate(inflater, container, false)
    val root: View = binding.root

        val nomePerfil: TextView = binding.txtNomePerfil
        informacoesViewModel.nome.observe(viewLifecycleOwner) {
          nomePerfil.text = it
        }
       val idade: TextView = binding.txtIdade
       informacoesViewModel.idade.observe(viewLifecycleOwner) {
           idade.text = it
      }
      val emailPerfil: TextView = binding.txtEmailPerfil
      informacoesViewModel.email.observe(viewLifecycleOwner) {
          emailPerfil.text = it
      }
      return root
  }

override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}