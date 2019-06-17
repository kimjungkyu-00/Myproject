package com.board.action;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.board.beans.Board;
import com.board.controller.CommandAction;
import com.board.dao.BoardDao;


public class ListAction implements CommandAction{
	
	@Override
	 public String requestPro(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		
		ArrayList<Board> articleList = BoardDao.getInstance().getArticleList();
		
		request.setAttribute("articleList",articleList);
		return "list.jsp";
	}
}
