package data.repositories;

import data.models.Phonebook;

import java.util.ArrayList;

public class PhonebookRepositoryImp implements PhonebookRepository{
    private ArrayList<Phonebook> phonebooks = new ArrayList<>();

    @Override
    public Phonebook findById(String phoneNumber) {
        for(Phonebook phonebook:phonebooks){
            String storedPhoneNumber = phonebook.getPhoneNumber();
            boolean phoneNumberMatches = storedPhoneNumber.equals(phoneNumber);
            if(phoneNumberMatches) return phonebook;
        }
        return null;
    }

    @Override
    public Phonebook save(Phonebook phonebook) {
        // check for phoneBook
        // if exists update
        // else i want to create
        Phonebook savedPhonebook = findById(phonebook.getPhoneNumber());
        if(savedPhonebook == null) phonebooks.add(phonebook);
        else updateSavedPhoneBook(phonebook,savedPhonebook);
        return phonebook;
    }

    private void updateSavedPhoneBook(Phonebook phonebook,Phonebook savedPhonebook){
        savedPhonebook.setOwnersName(phonebook.getOwnersName());
        savedPhonebook.setContacts(phonebook.getContacts());
        savedPhonebook.setPhoneNumber(phonebook.getPhoneNumber());
    }

    @Override
    public void delete(Phonebook phonebook) {

    }

    @Override
    public int count() {
        return phonebooks.size();
    }
}
