package week05.homeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		List<Book> bookList = Arrays.asList(new Book(1L, "모두의 딥러닝", "조태호", "IT", 21600),
				new Book(2L, "이득우의 게임 수학", "이득우", "IT", 40500), new Book(3L, "자바 웹 개발 워크북", "구멍가게 코딩단", "IT", 31500),
				new Book(4L, "실전 시계열 분석", "에일린 닐슨", "IT", 34200), new Book(5L, "데이터 분석가의 숫자유감", "권정민", "IT", 14400),
				new Book(6L, "스프링 부트 실전 활용 마스터", "그렉 턴키스트", "IT", 25200),
				new Book(7L, "오늘부터 IT를 시작합니다", "고코더", "IT", 16200),
				new Book(8L, "그림으로 이해하는 인지과학", "기타하라 요시노리", "IT", 16200),
				new Book(9L, "괜찮아, 그 길 끝에 행복이 기다릴 거야", "손미나", "여행", 17100), new Book(10L, "여행의 이유", "김영하", "여행", 12150),
				new Book(11L, "여행의 시간", "김진애", "여행", 16200), new Book(12L, "로봇 시대 살아남기", "염규현", "역사", 14850),
				new Book(13L, "경제 전쟁의 흑역사", "이완배", "역사", 15750),
				new Book(14L, "100가지 동물로 읽는 세계사", "사이먼 반즈", "역사", 29700),
				new Book(15L, "k 배터리 레볼루션", "박순혁", "경제", 17100), new Book(16L, "정하준의 경제학 레시피", "장하준", "경제", 16200),
				new Book(17L, "레버리지", "롭 무어", "경제", 16200));

		// 카테고리가 IT 인 책들의 가격을 40% 할인하여 새로운 책 리스트 만들기
		// IT인 애들만 filter로 골라서
		List<Book> saleItBooks = (List<Book>) bookList.stream().map(book -> {
			try {
				if(book.getCategory().equals("IT")) {
					book.setPrice(book.getPrice() * 0.4);
				}
				
			} catch (ClassCastException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			return book;
		}).toList();		
		
		for(Book book : saleItBooks) {
			System.out.println(book.getBookName() + book.getPrice());
		}
		
		// 카테고리 여행인 책들 조회
//		List<Book> tripBooks = (List<Book>) bookList.stream().filter(book -> book.getCategory().equals("여행")).toList();
//		for (Book book : tripBooks) {
//			System.out.println(book.getBookName());
//		}

		// 책의 가격이 16200원 이하인 책만 조회

//		List<Book> books = (List<Book>) bookList.stream().filter(book -> book.getPrice() < 16200).toList();
//		for (Book book : books) {
//			System.out.println(book.getBookName() + ", " + book.getPrice());
//		}

		// 책의 제목에 "경제"라는 용어가 들어간 책 제목 조회
//		List<Book> books = (List<Book>) bookList.stream().filter(book -> book.getBookName().contains("경제")).toList();
//		for (Book book : books) {
//			System.out.println(book.getBookName() + ", " + book.getPrice());
//		}
		
		// 가격이 가장 비싼 책 가격 조회하기
//		List<Integer> prices = new ArrayList<Integer>();
//		for(Book book : bookList) {
//			prices.add((int)book.getPrice());
//		}
//		
//		int expensiveBook = (int) prices.stream().mapToInt(x -> x).max().orElseThrow(NoSuchElementException::new);
//		System.out.println(expensiveBook);
		
		// 카테고리가 IT인 책들의 가격 합 조회하기
//		double sum = 0;
//		List<Double> resultInteger = new ArrayList<>();
//		
//		resultInteger = bookList.stream().map(book -> {
//			if(book.getCategory().equals("IT")) {
//				return book.getPrice();
//			} 
//			return 0.0;
//		}).toList();
//		
//		for (double price : resultInteger) {
//			sum += price;
//		}
//		
//		System.out.println(sum);
		
		
	}
}
