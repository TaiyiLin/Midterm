package com.example.midtermproject

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.midtermproject.databinding.ActivityMainBinding
import com.example.midtermproject.databinding.FragmentPublishArticleBinding

class PublishArticleFragment : Fragment() {

    companion object {
        fun newInstance() = PublishArticleFragment()
    }

    private lateinit var viewModel: PublishArticleViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val application = requireNotNull(activity).application
        val binding = FragmentPublishArticleBinding.inflate(inflater)
        binding.lifecycleOwner = this

        binding.button.setOnClickListener{
            findNavController().navigateUp()
        }


        return inflater.inflate(R.layout.fragment_publish_article, container, false)
    }





    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PublishArticleViewModel::class.java)
        // TODO: Use the ViewModel
    }

}