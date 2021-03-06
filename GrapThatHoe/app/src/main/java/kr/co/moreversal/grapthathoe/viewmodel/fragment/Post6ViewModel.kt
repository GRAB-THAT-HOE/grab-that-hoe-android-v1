package kr.co.moreversal.grapthathoe.viewmodel.fragment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kr.co.moreversal.grapthathoe.extension.SingleLiveEvent

class Post6ViewModel: ViewModel() {
    val onBackEvent = SingleLiveEvent<Unit>()
    val onNextEvent = SingleLiveEvent<Unit>()

    fun onClickBack() {
        onBackEvent.call()
    }

    fun onClickNext() {
        onNextEvent.call()
    }

}