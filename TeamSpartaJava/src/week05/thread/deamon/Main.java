package week05.thread.deamon;


// 데몬쓰레드 : 우선순위가 낮음
// 대표적으로 가비지콜렉터가 있다.
public class Main {
    public static void main(String[] args) {
        Runnable demon = () -> {
            for (int i = 0; i < 1000000; i++) {
                System.out.println(i + "번째 : " + "demon");
            }
        };

        // 우선순위가 낮다 => 상대적으로 다른 쓰레드에 비해 리소스를 적게 할당 받는다.
        Thread thread = new Thread(demon);
        // setDeamon으로 데몬쓰레드로 설정 가능
        thread.setDaemon(true);

        thread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println(i + "번째 : " + "task");
        }
    }
}