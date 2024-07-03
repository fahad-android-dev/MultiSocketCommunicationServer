package com.example.multisocketserver.mvvm.main.model

data class ClientListResponseModel(
    val data : ArrayList<ClientListDataModel> ?= arrayListOf()
)

data class ClientListDataModel(
    val id : String ?= null,
    val name : String ?= null,
)
