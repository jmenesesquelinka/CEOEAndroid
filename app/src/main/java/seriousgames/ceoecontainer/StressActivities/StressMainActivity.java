package seriousgames.ceoecontainer.StressActivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import seriousgames.ceoecontainer.R;

public class StressMainActivity extends AppCompatActivity {

Button whatIsButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stressmain);
        whatIsButton= (Button) findViewById(R.id.button4);

        whatIsButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StressMainActivity.this,
                        StressInstructionsActivity.class);
                startActivity(intent);
            }

        });

    }

}