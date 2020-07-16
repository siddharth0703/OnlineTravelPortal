package AdminServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import AdminDao.ADao;

public class UserLoginFilter implements Filter {

	public UserLoginFilter() {
		// TODO Auto-generated constructor stub
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("-----FIlter Initialised-----------------");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		PrintWriter out=response.getWriter();
		HttpServletRequest hreq=(HttpServletRequest)request;
		HttpServletResponse hres=(HttpServletResponse)response;
		String name = request.getParameter("user");
		String password = request.getParameter("pass");
		ADao a=new ADao();
		String pass=a.doGetCredentialsforUser(name);
		System.out.println(password);
		
		if ((password.equals(pass))) {
			System.out.println("Welcome to our website");
			HttpSession session=hreq.getSession();
			session.setAttribute("user", name);
			chain.doFilter(request, response);
		}else{
			
			System.out.println("Please Enter Valid Username/Password");
			System.out.println("welcome gbhmy");
			RequestDispatcher rd=request.getRequestDispatcher("loginUser.jsp");
			rd.include(request, response);
			out.println("<center><font color='red'><h1>Please Enter Valid Username/Password</h1></font></center>");
		}
		
	}

	public void destroy() {
		System.out.println("-----FIlter Destroyed-----------------");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */

}
