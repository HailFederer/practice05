package prob5;

public class MyStack <T>{

	private T[] stackArr;
	private int index;
	
	@SuppressWarnings("unchecked")
	public MyStack() {
		
		stackArr = (T[])new Object[10];
		index = 0;
	}
	
	@SuppressWarnings("unchecked")
	public MyStack(int size) {
		
		stackArr = (T[])new Object[size];
		index = 0;
	}
	
	public void push(T data) {
		
		if(index == stackArr.length){
			sizeUp();
		}
		stackArr[index++] = data;
	}
	
	private void sizeUp() {
		
		@SuppressWarnings("unchecked")
		T[] sizeUpStackArr = (T[])new Object[stackArr.length * 2];
		System.arraycopy(stackArr, 0, sizeUpStackArr, 0, stackArr.length);
		stackArr =  sizeUpStackArr;
	}
	
	public T pop() throws MyStackException{
		
		if(isEmpty()){
			throw new MyStackException("stack is empty");
		}
		
		T popValue = stackArr[--index];
		stackArr[index] = null;		// GC
		
		return popValue;
	}
	
	public boolean isEmpty(){
		
		return index == 0;
	}
}