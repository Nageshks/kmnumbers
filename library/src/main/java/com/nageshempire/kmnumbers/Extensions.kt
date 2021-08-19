package com.nageshempire.kmnumbers


fun Long.toKMNumbers() : String = KMNumbers.formatNumbers(this)
fun Double.toKMNumbers() : String = KMNumbers.formatNumbers(this.toLong())