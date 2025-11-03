
/**
 * This is a Store who delivers only 75% of its tenges
 * 
 * @author Beltrán - Ducuara
 * @2025-2
 */
public class DiscountStore extends Store {
    public DiscountStore(int position, int tenges, int x, int y, String color) {
        super(position, tenges, x, y, color);
    }

    @Override
    public int collect() {
        int amount = super.collect();
        return (int)(amount * 0.75);
    }
}
