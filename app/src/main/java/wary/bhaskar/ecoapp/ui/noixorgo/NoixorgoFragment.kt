package wary.bhaskar.ecoapp.ui.noixorgo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import wary.bhaskar.ecoapp.databinding.FragmentNoixorgoBinding
import wary.bhaskar.ecoapp.ui.noixorgo.NoixorgoViewModel

class NoixorgoFragment : Fragment() {

    private var _binding: FragmentNoixorgoBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val noixorgoViewModel =
            ViewModelProvider(this).get(NoixorgoViewModel::class.java)

        _binding = FragmentNoixorgoBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textNoixorgo
        noixorgoViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}