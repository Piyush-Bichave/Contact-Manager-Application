package com.example.contactapp.dp;


import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.contactapp.dp.entity.Contact;

@Database(entities = {Contact.class},version = 1)
public abstract class ContactsAppDatabase extends RoomDatabase {

    //Linking the database with DAO
    public abstract ContactDAO getContactDAO();
}
