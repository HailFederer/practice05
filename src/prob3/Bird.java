package prob3;

public abstract class Bird {
	
	protected String name;
	
	public abstract void fly();
	
	public void sing(){
		System.out.println("소리내어 웁니다.");
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		
		return "의 이름은 "+name+" 입니다.";
	}
}
