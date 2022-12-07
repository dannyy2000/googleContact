package data.repositories;

import data.models.Contact;
import data.models.Phonebook;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhonebookRepositoryImpTest {

     PhonebookRepository phonebookRepository;

    @BeforeEach
    public void setUp(){
         phonebookRepository = new PhonebookRepositoryImp();
    }

    @Test
    public void savePhoneBookTotalPhonebookIsOneTest(){
        // given i have a new phonebook repository
        // when i try to save a contact
        // assert equals count is 1
        Phonebook daniel = new Phonebook();
        phonebookRepository.save(daniel);
        assertEquals(1,phonebookRepository.count());
    }

    @Test
    public void savePhoneBookByIdReturnSavedPhonebook(){
        // given that i have a new phone book repository
        // when i save a new phonebook
        // and when i find by id
        // assert the phonebook is equals to saved phonebook

        Phonebook daniel = new Phonebook();
        daniel.setPhoneNumber("9900");
        daniel.setOwnersName("Daniel");
        phonebookRepository.save(daniel);
        Phonebook savedPhonebook = phonebookRepository.findById("9900");
        assertEquals(daniel,savedPhonebook);
        assertEquals("Daniel",savedPhonebook.getOwnersName());

    }

    @Test
    public void updatePhoneBookFindByIdReturnUpdatedPhoneBook(){
        // given i have a new phone book repository
        // i save a new phoneBook
        // and when i update
        // assert that phonebook details has been updated

        Phonebook daniel = new Phonebook();
        daniel.setPhoneNumber("9900");
        daniel.setOwnersName("Daniel");
        phonebookRepository.save(daniel);
        Phonebook updatedPhoneBook = new Phonebook();
        updatedPhoneBook.setPhoneNumber("9900");
        updatedPhoneBook.setOwnersName("Tomiwa");
        phonebookRepository.save(updatedPhoneBook);
        Phonebook savedPhonebook = phonebookRepository.findById("9900");
        assertEquals(1,phonebookRepository.count());
        assertEquals("Tomiwa",savedPhonebook.getOwnersName());

    }

}