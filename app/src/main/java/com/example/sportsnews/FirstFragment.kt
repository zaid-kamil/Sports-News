package com.example.sportsnews

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.sportsnews.databinding.FragmentFirstBinding
import com.example.sportsnews.models.Sport

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun get_sport_list(): List<Sport>{
        return listOf(
            Sport("BasketBall",R.drawable.image1, summary = "Basketball star Brittney Griner is the latest American to be detained in Russia as supporters work desperately to free them"),
            Sport("Cricket",R.drawable.image2, summary = "Basketball star Brittney Griner is the latest American to be detained in Russia as supporters work desperately to free them"),
            Sport("Badminton",R.drawable.image3, summary = "Basketball star Brittney Griner is the latest American to be detained in Russia as supporters work desperately to free them"),
            Sport("Tennis",R.drawable.image4, summary = "Basketball star Brittney Griner is the latest American to be detained in Russia as supporters work desperately to free them"),
            Sport("Dodge ball",R.drawable.image5, summary = "Basketball star Brittney Griner is the latest American to be detained in Russia as supporters work desperately to free them"),
        )
    }
}