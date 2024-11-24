package com.buildlive.kotlin_base

import java.util.*

fun String.toSlug() = lowercase(Locale.getDefault())
        .replace("\n"," ")
        .replace("[^a-z\\d\\s]".toRegex()," ")
        .split(" ")
        .joinToString("-")
        .replace("-+".toRegex(),"-")