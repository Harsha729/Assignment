package com.project.serch;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) {

		SearchContext context;
		ResultSet searchresults;
		String searchname = request.getParameter("search");
		// System.out.println("Searchname is :" + searchname);
		String searchtype = request.getParameter("select");
		// System.out.println("search type is :" + searchtype);
		if (searchtype.equals("bookname")) {
			context = new SearchContext(new BookSearch());
			searchresults = context.executeSearch(searchname, searchtype);
			try {
				// System.out.println("In Search :");
				// while(searchresults.next()){
				// System.out.println("In Book Search :");
				// try{
				String bookname = searchresults.getString("bookname");
				int id = searchresults.getInt("category_id");
				int rating = searchresults.getInt("rating");

				// System.out.println("VALUES ARE" + bookname + id + rating);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		else if (searchtype.equals("isbn")) {
			context = new SearchContext(new IsbnSearch());
			searchresults = context.executeSearch(searchname, searchtype);
			try {
				String bookname = searchresults.getString("bookname");
				// System.out.println("VALUES ARE" + bookname);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		else if (searchtype.equals("name")) {
			context = new SearchContext(new NameSearch());
			searchresults = context.executeSearch(searchname, searchtype);
			request.setAttribute("resultset",searchresults );
			try {
				String bookname = searchresults.getString("username");
				System.out.println("VALUES ARE" + bookname);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				response.sendRedirect("NameDetails.jsp");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			context = new SearchContext(new NullSearch());
			searchresults = context.executeSearch(searchname, searchtype);
			System.out.println("In Null Search");
			try {
				String bookname = searchresults.getString("returnstring");
				System.out.println("VALUES ARE" + bookname);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
