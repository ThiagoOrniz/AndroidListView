package com.example.thiagoorniz.changeactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import adapters.ContactsListArrayAdapter;
import json.ContactJSON;

public class MainActivity extends AppCompatActivity {

    private ListView lstContacts;
    private ContactsListArrayAdapter contactsListArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstContacts = (ListView) findViewById(R.id.lstContacts);

        contactsListArrayAdapter = new ContactsListArrayAdapter(this,R.layout.item_contact_list, ContactJSON.getContacts());
        lstContacts.setAdapter(contactsListArrayAdapter);


    }
}
