package data.models;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {

    private  String ownersName;
    private String phoneNumber;
    private List<Contact> contacts = new ArrayList<>();

    public String getOwnersName() {
        return ownersName;
    }

    public void setOwnersName(String ownersName) {
        this.ownersName = ownersName;
     }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Contact> getContacts() {
        return (ArrayList<Contact>) contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }




}
