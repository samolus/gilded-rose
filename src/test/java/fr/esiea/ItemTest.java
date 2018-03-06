package fr.esiea;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {
    

    @Test
    public void testToString()
    {
        Item item = new Item("apple", 2, 10);
        assertEquals("apple,1,10",item.toString());
    }

}
