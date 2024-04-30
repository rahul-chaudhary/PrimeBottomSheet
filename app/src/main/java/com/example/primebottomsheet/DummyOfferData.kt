package com.example.primebottomsheet


import android.content.Context
import androidx.appcompat.content.res.AppCompatResources
import com.example.primebottomsheet.model.OfferModel

object DummyOfferData {

    fun getOffersList(context: Context): ArrayList<OfferModel> {
        return arrayListOf(
            OfferModel(
                AppCompatResources.getDrawable(context, R.drawable.offer) ,
                context.getString(R.string.save_at_least_400_in_every_booking)
            ),
            OfferModel(
                AppCompatResources.getDrawable(context, R.drawable.rupee),
                context.getString(R.string.recover_prime_fee_in_first_booking_itself)
            )
        )
    }

}