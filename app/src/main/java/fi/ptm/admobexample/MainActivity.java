package fi.ptm.admobexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showBannerAd(View view) {
        Intent intent = new Intent(this,BannerActivity.class);
        startActivity(intent);
    }

    public void showSmartBannerAd(View view) {
        Intent intent = new Intent(this,SmartBannerActivity.class);
        startActivity(intent);
    }

    public void showInterstitialAd(View view) {
        Intent intent = new Intent(this,InterstitialActivity.class);
        startActivity(intent);
    }

    public void showRewardedVideoAd(View view) {
        Intent intent = new Intent(this,RewardedVideoActivity.class);
        startActivity(intent);
    }

}
