package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/student")
public class StudentServlet extends HttpServlet {

    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        response.getWriter().println(
                "<h1>This is GET request</h1>"
        );

        response.getWriter().println(
                "<p>doGet() method is executed</p>"
        );
    }


    @Override
    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        // Get data from HTML form

        String name =
                request.getParameter("name");

        String age =
                request.getParameter("age");


        // Send response

        response.setContentType("text/html");

        response.getWriter().println(
                "<h1>Student Details</h1>"
        );

        response.getWriter().println(
                "<p>Name: " + name + "</p>"
        );

        response.getWriter().println(
                "<p>Age: " + age + "</p>"
        );

        response.getWriter().println(
                "<h3>Student registered successfully!</h3>"
        );
    }
}