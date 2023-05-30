<!--write1_ok-->
<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="javax.naming.Context" %>
    <%@ page import="javax.naming.InitialContext" %>

    <!-- dao와 to import 시키기 -->
    <%@ page import="model1.BoardTO" %>
    <%@ page import="model1.BoardDAO" %>
    
    
    <%
        int flag = (Integer)request.getAttribute("flag");
        
        
        // return 된 값으로 글 작성하기
        out.println("<script type=''text/javascript>");
        if(flag == 0){
            out.println("alert('글쓰기 성공');");
            out.println("location.href='list.do';");
        } else {
            out.println("alert('글쓰기 실패');");
            out.println("history.back();");
        }
        out.println("</script>");
    %>