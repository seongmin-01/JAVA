package controller;

import java.util.List;
import java.util.Scanner;

import entity.Product;
import service.ProductService;

public class ProductController {

	private ProductService service = ProductService.getInstance();

	public void manage(Scanner sc) {
		
		while(true) {
			
			System.out.println("-------- 상품관리 --------");
			System.out.println("0:메인, 1:상품등록, 2:상품목록, 3:상품검색");
			System.out.print("선택 : ");
			
			int choice = sc.nextInt();
			
			switch (choice) {
			case 0: 
				//메인 이동
				return;  // 메서드 종료
			case 1: 
				//상품등록
				Product inputProduct = inputProduct(sc);
				service.registerProduct(inputProduct);
				
				System.out.println("상품 등록 완료!");
				break;
			case 2: 
				//상품목록
				List<Product> products = service.listProduct();
				
				for(Product product : products) {
					System.out.println(product);
				}
				break;
			case 3: 
				//상품검색
				String prodName = findProduct(sc);
				Product product = service.serachProduct(prodName);
				
				if(product != null) {
					System.out.println(product);
				}
				else {
					System.out.println("해당 상품을 찾을 수 없습니다.");
				}
				
				break;	
			default:
				break;
				}
			}
		}
		
		public Product inputProduct(Scanner sc) {
			sc.nextLine();
			System.out.print("상품명 : ");
			String prodName = sc.nextLine();
			
			System.out.print("재고량 : ");
			int stock = sc.nextInt();
		
			System.out.print("가격 : ");
			int price = sc.nextInt();
			
			sc.nextLine();
			System.out.print("제조사 : ");
			String company = sc.nextLine();
			
			return new Product(prodName, stock, price, company);
	}
		
		public String findProduct(Scanner sc) {
			sc.nextLine();
			
			System.out.println("검색 상품명 : ");
			String prodName = sc.nextLine();
			
			return prodName;
		}
}
