import java.util.Scanner;

public class interface_exam {
	public static void main(String[] args) {
		main m = new main();
		m.start();
	}
}

interface OnOff {
	public void on();

	public void off();
}

interface operate {
	public void setup();

	public void delete();
}

interface reserve {
	public void reservation();

	public void cancel();
}

class scanner {
	Scanner sc = new Scanner(System.in);
	public static int In_int;
	public static String In_str;

	void Int() {
		In_int = sc.nextInt();
	}

	void Str() {
		In_str = sc.nextLine();
	}
}

class main {
	public void start() {
		System.out.println("====================");
		System.out.println("Iot Operate List");
		System.out.println("|| 1.보일러");
		System.out.println("|| 2.에어컨");
		System.out.println("|| 3.Tv 녹화");
		System.out.println("|| 4.목욕물 채우기");
		System.out.println("====================");
		System.out.print("prompt > ");

		scanner scan = new scanner();
		scan.Int();
		int num = scan.In_int;
		if (num == 1) {
			Boiler start = new Boiler();
			start.op();
		}
		else if(num == 2 ) {
			Aircon ari = new Aircon();
			ari.reservation();
		}
		else if(num == 3 ) {
			televison tv = new televison();
			tv.reservation();
		}
		else if(num == 4 ) {
			temper te = new temper();
			te.reservation();
		}
		else
			System.out.println("오류 입니다.");
	}
}

class Boiler implements OnOff {

	public void op() {
		Boiler bo = new Boiler();
		bo.on();
	}

	@Override
	public void on() {
		System.out.println("보일러를 켰습니다.");
	}

	@Override
	public void off() {
		System.out.println("보일러를 껐습니다.");
	}

}

class Aircon implements OnOff, reserve{

	@Override
	public void reservation() {
		System.out.println("에어컨 실행 예약이 완료 됬습니다.");
	}

	@Override
	public void cancel() {
		System.out.println("에어컨 예약을 취소합니다.");
	}

	@Override
	public void on() {
		System.out.println("에어컨을 실행 합니다.");
	}

	@Override
	public void off() {
		System.out.println("에어컨을 종료합니다.");
	}
	
}

class televison implements reserve{

	@Override
	public void reservation() {
		System.out.println("드라마 예약이 완료 되었습니다.");
	}

	@Override
	public void cancel() {
		System.out.println("예약이 취소 되었습니다.");
	}
	
}

class temper implements reserve {

	@Override
	public void reservation() {
		System.out.println("물을 틀어서 목욕물을 받습니다.");
	}

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		
	}
	
}