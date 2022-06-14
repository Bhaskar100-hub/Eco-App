package wary.bhaskar.ecoapp.ui.noixorgo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NoixorgoViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Noixorgo Fragment"
    }
    val text: LiveData<String> = _text
}