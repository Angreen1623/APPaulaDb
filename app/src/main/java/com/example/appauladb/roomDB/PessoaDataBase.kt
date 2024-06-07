package com.example.appauladb.roomDB

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Pessoa::class], //cria os bancos na versão desejada
    version = 1
    )

abstract class PessoaDataBase: RoomDatabase() {
    abstract fun pessoaDao(): PessoaDao //Referencia a classe pessoaDao em uma função
}
