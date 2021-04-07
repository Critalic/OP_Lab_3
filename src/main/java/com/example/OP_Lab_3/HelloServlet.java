package com.example.OP_Lab_3;

import java.io.*;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/helloServlet")
public class HelloServlet extends HttpServlet {


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int formula;
        ArrayList<ArrayList> superArr = new ArrayList<>();
        ArrayList<Double> arrStart = new ArrayList<>();
        ArrayList<Double> arrFinish = new ArrayList<>();
        ArrayList<Double> arrStep = new ArrayList<>();
        HttpSession session=request.getSession();
        try { // get parameters
            arrFinish.add(Double.parseDouble(request.getParameter("aTo")));
            arrFinish.add(Double.parseDouble(request.getParameter("bTo")));
            arrFinish.add(Double.parseDouble(request.getParameter("cTo")));
            arrFinish.add(Double.parseDouble(request.getParameter("dTo")));

            arrStep.add(Double.parseDouble(request.getParameter("aStep")));
            arrStep.add(Double.parseDouble(request.getParameter("bStep")));
            arrStep.add(Double.parseDouble(request.getParameter("cStep")));
            arrStep.add(Double.parseDouble(request.getParameter("dStep")));

            arrStart.add(Double.parseDouble(request.getParameter("aFrom")));
            arrStart.add(Double.parseDouble(request.getParameter("bFrom")));
            arrStart.add(Double.parseDouble(request.getParameter("cFrom")));
            arrStart.add(Double.parseDouble(request.getParameter("dFrom")));
            formula =Integer.parseInt( request.getParameter("formula"));

            UtilClass myClass = new UtilClass(arrStart, arrFinish, arrStep, formula); // call UtilClass and get array as answer
            superArr = myClass.action(formula);
            request.setAttribute("superList", superArr);

            session.setMaxInactiveInterval(60*48*60); // set a session to save the table values
            session.setAttribute("superList", superArr);
            String [] letter = {"a", "b", "c", "d"};
            for (int i = 0; i < arrFinish.size(); i++) {
                session.setAttribute(letter[i] + "To", arrFinish.get(i));

                session.setAttribute(letter[i] + "From", arrStart.get(i));

                session.setAttribute(letter[i] + "Step", arrStep.get(i));
            }

        } catch (NumberFormatException e) {
            ArrayList arr = new ArrayList();
            arr.add("Error");
            arr.add("Error");
            arr.add("Error");
            arr.add("Error");
            arr.add("Error");

            superArr.add(arr);
            request.setAttribute("superList", superArr);
        }

        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }

}