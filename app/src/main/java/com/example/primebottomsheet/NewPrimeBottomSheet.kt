package com.example.primebottomsheet

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
        val offersRV = binding.offersRV
        offersRV.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        offersRV.adapter = OfferAdapter(fetchOfferTextData())

        return binding.root

    }
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return BottomSheetDialog(requireContext(), R.style.BottomSheetStyle)

    }

    private fun fetchOfferTextData(): ArrayList<OfferModel> {
        return DummyOfferData.getOffersList(requireContext())
    }


}