package com.example.practise.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.practise.R;

public class WebViewDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

       WebView view= (WebView)findViewById(R.id.web);
       view.loadUrl("https://hdmovieshub.mobi/");
        WebSettings webSettings=view.getSettings();
        webSettings.setJavaScriptEnabled(true);
        view.setWebViewClient(new WebViewClient());


    }
}
