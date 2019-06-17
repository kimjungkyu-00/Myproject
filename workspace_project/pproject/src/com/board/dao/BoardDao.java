package com.board.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.board.beans.Board;

public class BoardDao extends CommonDao{
	
	public static BoardDao getInstance() {
		BoardDao _instance = new BoardDao();
		return _instance;
	}
	
	public ArrayList<Board> getArticleList() throws SQLException{
		ResultSet rs =null;
		String sql="select * from board.board order by IDX DESC";
		rs = openConenction().executeQuery(sql);	//sql을 실행하기위해 연결을 얼어 쿼리를 실행하고 rs에 반환합니다.
		
		ArrayList<Board> articleList = new ArrayList<Board>();
		
		while(rs.next()) {
			Board article = new Board();	//데이터들을 담기위해 board객체에 메모리를 할당
			article.setIdx(Integer.parseInt(rs.getString("idx")));
			article.setTitle(rs.getString("title"));
			article.setWriter(rs.getString("writer"));
			article.setRegdate(rs.getString("regdate"));
			article.setCount(Integer.parseInt(rs.getString("count")));
			
			articleList.add(article); // 셋팅된 빈을 리스트에 추가합니다.
		}
		closeConnection(); // 연결을꼮 닫아줍시다.
		return articleList;
			
	}
	
}
