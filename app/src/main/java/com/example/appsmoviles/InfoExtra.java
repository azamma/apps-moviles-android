package com.example.appsmoviles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class InfoExtra extends AppCompatActivity {
    Button url1;
    Button url2;
    Button url3;
    Button url4;
    WebView myWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_extra);
        url1 = findViewById(R.id.url1);
        url2 = findViewById(R.id.url2);
        url3 = findViewById(R.id.url3);
        url4 = findViewById(R.id.url4);
        myWebView = findViewById(R.id.webView);

        url1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebSettings webSettings = myWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                myWebView.setWebViewClient(new WebViewClient());
                myWebView.loadUrl("https://www.bancodealimentos.org.ar");
                myWebView.setVisibility(View.VISIBLE);
            }
        });
        url2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebSettings webSettings = myWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                myWebView.setWebViewClient(new WebViewClient());
                myWebView.loadUrl("http://alimentaccion.org/");
                myWebView.setVisibility(View.VISIBLE);
            }
        });
        url3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebSettings webSettings = myWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                myWebView.setWebViewClient(new WebViewClient());
                myWebView.loadUrl("https://www.savethechildren.es/trabajo-ong/mortalidad-infantil/nutricion");
                myWebView.setVisibility(View.VISIBLE);
            }
        });
        url4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebSettings webSettings = myWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                myWebView.setWebViewClient(new WebViewClient());
                myWebView.loadUrl("http://www.nutricionsinfronteras.org/");
                myWebView.setVisibility(View.VISIBLE);
            }
        });

    }
}
