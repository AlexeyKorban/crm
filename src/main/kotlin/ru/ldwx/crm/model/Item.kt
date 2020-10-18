package ru.ldwx.crm.model

import java.math.BigDecimal
import java.net.URL

data class Item(val description: String, val url: URL, val price: BigDecimal)