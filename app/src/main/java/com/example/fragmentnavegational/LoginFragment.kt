package com.example.fragmentnavegational

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.activityViewModels


// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class LoginFragment : Fragment() {
   /* private var param1: String? = null
    private var param2: String? = null
*/
    // conn't create object direct because this write this code
    private val shareViewModel:ShareViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }
    // Add this function

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val usernameView:EditText = view.findViewById(R.id.username_edittext)
        val passwordView:EditText = view.findViewById(R.id.password_edittext)
        val logInView:Button = view.findViewById(R.id.login_button)

        logInView.setOnClickListener(){
            val username:String = usernameView.text.toString()
            val password :String = passwordView.text.toString()
            shareViewModel.username = username
            // for change between fragment
            requireActivity().supportFragmentManager.beginTransaction().replace(
                R.id.fragment_frame_layout,MainFragment()).commit()
        }



    }


}