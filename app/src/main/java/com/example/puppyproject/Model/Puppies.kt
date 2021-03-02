package com.example.puppyproject.Model

/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


import androidx.compose.runtime.Immutable

@Immutable
data class Puppy(
    val id: Long,
    val name: String,
    val     imageUrl: String,
    val price: Long,
    val tagline: String = "",
    val tags: Set<String> = emptySet()
)

/**
 * Static data
 */

val Puppys = listOf(
    Puppy(
        id = 1L,
        name = "Cupcake",
        tagline = "A tag line",
        imageUrl = "https://images.unsplash.com/photo-1587402092301-725e37c70fd8?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=700&q=80",
        price = 299
    ),
    Puppy(
        id = 2L,
        name = "Donut",
        tagline = "A tag line",
        imageUrl = "https://images.unsplash.com/photo-1501472193205-56ffb66400f0?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=634&q=80",
        price = 299
    ),
    Puppy(
        id = 3L,
        name = "Eclair",
        tagline = "A tag line",
        imageUrl = "https://images.unsplash.com/photo-1610385874395-e75e493098b7?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=675&q=80",
        price = 299
    ),
    Puppy(
        id = 4L,
        name = "Froyo",
        tagline = "A tag line",
        imageUrl = "https://images.unsplash.com/photo-1610624427159-f77e3152cfd7?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=736&q=80",
        price = 299
    ),
    Puppy(
        id = 5L,
        name = "Gingerbread",
        tagline = "A tag line",
        imageUrl = "https://images.unsplash.com/photo-1569229646060-65d06a76d360?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1318&q=80",
        price = 499
    ),
    Puppy(
        id = 6L,
        name = "Honeycomb",
        tagline = "A tag line",
        imageUrl = "https://images.unsplash.com/photo-1569229646060-65d06a76d360?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1318&q=80",
        price = 299
    ),
    Puppy(
        id = 7L,
        name = "Ice Cream Sandwich",
        tagline = "A tag line",
        imageUrl = "https://images.unsplash.com/photo-1569229646060-65d06a76d360?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1318&q=80",
        price = 1299
    ),
    Puppy(
        id = 8L,
        name = "Jellybean",
        tagline = "A tag line",
        imageUrl = "https://images.unsplash.com/photo-1610624427159-f77e3152cfd7?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=736&q=80",
        price = 299
    ),

)
