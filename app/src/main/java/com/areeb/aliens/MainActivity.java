package com.areeb.aliens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText birthday;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        birthday= findViewById(R.id.birthday);
        submit= findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Carry bhai amar rahe ", Toast.LENGTH_SHORT).show();
                Intent startNewActivity = new Intent(MainActivity.this,HappyWala.class);

                //🙃🙃🙃🙃🙃🙃🙃🙃
                //Note write putExtra name carefully because the same name we will call in next activity to get our data
                startNewActivity.putExtra("shivansh",birthday.getText().toString());
                startActivity(startNewActivity);
            }
        });
    }

    
}