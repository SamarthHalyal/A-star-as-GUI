package Game;

public class tileinfo
{
   private int type,x,y,i,j,a,b,c,cost;
	public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
	public tileinfo(int i,int j)
	{
		this.i=i;
		this.j=j;
		type=0;
	}
	public int getType() {
		return type;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getI() {
		return i;
	}
	public int getJ() {
		return j;
	}
	public void setType(int type) {
		this.type = type;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setI(int i) {
		this.i = i;
	}
	public void setJ(int j) {
		this.j = j;
	}
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public int getC() {
		return c;
	}
	public void setA(int a) {
		this.a = a;
	}
	public void setB(int b) {
		this.b = b;
	}
	public void setC(int c) {
		this.c = c;
	}
}
