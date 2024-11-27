package com.buildlive.kotlin_base

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.Optional

@Repository
interface IArticleRepository : JpaRepository<Article, Long> {


    fun findAllByOrderByCreatedAtDesc():Iterable<Article>
    fun findBySlug(slug:String):Optional<Article>
}