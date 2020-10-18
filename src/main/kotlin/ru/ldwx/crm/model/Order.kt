package ru.ldwx.crm.model

data class Order(val internalNumber: String, val externalNumber: String, val items: List<Item>)