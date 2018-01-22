package com.patel.sandip.lombok;

import org.junit.Assert;
import org.junit.Test;

public class LombokTest {

    @Test
    public void testConstructor() {

        Contact contact = new Contact(); // no arg constructor
        //Contact contact1 = new Contact(1L, "Sandip", "0123456799", "India"); // Unable to compile. Private all arg constructor.

        Assert.assertEquals("Contact(null, null)", contact.toString());
    }

    @Test
    public void testGetterAndSetter() {

        Contact contact = new Contact();
        contact.setId(1L);
        contact.setName("Sandip");
        contact.setContactNo("0123456789");
        contact.setAddress("India");

        Assert.assertEquals("Sandip", contact.getName());
        Assert.assertEquals("0123456789", contact.getContactNo());
        Assert.assertEquals("India", contact.getAddress());
    }

    @Test
    public void testToString() {

        Contact contact = new Contact();
        contact.setId(1L);
        contact.setName("Sandip");
        contact.setContactNo("0123456789");
        contact.setAddress("India");

        Assert.assertEquals("Contact(1, Sandip)", contact.toString());
    }


    @Test
    public void testEqualsAndHashCode() {

        Contact contact1 = new Contact();
        contact1.setId(1L);
        contact1.setName("Sandip");
        contact1.setContactNo("0123456789");
        contact1.setAddress("India");

        Contact contact2 = new Contact();
        contact2.setId(1L);
        contact2.setName("Sandip");
        contact2.setContactNo("0123456789");
        contact2.setAddress("India");

        Assert.assertTrue( contact1.equals(contact2));
        Assert.assertEquals(contact1.hashCode(), contact2.hashCode());
    }
}
