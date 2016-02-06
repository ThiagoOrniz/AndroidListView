package json;

import java.util.ArrayList;
import java.util.List;

import models.Contact;

/**
 * Created by thiagoorniz on 16-02-06.
 */
public class ContactJSON {

    private static List<Contact> contacts = new ArrayList<>();

    public static List<Contact> getContacts(){

        //fill contacts;

        Contact contactAna = new Contact("Ana","Andrade",10,"11111111");
        Contact contactBianca = new Contact("Bianca","Barros",12,"22222222");
        Contact contactCarolina = new Contact("Carolina","Campos",14,"33333333");

        contacts.add(contactAna);
        contacts.add(contactBianca);
        contacts.add(contactCarolina);


        return contacts;
    }
}
