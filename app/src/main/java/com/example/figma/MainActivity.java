package com.example.figma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private View _bg__iphone_14___15_pro_max___1_ek2;
    private ImageView rectangle_1;
    private View rectangle_2;
    private TextView password;
    private TextView login;
    private View _bg__frame_1_ek1;
    private TextView login_ek1;
    private View ellipse_1;
    private ImageView maxresdefault_1;
    private TextView username;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.iphone_14___15_pro_max___1);


        _bg__iphone_14___15_pro_max___1_ek2 = (View) findViewById(R.id._bg__iphone_14___15_pro_max___1_ek2);
        rectangle_1 = (ImageView) findViewById(R.id.rectangle_1);
        rectangle_2 = (View) findViewById(R.id.rectangle_2);
        password = (TextView) findViewById(R.id.password);
        login = (TextView) findViewById(R.id.login);
        _bg__frame_1_ek1 = (View) findViewById(R.id._bg__frame_1_ek1);
        login_ek1 = (TextView) findViewById(R.id.login_ek1);
        ellipse_1 = (View) findViewById(R.id.ellipse_1);
        maxresdefault_1 = (ImageView) findViewById(R.id.maxresdefault_1);
        username = (TextView) findViewById(R.id.username);


        //custom code goes here

    }
}
