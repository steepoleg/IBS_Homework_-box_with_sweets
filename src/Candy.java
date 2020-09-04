public class Candy extends Sweet {
    private String color;

    public Candy(String name, double weight, double price, String color) {
        super(name, weight, price);
        this.color = color;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Сладость: " + getName()
                + ", Стоимость: " + getPrice() + "$"
                + ", Вес: " + getWeight() + " грамм"
                + ", Цвет: " + getColor();
    }
}
