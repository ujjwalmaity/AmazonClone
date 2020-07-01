package dev.ujjwal.amazonclone

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.smarteist.autoimageslider.SliderViewAdapter
import kotlinx.android.synthetic.main.item_image_slider.view.*


class ImageSliderAdapter(private val context: Context) :
    SliderViewAdapter<ImageSliderAdapter.ImageSliderVH>() {

    private var mSliderItems: List<String> = ArrayList()

    fun renewItems(sliderItems: List<String>) {
        mSliderItems = sliderItems
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup): ImageSliderVH {
        val inflate: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_image_slider, null)
        return ImageSliderVH(inflate)
    }

    override fun onBindViewHolder(viewHolder: ImageSliderVH, position: Int) {
        viewHolder.bind(context, mSliderItems[position])
    }

    override fun getCount() = mSliderItems.size

    class ImageSliderVH(view: View) : SliderViewAdapter.ViewHolder(view) {

        private val imageView = view.image_slider_iv

        fun bind(context: Context, sliderItem: String) {
            Glide.with(imageView.context)
                .load(sliderItem)
                .centerCrop()
                .into(imageView)
        }
    }
}
