<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <form action="" method="post">
        <p>제목 <input type="text" name="title" placeholder="제목을 입력하세요">
        <p>작성자 <input type="text" name="author">
        <p>내용  <span>0</span>/10 
            <textarea  id="my-textarea" name="content" rows="5" placeholder="내용을 입력하세요"></textarea>
        <p><input type="button" value="새글등록">
        
    </form>
</body>
</html>