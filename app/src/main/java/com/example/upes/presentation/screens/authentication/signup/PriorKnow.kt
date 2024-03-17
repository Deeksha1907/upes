package com.example.upes.presentation.screens.authentication
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.lifecycle.lifecycleScope
import com.example.sharesphere.domain.repository.DataStoreRepositoryInterface
import com.example.upes.R
import com.example.upes.databinding.PriorKnowledgeBinding
import com.example.upes.presentation.screens.user.User
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class PriorKnow : AppCompatActivity() {

    @Inject
    lateinit var dataStoreRepositoryInterface: DataStoreRepositoryInterface
    lateinit var binding: PriorKnowledgeBinding
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= PriorKnowledgeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.phishing.setOnClickListener{
            binding.phishing.iconTint= ContextCompat.getColorStateList(this,R.color.secondary)
            lifecycleScope.launch {
                dataStoreRepositoryInterface.save(PreferencesKeys.Phishing,true)
            }
        }
        binding.social.setOnClickListener{
            binding.phishing.iconTint= ContextCompat.getColorStateList(this,R.color.secondary)
            lifecycleScope.launch {
                dataStoreRepositoryInterface.save(PreferencesKeys.SocialEngineering,true)
            }
        }
        binding.malware.setOnClickListener{
            binding.phishing.iconTint= ContextCompat.getColorStateList(this,R.color.secondary)
            lifecycleScope.launch {
                dataStoreRepositoryInterface.save(PreferencesKeys.Malware,true)
            }
        }

        binding.next.setOnClickListener {
            startActivity(Intent(this,User::class.java))
        }


    }
}
