package com.example.appauladb.viewModel

import androidx.lifecycle.ViewModel

class PessoaViewModel(private val repository: Repository): ViewModel {

    fun getPessoa() = repository.getAllPessoa().asLiveData()

}