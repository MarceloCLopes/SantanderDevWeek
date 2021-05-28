package com.mcl.santanderdevweek.data.local

import com.mcl.santanderdevweek.data.Cartao
import com.mcl.santanderdevweek.data.Cliente
import com.mcl.santanderdevweek.data.Conta

class FakeData {
    fun getLocaldata(): Conta {
        val cliente = Cliente("Marcelo Lopes")
        val cartao = Cartao("5846856898574569")
        return Conta(
            "458655-8",
            "6554-8",
            "R$ 2.586,58",
            "R$ 4.859,57",
            cliente,
            cartao
        )
    }
}