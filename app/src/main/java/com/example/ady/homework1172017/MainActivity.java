package com.example.ady.homework1172017;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView out;
    private ImageView imgOUT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        out = findViewById(R.id.output);
        imgOUT = findViewById(R.id.picout);
        final Button where = findViewById(R.id.where);
        final Button foto = findViewById(R.id.Pic);
        where.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                out.setText(" ");
                imgOUT.setVisibility(View.INVISIBLE);

                out.setText("Cape Verde");
            }
        });
        final Button edu = findViewById(R.id.Education);
        edu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                out.setText(" ");
                imgOUT.setVisibility(View.INVISIBLE);

                out.setText("Umass Lowell");
            }
        });
        final Button next = findViewById(R.id.Go);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                out.setText(" ");
                imgOUT.setVisibility(View.INVISIBLE);

                out.setText("Android App Company");
            }
        });

        foto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                out.setText(" ");
                //out.setText("Does NOT WORK!");
                imgOUT.setVisibility(View.VISIBLE);

            }
        });

    }
}
