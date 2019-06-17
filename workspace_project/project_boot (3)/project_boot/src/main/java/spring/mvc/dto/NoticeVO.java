package spring.mvc.dto;


import java.sql.Date;


public class NoticeVO {
	private int nidx;
	private String ntitle;
	private String nwriter;
	private Date nregdate;
	private String ncontent;


	public int getNidx() {
		return nidx;
	}
	public void setNidx(int nidx) {
		this.nidx = nidx;
	}
	public String getNtitle() {
		return ntitle;
	}
	public void setNtitle(String ntitle) {
		this.ntitle = ntitle;
	}
	public String getNwriter() {
		return nwriter;
	}
	public void setNwriter(String nwriter) {
		this.nwriter = nwriter;
	}


	public Date getNregdate() {
		return nregdate;
	}
	public void setNregdate(Date nregdate) {
		this.nregdate = nregdate;
	}
	public String getNcontent() {
		return ncontent;
	}
	public void setNcontent(String ncontent) {
		this.ncontent = ncontent;
	}
	
	
	@Override
	public String toString() {
		return getNcontent()+","+getNidx()+","+getNtitle()+","+getNregdate()+","+getNwriter();
	
	} 
	
	
	
	
	
}