package dev.ujjwal.amazonclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.smarteist.autoimageslider.SliderAnimations
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageSliderAdapter = ImageSliderAdapter(this)

        main_image_slider.setSliderAdapter(imageSliderAdapter)
        main_image_slider.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION)
        main_image_slider.startAutoCycle()

        imageSliderAdapter.renewItems(fetchSliderItemList())

        main_recycler_view.apply {
            adapter = ItemListAdapter()
            layoutManager = LinearLayoutManager(context)
        }

        main_recycler.apply {
            adapter = ItemList2Adapter()
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        }
    }

    private fun fetchSliderItemList(): List<String> {
        val items = arrayListOf<String>()
        items.add("https://images.pexels.com/photos/547114/pexels-photo-547114.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260")
        items.add("https://images.pexels.com/photos/747964/pexels-photo-747964.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260")
        items.add("https://images.pexels.com/photos/929778/pexels-photo-929778.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260")
        return items
    }
}