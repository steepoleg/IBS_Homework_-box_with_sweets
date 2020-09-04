public class Main {
    public static void main(String[] args) {
        Box box = new BoxImpl();
        Sweet candy1 = new Candy("Барбарис", 1.5,8.5,"Красный");
        Sweet chocolate = new Chocolate("Аленка", 4.5,50.5,20);
        Sweet marmalade = new Marmalade("Морковный мармелад", 3.8,77,"Красный Октябрь");
        Sweet candy2 = new Candy("Мишка на севере", 6.66,25,"Серо-буро-малиновый");

        box.addSweet(candy1);
        box.addSweet(candy2);
        box.addSweet(chocolate);
        box.addSweet(marmalade);
        System.out.println(box.getPrice());
        System.out.println(box.getWeight());


        System.out.println();
        box.removeLastSweet();
        System.out.println(box.getPrice());
        System.out.println(box.getWeight());
        System.out.println();
        box.showAll();
        System.out.println();

        box.OptimizeWeight(12.6);
        box.showAll();
        System.out.println();

        box.OptimizePrice(74);
        box.showAll();

    }
}
