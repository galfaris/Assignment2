package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b;
    EditText e;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       b= (Button) findViewById(R.id.hbutton);
       e= (EditText) findViewById(R.id.PersonName);
       t= (TextView) findViewById(R.id.textView);

    b.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
       String s= e.getText().toString();
       sendData(s);
         }
      });
    }

   private void sendData(String s) {
       t.setText("Hello, " + s);
   }
}
