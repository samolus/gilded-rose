package fr.esiea;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }



    public void updateQuality() {

        for (int i = 0; i < items.length; i++) {
            String item_name= items[i].getName();
            switch(item_name){
                case "Aged Brie":
                    items[i] = updateAgedBrie(items[i]);
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    items[i]=updateBackstagePassesToATAFKAL80ETCconcert(items[i]);
					break;
                case "Sulfuras, Hand of Ragnaros":
                    break;
                default:
					items[i]=updateItemDefault(items[i]);	
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
             if (item.getSellIn() < 6)
             {
                if (item.getQuality() < 50)
                    {
                        item.setQuality(item.getQuality()+1);
                    }
            }
         }

        return item;
    }
	public Item updateItemDefault(Item item){
        if (item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 1);
        }
        item.setSellIn(item.getSellIn() - 1);

        if (item.getSellIn() < 0) {
            if (item.getQuality() > 0) {
                item.setQuality(item.getQuality() - 1);
            }
        }
        return item;
    }
}
