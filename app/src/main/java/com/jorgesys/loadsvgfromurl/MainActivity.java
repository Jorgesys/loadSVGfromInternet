package com.jorgesys.loadsvgfromurl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.ahmadrosid.svgloader.SvgLoader;


public class MainActivity extends AppCompatActivity {

    //Example: How to load an SVG from Internet using SVGLoader  https://github.com/ar-android/AndroidSvgLoader
    //created by Ahmad Rosid

    private ImageView myImageView;
    private String urlSVG = "https://bit.ly/2pOHCh8"; //Defining url of .svg file.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        myImageView = findViewById(R.id.myImageView);

        SvgLoader.pluck()
                .with(this)
                .setPlaceHolder(R.mipmap.ic_launcher, R.mipmap.ic_launcher)
                .load(urlSVG, myImageView);


    }

    @Override protected void onDestroy() {
        super.onDestroy();
        SvgLoader.pluck().close();
    }



}
