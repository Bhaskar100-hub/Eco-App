package wary.bhaskar.ecoapp.ui.events

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import wary.bhaskar.ecoapp.databinding.FragmentEventBinding

class EventsFragment : Fragment() {

    private var _binding: FragmentEventBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val eventsViewModel =
            ViewModelProvider(this).get(EventsViewModel::class.java)

        _binding = FragmentEventBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textEvent
        eventsViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}