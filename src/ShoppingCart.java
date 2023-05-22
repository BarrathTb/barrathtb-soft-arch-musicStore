import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Music> items;

    public ShoppingCart(){
        this.items = new ArrayList<>();
    }

    public void addItem(Music song){
        this.items.add(song);
    }

    public void removeItem(Music song){
        this.items.remove(song);
    }

    public double getTotal(){
        double total = 0.0;
        for(Music song : items){
            total += song.getPrice();
        }
        return total;
    }

    public List<Music> getCartItems(){
        return items;
    }

    public void clear() {
    }
}
