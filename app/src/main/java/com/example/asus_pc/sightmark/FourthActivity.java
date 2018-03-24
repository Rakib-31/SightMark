package com.example.asus_pc.sightmark;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class FourthActivity extends AppCompatActivity {

    private WebView webView;
    ThirdActivity th = new ThirdActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        webView = (WebView) findViewById(R.id.webId);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        String str = getIntent().getStringExtra("KEY");
        webView.loadUrl("http://"+str+"/");
    }

    @Override
    public void onBackPressed() {

        if(webView.canGoBack())
            webView.goBack();
        else
            super.onBackPressed();
    }
}

