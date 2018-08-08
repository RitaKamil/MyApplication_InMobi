package com.example.rkamil.myapplication_inmobi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.inmobi.ads.InMobiAdRequest;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.sdk.InMobiSdk.LogLevel;
import com.inmobi.ads.InMobiAdRequestStatus;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InMobiSdk.init(this, "389ca4c59f6741f7b1e96e4af3f42b3f");
        //InMobiAdRequest
        InMobiBanner bannerAd = (InMobiBanner)findViewById(R.id.banner);
        bannerAd.load();

        public void BannerAdListener {
            onAdLoadSucceeded(InMobiBanner inMobiBanner);
            /**
             * Called to notify that a request to load an ad failed.
             *
             * @param ad
             * @param status
             */
            public void onAdLoadFailed(InMobiBanner inMobiBanner, InMobiAdRequestStatus status);
            /**
             * Called to notify that the banner ad was displayed
             *
             * @param ad
             */
            public void onAdDisplayed(InMobiBanner inMobiBanner);
            /**
             * Called to notify that the User is about to return to the application
             * after closing the ad.
             *
             * @param ad
             */
            public void onAdDismissed(InMobiBanner inMobiBanner);
            /**
             * Called to notify that the user interacted with the ad.
             *
             * @param ad
             * @param params
             */
        }
        InMobiSdk.setLogLevel(LogLevel.DEBUG);


    }
}
