package com.mustafanarin.landmarkbookkotlin

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mustafanarin.landmarkbookkotlin.databinding.RecyclerRowBinding

class LandmarkAdaptor(val landmarkList : ArrayList<Landmark>) : RecyclerView.Adapter<LandmarkAdaptor.landmarkHolder>() {

    class landmarkHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): landmarkHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return landmarkHolder(binding)
    }

    override fun onBindViewHolder(holder: landmarkHolder, position: Int) {
        holder.binding.recyclerViewTextView.text = landmarkList.get(position).name

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,DetailsActivity :: class.java)
            chosenLandmark = landmarkList.get(position)
           // intent.putExtra("landmark",landmarkList.get(position))
            holder.itemView.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return landmarkList.size
    }
}




