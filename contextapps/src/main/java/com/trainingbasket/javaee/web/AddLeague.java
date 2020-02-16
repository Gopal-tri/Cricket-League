package com.trainingbasket.javaee.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.trainingbasket.javaee.modal.LeagueModal;

/**
 * Servlet implementation class AddLeague
 */
@WebServlet(urlPatterns = "/addleague")
public class AddLeague extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/addleague.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int year = 0;
		List<String> errMsg = new ArrayList<String>();
		String season = request.getParameter("season");
		String title = request.getParameter("title");
		try {
			year = Integer.parseInt(request.getParameter("year"));
		} catch (Exception e) {
			errMsg.add("Please add valid Year" + e.getMessage());
		}
		if (year < 2020) {
			errMsg.add("Year cann't be less than current year");
		}
		if (season.equals("")) {
			errMsg.add("Season cann't be blank");
		}
		if (title.equals("") || title == null) {
			errMsg.add("Title cann't be blank");
		}
		RequestDispatcher dispatcher = null;
		if (errMsg.isEmpty()) {
			LeagueModal league = new LeagueModal();
			HashSet<LeagueModal> leagues = (HashSet<LeagueModal>) getServletContext().getAttribute("leagues");
			if (leagues == null) {
				leagues = new HashSet<LeagueModal>();
				league.setSeason(season);
				league.setTitle(title);
				league.setYear(year);
				leagues.add(league);
				getServletContext().setAttribute("leagues", leagues);
			} else {
				league.setSeason(season);
				league.setTitle(title);
				league.setYear(year);
				leagues.add(league);
				getServletContext().setAttribute("leagues", leagues);
			}
			dispatcher = request.getRequestDispatcher("/views/listleague.jsp");
			request.setAttribute("msg", "League has been added" + league);
		} else {
			dispatcher = request.getRequestDispatcher("/views/addleague.jsp");
			request.setAttribute("errMsg", errMsg);
		}

		
		dispatcher.forward(request, response);
	}

}
