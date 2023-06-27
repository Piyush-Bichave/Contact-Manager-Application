package com.example.contactapp.dp;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.contactapp.dp.entity.Contact;

import java.util.List;

@Dao
public interface ContactDAO {

    @Insert
    public long addContact(Contact contact);

    @Update
    public void updateContact(Contact contact);

    @Delete
    public void deleteContact(Contact contact);

    @Query("Select * from contacts")
    public List<Contact> getContact();

    @Query("Select * from contacts where contact_id==:contactId")
    public Contact getcontact(long contactId);




}
