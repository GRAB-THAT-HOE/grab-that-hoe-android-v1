package kr.co.moreversal.grapthathoe.viewmodel.fragment

import androidx.lifecycle.ViewModel
import kr.co.moreversal.grapthathoe.extension.SingleLiveEvent

class DetailFarmViewModel: ViewModel() {
    val onBackEvent = SingleLiveEvent<Unit>()
    val onCallEvent = SingleLiveEvent<Unit>()
    val onDetailProfileEvent = SingleLiveEvent<Unit>()
    val onShowDetailEvent = SingleLiveEvent<Unit>()
    val onPinEvent = SingleLiveEvent<Unit>()

    fun onClickBack() {
        onBackEvent.call()
    }

    fun onClickCall() {
        onCallEvent.call()
    }

    fun onClickShowDetail() {
        onShowDetailEvent.call()
    }

    fun onClickPin() {
        onPinEvent.call()
    }

    fun onClickDetailProfile() {
        onDetailProfileEvent.call()
    }

}