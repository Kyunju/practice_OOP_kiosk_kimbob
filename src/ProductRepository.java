public class ProductRepository {
    private Product[] menu = new Product[]{
            new Product(1,"김밥", 1000, 99),
            new Product(2, "계란 김밥", 1500, 99),
            new Product(3, "충무 김밥", 1000, 99),
            new Product(4, "떡볶이", 2000, 99)
    };

    public Product[] getMenu() {
        return menu;
    }

    public void printMenu() {
        for (Product product: menu) {
            System.out.printf("%d) %s(%d원) ", product.getId(), product.getName(), product.getPrice());
        }
    }
}
