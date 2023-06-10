package com.example.loginapp;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.loginapp.databinding.ActivityLoginPageBinding;

public class loginPage extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityLoginPageBinding binding;

    TextView welcomeMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       // welcomeMessage = findViewById(R.id.textView3);
        binding = ActivityLoginPageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Bundle extras = getIntent().getExtras();
        String username = extras.getString("Username");

        welcomeMessage = findViewById(R.id.textView3);
        welcomeMessage.setText("Welcome"+" "+username + "!");
     //   Toast.makeText(getApplicationContext(),"Welcome"+" "+username,Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_login_page);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}