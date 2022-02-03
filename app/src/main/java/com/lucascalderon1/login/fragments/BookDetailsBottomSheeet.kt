package com.lucascalderon1.login.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.lucascalderon1.login.R
import com.lucascalderon1.login.databinding.BottomSheetBookDetailsBinding
import com.lucascalderon1.login.model.Book


class BookDetailsBottomSheeet : BottomSheetDialogFragment() {


    private var _binding: BottomSheetBookDetailsBinding? = null
    private val binding: BottomSheetBookDetailsBinding get() = _binding!!

    private var book: Book? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = BottomSheetBookDetailsBinding.inflate(inflater, container, false).apply {
        _binding = this
    }.root

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {

        fun newInstance(book: Book? =  null): BookDetailsBottomSheeet {
            return BookDetailsBottomSheeet().apply {
                this.book = book
            }

            }



        }

    }




