	<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	 <%@ page import="javax.naming.Context" %>
    <%@ page import="javax.naming.InitialContext" %>
    <%@ page import="javax.naming.NamingException" %>
    
    <%@ page import="model1.BoardTO" %>
    <%@ page import="java.util.ArrayList" %>
    
    <%
    	// 기존 dao와의 연결은 model2가 가져가고 이 한줄이 추가된다.
    	ArrayList<BoardTO> datas = (ArrayList)request.getAttribute("datas");
    
    	StringBuilder sb = new StringBuilder();
    	

		int totalRecord = datas.size();
		
    
			for(BoardTO to : datas){
				String seq =  to.getSeq();
				String subject = to.getSubject();
				String writer = to.getWriter();
				String wdate = to.getWdate();
				String hit = to.getHit();
				int wgap = to.getWgap();
				
				sb.append("<tr>");
				sb.append("<td>&nbsp;</td>");
				sb.append("<td>"+ seq +"</td>");
				
				// wgap에 따른 new 태그 없애기
				sb.append("<td class='left'>");
				sb.append("<a href='view.do?seq=" + seq +"'>"+ subject +"");
				if(wgap == 0){
				sb.append("</a>&nbsp;<img src='./images/icon_new.gif' alt='NEW'>");
				}
				sb.append("</td>");
				
				sb.append("<td>"+ writer +"</td>");
				sb.append("<td>"+ wdate +"</td>");
				sb.append("<td>"+ hit +"</td>");
				sb.append("<td>&nbsp;</td>");
				sb.append("</tr>");
			
			}

    %>
    
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="./css/board.css">
</head>

<body>
<!-- 상단 디자인 -->
<div class="con_title">
	<h3>게시판</h3>
	<p>HOME &gt; 게시판 &gt; <strong>게시판</strong></p>
</div>
<div class="con_txt">
	<div class="contents_sub">
		<div class="board_top">
			<div class="bold">총 <span class="txt_orange"><%= totalRecord %></span>건</div>
		</div>

		<!--게시판-->
		<div class="board">
			<table>
			<tr>
				<th width="3%">&nbsp;</th>
				<th width="5%">번호</th>
				<th>제목</th>
				<th width="10%">글쓴이</th>
				<th width="17%">등록일</th>
				<th width="5%">조회</th>
				<th width="3%">&nbsp;</th>
				
				
			</tr>
			<!--내용시작-->
			<%= sb.toString() %>
			<!--내용 끝-->
			</table>
		</div>	

		<div class="btn_area">
			<div class="align_right">
				<input type="button" value="쓰기" class="btn_write btn_txt01" style="cursor: pointer;" onclick="location.href='./write.do'" /> <!--jsp 호출이 아닌 경로를 불러야함-->
			</div>
		</div>
		<!--//게시판-->
	</div>
</div>
<!--//하단 디자인 -->

</body>
</html>