package com.example.midtermproject

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.midtermproject.databinding.ActivityMainBinding
import com.example.midtermproject.databinding.ItemHomePageListBinding
import com.google.firebase.firestore.FirebaseFirestore
import java.util.Date.from

class ArticlesAdapter(): ListAdapter<Articles, RecyclerView.ViewHolder>(ArticlesCallback()){

    val db = FirebaseFirestore.getInstance()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val holder = holder as ViewHolder
        val articles = getItem(position)
        holder.bind(db, articles)

    }

    class ViewHolder(private val binding: ItemHomePageListBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind(
            db: FirebaseFirestore,
            articles: Articles
        ) {

            binding.articles = articles




        }


        companion object{
            fun from(parent: ViewGroup): ViewHolder{
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemHomePageListBinding.inflate(layoutInflater, parent, false)

                return ViewHolder(binding)
            }
        }

    }


}

class ArticlesCallback: DiffUtil.ItemCallback<Articles>(){
    override fun areItemsTheSame(oldItem: Articles, newItem: Articles): Boolean {
        return oldItem === newItem
    }

    override fun areContentsTheSame(oldItem: Articles, newItem: Articles): Boolean {
        return oldItem == newItem

    }

}

