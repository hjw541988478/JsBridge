package com.apkfuns.jsbridgesample.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.apkfuns.jsbridgesample.R;

import java.util.List;


public class MainActivity extends BaseActivity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_webView).setOnClickListener(this);
        findViewById(R.id.btn_custom_webView).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_webView:
                startActivity(new Intent(this, WebViewActivity.class));
                break;
            case R.id.btn_custom_webView:
                startActivity(new Intent(this, CustomWebViewActivity.class));
                break;
            default:
                break;
        }
    }
}
