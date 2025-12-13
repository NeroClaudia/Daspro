package javaFolder;

public class method {

    static String bakePizza(String bread) {
        return bread + " pizza";
    }
    static String bakePizza(String bread, String cheese) {
        return bread + cheese + " pizza";
    }
    static String bakePizza(String bread, String cheese, String topping) {
        return bread + " " + cheese + " " + topping + " pizza";
    }
        public static void main(String[] args) {
        
            String pizza = bakePizza("Flat bread", "mozzarella", "pepperoni");
            System.out.println(pizza);
    }
}