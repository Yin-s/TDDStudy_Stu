package Main;

public class Calculate extends ABS_Calculate {
	
	ABS_Rectangle rectangle;

	public ABS_Rectangle getRectangle() {
		return rectangle;
	}
	
	public void setRectangle(ABS_Rectangle rectangle) {
		this.rectangle=rectangle;
	}

	@Override
	public int getResult(int a, int b, String op) {
		// TODO Auto-generated method stub
		
		if(op.equals("girth"))
			return girth(a,b);
		
		
		return Integer.MIN_VALUE;
	}

	
	private int girth(int a,int b){
		return rectangle.girth(a, b);
	}
}
