package com.example.mitohida.automationpm1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main2Activity extends AppCompatActivity {

    private WebView webkwh;
    private String form_kwh = "https://docs.google.com/forms/d/e/1FAIpQLSdnQ669n0q27fnTwsBOYU-Q8wlKw15TL5AFy8FJmmq0pGyv4Q/viewform?usp=sf_link";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        webkwh = (WebView)findViewById(R.id.web_kwh);
        webkwh.getSettings().setJavaScriptEnabled(true);
        webkwh.loadUrl(form_kwh);
        webkwh.setWebViewClient(new browserkwh());




    }

    public class browserkwh extends WebViewClient {

        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            webkwh.loadUrl(url);
            return true;
        }
    }
}
