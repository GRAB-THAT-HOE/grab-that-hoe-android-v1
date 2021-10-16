package kr.co.moreversal.grapthathoe.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LifecycleOwner
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kr.co.moreversal.grapthathoe.R
import kr.co.moreversal.grapthathoe.databinding.ItemFarmerHomeBinding
import kr.co.moreversal.grapthathoe.network.model.FarmerPost

class FarmerHomeRecyclerAdapter(val lifecycleOwner: LifecycleOwner):
    RecyclerView.Adapter<FarmerHomeRecyclerAdapter.FarmerHomeViewHolder>() {

    var farmerPostList : List<FarmerPost> = ArrayList<FarmerPost>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FarmerHomeViewHolder {
        return FarmerHomeViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.item_farmer_home,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: FarmerHomeViewHolder, position: Int) {
        holder.bind(farmerPostList[position])
    }

    override fun getItemCount(): Int = farmerPostList.size

    class FarmerHomeViewHolder(private val binding: ItemFarmerHomeBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(farmerPost: FarmerPost) {
            with(farmerPost) {
                binding.tvTitle.text = title
                binding.tvDate.text = date

                Glide.with(binding.root)
                    .load(image)
                    .error(R.drawable.ic_no_image)
                    .into(binding.ivPost)
            }
        }
    }
}