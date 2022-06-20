package wary.bhaskar.ecoapp.ui.team

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_team.*
import wary.bhaskar.ecoapp.R

class TeamFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val root = inflater.inflate(R.layout.fragment_team, container, false)
        return root
        toggleButtonGroup.addOnButtonCheckedListener { toggleButtonGroup, checkedId, isChecked ->

            if (isChecked) {
                when (checkedId) {
                    R.id.btnAndroid -> showToast("Robot that looks like human.")
                    R.id.btnFlutter -> showToast("It's a Butterfly thing.")
                    R.id.btnWeb -> showToast("You still exist?")
                }
            } else {
                if (toggleButtonGroup.checkedButtonId == View.NO_ID) {
                    showToast("Nothing Selected")
                }
            }
        }
    }
    private fun showToast(str: String) {
        Toast.makeText(getContext(), str, Toast.LENGTH_LONG).show()
    }
}