<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="javax.naming.Context" %>
    <%@ page import="javax.naming.InitialContext" %>
    <%@ page import="model1.BoardTO" %>
    <%@ page import="model1.BoardDAO" %>
    
    
<%
 
    int flag = (Integer)request.getAttribute("flag");
    

    
    out.println("<script type=''text/javascript>");
    if(flag == 0){
        out.println("alert('글수정 성공');");
        out.println("location.href='view.do?seq="+request.getParameter("seq")+"';");
    } else if(flag == 1){
        out.println("alert('비밀번호 오류');");
        out.println("history.back();");
    }else{
        out.println("alert('글수정 실패');");
        out.println("history.back();");
    }
    out.println("</script>");
%>