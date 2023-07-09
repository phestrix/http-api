package com.example.plugins

import com.example.routes.customer.customerRouting
import com.example.routes.order.getOrderRoute
import com.example.routes.order.listOrdersRoute
import com.example.routes.order.totalizeOrderRoute
import io.ktor.server.routing.*
import io.ktor.server.application.*

fun Application.configureRouting() {
    routing {
        customerRouting()
        listOrdersRoute()
        getOrderRoute()
        totalizeOrderRoute()
    }
}
