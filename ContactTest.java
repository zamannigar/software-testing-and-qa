package contact;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ContactTest {

    @Test
    void testContactCreation() {

        Contact contact = new Contact(
                "123",
                "John",
                "Smith",
                "1234567890",
                "123 Main St");

        assertEquals("123", contact.getContactId());
        assertEquals("John", contact.getFirstName());
        assertEquals("Smith", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("123 Main St", contact.getAddress());
    }

    @Test
    void testContactIdTooLong() {

        assertThrows(IllegalArgumentException.class, () -> {

            new Contact(
                    "12345678901",
                    "John",
                    "Smith",
                    "1234567890",
                    "123 Main St");
        });
    }

    @Test
    void testContactIdNull() {

        assertThrows(IllegalArgumentException.class, () -> {

            new Contact(
                    null,
                    "John",
                    "Smith",
                    "1234567890",
                    "123 Main St");
        });
    }

    @Test
    void testFirstNameTooLong() {

        assertThrows(IllegalArgumentException.class, () -> {

            new Contact(
                    "123",
                    "JohnJohnJohn",
                    "Smith",
                    "1234567890",
                    "123 Main St");
        });
    }

    @Test
    void testFirstNameNull() {

        assertThrows(IllegalArgumentException.class, () -> {

            new Contact(
                    "123",
                    null,
                    "Smith",
                    "1234567890",
                    "123 Main St");
        });
    }

    @Test
    void testLastNameTooLong() {

        assertThrows(IllegalArgumentException.class, () -> {

            new Contact(
                    "123",
                    "John",
                    "SmithSmithS",
                    "1234567890",
                    "123 Main St");
        });
    }

    @Test
    void testLastNameNull() {

        assertThrows(IllegalArgumentException.class, () -> {

            new Contact(
                    "123",
                    "John",
                    null,
                    "1234567890",
                    "123 Main St");
        });
    }

    @Test
    void testPhoneTooShort() {

        assertThrows(IllegalArgumentException.class, () -> {

            new Contact(
                    "123",
                    "John",
                    "Smith",
                    "12345",
                    "123 Main St");
        });
    }

    @Test
    void testPhoneContainsLetters() {

        assertThrows(IllegalArgumentException.class, () -> {

            new Contact(
                    "123",
                    "John",
                    "Smith",
                    "12345abcde",
                    "123 Main St");
        });
    }

    @Test
    void testPhoneNull() {

        assertThrows(IllegalArgumentException.class, () -> {

            new Contact(
                    "123",
                    "John",
                    "Smith",
                    null,
                    "123 Main St");
        });
    }

    @Test
    void testAddressTooLong() {

        assertThrows(IllegalArgumentException.class, () -> {

            new Contact(
                    "123",
                    "John",
                    "Smith",
                    "1234567890",
                    "This address is definitely over thirty characters");
        });
    }

    @Test
    void testAddressNull() {

        assertThrows(IllegalArgumentException.class, () -> {

            new Contact(
                    "123",
                    "John",
                    "Smith",
                    "1234567890",
                    null);
        });
    }

    @Test
    void testUpdateFields() {

        Contact contact = new Contact(
                "123",
                "John",
                "Smith",
                "1234567890",
                "123 Main St");

        contact.setFirstName("Jane");
        contact.setLastName("Jones");
        contact.setPhone("0987654321");
        contact.setAddress("456 Oak St");

        assertEquals("Jane", contact.getFirstName());
        assertEquals("Jones", contact.getLastName());
        assertEquals("0987654321", contact.getPhone());
        assertEquals("456 Oak St", contact.getAddress());
    }
}