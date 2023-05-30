package model2;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import model1.BoardDAO;
import model1.BoardTO;

public class DeleteAction implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub

		BoardTO to = new BoardTO();
		to.setSeq(request.getParameter("seq"));
		System.out.println(request.getParameter("seq"));
		BoardDAO dao = new BoardDAO();
		to = dao.boardDelete(to);

		request.setAttribute("datas", to);

        ModelAndView modelandView = new ModelAndView();
        modelandView.setViewName("board_delete1");

        modelandView.addObject("datas", to);

		return modelandView;
	}

}
