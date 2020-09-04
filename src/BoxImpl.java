import java.util.ArrayList;
import java.util.List;

public class BoxImpl implements Box {

    private List<Sweet> sweetArray = new ArrayList<>();


    @Override
    public void addSweet(Sweet sweet) {
        sweetArray.add(sweet);
    }

    @Override
    public void removeLastSweet() {
        sweetArray.remove(sweetArray.size() - 1);
    }

    @Override
    public void removeSweetByIndex(int index) {
        sweetArray.remove(index);
    }

    @Override
    public double getWeight() {
        double boxWeight = 0;
        for (Sweet sweet:sweetArray) {
            boxWeight += sweet.getWeight();
        }
        return boxWeight;
    }

    public double getPrice() {
        double boxPrice = 0;
        for (Sweet sweet:sweetArray) {
            boxPrice += sweet.getPrice();
        }
        return boxPrice;
    }

    @Override
    public void showAll() {
        for (Sweet sweet:sweetArray) {
            System.out.println(sweet.toString());
            System.out.println();
        }
    }

    @Override
    public void OptimizeWeight(double maxWeight) {
        if(this.getWeight() < maxWeight) return;
        while (this.getWeight() >= maxWeight){
            sweetArray.remove(this.getMinWeightItem());
        }
    }

    @Override
    public void OptimizePrice(double maxPrice) {
        if(this.getPrice() < maxPrice) return;
        while (this.getPrice() >= maxPrice){
            sweetArray.remove(this.getMinPriceItem());
        }
    }

    public Sweet getMinWeightItem(){
        Sweet minSweet = null;
        if(sweetArray.size() > 0){
            minSweet = sweetArray.get(0);
        }
        for (Sweet sweet: sweetArray) {
            if(minSweet != null) {
                if (minSweet.getWeight() > sweet.getWeight()){
                    minSweet = sweet;
                }
            }
        }
        return minSweet;
    }

    public Sweet getMinPriceItem(){
        Sweet minSweet = null;
        if(sweetArray.size() > 0){
            minSweet = sweetArray.get(0);
        }
        for (Sweet sweet: sweetArray) {
            if(minSweet != null) {
                if (minSweet.getPrice() > sweet.getPrice()){
                    minSweet = sweet;
                }
            }
        }
        return minSweet;
    }
}
