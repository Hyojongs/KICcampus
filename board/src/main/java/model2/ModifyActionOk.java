package model2;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import model1.BoardDAO;
import model1.BoardTO;

public class ModifyActionOk implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		BoardTO to = new BoardTO();
		to.setSeq(request.getParameter("seq"));
		to.setPassword(request.getParameter("password"));
		to.setSubject(request.getParameter("subject"));
		to.setWriter(request.getParameter("writer"));
		to.setContent(request.getParameter("content"));
		to.setMail(request.getParameter("mail2") + "@" + request.getParameter("mail2"));
		
		BoardDAO dao = new BoardDAO();
		int flag = dao.boardModifyOk(to);

        ModelAndView modelandView = new ModelAndView();
        modelandView.setViewName("board_modify_ok");

        modelandView.addObject("flag", flag);

		return modelandView;
	}

}
