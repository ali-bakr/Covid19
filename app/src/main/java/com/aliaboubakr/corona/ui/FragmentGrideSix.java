package com.aliaboubakr.corona.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.aliaboubakr.corona.R;

public class FragmentGrideSix extends Fragment {

    private WebView mLiveNewsWebView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      View v =inflater.inflate(R.layout.fragment_gride6,container,false);


        mLiveNewsWebView=v.findViewById(R.id.videos_wv);
        mLiveNewsWebView.setWebViewClient(new WebViewClient());
        mLiveNewsWebView.loadUrl(getString(R.string.videosLink));
        WebSettings webSettings=mLiveNewsWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        return v;

    }
}
