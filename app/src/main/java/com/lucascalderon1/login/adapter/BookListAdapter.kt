package com.lucascalderon1.login.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.lucascalderon1.login.databinding.BookItemBinding
import com.lucascalderon1.login.model.Book


class BookListAdapter(
    private val onBookClickListener: BookClickListener
):ListAdapter<Book, BookListAdapter.BookListViewHolder>(DIFF_CALlBACK) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookListViewHolder {
        return BookListViewHolder.create(parent, onBookClickListener)
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


    class BookListViewHolder(
        private val binding: BookItemBinding,
        private val onBookClickListener: BookClickListener
    ) : RecyclerView.ViewHolder(binding.root) {


        fun bind(book: Book) {
            binding.apply {

                tvTitleBook.text = book.name
                txtAuthorName.text = book.author
                tvPagesCount.text = book.pages
                tvPublisher.text = book.editor
                tvPublished.text = book.data


                root.setOnClickListener {
                    onBookClickListener.onBookClickListener(book)
                }

            }
        }

        companion object {
            fun create(
                parent: ViewGroup,
                onBookClickListener: BookClickListener
            ): BookListViewHolder {
                val binding = BookItemBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false

                )



                return BookListViewHolder(binding, onBookClickListener)
            }

        }

    }
}
