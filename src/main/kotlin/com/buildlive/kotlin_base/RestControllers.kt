package com.buildlive.kotlin_base

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/articles")
class ArticleController {

    val articles = mutableListOf(Article(title = "My title", content = "My content"))

    @GetMapping
    fun articles() = articles

}