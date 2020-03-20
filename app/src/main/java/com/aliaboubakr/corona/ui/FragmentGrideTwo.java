package com.aliaboubakr.corona.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.aliaboubakr.corona.R;
import com.github.chrisbanes.photoview.PhotoView;

import java.util.Locale;

public class FragmentGrideTwo extends Fragment {

    private WebView mLiveNewsWebView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      View v =inflater.inflate(R.layout.fragment_gride2,container,false);
        PhotoView photoView = v.findViewById(R.id.photo_view_traveling);
        //PhotoView photoView = v.findViewById(R.id.photo_view);
        //photoView.setImageResource(R.drawable.during_travel);
        TextView textView=v.findViewById(R.id.tv_4);
        if ( Locale.getDefault().getDisplayLanguage().equals("English"))
        {

            textView.setVisibility(View.GONE);
            mLiveNewsWebView=v.findViewById(R.id.travel_prevent_wv);
            mLiveNewsWebView.setVisibility(View.VISIBLE);
            mLiveNewsWebView.setWebViewClient(new WebViewClient());
            mLiveNewsWebView.loadUrl(getString(R.string.travelLink));
            WebSettings webSettings=mLiveNewsWebView.getSettings();

            webSettings.setJavaScriptEnabled(true);



        }else {

            photoView.setImageResource(R.drawable.during_travel);
        }

      return v;


    }
}
