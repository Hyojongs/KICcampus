package config;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import model1.BoardDAO;
import model1.BoardTO;

// 컨트롤러로 쓰겠다는 어노테이션
@Controller
public class ConfigController1 {

	// list1.do 호출시
	@RequestMapping("/list.do")
	public ModelAndView listAction(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
    	BoardDAO dao = new BoardDAO();
    	ArrayList<BoardTO> datas = dao.boardList();

        ModelAndView modelandView = new ModelAndView();
        modelandView.setViewName("board_list1");
        modelandView.addObject("datas", datas);
    	

		return modelandView;
	}

	@RequestMapping("/write.do")
	public ModelAndView writeAction(HttpServletRequest request, HttpServletResponse response){
		// TODO Auto-generated method stub

        ModelAndView modelandView = new ModelAndView();
        modelandView.setViewName("board_write1");
    	

		return modelandView;
	}

	@RequestMapping("/write_ok.do")
	public ModelAndView writeOkAction(HttpServletRequest request, HttpServletResponse response){
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

	@RequestMapping("/view.do")
	public ModelAndView viewAction(HttpServletRequest request, HttpServletResponse response){
		// TODO Auto-generated method stub
		BoardTO to = new BoardTO();
		
		// 파라미터로 받은 seq를 to에 set하기
		to.setSeq(request.getParameter("seq"));
		
		BoardDAO dao = new BoardDAO();
		to = dao.boardView(to);

        ModelAndView modelandView = new ModelAndView();
        modelandView.setViewName("board_view1");
        modelandView.addObject("datas", to);
    	

		return modelandView;
	}

	@RequestMapping("/delete.do")
	public ModelAndView deleteAction(HttpServletRequest request, HttpServletResponse response){
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

	@RequestMapping("/delete_ok.do")
	public ModelAndView deleteOkAction(HttpServletRequest request, HttpServletResponse response){
		// TODO Auto-generated method stub

		BoardTO to = new BoardTO();
		to.setSeq(request.getParameter("seq"));
		to.setPassword(request.getParameter("password"));
		
		BoardDAO dao = new BoardDAO();
		int flag = dao.boardDeleteOk(to);

        ModelAndView modelandView = new ModelAndView();
        modelandView.setViewName("board_delete_ok");

        modelandView.addObject("flag", flag);

		return modelandView;
	}

	@RequestMapping("/modify.do")
	public ModelAndView modifyAction(HttpServletRequest request, HttpServletResponse response){
		// TODO Auto-generated method stub

		BoardTO to = new BoardTO();
		to.setSeq(request.getParameter("seq"));
		System.out.println(request.getParameter("seq"));
		BoardDAO dao = new BoardDAO();
		to = dao.boardModify(to);

		request.setAttribute("datas", to);

        ModelAndView modelandView = new ModelAndView();
        modelandView.setViewName("board_modify1");

        modelandView.addObject("datas", to);

		return modelandView;
	}

	@RequestMapping("/modify_ok.do")
	public ModelAndView modifyOkAction(HttpServletRequest request, HttpServletResponse response){
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
