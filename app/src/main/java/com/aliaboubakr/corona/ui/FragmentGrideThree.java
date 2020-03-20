package com.aliaboubakr.corona.ui;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.aliaboubakr.corona.R;

import java.util.Locale;

public class FragmentGrideThree extends Fragment {

    private WebView mLiveNewsWebView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      View v =inflater.inflate(R.layout.fragment_gride3,container,false);

/*
        mLiveNewsWebView=v.findViewById(R.id.work_preventionn_wv);
        mLiveNewsWebView.setWebViewClient(new WebViewClient());
        mLiveNewsWebView.loadUrl("https://docs.google.com/viewer?url=http://my.domain.com/yourPdfUrlHere.pdf"+getString(R.string.workPreventLink));
        WebSettings webSettings=mLiveNewsWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);



 */

        if ( Locale.getDefault().getDisplayLanguage().equals("English"))
        {


            try
            {

                Intent intentUrl = new Intent(Intent.ACTION_VIEW);
                intentUrl.setDataAndType(Uri.parse(getString(R.string.workPreventLink)), "application/pdf");
                intentUrl.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                this.startActivity(intentUrl);

            }
            catch (ActivityNotFoundException e)
            {
                Toast.makeText(getContext(), "No PDF Viewer Installed", Toast.LENGTH_LONG).show();
            }




        }else {

            mLiveNewsWebView=v.findViewById(R.id.work_preventionn_wv);
            mLiveNewsWebView.setVisibility(View.VISIBLE);
            mLiveNewsWebView.setWebViewClient(new WebViewClient());
            mLiveNewsWebView.loadUrl(getString(R.string.workPreventLink));
            WebSettings webSettings=mLiveNewsWebView.getSettings();

            webSettings.setJavaScriptEnabled(true);
        }




        return v;

    }
}
