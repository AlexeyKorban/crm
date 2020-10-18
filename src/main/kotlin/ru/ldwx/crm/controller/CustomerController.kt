package ru.ldwx.crm.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import ru.ldwx.crm.model.Customer
import ru.ldwx.crm.service.CustomerService

@RestController
class CustomerController(@Autowired val customerService: CustomerService) {

    @GetMapping("/customers")
    fun getAllCustomers() = customerService.getAll()

    @GetMapping(value = ["/customer/{id}"])
    fun getCustomer(@PathVariable id: Int) = customerService.getById(id)

    @GetMapping(value = ["/customer/{phone}"])
    fun getByPhone(@PathVariable phone: String) = customerService.getByPhone(phone)

    @GetMapping(value = ["/customer/{mail}"])
    fun getByMail(@PathVariable mail: String) = customerService.getByMail(mail)

    @GetMapping(value = ["/customer/{name}"])
    fun getByName(@PathVariable name: String) = customerService.getByName(name)

    @PostMapping(value = ["/customer/create"])
    fun create(@RequestBody customer: Customer) = customerService.create(customer)

    @PostMapping(value = ["/customer/update"])
    fun update(@RequestBody customer: Customer) = customerService.create(customer)
}