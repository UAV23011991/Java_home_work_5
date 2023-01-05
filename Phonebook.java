package Java.h_w_5;

import java.util.*;

public class Phonebook {

    public Map<String, String []> phonebook;

    public Phonebook() {
        phonebook = new HashMap<>();
        phonebook.put("Алексей", new String[]{"+7-(924)-654-89-11", "+7-(930)-745-25-16", "+7-(917)-345-89-74"});
        phonebook.put("Павел", new String[]{"+7-(945)-085-77-55", "+7-(900)-412-56-77"});
        phonebook.put("Дарья", new String[]{"+7-(978)-56-78-11", "+7-(948)-785-91-22"});
        phonebook.put("Ирина", new String[]{"+7-(925)-213-82-33"});
    }
}
