package com.example.composeactivity.logininsta

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel: ViewModel() {

    private val _email = MutableLiveData<String>()
    private val _password = MutableLiveData<String>()

    val email : LiveData<String> = _email
    val password: LiveData<String> = _password

    fun onLoginChanged(email: String){
        _email.value = email
    }

    fun onPasswordChanged(password: String){
        _password.value = password
    }
}