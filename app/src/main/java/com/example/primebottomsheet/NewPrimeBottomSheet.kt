package com.example.primebottomsheet

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.primebottomsheet.adapter.OfferAdapter
import com.example.primebottomsheet.databinding.FragmentNewPrimeBottomSheetBinding
import com.example.primebottomsheet.model.OfferModel
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class NewPrimeBottomSheet : BottomSheetDialogFragment() {
    private lateinit var binding: FragmentNewPrimeBottomSheetBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNewPrimeBottomSheetBinding.inflate(inflater, container, false)
        //offer Recycler View
        val offersRV = binding.offersRV
        offersRV.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        offersRV.adapter = OfferAdapter(fetchOfferTextData())
        //Skip and book onClickListener
        binding.skipAndBook.setOnClickListener {
            Toast.makeText(context, "Skip and Book Button Clicked", Toast.LENGTH_SHORT).show()
            dismiss()
        }
        //Be Prime Button
        binding.bePrimeBtn.setOnClickListener {
            Toast.makeText(context, "Be Prime Button Clicked", Toast.LENGTH_SHORT).show()
        }
        //know more TextView
        binding.knowMore.setOnClickListener {
            Toast.makeText(context, "Know More TextView Clicked", Toast.LENGTH_SHORT).show()
        }

        return binding.root

    }
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return BottomSheetDialog(requireContext(), R.style.BottomSheetStyle)

    }

    private fun fetchOfferTextData(): ArrayList<OfferModel> {
        return DummyOfferData.getOffersList(requireContext())
    }


}