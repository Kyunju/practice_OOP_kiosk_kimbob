public class Product {
    private int id;
    private String name; // 상품명
    private int price; // 가격
    private int amount = 0; // 상품 갯수

    public Product(int id, String name, int price, int amount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public int getId() {
        return id;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
