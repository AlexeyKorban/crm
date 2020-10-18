package ru.ldwx.crm.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import ru.ldwx.crm.model.Customer
import ru.ldwx.crm.repository.CustomerRepository

@Service
class CustomerServiceImpl(@Autowired val customerRepository: CustomerRepository) : CustomerService {
    override fun getAll() = customerRepository.getAll()

    override fun getById(id: Int) = customerRepository.getById(id)

    override fun getByName(name: String) = customerRepository.getAll()

    override fun getByPhone(phone: String) = customerRepository.getAll().filter { customer -> customer.phone.contains(phone) }

    override fun getByMail(mail: String) = customerRepository.getByMail(mail)

    override fun create(customer: Customer) = customerRepository.save(customer)
}