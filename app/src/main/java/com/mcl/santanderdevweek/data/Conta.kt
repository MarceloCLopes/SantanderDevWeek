package com.mcl.santanderdevweek.data

data class Conta (
    val numero: String,
    val agencia: String,
    val saldo: String,
    val limite: String,
    val clinte: Cliente,
    val cartao: Cartao

)