package com.example.upes.presentation.screens.authentication.login
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.example.sharesphere.domain.repository.DataStoreRepositoryInterface
import com.example.upes.databinding.LoginBinding
import com.example.upes.presentation.screens.authentication.signup.Signup
import com.example.upes.presentation.screens.user.User
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class Login : AppCompatActivity() {
    //intialize view binding
    lateinit var binding: LoginBinding

    @Inject
    lateinit var dataStoreRepositoryInterface: DataStoreRepositoryInterface
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

       lifecycleScope.launch {
           val isSignedIn=dataStoreRepositoryInterface.getBoolean(PreferencesKeys.IsSignedIn).first()
           if(isSignedIn?:false){
               startActivity(Intent(this@Login, User::class.java))
           }
       }

        binding.loginBtn.setOnClickListener{

            if(binding.email.text?.isEmpty() ?: true || binding.password.text?.isEmpty() ?: true){
                binding.email.error="Please enter email"
                return@setOnClickListener
            }else{
                lifecycleScope.launch {
                    dataStoreRepositoryInterface.save(PreferencesKeys.IsSignedIn,true)
                }

                val intent= Intent(this, User::class.java)
                startActivity(intent)
            }

        }
        binding.signup.setOnClickListener {
            val intent= Intent(this, Signup::class.java)
            startActivity(intent)
        }


    }
}