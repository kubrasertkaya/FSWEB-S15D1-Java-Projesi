package com.workintech.mobile;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if (!myContacts.contains(contact)) {
            myContacts.add(contact);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (myContacts.contains(oldContact)) {
            //oldContact=newContact yapma bu referab-nce eğitliği!!!
            oldContact.setPhoneNumber(newContact.getPhoneNumber());
            oldContact.setName(newContact.getName());
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        if (myContacts.contains(contact)) {
            myContacts.remove(contact);
            return true;
        }
        return false;
    }

    public int findContact(Contact contact) {
        return myContacts.indexOf(contact);

    }

    public int findContact(String contactName) {
        for (Contact contact : myContacts) {
            if (contact.getName().equals(contactName)) {
                return myContacts.indexOf(contact);
            }

        }

        return -1;
    }




}
