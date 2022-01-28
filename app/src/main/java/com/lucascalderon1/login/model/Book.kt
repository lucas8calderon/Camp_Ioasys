package com.lucascalderon1.login.model

data class Book (

    val id: Int,
    val name: String,
    val author: String ="Tim Brown",
    val pages: String = "150 paginas",
    val editor: String = "Editora Loyola",
    val data: String = "Publicado em 2020"
) {

    companion object {

        fun getMockList() = listOf(
            Book(
                id = 1,
                name = "Crossing the Chasm"
            ),
            Book(
                id = 2,
                name = "Change By Desing"
            ),
            Book(
                id = 3,
                name = "The Making of a Manager"
            ),
            Book(
                id = 4,
                name = "Don't Make me Think"
            ),
            Book(
                id = 5,
                name = "Web Desing 101"
            ),

            )

    }
}