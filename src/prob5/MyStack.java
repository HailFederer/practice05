package prob5;

public class MyStack {

	private String[] stackArr;
	private int index;
	
	public MyStack(int size) {
		
		stackArr = new String[size];
		index = 0;
	}
	
	public void push(String data) {
		
		if(index == stackArr.length){
			sizeUp();
		}
		stackArr[index++] = data;
	}
	
	private void sizeUp(){
		
		String[] sizeUpStackArr = new String[stackArr.length * 2];
		System.arraycopy(stackArr, 0, sizeUpStackArr, 0, stackArr.length);
		stackArr =  sizeUpStackArr;
	}
	
	public String pop() throws MyStackException{
		
		if(isEmpty()){
			throw new MyStackException("stack is empty");
		}
		
		String popValue = stackArr[--index];
		stackArr[index] = null;		// GC
		
		return popValue;
	}
	
	public boolean isEmpty(){
		
		return index == 0;
	}
}
