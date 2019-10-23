package com.example.circleciapplication;

//import androidx.appcompat.app.AppCompatActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button tapButton = findViewById(R.id.tap_button);
        tapButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View view){
                TextView textView = findViewById(R.id.hello_text);
                textView.setText("こんばんは");
            }
        });
    }
}
