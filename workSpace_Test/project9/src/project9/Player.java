package project9;

public class Player {

	private int no;
	private String nation;
	private int ggo;
	private boolean omg;

	public Player(String nation, int no) {
		this.nation = nation;
		this.no = no;
	}

	public Player() {
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public int getGgo() {
		return ggo;
	}

	public void setGgo(int ggo) {
		this.ggo = ggo;
	}

	public boolean isOmg() {
		return omg;
	}

	public void setOmg(boolean omg) {
		this.omg = omg;
	}

	@Override
	public String toString() {
		return getNation() + "," + getNo() + "전진거리 :" + getGgo();
	}

}