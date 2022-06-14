package wary.bhaskar.ecoapp.ui.blog

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BlogViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Blog Fragment"
    }
    val text: LiveData<String> = _text
}