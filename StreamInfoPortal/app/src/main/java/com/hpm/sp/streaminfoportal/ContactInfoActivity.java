package com.hpm.sp.streaminfoportal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ContactInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_info);
        getSupportActionBar().setTitle("Contact Information");
    }
}
