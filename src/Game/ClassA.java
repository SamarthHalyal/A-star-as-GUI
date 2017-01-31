package Game;

public class ClassA {
	int a;
	private int b;
	
	public ClassA(int a,int b){
		this.a=a;
		this.b=b;
	}
	 
	public void setB(int b)
	{
		this.b=b;
	}
	
    public void printab(){
    	System.out.println(this.a);
    	System.out.println(this.b);
    }
}
