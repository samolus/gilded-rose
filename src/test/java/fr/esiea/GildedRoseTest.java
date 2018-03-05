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

    @Test
    public void Sellin_Inf_0_and_object_non_specific() {
        Item item = new Item("Apple", -10, 10);
        Item[] items = new Item[] {item};

        GildedRose tavern = new GildedRose(items);

        tavern.updateQuality();

        SoftAssertions solftly = new SoftAssertions();
        solftly.assertThat(item.quality)
                .as("Apple quality")
                .isEqualTo(8);
        solftly.assertThat(item.sellIn)
                .as("Apple Price")
                .isEqualTo(-11);
        solftly.assertAll();
    }
    @Test
    public void Equals_Backstage_quality_add_one() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 10);
        Item[] items = new Item[] {item};

        GildedRose tavern = new GildedRose(items);

        tavern.updateQuality();

        SoftAssertions solftly = new SoftAssertions();
        solftly.assertThat(item.quality)
                .as("Backstage quality")
                .isEqualTo(11);
        solftly.assertThat(item.sellIn)
                .as("Backstage Price")
                .isEqualTo(5);
        solftly.assertAll();
    }
    @Test
    public void Sellin_inf_0_and_not_equals_to_aged_and_backstage() {
        Item item = new Item("Apple", -11, 10);
        Item[] items = new Item[] {item};

        GildedRose tavern = new GildedRose(items);

        tavern.updateQuality();

        SoftAssertions solftly = new SoftAssertions();
        solftly.assertThat(item.quality)
                .as("Apple quality")
                .isEqualTo(8);
        solftly.assertThat(item.sellIn)
                .as("Apple Price")
                .isEqualTo(-12);
        solftly.assertAll();
    }
    @Test
    public void Sellin_inf_0_and_equals_to_aged_and_quality_inf_50() {
        Item item = new Item("Aged Brie", -11, 10);
        Item[] items = new Item[] {item};

        GildedRose tavern = new GildedRose(items);

        tavern.updateQuality();

        SoftAssertions solftly = new SoftAssertions();
        solftly.assertThat(item.quality)
                .as("Aged quality")
                .isEqualTo(12);
        solftly.assertThat(item.sellIn)
                .as("Aged Price")
                .isEqualTo(-12);
        solftly.assertAll();
    }
    @Test
    public void Sellin_inf_0_and_equals_to_Backstage() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", -11, 10);
        Item[] items = new Item[] {item};

        GildedRose tavern = new GildedRose(items);

        tavern.updateQuality();

        SoftAssertions solftly = new SoftAssertions();
        solftly.assertThat(item.quality)
                .as("Backstage quality")
                .isEqualTo(11);
        solftly.assertThat(item.sellIn)
                .as("Backstage Price")
                .isEqualTo(-11);
        solftly.assertAll();
    }

}