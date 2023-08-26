package com.example.consultacep.model

data class EnderecoDetalhado(
    val cep: String,
    val rua: String,
    val cidade: String,
    val bairro: String,
    val uf: String
)
