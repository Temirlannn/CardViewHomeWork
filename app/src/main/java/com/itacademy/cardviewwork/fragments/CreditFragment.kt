package com.itacademy.cardviewwork.fragments

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import cn.pedant.SweetAlert.SweetAlertDialog
import com.itacademy.cardviewwork.R
import com.itacademy.cardviewwork.databinding.FragmentCreditBinding
import com.itacademy.cardviewwork.databinding.FragmentNewBinding

class CreditFragment : Fragment() {

    private var _binding: FragmentCreditBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCreditBinding.inflate(inflater, container, false)
        binding.button.setOnClickListener {
            val dialog = SweetAlertDialog(context, SweetAlertDialog.ERROR_TYPE)
            dialog.progressHelper.barColor = Color.parseColor("#A5DC86")
            dialog.titleText = "#404.04034023!"
            dialog.setCancelable(false)
            dialog.show()
        }
        return binding.root
    }

}