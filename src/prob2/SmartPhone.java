package prob2;

public class SmartPhone extends MusicPhone {

	@Override
	public void execute(String function) {
		if("앱".equals(function)){
			executeApp();
			return;
		}
		super.execute(function);
	}
	
	@Override
	protected void playMusic() {
		System.out.println("다운로드해서 음악재생");
	}
	
	void executeApp() {
		System.out.println("앱 실행");
	}
}
