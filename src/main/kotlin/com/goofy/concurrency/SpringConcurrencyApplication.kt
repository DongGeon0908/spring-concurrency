package com.goofy.concurrency

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringConcurrencyApplication

fun main(args: Array<String>) {
    runApplication<SpringConcurrencyApplication>(*args)
}
