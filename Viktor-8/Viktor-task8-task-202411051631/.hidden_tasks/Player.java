import java.util.List;
import java.util.ArrayList;

public class Player {
    private List<Item> inventory = new ArrayList<>();

    public void pickUpItem(Item item) {
        inventory.add(item);
    }

    public void useItem(String itemName) {
        Item item = null;
        for (Item i : inventory) {
            if (i.getName().equals(itemName)) {
                item = i;
                break;
            }
        }
        if (item != null) {
            System.out.println("Using item: " + item.getName());
            inventory.remove(item);
        } else {
            System.out.println("Item not found in inventory: " + itemName);
        }
    }
}