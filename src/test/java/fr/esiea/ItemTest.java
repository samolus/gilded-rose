package fr.esiea;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    /*@Test
    public void non_specific_object_quality_and_price_decrease_by_one() {
        Item item = new Item("apple", 2, 10);
        Item[] items = new Item[] {item};

        GildedRose tavern = new GildedRose(items);

        tavern.updateQuality();

        SoftAssertions solftly = new SoftAssertions();
        solftly.assertThat(item.quality)
                .as("Apple quality")
                .isEqualTo(9);
        solftly.assertThat(item.sellIn)
                .as("Apple Price")
                .isEqualTo(1);
        solftly.assertAll();
    }*/

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