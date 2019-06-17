package spring.mvc.dto;

import java.sql.Date;

public class BoardVO {
	private int board_no; //글 번호
	private String sel_board; //찾습니다면 0, 보호중이면 1
	private String writer;
	private String area; // 지역
	private String sel_date;
	private String content; //글 내용(특징)
	private String fileName; //파일 이름
	private String dogKind; //견종
	private String gender;
	private Date   writeDate; //작성 날짜
	private int  count;	 //조회수
	 private int commentNum; //댓글 갯수


	
	
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getSel_date() {
		return sel_date;
	}
	public void setSel_date(String sel_date) {
		this.sel_date = sel_date;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getSel_board() {
		return sel_board;
	}
	public void setSel_board(String sel_board) {
		this.sel_board = sel_board;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDogKind() {
		return dogKind;
	}
	public void setDogKind(String dogKind) {
		this.dogKind = dogKind;
	}

	public int getBoard_no() {
		return board_no;
	}
	public void setBoard_no(int board_no) {
		this.board_no = board_no;
	}

	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "BoardVO [board_no=" + board_no + ", sel_board=" + sel_board + ", writer=" + writer + ", area=" + area
				+ ", sel_date=" + sel_date + ", content=" + content + ", fileName=" + fileName + ", dogKind=" + dogKind
				+ ", gender=" + gender + ", writeDate=" + writeDate + ", count=" + count + ", commentNum=" + commentNum
				+ "]";
	}
	
	


}
