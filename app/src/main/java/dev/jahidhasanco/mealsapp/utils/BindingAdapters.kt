package dev.jahidhasanco.mealsapp.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import dev.jahidhasanco.mealsapp.R

@BindingAdapter("urlToImage")
fun urlToImage(view: ImageView,str:String){

    val options = RequestOptions.placeholderOf(R.drawable.loading).error(R.drawable.error)

    Glide.with(view).setDefaultRequestOptions(options).load(str).into(view)
}