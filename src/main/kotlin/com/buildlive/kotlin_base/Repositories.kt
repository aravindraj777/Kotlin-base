package com.buildlive.kotlin_base

import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional

interface IArticleRepository : JpaRepository<Article, Long> {


    fun findAllByOrderByCreatedAtDesc():Iterable<Article>
    fun findBySlug(slug:String):Optional<Article>
}