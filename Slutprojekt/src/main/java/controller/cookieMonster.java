package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.GettheWeather;
import model.weatherBean;

/**
 * Servlet implementation class cookieMonster
 */
@WebServlet("/cookieMonster")
public class cookieMonster extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public cookieMonster() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Cookie ck[] = request.getCookies();
		// for loop i request.getCookies()
		for (int i = 0; i < ck.length; i++) {

			// if ck = cname printa "searchHistory"
			if (ck[i].getName().equals("searchHistory")) {
				System.out.println(ck[i].getName());

				System.out.println(ck[i].getValue());

				// printar tidigare sökning
				weatherBean wBean = new weatherBean(ck[i].getValue(), "se");

				GettheWeather.getWeather(wBean);

				request.setAttribute("wBean", wBean);

				RequestDispatcher rd = request.getRequestDispatcher("showWeather.jsp");
				rd.forward(request, response);

			}

		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}