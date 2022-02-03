package com.lucascalderon1.login.model

data class Book(

    val id: Int,
    val name: String,
    val author: String = "Tim Brown",
    val pages: String = "150 paginas",
    val editor: String = "Editora Loyola",
    val data: String = "Publicado em 2020"
) {

    companion object {


        fun getMocklistCount(count: Int): List<Book> {

            val mockList = mutableListOf<Book>()
            for (id in 1..count) {
                mockList.add(
                    Book(
                        id = id,
                        name = "Crossing the Chasm"
                    )
                )

            }
            return mockList
        }

    }
}