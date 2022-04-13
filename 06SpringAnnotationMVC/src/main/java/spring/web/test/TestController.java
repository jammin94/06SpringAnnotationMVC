package spring.web.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/*
 * FileName : TestController.java
 * -1EA�� Controller ��� �ټ��� Request ó�� :: @RequestMapping
 * -@RequestMapping ����� Method �� �پ��� ����
 * -@ �� ������ Servlet API�� ���Ͽ� ��������
 */
@Controller
public class TestController {

	///Field
	
	///Constructor
	public TestController() {
		System.out.println(":: TestController default Constructor call");
	}
	
	//==>Ư�� interface�� �������� �������� OverRiding�� Method�� ����.
	@RequestMapping("/testView01.do")
	public ModelAndView testView01() {
		System.out.println("[ testView01() start....]");//<==������
		
		//ViewName ���� ���� ModelAndView ��ü Return
		return new ModelAndView("/test/testView.jsp");
	}
	
	//==> Ư�� interface�� �������� �������� OverRiding�� Method �� ����.
	//==> return DataType�� Fix �Ǿ����� �ʴ�.
	@RequestMapping("/testView02.do")
	public String testView02() {
		System.out.println("[testView02() start....]");//<==������
		
		//viewName �� ���� String Return
		return "/test/testView.jsp";
	}
	
	@RequestMapping("/testView03.do")
	public String testView03( @RequestParam("abc") int no,
									@RequestParam("def") String name) {
		System.out.println("[ testView03() start....]");//<==������
		
		//==> Servlet API �� �̿��� Client Data ó���ϱ⸦ �����ϸ�..
		//==> @~~ ������ �����ϸ�...
		//int no = Integer.parseInt(request.getParameter("abc"));
		//String name = request.getParameter("def")
		
		System.out.println("no:" +no+"=== name:" +name);
		//viewName �� ���� String Return
		return "/test/testView.jsp";
	}
	
	@RequestMapping("/testView04.do")
	public String testView04( @RequestParam(value="abc") int no,
								 @RequestParam(value="def",required=false) String name) {
		System.out.println("[ testView04() start....]");//<==������
		
		System.out.println("no:" +no+"=== name:" +name);
		
		//viewName �� ���� String Return
		return "/test/testView.jsp";
	}
	
	@RequestMapping("/testView05.do")
	public String testView05( @RequestParam(value="abc") int no,
			 						@RequestParam(value="def",required=false) String name) {
		System.out.println("[ testView04() start....]");//<==������

		System.out.println("no:" +no+"=== name:" +name);

		//viewName �� ���� String Return
		return "/test/testView.jsp";
	}	
}//end of class
	
