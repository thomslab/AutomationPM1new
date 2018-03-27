package com.example.mitohida.automationpm1;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class form_kwh_meter extends AppCompatActivity {

    private WebView webkwh;
    private String form_kwh = "https://docs.google.com/forms/d/e/1FAIpQLSdnQ669n0q27fnTwsBOYU-Q8wlKw15TL5AFy8FJmmq0pGyv4Q/viewform?usp=sf_link";
    private ProgressBar progressBar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_kwh);

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
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            progressBar1 = (ProgressBar)findViewById(R.id.progress2);
            progressBar1.setVisibility(View.VISIBLE);
            webkwh.setVisibility(View.INVISIBLE);
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);

            progressBar1.setVisibility(View.GONE);
            webkwh.setVisibility(View.VISIBLE);

        }




    }

}