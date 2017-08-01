package prob3;

public class Sparrow extends Bird {

	@Override
	public void fly() {
		
		System.out.println("참새("+name+")가 날아다닙니다.");
	}

	@Override
	public void sing() {
		System.out.print("참새("+name+")가 ");
		super.sing();
	}

	@Override
	public String toString() {
		
		return "참새"+super.toString();
	}

}
