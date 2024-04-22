package com.example.primebottomsheet

import android.app.Dialog
import android.os.Bundle
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialog

class PrimeDialogFragment : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.bottomsheet_fragment_dialog, container, false)

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
//        val dialog = super.onCreateDialog(savedInstanceState) as BottomSheetDialog
//        dialog.setOnShowListener {
//            val bottomSheetDialog = it as BottomSheetDialog
//            val bottomSheet = bottomSheetDialog.findViewById<View>(com.google.android.material.R.id.design_bottom_sheet)
//            bottomSheet?.let { sheet ->
//                val behavior = BottomSheetBehavior.from(sheet)
//                behavior.state = BottomSheetBehavior.STATE_EXPANDED
//            }
//        }
//        dialog.apply {
//            setStyle(STYLE_NORMAL , R.style.BottomSheetStyle)
//        }
        return BottomSheetDialog(requireContext(),R.style.BottomSheetStyle)

    }

    companion object {
        const val TAG = "ModalBottomSheet"
    }
}