package com.example.dsc_galgotias_android_app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button,button2;
    int ctr=0;
    public void count(View view){
        ctr++;
        textView.setText(Integer.toString(ctr));
    }
    public void toast(View view){
        Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);
        
    }
}
