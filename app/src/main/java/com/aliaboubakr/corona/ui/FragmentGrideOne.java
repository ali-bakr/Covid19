package com.aliaboubakr.corona.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.aliaboubakr.corona.R;
import com.github.chrisbanes.photoview.PhotoView;

import java.util.Locale;

public class FragmentGrideOne extends Fragment {

    private WebView mLiveNewsWebView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      View v =inflater.inflate(R.layout.fragment_gride1,container,false);


        PhotoView photoView = v.findViewById(R.id.photo_view_you_other);
        PhotoView photoView2 = v.findViewById(R.id.photo_view_how_educaion);
        PhotoView photoView3 = v.findViewById(R.id.photo_view_how_healthman_worker);
        TextView textView0=v.findViewById(R.id.tv_0);
        TextView textView1=v.findViewById(R.id.tv_1);
        TextView textView2=v.findViewById(R.id.tv_2);
        TextView textView3=v.findViewById(R.id.tv_3);
        //PhotoView photoView = v.findViewById(R.id.photo_view);
        //photoView.setImageResource(R.drawable.during_travel);

        if ( Locale.getDefault().getDisplayLanguage().equals("English"))
        {
            photoView.setVisibility(View.GONE);
            photoView2.setVisibility(View.GONE);
            photoView3.setVisibility(View.GONE);
            textView0.setVisibility(View.GONE);
            textView1.setVisibility(View.GONE);
            textView2.setVisibility(View.GONE);
            textView3.setVisibility(View.GONE);


            mLiveNewsWebView=v.findViewById(R.id.you_others_prevent_wv);
            mLiveNewsWebView.setVisibility(View.VISIBLE);
            mLiveNewsWebView.setWebViewClient(new WebViewClient());
            mLiveNewsWebView.loadUrl(getString(R.string.you_other));
            WebSettings webSettings=mLiveNewsWebView.getSettings();

            webSettings.setJavaScriptEnabled(true);


        }else {

            ImageView imageView=v.findViewById(R.id.grid_img1);
            imageView.setVisibility(View.VISIBLE);
            photoView.setImageResource(R.drawable.self_protect);
            photoView.setImageResource(R.drawable.self_protect);
            photoView.setImageResource(R.drawable.healthman_protection);
        }


        return v;


    }
}
