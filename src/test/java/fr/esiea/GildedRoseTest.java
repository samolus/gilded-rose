package fr.esiea;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

public class GildedRoseTest {
    @Test
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
    }

    @Test
    public void Aged_Brie_Equals_and_Quality_increase() {
        Item item = new Item("Aged Brie", 2, 10);
        Item[] items = new Item[] {item};

        GildedRose tavern = new GildedRose(items);

        tavern.updateQuality();

        SoftAssertions solftly = new SoftAssertions();
        solftly.assertThat(item.quality)
                .as("Aged Brie quality")
                .isEqualTo(11);
        solftly.assertThat(item.sellIn)
                .as("Aged Brie Price")
                .isEqualTo(1);
        solftly.assertAll();
    }
}