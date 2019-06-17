package spring.mvc.dto;

import java.util.Date;

public class ReplyVO {
	private int reply_no;
	private int board_no;
	private String reply;
	private String replyer;
	private Date replyDate;
	private Date updateDate;
	
	public int getReply_no() {
		return reply_no;
	}
	public void setReply_no(int reply_no) {
		this.reply_no = reply_no;
	}
	public int getBoard_no() {
		return board_no;
	}
	public void setBoard_no(int board_no) {
		this.board_no = board_no;
	}
	public String getReply() {
		return reply;
	}
	public void setReply(String reply) {
		this.reply = reply;
	}
	public String getReplyer() {
		return replyer;
	}
	public void setReplyer(String replyer) {
		this.replyer = replyer;
	}
	public Date getReplyDate() {
		return replyDate;
	}
	public void setReplyDate(Date replyDate) {
		this.replyDate = replyDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "ReplyVO [reply_no=" + reply_no + ", board_no=" + board_no + ", reply=" + reply + ", replyer=" + replyer
				+ ", replyDate=" + replyDate + ", updateDate=" + updateDate + "]";
	}
	
	

}
