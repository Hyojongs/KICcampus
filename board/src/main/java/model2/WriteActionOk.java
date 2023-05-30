package model2;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import model1.BoardDAO;
import model1.BoardTO;

public class WriteActionOk implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub

		BoardTO to = new BoardTO();
	    
	    to.setSubject(request.getParameter("subject")) ;
	    to.setWriter(request.getParameter("writer"));
	    
	    String mail = "";
	    if(!request.getParameter("mail1").equals("") && !request.getParameter("mail2").equals("")){
		    to.setMail( request.getParameter("mail1") + "@" + request.getParameter("mail2"));
	    }
	    to.setPassword(request.getParameter("password"));
	    to.setContent(request.getParameter("content"));
	    
	    to.setWip(request.getRemoteAddr());

	    BoardDAO dao = new BoardDAO();
	    int flag = dao.boardWriteOk(to);

        ModelAndView modelandView = new ModelAndView();
        modelandView.setViewName("board_write_ok");

        modelandView.addObject("flag", flag);

		return modelandView;
	}

}
