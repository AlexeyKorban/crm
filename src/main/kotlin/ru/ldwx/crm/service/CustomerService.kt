package ru.ldwx.crm.service

import ru.ldwx.crm.model.Customer

interface CustomerService {
    fun getAll(): List<Customer>
    fun getById(id: Int): Customer
    fun getByName(name: String): List<Customer>
    fun getByPhone(phone: String): List<Customer>
    fun getByMail(mail: String): Customer
    fun create(customer: Customer): Boolean
}