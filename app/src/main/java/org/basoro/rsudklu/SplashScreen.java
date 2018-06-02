package org.basoro.rsudklu;
 
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

import com.google.firebase.analytics.FirebaseAnalytics;

public class SplashScreen extends Activity{
    private FirebaseAnalytics mfirebaseAnl;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mfirebaseAnl = FirebaseAnalytics.getInstance(this);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Thread() {
            @Override
            public void run() {
                   Intent mainMenu= new Intent(SplashScreen.this,MainActivity.class);
                   SplashScreen.this.startActivity(mainMenu);
                   SplashScreen.this.finish();
                   overridePendingTransition(R.layout.fadein, R.layout.fadeout);
            }
    }, 3000);
    }
}
