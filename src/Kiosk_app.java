import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk_app {

    public void init() {
        ProductRepository productRepository = new ProductRepository();
        ArrayList<Order> orderHistory = new ArrayList<>();

        System.out.println("[안내] 안녕하세요. 김밥천국에 오신 것을 환영합니다.");
        System.out.println("-".repeat(50));

        boolean running = true;
        while (running) {
            System.out.println("[안내]원하시는 메뉴의 번호를 입력하여 주세요.");
            productRepository.printMenu();
            Scanner input = new Scanner(System.in);

            String productId = input.nextLine();     // 메뉴의 번호 입력 받기
            while (productRepository.printMenu(productId) == false){
                // 메뉴의 번호로 레파지토리에서 해당 상품 출력
                System.out.println("메뉴의 번호를 다시 확인하시고 입력해주세요");
                productId = input.nextLine(); // 다른 메뉴 번호가 입력되면 실행됨
            }

            System.out.println("[안내] 원하시는 수량을 입력해주세요");
            int quantity = input.nextInt();
            input.nextLine();

            // 주문한 메뉴를 orderHistory List에 넣음
            Product orderedProduct = productRepository.findMenu(productId);
            Order order = new Order(orderedProduct, quantity);
            orderHistory.add(order);

            System.out.println("[안내] 주문 종료 : 0, 추가 주문 : 9");
            if (input.nextLine().equals("0")) running = false;
        }

        // #,### 원 으로 만들어주는 클래스
        DecimalFormat df = new DecimalFormat("#,###");

        // 모든 주문을 종료하고 주문한 총액을 리턴함
        System.out.println("\n[주문내역]");
        System.out.println("-".repeat(50));
        for (Order order : orderHistory) {
            System.out.printf("주문메뉴 : %-5s 수량 : %d  가격 : %s 원\n", order.getProduct().getName(),
                    order.getQuantity(),
                    df.format(order.getProduct().getPrice() * order.getQuantity()));
        }

    }
}
