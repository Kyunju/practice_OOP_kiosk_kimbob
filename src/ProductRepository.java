import org.w3c.dom.ls.LSOutput;

public class ProductRepository {
    private Product[] menu = new Product[]{
            new Product(1,"김밥", 1000, 99),
            new Product(2, "계란김밥", 1500, 99),
            new Product(3, "충무김밥", 1000, 99),
            new Product(4, "떡볶이", 2000, 99)
    };

    public Product[] getMenu() {
        return menu;
    }

    public void printMenu() {
        for (Product product: menu) {
            System.out.printf("%d) %s(%d원) ", product.getId(), product.getName(), product.getPrice());
        }
        System.out.println();
    }

    public boolean printMenu(String id) {
        if (findMenu(id) == null) return false;
        for (Product product : menu) {
            if (product.getId() == Integer.parseInt(id)) {
                System.out.printf("%d) %s(%d원) 를 주문합니다.\n", product.getId(), product.getName(), product.getPrice());
                break;
            }
        }
        return true;
    }

    public Product findMenu(String id) {
        for (Product product : menu) {
            if (product.getId() == Integer.parseInt(id)) {
                return product;
            }
        }
        return null;
    }
}
