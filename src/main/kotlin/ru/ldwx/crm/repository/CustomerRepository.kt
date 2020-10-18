package ru.ldwx.crm.repository

import ru.ldwx.crm.model.Customer

interface CustomerRepository {
    fun getAll(): List<Customer>
    fun getById(id: Int): Customer
    fun getByMail(mail: String): Customer
    fun save(customer: Customer): Boolean
}