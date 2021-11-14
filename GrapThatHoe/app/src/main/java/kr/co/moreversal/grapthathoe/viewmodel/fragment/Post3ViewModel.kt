package kr.co.moreversal.grapthathoe.viewmodel.fragment

import androidx.lifecycle.ViewModel
import kr.co.moreversal.grapthathoe.extension.SingleLiveEvent

class Post3ViewModel: ViewModel() {
    val onBackEvent = SingleLiveEvent<Unit>()

    fun onClickBack() {
        onBackEvent.call()
    }

}