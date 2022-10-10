package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.webview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding binding;
    private String editTextUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btDireccion.setOnClickListener(this);

        editTextUrl = binding.txtUrl.getText().toString();
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, WebViewActivity.class);
        intent.putExtra("url", editTextUrl);
        startActivity(intent);
    }
}