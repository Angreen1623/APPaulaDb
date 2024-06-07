package com.example.appauladb.roomDB

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface PessoaDao {

    @Upsert
    suspend fun upsertPessoa(pessoa: Pessoa) // Insere ou atualiza a linha ao banco de dados baseado nos valores especificados na variável pessoa

    @Delete
    suspend fun deletePessoa(pessoa: Pessoa) // Deleta a linha que contenha os valores especificados na variável pessoa

    @Query("SELECT * FROM pessoa")
    fun getAllPessoa(): Flow<List<Pessoa>> //Envia todos os dados contidos na tabela Pessoa

}