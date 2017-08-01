package prob3;

public class Duck extends Bird {

	@Override
	public void fly() {
		
		System.out.println("오리("+name+")는 날지 않습니다.");
	}
	
	@Override
	public void sing() {
		System.out.print("오리("+name+")가 ");
		super.sing();
	}
	
	@Override
	public String toString() {
		
		return "오리"+super.toString();
	}
}
