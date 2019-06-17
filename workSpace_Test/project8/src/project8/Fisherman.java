package project8;

public class Fisherman {
	
	private int controlx;
	private int controly;

	
	public int getControly() {
		return controly;
	}

	public void setControly(int controly) {
		this.controly = controly;
	}
	public int getControlx() {
		return controlx;
	}

	public void setControlx(int controlx) {
		this.controlx = controlx;
	}
	
	public void xUp()
	{
		controlx++;
	}
	public void xDown()
	{
		controlx--;
	}
	public void yUp()
	{
		controly++;
	}
	public void yDown()
	{
		controly--;
	}
}
