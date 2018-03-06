package fr.esiea;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

<<<<<<< HEAD
    @Test
    public void testToString(){
        Item item = new Item("Test", 0, 0);
        Assertions.assertThat(item.toString()).as("Item toString methode").isEqualTo(item.name + ", " + item.sellIn + ", " + item.quality );
=======


    @Test
    public void testToString()
    {
        Item item = new Item("apple", 2, 10);
        assertEquals("apple,1,10",item.toString());
>>>>>>> implementation correcte du test de la methode tostring
    }

}
