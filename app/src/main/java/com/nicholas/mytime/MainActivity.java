package com.nicholas.mytime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    Button getUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hooks for my button
        getUpdate=findViewById(R.id.buttonforupdating);
        getUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // public void getCurrentTime(View v) {
                    Calendar calendar = Calendar.getInstance();
                    SimpleDateFormat mdformat = new SimpleDateFormat("HH:mm:ss");
                    String strTime = "Current Time : " + mdformat.format(calendar.getTime());
                    display(strTime);
                //}

            }

            private void display(String strTime) {
                    TextView textView1 = findViewById(R.id.currenttime);
                    textView1.setText(strTime);
            }
        });
    }

}