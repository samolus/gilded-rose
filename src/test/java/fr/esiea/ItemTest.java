package fr.esiea;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void testToString(){
        Item item = new Item("Test", 0, 0);
        Assertions.assertThat(item.toString()).as("Item toString methode").isEqualTo(item.name + ", " + item.sellIn + ", " + item.quality );
    }

}
