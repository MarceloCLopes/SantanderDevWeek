package com.mcl.santanderdevweek.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mcl.santanderdevweek.data.Conta
import com.mcl.santanderdevweek.data.local.FakeData

class MainViewModel : ViewModel() {

    private val mutableLiveData: MutableLiveData<Conta> = MutableLiveData()

    fun buscarContaCliente() : LiveData<Conta>{
        mutableLiveData.value = FakeData().getLocaldata()

        return mutableLiveData
    }
}