import java.util.Scanner;

public class Kiosk_app {

    public void init() {
        ProductRepository productRepository = new ProductRepository();
        System.out.println("[안내] 안녕하세요. 김밥천국에 오신 것을 환영합니다.");
        System.out.println("-".repeat(50));

        System.out.println("[안내]원하시는 메뉴의 번호를 입력하여 주세요.");
        productRepository.printMenu();
        Scanner input = new Scanner(System.in);
        String productId = input.nextLine(); // 메뉴의 번호 입력 받기
        productRepository.printMenu(productId); // 메뉴의 번호로 레파지토리에서 해당 상품 출력

        System.out.println("[안내] 원하시는 수량을 입력해주세요");


    }
}
