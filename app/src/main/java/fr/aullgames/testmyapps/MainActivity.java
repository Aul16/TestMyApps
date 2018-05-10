package fr.aullgames.testmyapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private WebView mySite;
    private WebSettings mySiteSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySite= findViewById(R.id.wv_main);
        mySiteSettings = mySite.getSettings();

        mySite.loadUrl("https://diamant0901.wixsite.com/testmyapps");
        mySiteSettings.setJavaScriptEnabled(true);
        mySite.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
        mySiteSettings.setUseWideViewPort(true);
        mySiteSettings.setLoadWithOverviewMode(true);
    }
}
