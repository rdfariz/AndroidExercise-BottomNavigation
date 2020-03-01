package org.d3if4127.bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import org.d3if4127.bottomnavigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val navCtrl = findNavController(R.id.nav_host_fragment_container)

        NavigationUI.setupActionBarWithNavController(this, navCtrl)
        NavigationUI.setupWithNavController(binding.bottomNavigation, navCtrl)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navCtrl = findNavController(R.id.nav_host_fragment_container)
        return navCtrl.navigateUp()
    }
}
