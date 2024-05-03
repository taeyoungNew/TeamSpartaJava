package week05.thread.stat.waitNotify;

import java.util.ArrayList;
import java.util.List;

// 병목현상 : 모든 쓰레드가 서로를 기다려서 프로그램은 돌아가고 있지만 멈춰있는 현상
// 이 프로그램에서 병목현상이 발생하는 이유 : 
// 구매자는 자신이 사고자하는 물품이 없고 판매자는 인벤토리가 꽉차있는 상태(중복데이터)

// notify는 객체의 대기실에 있는 모든 쓰레드 중에서 임의의 쓰레드만 통지를 받는다. <= 존나 안좋은거 아님?

public class Main {
	public static String[] itemList = { "MacBook", "IPhone", "AirPods", "iMac", "Mac mini" };
	public static AppleStore appleStore = new AppleStore();
	public static final int MAX_ITEM = 5;

	public static void main(String[] args) {

		// 가게 점원
		Runnable StoreClerk = () -> {
			while (true) {
				// 0부터 4사이의 정수 중 Random한 값을 뽑아내기 위함
				int randomItem = (int) (Math.random() * MAX_ITEM);
				
				// restock : 재고를 넣는 메서드
				appleStore.restock(itemList[randomItem]);
				try {
					Thread.sleep(50);
				} catch (InterruptedException ignored) {
				}
			}
		};

		// 고객
		Runnable Customer = () -> {
			while (true) {
				try {
					Thread.sleep(77);
				} catch (InterruptedException ignored) {
				}
				// Math.random : 0 ~ 1중 랜덤숫자 리턴
				// 0부터 4사이의 정수 중 Random한 값을 뽑아내기 위함
				int randomItem = (int) (Math.random() * MAX_ITEM);
				
				// 랜덤하게 나온 숫자를 인덱스로 넣고 
				// 해당 인덱스의 데이터를 sale메서드에 넘긴다.
				// sale : 판매하는 메서드
				// Random한 물품을 구매하려고 시도
				appleStore.sale(itemList[randomItem]);
				System.out.println(Thread.currentThread().getName() + " Purchase Item " + itemList[randomItem]);
			}
		};

		// 점원
		new Thread(StoreClerk, "StoreClerk").start();
		
		// 구매자
		new Thread(Customer, "Customer1").start();
		new Thread(Customer, "Customer2").start();

	}
}

class AppleStore {
	private List<String> inventory = new ArrayList<>();

	public void restock(String item) {
		// 아래의 로직이 실행될때는 다른 쓰레드가 기다림
		synchronized (this) {
			// 인벤토리가 꽉차면 
			while (inventory.size() >= Main.MAX_ITEM) {
				System.out.println(Thread.currentThread().getName() + " Waiting!");
				try {
					// 기다림
					wait(); // 재고가 꽉 차있어서 재입고하지 않고 기다리는 중!
					Thread.sleep(333);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			// 재입고
			inventory.add(item);
			notify(); // 재입고 되었음을 고객에게 알려주기
			System.out.println("Inventory 현황: " + inventory.toString());
		}
	}

	// 구매
	public synchronized void sale(String itemName) {
		// 인벤토리가 만약0이면 
		while (inventory.size() == 0) {
			System.out.println(Thread.currentThread().getName() + " Waiting!");
			try {
				// 고객은 기다림
				wait(); // 재고가 없기 때문에 고객 대기중
				Thread.sleep(333);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// 인벤토리가 0이 아니면 구매
		while (true) {
			// 고객이 주문한 제품이 있는지 확인
			for (int i = 0; i < inventory.size(); i++) {
				// 고객이 찾는 물품이 있다면
				// itemName : 고객이 구매하고자 하는 물품이름
				if (itemName.equals(inventory.get(i))) {
					// 고객이 구매한 상품은 inventory에서 지우기
					inventory.remove(itemName);
					System.out.println(itemName + "구매완료!");
					notify(); // 제품 하나 팔렸으니 재입고 하라고 알려주기
					return; // 메서드 종료
				}
			}

			// 고객이 찾는 제품이 없을 경우
			try {
				System.out.println(Thread.currentThread().getName() + " Waiting!");
				// 기다림
				wait();
				Thread.sleep(333);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}