package com.lucascalderon1.login.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.lucascalderon1.login.R
import com.lucascalderon1.login.model.Book


class BookListAdapter: ListAdapter<Book, BookListAdapter.BookListViewHolder>(DIFF_CALlBACK) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookListViewHolder {
        return BookListViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: BookListViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    companion object {
        private val DIFF_CALlBACK = object : DiffUtil.ItemCallback<Book>() {

            override fun areItemsTheSame(oldItem: Book, newItem: Book): Boolean =
                oldItem.id == newItem.id


            override fun areContentsTheSame(oldItem: Book, newItem: Book): Boolean =
                oldItem == newItem


        }
    }


    class BookListViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val  bookTitle: AppCompatTextView = view.findViewById(R.id.tvTitleBook)
        private val  bookAuthor: AppCompatTextView = view.findViewById(R.id.txtAuthorName)
        private val  bookPages: AppCompatTextView = view.findViewById(R.id.tvPagesCount)
        private val  bookEditor: AppCompatTextView = view.findViewById(R.id.tvPublisher)
        private val  bookDate: AppCompatTextView = view.findViewById(R.id.tvPublished)


        fun bind(book: Book) {
            bookTitle.text = book.name
            bookAuthor.text = book.author
            bookPages.text = book.pages
            bookEditor.text = book.editor
            bookDate.text = book.data

        }


        companion object {
            fun create (parent: ViewGroup): BookListViewHolder {
                val view =
                    LayoutInflater.from(parent.context).inflate(R.layout.book_item, parent, false)
                return BookListViewHolder(view)
            }

        }

    }

}