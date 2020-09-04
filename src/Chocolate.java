public class Chocolate extends Sweet {
    private int numberOfBars;

    public Chocolate (String name, double weight, double price,int numberOfBars) {
        super(name, weight, price);
        this.numberOfBars = numberOfBars;

    }

    public int getNumberOfBars() {
        return numberOfBars;
    }

    public void setNumberOfBars(int numberOfBars) {
        this.numberOfBars = numberOfBars;
    }

    @Override
    public String toString() {
        return "Сладость: " + getName()
                + ", Стоимость: " + getPrice() + "$"
                + ", Вес: " + getWeight() + " грамм"
                + ", Количество плиточек: " + getNumberOfBars();
    }
}
