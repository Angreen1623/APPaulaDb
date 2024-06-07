package com.example.appauladb.viewModel

import com.example.appauladb.roomDB.Pessoa
import com.example.appauladb.roomDB.PessoaDataBase

class Repository (private val db: PessoaDataBase){ // instancia PessoaDataBase na variável bd
    suspend fun upsertPessoa(pessoa:Pessoa){
        db.pessoaDao().upsertPessoa(pessoa) // Usa as funções do PessoaDao() dentro de PessoaDataBase para inserir ou atualizar uma linha
    }

    suspend fun deletePessoa(pessoa:Pessoa){
        db.pessoaDao().deletePessoa(pessoa) // Usa as funções do PessoaDao() dentro de PessoaDataBase para deletar uma linha
    }

    fun getAllPessoa() = db.pessoaDao().getAllPessoa() // Usa as funções do PessoaDao() dentro de PessoaDataBase para coletar os valores da tabela
}