package com.example.upes.presentation.screens.authentication.signup

import PreferencesKeys
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.sharesphere.domain.repository.DataStoreRepositoryInterface
import com.example.upes.databinding.SignupBinding
import com.example.upes.presentation.screens.authentication.Otp
import com.example.upes.repository.SignupRepository
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class Signup : AppCompatActivity() {

    @Inject
    lateinit var signupRepository: SignupRepository

    @Inject
    lateinit var dataStoreRepositoryInterface: DataStoreRepositoryInterface

    lateinit var binding: SignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SignupBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        val cyberStrikeApi=
//        signupRepository = SignupRepository(CyberStrikeApi)

        binding.signupBtn.setOnClickListener {
            val email = binding.email.text.toString()
            val password = binding.password.text.toString()
            val password2 = binding.confirmPassword.text.toString()
            val fullName = binding.name.text.toString()
            val mobileNumber = binding.phone.text.toString()
            val age = binding.age.text.toString()
            val gender = binding.gender.text.toString()

            if (email.isEmpty() || password.isEmpty() || password2.isEmpty() || fullName.isEmpty() || mobileNumber.isEmpty() || age.isEmpty() || gender.isEmpty()) {
                binding.email.error = "Email is required"
                binding.password.error = "Password is required"
                binding.confirmPassword.error = "Confirm Password is required"
                binding.name.error = "Name is required"
                binding.phone.error = "Phone is required"
                binding.age.error = "Age is required"
            } else {
                if (password != password2) {
                    binding.confirmPassword.error = "Password does not match"
                } else {
//                    val signupReq = SignupRequestModel(
//                        age.toInt(),
//                        email,
//                        fullName,
//                        gender,
//                        mobileNumber,
//                        password,
//                        password2
//                    )
                    lifecycleScope.launch {
                        dataStoreRepositoryInterface.save(PreferencesKeys.Email, email)
                        dataStoreRepositoryInterface.save(PreferencesKeys.FullName, fullName)
                        dataStoreRepositoryInterface.save(PreferencesKeys.Mobile, mobileNumber)
                        dataStoreRepositoryInterface.save(PreferencesKeys.Age, age)
                        dataStoreRepositoryInterface.save(PreferencesKeys.Gender, gender)
                        val intent = Intent(this@Signup, Otp::class.java)
                        startActivity(intent)
//                        signup(signupReq)
                    }
                }
            }
        }

    }

//    private suspend fun signup(signupReq: SignupRequestModel) {
//        signupRepository.signup(signupReq).collect { result ->
//            when (result) {
//                is ApiResponse.Success -> {
//
//                    val intent = Intent(this, Otp::class.java)
//                    startActivity(intent)
//                }
//
//                is ApiResponse.Error -> {
//                    Toast.makeText(this, "Something went wrong", Toast.LENGTH_SHORT).show()
//                }
//
//                is ApiResponse.Loading -> {
//                    //show loading
//                }
//            }
//        }
//    }

}