public interface Box {
    void addSweet (Sweet sweet);
    void removeLastSweet();
    void removeSweetByIndex(int index);
    double getWeight();
    double getPrice();
    void showAll();
    void OptimizeWeight(double maxWeight);
    void OptimizePrice(double maxPrice);
}
