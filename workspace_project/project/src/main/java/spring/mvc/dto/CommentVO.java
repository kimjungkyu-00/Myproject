package spring.mvc.dto;

public class CommentVO {
	private int idx;
	private String contents;
	private int boardidx;
	private String writer;
	
	
	 
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public int getBoardidx() {
		return boardidx;
	}
	public int setBoardidx(int boardidx) {
		return this.boardidx = boardidx;
	}

	
}
