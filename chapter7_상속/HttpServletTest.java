package chapter7_상속;

public class HttpServletTest {
	public static void main(String[] args) {
		LoginServlet loginServlet = new LoginServlet();

		loginServlet.service();

		FileDownloadServlet fileDownloadServlet = new FileDownloadServlet();
		fileDownloadServlet.service();
	}
}
