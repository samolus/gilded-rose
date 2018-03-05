package fr.esiea;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    // public void updateQuality() {
        // for (int i = 0; i < items.length; i++) {
            // if (!items[i].name.equals("Aged Brie")
                    // && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                // if (items[i].quality > 0) {
                    // if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                        // items[i].quality = items[i].quality - 1;
                    // }
                // }
            // } else {
                // if (items[i].quality < 50)
                // {
                    // items[i].quality = items[i].quality + 1;

                    // if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        // if (items[i].sellIn < 11) {
                            // if (items[i].quality < 50) {
                                // items[i].quality = items[i].quality + 1;
                            // }
                        // }

                        // if (items[i].sellIn < 6) {
                            // if (items[i].quality < 50) {
                                // items[i].quality = items[i].quality + 1;
                            // }
                        // }
                    // }
                // }
            // }

            // if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                // items[i].sellIn = items[i].sellIn - 1;
            // }

            // if (items[i].sellIn < 0) {
                // if (!items[i].name.equals("Aged Brie")) {
                    // if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        // if (items[i].quality > 0) {
                            // if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                                // items[i].quality = items[i].quality - 1;
                            // }
                        // }
                    // } else {
                        // items[i].quality = items[i].quality - items[i].quality;
                    // }
                // } else {
                    // if (items[i].quality < 50) {
                        // items[i].quality = items[i].quality + 1;
                    // }
                // }
            // }
        // }
    // }

    public void updateQuality() {

        for (int i = 0; i < items.length; i++) {
            String item_name= items[i].getName();
            switch(item_name){
                case "Aged Brie":
                    items[i] = updateAgedBrie(items[i]);
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
<<<<<<< HEAD
                    break;
=======
                    items[i]=updateBackstagePassesToATAFKAL80ETCconcert(items[i]);
>>>>>>> refactoring with method updateBackstagePassesToATAFKAL80ETCconcert
                case "Sulfuras, Hand of Ragnaros   ":
                    break;
                default:
                    break;
            }
        }
    }
    public Item updateAgedBrie(Item item){
    if (item.getQuality() < 50) {
        item.setQuality(item.getQuality() + 1);
    }
    item.setSellIn(item.getSellIn() - 1);
    if (item.getSellIn() < 0) {
        if (item.getQuality()< 50) {
            item.setQuality(item.getQuality() + 1);
        }
    }


    return item;
    }
    public Item updateBackstagePassesToATAFKAL80ETCconcert(Item item)
    {
        if (item.getSellIn()< 11)
        {
             if (item.getQuality() < 50)
             {
                item.setQuality(item.getQuality()+1);
             }
         }
        return item;
    }
}
