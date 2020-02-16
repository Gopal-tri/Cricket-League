package com.trainingbasket.javaee.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.trainingbasket.javaee.modal.LeagueModal;
import com.trainingbasket.javaee.modal.MyDate;
import com.trainingbasket.javaee.modal.Player;

/**
 * Servlet implementation class RegisterLeague
 */
@WebServlet(urlPatterns = "/registerleague")
public class RegisterLeague extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterLeague() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/registerleague.jsp");
		List<LeagueModal> leagues = (List<LeagueModal>) getServletContext().getAttribute("leagues");
		dispatcher.forward(request, response);
	}

	List<String> errMsg;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String dob = request.getParameter("dob");
		String contact = request.getParameter("contact");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		String league = request.getParameter("leagues");
		String male = request.getParameter("male");
		String female = request.getParameter("female");

		validateData(name, dob, contact, email, address, league);
		Player player = new Player();
		MyDate myDate = new MyDate();

		String dobdash[] = dob.split("-");
		String dobslash[] = dob.split("/");

		if (dobdash.length == 3) {
			myDate.setDate(Integer.parseInt(dobdash[0]));
			myDate.setMonth(Integer.parseInt(dobdash[1]));
			myDate.setYear(Integer.parseInt(dobdash[2]));
		} else if (dobslash.length == 3) {
			myDate.setDate(Integer.parseInt(dobslash[0]));
			myDate.setMonth(Integer.parseInt(dobslash[1]));
			myDate.setYear(Integer.parseInt(dobslash[2]));
		}
		player.setDob(myDate);

		String leaguefromui[] = league.split("-");
		LeagueModal leagueModal = new LeagueModal();
		// leagueModal.setId(Integer.parseInt(leaguefromui[0]));
		leagueModal.setTitle(leaguefromui[0]);
		leagueModal.setSeason(leaguefromui[1]);
		leagueModal.setYear(Integer.parseInt(leaguefromui[2].trim()));
		if (male != null) {
			player.setGender("male");
		}
		if (female != null) {
			player.setGender("female");
		}
		if (errMsg.size() != 0) {

		} else {
			player.setName(name);
			player.setContact(contact);
			player.setAddress(address);
			player.setEmail(email);
			player.setLeague(leagueModal);
		}
		//System.out.println(player);
	}

	private void validateData(String name, String dob, String contact, String email, String address, String league) {
		errMsg = new ArrayList<String>();

		if (name.equals("") || name == null) {
			errMsg.add("Name can not be Empty");
		}
		if (contact.equals("") || contact == null) {
			errMsg.add("Contact can not be Empty");
		}
		if (dob.equals("") || dob == null) {
			errMsg.add("Date Of Birth can not be Empty");
		}
		if (address.equals("") || address == null) {
			errMsg.add("Address can not be Empty");
		}
		if (email.equals("") || email == null) {
			errMsg.add("Email can not be Empty");
		}
		if (league.equals("") || league == null) {
			errMsg.add("League can not be Empty");
		}

	}

}
