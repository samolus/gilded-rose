package fr.esiea;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {


    @Test
    public void testToString()
    {
        Item item = new Item("apple", 2, 10);
        Item[] items = new Item[] {item};
        String expected = "apple, 2, 10"; // put the expected value here
        SoftAssertions solftly = new SoftAssertions();
        solftly.assertThat(items.toString().equals(expected));
        solftly.assertAll();
    }

}