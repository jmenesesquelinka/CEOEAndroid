package seriousgames.ceoecontainer.StressActivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import seriousgames.ceoecontainer.R;

public class StressSplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stresssplash);


        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(2000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent intent = new Intent(StressSplashActivity.this,StressInstructionsActivity.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();


    }
}
