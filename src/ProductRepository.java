public class ProductRepository {
    private Product[] menu = new Product[]{
            new Product("김밥", 1000, 99),
            new Product("계란 김밥", 1500, 99),
            new Product("충무 김밥", 1000, 99),
            new Product("떡볶이", 2000, 99)
    };

    public Product[] getMenu() {
        return menu;
    }
}
