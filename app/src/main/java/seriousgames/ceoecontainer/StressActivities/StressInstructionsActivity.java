package seriousgames.ceoecontainer.StressActivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import seriousgames.ceoecontainer.R;

public class StressInstructionsActivity extends AppCompatActivity {

    int counter=1;
    TextView label;
    Button mainButton;
    Button backButton;
    Button nextButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stressinstructions);
        backButton= (Button) findViewById(R.id.button);
        nextButton= (Button) findViewById(R.id.button2);
        mainButton= (Button) findViewById(R.id.button3);
        label=(TextView) findViewById(R.id.textView);

        backButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                counter--;
                label.setText("Paso "+String.valueOf(counter));
                mainButtonControl();
            }

        });
        nextButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                counter++;
                label.setText("Paso "+String.valueOf(counter));
                mainButtonControl();

            }

        });
        mainButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StressInstructionsActivity.this,
                        StressMainActivity.class);
                startActivity(intent);

            }

        });

    }

    public void mainButtonControl(){
        if (counter==6) {//Páginas de ejemplo 6, pero cambiar según contenido gráfico
            mainButton.setVisibility(View.VISIBLE);
            nextButton.setVisibility(View.INVISIBLE);
        }
        else if (counter==1)
            backButton.setVisibility(View.INVISIBLE);
        else {
            mainButton.setVisibility(View.INVISIBLE);
            backButton.setVisibility(View.VISIBLE);
        }

        }

}
