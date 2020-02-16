package com.trainingbasket.javaee.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class InitListner implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent context) {

	}

	@Override
	public void contextInitialized(ServletContextEvent context) {
		// Code to read a Files Data
		try {
			List<String> seasons = Files
					.readAllLines(Paths.get(context.getServletContext().getRealPath("contextData")));
			context.getServletContext().setAttribute("seasons", seasons);
			seasons.forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		//Code to read a File Path
		// System.out.println(Paths.get(context.getServletContext().getRealPath("contextData")));
		
		
		// System.out.println(context.getServletContext().getContextPath() +
		// "contextData");
	}

}
