package com.example.syyam.dietplan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class DisorederWebView extends AppCompatActivity {
    private String url;
    private Intent Sintent;
    private String suffer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disoreder_web_view);



        Sintent = getIntent();
        url= Sintent.getStringExtra("url");
        suffer=Sintent.getStringExtra("suffering");

        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl(url);

    }
}
