package com.example.appauladb.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.appauladb.roomDB.Pessoa
import kotlinx.coroutines.launch

class PessoaViewModel(private val repository: Repository): ViewModel (){

    fun getPessoa() = repository.getAllPessoa().asLiveData(viewModelScope.coroutineContext) // retorna os valores contidos na função getAllPessoa

    fun upsertPessoa(pessoa: Pessoa){
        viewModelScope. launch {
            repository.upsertPessoa(pessoa) // envia a matriz pessoa para a função upsertPessoa da classe repositório
        }
    }

    fun deletePessoa(pessoa: Pessoa){
        viewModelScope. launch {
            repository.deletePessoa(pessoa) // envia a matriz pessoa para a função deletePessoa da classe repositório
        }
    }

}