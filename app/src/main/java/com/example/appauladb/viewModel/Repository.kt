package com.example.appauladb.viewModel

import com.example.appauladb.roomDB.Pessoa
import com.example.appauladb.roomDB.PessoaDataBase

class Repository (private val db: PessoaDataBase){
    suspend fun upsertPessoa(pessoa:Pessoa){
        db.pessoaDao().upsertPessoa(pessoa)
    }

    suspend fun deletePessoa(pessoa:Pessoa){
        db.pessoaDao().deletePessoa(pessoa)
    }

    fun getAllPessoa() = db.pessoaDao().getAllPessoa()
}