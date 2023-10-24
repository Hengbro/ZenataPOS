package com.example.zenatapos.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.zenatapos.databinding.FragmentSlideshowBinding
import com.example.zenatapos.databinding.ItemTransformBinding
import com.example.zenatapos.ui.allactivity.AddCategoryActivity
import com.inyongtisto.myhelper.extension.intentActivity

class SlideshowFragment : Fragment() {

    private var _binding: FragmentSlideshowBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val transformViewModel = ViewModelProvider(this).get(SlideshowViewModel::class.java)
        _binding = FragmentSlideshowBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val recyclerView = binding.recyclerviewTransform
        val adapter = TransformAdapter()
        recyclerView.adapter = adapter
        transformViewModel.texts.observe(viewLifecycleOwner) {
            adapter.submitList(it)
        }

        mainBUtton()

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    class TransformAdapter :
        ListAdapter<String, TransformViewHolder>(object : DiffUtil.ItemCallback<String>() {

            override fun areItemsTheSame(oldItem: String, newItem: String): Boolean =
                oldItem == newItem

            override fun areContentsTheSame(oldItem: String, newItem: String): Boolean =
                oldItem == newItem
        }) {

        private val listNameCategory = listOf(
            "Food",
            "Drink",
            "Cheese",
            "Cola",
        )

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransformViewHolder {
            val binding = ItemTransformBinding.inflate(LayoutInflater.from(parent.context))
            return TransformViewHolder(binding)
        }

        override fun onBindViewHolder(holder: TransformViewHolder, position: Int) {
            holder.textView.text = listNameCategory[position]
            holder.txtView.text = getItem(position)
        }
    }

    class TransformViewHolder(binding: ItemTransformBinding) :
        RecyclerView.ViewHolder(binding.root) {

        val textView: TextView = binding.textViewItemTransform
        val txtView: TextView = binding.tvQty

    }

    private fun mainBUtton(){
        binding.apply {
            btnAddcategory.setOnClickListener {
                intentActivity(AddCategoryActivity::class.java)
            }
        }
    }
}