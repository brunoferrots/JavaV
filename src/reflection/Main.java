package reflection;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class<Product> productClass1 = Product.class;
        Class<? extends Product> productClass2 = new Product().getClass();
        Class<?> productClass3 = Class.forName("reflection.Product");

        Product product = productClass1.newInstance();

        System.out.println(product instanceof Product);




    }
}
