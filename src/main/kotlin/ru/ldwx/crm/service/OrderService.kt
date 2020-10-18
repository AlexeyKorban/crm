package ru.ldwx.crm.service

import org.springframework.stereotype.Service

@Service
interface OrderService {
    fun getAll()
    fun getById(id: Int)
    fun getActive()
}