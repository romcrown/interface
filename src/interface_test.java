
public class interface_test {
	public static void main(String[] args) {
		tv t = new tv();
		refrigerator re = new refrigerator();
		
		t.on();
		t.off();
		re.on();
		re.off();
	}
}

interface Iot {
	public void on(); 
	public void off();
}

interface server {
	public void setup();
	public void delete();
}

class tv implements Iot{ //implements 로 상속을 받는다. 다중허용 가능.
	public void on() { //메소드를 재정의 해줘야한다.
		System.out.println("tv ON");
	}
	public void off() {
		System.out.println("tv OFF");
	}
}

class refrigerator implements Iot{
	public void on() {
		System.out.println("refrigerator ON");
	}
	public void off() {
		System.out.println("refrigerator OFF");
	}
}

class computer implements Iot, server { //interface 는 다중 상속이 가능하다.

	@Override
	public void setup() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void on() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		
	}
}