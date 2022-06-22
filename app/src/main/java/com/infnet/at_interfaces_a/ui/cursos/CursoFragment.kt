package com.infnet.at_interfaces_a.ui.cursos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.infnet.at_interfaces_a.databinding.FragmentCursoBinding
import com.infnet.at_interfaces_a.databinding.FragmentExperienciaBinding

class CursoFragment : Fragment() {

private var _binding: FragmentCursoBinding? = null
  // This property is only valid between onCreateView and
  // onDestroyView.
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    val cursoViewModel =
            ViewModelProvider(this).get(CursoViewModel::class.java)

    _binding = FragmentCursoBinding.inflate(inflater, container, false)
    val root: View = binding.root

    val curso: TextView = binding.txtCurso
      cursoViewModel.curso.observe(viewLifecycleOwner) {
          curso.text = it
    }
    return root
  }

override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}