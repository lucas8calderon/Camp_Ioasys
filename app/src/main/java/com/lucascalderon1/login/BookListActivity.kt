package com.lucascalderon1.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.lucascalderon1.login.adapter.BookListAdapter
import com.lucascalderon1.login.model.Book

class BookListActivity : AppCompatActivity() {

    private lateinit var  bookListAdapter: BookListAdapter

    private val  rvBooks: RecyclerView by lazy {
        findViewById(R.id.rvBooks)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_list)

        setBookListData()

    }


    private fun setBookListData(){

        bookListAdapter = BookListAdapter()
        rvBooks.adapter = bookListAdapter

        bookListAdapter.submitList(Book.getMockList())


    }

}