package fr.paniersfleriens.lespaniersfleriens;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webview = (WebView) findViewById(R.id.webview);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("https://contrats.amapj.fr/b/flers");
        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}
