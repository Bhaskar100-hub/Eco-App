package wary.bhaskar.ecoapp.ui.noixorgo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import wary.bhaskar.ecoapp.R
import wary.bhaskar.ecoapp.databinding.FragmentNoixorgoBinding
import wary.bhaskar.ecoapp.ui.noixorgo.NoixorgoViewModel

class NoixorgoFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val root = inflater.inflate(R.layout.fragment_noixorgo, container, false)

        return root
    }
}