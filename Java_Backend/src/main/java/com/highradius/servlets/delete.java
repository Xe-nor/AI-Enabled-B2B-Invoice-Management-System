package com.highradius.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.highradius.connection.DbConnect;
import com.highradius.implementation.invdao;

@WebServlet("/delete")
public class delete extends HttpServlet {
    private static final long serialVersionUID = -5994472927284660281L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	 response.setHeader("Access-Control-Allow-Origin", "*"); // Allow requests from any origin
	     response.setHeader("Access-Control-Allow-Methods", "GET"); // Allow only GET requests
	     response.setHeader("Access-Control-Allow-Headers", "Content-Type"); // Allow only Content-Type header
        String sln = request.getParameter("slno");
        try {
            invdao dao = new invdao(DbConnect.getConn());
            HttpSession session = request.getSession();
            boolean f = dao.delete(sln);
            if (f) {
                session.setAttribute("succMSG", "Deleted SUCCESSFULLY");
                response.setStatus(HttpServletResponse.SC_OK);
            } else {
                session.setAttribute("erroMSG", "UNSUCCESSFUL");
                response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        }
    }
}
