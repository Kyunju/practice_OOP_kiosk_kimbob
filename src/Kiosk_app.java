public class Kiosk_app {

    public void init() {
        ProductRepository productRepository = new ProductRepository();
        System.out.println("[안내] 안녕하세요. 김밥천국에 오신 것을 환영합니다.");
        System.out.println("-".repeat(50));

        System.out.println("[안내]원하시는 메뉴의 번호를 입력하여 주세요.");
        productRepository.printMenu();

    }
}
