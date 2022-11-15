package com.example.classactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText fnameText , lnameText  , emailText ,passwordText;
    private Spinner major , gender ;
    private Switch swInfo ;
    private TextView scrollText ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getReferance() ;
        showInfo() ;

    }


    private void getReferance()
    {
        fnameText = findViewById(R.id.fnameText) ;
        lnameText = findViewById(R.id.lnameText) ;
        emailText = findViewById(R.id.emailText) ;
        passwordText = findViewById(R.id.passwordText) ;
        major = findViewById(R.id.major) ;
        gender = findViewById(R.id.gender) ;
        swInfo = findViewById(R.id.swInfo) ;
        scrollText = findViewById(R.id.scrollText) ;
    }

    private void view ()
    {
        String msg = "" , fname = "" , lname = "" , ema = "" , pass = "" , maj = "" , gen = "";
        fname = fnameText.getText().toString();
        lname = lnameText.getText().toString();
        ema = emailText.getText().toString() ;
        pass = passwordText.getText().toString() ;
        maj = major.getSelectedItem().toString();
        gen = gender.getSelectedItem().toString();
        msg += "Name :\t" + fname + lname +"\nEmail : \t" + ema + "\nPassword : \t" + pass + "\nMajor : \t" + maj + "\nGender : \t" + gen;
        scrollText.setText(msg) ;
    }

    private void showInfo()
    {
        swInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(swInfo.isChecked())
                {
                    view() ;
                }
                else
                {
                    scrollText.setText(" ");
                }
            }
        });
    }

}