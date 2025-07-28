package com.appalog.logger

import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("Logger application started")
    while (true) {
        // Keep application running
        kotlinx.coroutines.delay(Long.MAX_VALUE)
    }
}
