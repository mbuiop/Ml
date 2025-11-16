package com.example.myapp;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        WebView webView = findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        
        // بارگذاری HTML ساده
        String html = "<!DOCTYPE html>" +
            "<html dir='rtl' lang='fa'>" +
            "<head><meta charset='utf-8'><title>اپ من</title>" +
            "<style>body{font-family: Tahoma; text-align: center; padding: 50px; background: linear-gradient(135deg, #667eea, #764ba2); color: white;}" +
            "button{padding: 15px 30px; margin: 10px; border: none; border-radius: 10px; background: #fff; color: #333; font-size: 16px; cursor: pointer;}" +
            ".container{background: rgba(255,255,255,0.1); padding: 30px; border-radius: 20px; backdrop-filter: blur(10px);}" +
            "</style></head>" +
            "<body><div class='container'>" +
            "<h1>🚀 اپلیکیشن من</h1>" +
            "<p>این اپ با GitHub Actions ساخته شده است</p>" +
            "<button onclick=\"alert('آفرین! دکمه کار می‌کند!')\">کلیک کن</button>" +
            "<button onclick=\"document.body.style.background='linear-gradient(135deg, #ff6b6b, #ee5a24)'\">تغییر رنگ</button>" +
            "<p id='status'>ساخته شده با GitHub Actions ✅</p>" +
            "</div></body></html>";
        
        webView.loadData(html, "text/html; charset=utf-8", "UTF-8");
    }
}
