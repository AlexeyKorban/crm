package ru.ldwx.crm.model

data class Customer(val id: Int, val name: String, val phone: String, val mail: String, val orders: List<Order>)