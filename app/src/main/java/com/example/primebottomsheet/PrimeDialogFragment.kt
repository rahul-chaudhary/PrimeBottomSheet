package com.example.primebottomsheet

import android.app.Dialog
import android.os.Bundle
import android.util.Log
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.primebottomsheet.databinding.BottomsheetFragmentDialogBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class PrimeDialogFragment : BottomSheetDialogFragment() {
    private lateinit var binding: BottomsheetFragmentDialogBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = BottomsheetFragmentDialogBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.skipAndBook.setOnClickListener {
            Toast.makeText(requireContext(), "Skip and Book Clicked", Toast.LENGTH_SHORT).show()
        }

        binding.bePrimeBtn.setOnClickListener {
            Toast.makeText(requireContext(), "Be Prime Button Clicked", Toast.LENGTH_SHORT).show()
        }
    }
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return BottomSheetDialog(requireContext(),R.style.BottomSheetStyle)

    }

    companion object {
        const val TAG = "ModalBottomSheet"
    }
}
//
//binding = BottomsheetFragmentDialogBinding.inflate(layoutInflater)
//binding.skipAndBook.setOnClickListener {
//    Toast.makeText(it.context, "Skip and Book Clicked", Toast.LENGTH_SHORT).show()
//    Log.d("Prime Dialog Fragment", "Skip and Book Clicked")
//}
//binding.bePrimeBtn.setOnClickListener {
//    Toast.makeText(it.context, "Be Prime Button Clicked", Toast.LENGTH_SHORT).show()
//    Log.d("Prime Dialog Fragment", "Be Prime Clicked")
//}