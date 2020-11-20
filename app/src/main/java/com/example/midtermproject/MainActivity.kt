package com.example.midtermproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.midtermproject.databinding.ActivityMainBinding
import com.google.firebase.Timestamp
import com.google.firebase.firestore.FirebaseFirestore


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val binding =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        val db = FirebaseFirestore.getInstance()

//        db.collection("articles").whereEqualTo().get()
//            .addOnSuccessListener{
//
//            }

//        val firebase = Articles(
//        catagory = "Life",
//        content = "Midterm Day",
//        id = "123456789",
//        title = "Thank God is Friday"
//        )

        binding.floatingActionButton2.setOnClickListener {
            it.findNavController().navigate(R.id.action_global_publishArticleFragment)
        }

        val articlesAdapter = ArticlesAdapter()
        binding.recyclerView.adapter = articlesAdapter
        articlesAdapter.submitList(Articles)


//        //add()是 我可以寫入資料進article
//        db.collection("articles")
//            .add(getInput(binding))
//
//            .addOnSuccessListener { documentReference ->
//                Log.d("TY", "success")
//                documentReference.update("id", documentReference.id)
//            }
//            .addOnFailureListener { e ->
//                Log.w("TY", "fail", e)
//            }


    }

//
//    fun getInput(binding:ActivityMainBinding): Articles {
//
//        val data = Articles(
//            id = binding.id.text.toString(),
//            title = binding.title.text.toString(),
//            content = binding.content.text.toString(),
//            author_id = binding.authorId.text.toString()
//        )
//        return data
//    }


}











