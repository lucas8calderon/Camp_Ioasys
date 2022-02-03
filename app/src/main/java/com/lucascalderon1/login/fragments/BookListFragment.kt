package com.lucascalderon1.login.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.lucascalderon1.login.adapter.BookClickListener
import com.lucascalderon1.login.adapter.BookListAdapter
import com.lucascalderon1.login.databinding.FragmentBookListBinding
import com.lucascalderon1.login.model.Book


class BookListFragment : Fragment(), BookClickListener {

    private val args: BookListFragmentArgs by navArgs()
    private lateinit var bookListAdapter: BookListAdapter
    private var _binding: FragmentBookListBinding? = null
    private val binding: FragmentBookListBinding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = FragmentBookListBinding.inflate(inflater, container, false).apply {
        _binding = this
    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setBookListData()

    }

    private fun setBookListData() {

        bookListAdapter = BookListAdapter(this)
        binding.rvBooks.adapter = bookListAdapter
        bookListAdapter.submitList(
            Book.getMocklistCount(
                args.itemCount
            )
        )

    }

    override fun onBookClickListener(book: Book) {
       BookDetailsBottomSheeet.newInstance(book).show(childFragmentManager, "Book")

    }
}



