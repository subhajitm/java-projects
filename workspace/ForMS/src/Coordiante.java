
public class Coordiante {
	int x,y;
	boolean flag;
	Coordiante dad;
	public Coordiante(int x, int y, boolean flag, Coordiante dad) {
		super();
		this.x = x;
		this.y = y;
		this.flag = false;
		this.dad = null;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public Coordiante getDad() {
		return dad;
	}
	public void setDad(Coordiante dad) {
		this.dad = dad;
	}
	
}
