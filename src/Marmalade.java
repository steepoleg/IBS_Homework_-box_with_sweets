public class Marmalade extends Sweet{
    private String producer;

    public Marmalade(String name, double weight, double price, String producer) {
        super(name, weight, price);
        this.producer = producer;

    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Сладость: " + getName()
                + ", Стоимость: " + getPrice() + "$"
                + ", Вес: " + getWeight() + " грамм"
                + ", Производитель: " + getProducer();
    }
}
