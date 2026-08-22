package contact;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ContactServiceTest {

    @Test
    void testAddContact() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "123",
                "John",
                "Smith",
                "1234567890",
                "123 Main St");

        service.addContact(contact);

        assertEquals(contact, service.getContact("123"));
    }

    @Test
    void testDuplicateContactId() {

        ContactService service = new ContactService();

        Contact firstContact = new Contact(
                "123",
                "John",
                "Smith",
                "1234567890",
                "123 Main St");

        Contact secondContact = new Contact(
                "123",
                "Jane",
                "Jones",
                "0987654321",
                "456 Oak St");

        service.addContact(firstContact);

        assertThrows(IllegalArgumentException.class, () -> {
            service.addContact(secondContact);
        });
    }

    @Test
    void testDeleteContact() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "123",
                "John",
                "Smith",
                "1234567890",
                "123 Main St");

        service.addContact(contact);
        service.deleteContact("123");

        assertNull(service.getContact("123"));
    }

    @Test
    void testDeleteMissingContact() {

        ContactService service = new ContactService();

        assertThrows(IllegalArgumentException.class, () -> {
            service.deleteContact("999");
        });
    }

    @Test
    void testUpdateFirstName() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "123",
                "John",
                "Smith",
                "1234567890",
                "123 Main St");

        service.addContact(contact);

        service.updateFirstName("123", "Jane");

        assertEquals("Jane", service.getContact("123").getFirstName());
    }

    @Test
    void testUpdateLastName() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "123",
                "John",
                "Smith",
                "1234567890",
                "123 Main St");

        service.addContact(contact);

        service.updateLastName("123", "Jones");

        assertEquals("Jones", service.getContact("123").getLastName());
    }

    @Test
    void testUpdatePhone() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "123",
                "John",
                "Smith",
                "1234567890",
                "123 Main St");

        service.addContact(contact);

        service.updatePhone("123", "0987654321");

        assertEquals("0987654321", service.getContact("123").getPhone());
    }

    @Test
    void testUpdateAddress() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "123",
                "John",
                "Smith",
                "1234567890",
                "123 Main St");

        service.addContact(contact);

        service.updateAddress("123", "456 Oak St");

        assertEquals("456 Oak St", service.getContact("123").getAddress());
    }

    @Test
    void testUpdateMissingContact() {

        ContactService service = new ContactService();

        assertThrows(IllegalArgumentException.class, () -> {
            service.updateFirstName("999", "Jane");
        });
    }}
