package chapter7_상속;

public class LoginServlet extends HttpServlet {
	@Override
	public void service() {
		System.out.println("로그인합니다.");
	}

}
