package com.example.blooddonationapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import de.hdodenhof.circleimageview.CircleImageView;

public class DonorRegistrationActivity extends AppCompatActivity {

    private TextView backButton;

    private CircleImageView profile_image;

    private TextInputEditText registerFullName, registerIdNumber, registerPhoneNumber, registerEmail,registerPassword;

    private Spinner bloodGroupSpinner;

    private Button registertButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donor_registration);

        backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(DonorRegistrationActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
        profile_image = findViewById(R.id.profile_image);
        registerFullName = findViewById(R.id.registerFullName);
        registerIdNumber = findViewById(R.id.registerIdNumber);
        registerPhoneNumber = findViewById(R.id.registerPhoneNumber);
        registerEmail = findViewById(R.id.registerEmail);
        registerPassword = findViewById(R.id.registerPassword);
        bloodGroupSpinner = findViewById(R.id.bloodGroupSpinner);
        registertButton = findViewById(R.id.registerButton);




    }
}