package com.ministerio.medioambiente

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.ministerio.medioambiente.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var appBarConfig: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.topAppBar)

        val navController = findNavController(R.id.nav_host_fragment)

        appBarConfig = AppBarConfiguration(
            setOf(
                R.id.inicioFragment,
                R.id.sobreFragment,
                R.id.serviciosFragment,
                R.id.noticiasFragment,
                R.id.videosFragment,
                R.id.areasFragment,
                R.id.medidasFragment,
                R.id.equipoFragment,
                R.id.voluntariadoFragment,
                R.id.loginFragment,
                R.id.normativasFragment,
                R.id.reportarFragment,
                R.id.misReportesFragment,
                R.id.acercaFragment
            ),
            binding.drawerLayout
        )

        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfig)
        NavigationUI.setupWithNavController(binding.navView, navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return NavigationUI.navigateUp(navController, appBarConfig) || super.onSupportNavigateUp()
    }
}
