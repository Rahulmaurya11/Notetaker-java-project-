package com.servlets;
import java.io.IOException;

import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Entites.*;
import Factory.FactoryProvider;

public class SavenoteServlet extends HttpServlet {
	
    public SavenoteServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    try {
    	String t = request.getParameter("title");
    	String c = request.getParameter("content");
    	 
    	Note note = new Note(t, c, new Date());
    	System.out.println(+note.getId()+" "+note.getTitle()+"  "+note.getContent());
Session session= FactoryProvider.getFactory().openSession();
Transaction tx= session.beginTransaction();
session.save(note);
tx.commit();
session.close();

response.setContentType("text/html");
 PrintWriter out = response.getWriter();
 out.println(" <h1 style = 'text -align:center '> Note is added successfully  </h1> ");
 
 
		
	} catch (Exception e) {
			
	e.printStackTrace();
	
	}    
    }   
}
