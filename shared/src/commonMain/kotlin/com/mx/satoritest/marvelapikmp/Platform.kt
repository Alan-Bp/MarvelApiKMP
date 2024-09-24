package com.mx.satoritest.marvelapikmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform