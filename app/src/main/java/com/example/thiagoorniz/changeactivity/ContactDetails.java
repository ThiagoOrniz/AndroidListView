package com.example.thiagoorniz.changeactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import models.Contact;

public class ContactDetails extends AppCompatActivity {
    private Contact contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_details);


        Bundle extras = getIntent().getExtras();
        if(extras != null) {
            contact = (Contact) extras.getSerializable("contact");
            populateFields();
        }
    }

    private void populateFields(){
        Toast.makeText(ContactDetails.this, "Contact Selected: "+contact.getName(), Toast.LENGTH_SHORT).show();


    }
}
