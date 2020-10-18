package ru.ldwx.crm.repository

import org.springframework.stereotype.Repository
import ru.ldwx.crm.exception.CustomerNotFoundException
import ru.ldwx.crm.model.Customer

@Repository
class CustomerInMemoryRepositoryImpl : CustomerRepository {
    val customers = mutableListOf<Customer>()

    override fun getAll() = customers

    override fun getById(id: Int) = customers.find { customer -> customer.id == id }
            ?: throw CustomerNotFoundException()


    override fun getByMail(mail: String) = customers.find { customer -> customer.mail.contains(mail) }
            ?: throw CustomerNotFoundException()

    override fun save(customer: Customer) = customers.add(customer)
}