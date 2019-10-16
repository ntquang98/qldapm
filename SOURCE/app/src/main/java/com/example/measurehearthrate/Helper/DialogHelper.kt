package com.example.measurehearthrate.Helper

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class DialogHelper {


    companion object {

        private var mDialogState: MutableLiveData<DialogWrapper> = MutableLiveData()

        val dialogState: LiveData<DialogWrapper>
            get() = mDialogState

        fun emitDialogState(
                isshowingDialog: Boolean? = null
        ) {
            val dialogModel = DialogWrapper(isshowingDialog)
            mDialogState.postValue(dialogModel)

        }

        data class DialogWrapper(
                var isshowingDialog: Boolean?
        )
    }
}