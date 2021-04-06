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
        ArrayList superArr = new ArrayList();
        ArrayList<Double> arrStart = new ArrayList();
        ArrayList<Double> arrFinish = new ArrayList();
        ArrayList<Double> arrStep = new ArrayList();
        try {
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
//            superArr.add(arrStart);

            UtilClass myClass = new UtilClass(arrStart, arrFinish, arrStep, formula);
            superArr = myClass.action(formula);
            request.setAttribute("superList", superArr);
//            request.getSession().setMaxInactiveInterval(60*48*60);
//            request.setAttribute("number",result);
//            request.setAttribute("a",arrStart);
//            request.getSession().setAttribute("a",a);
//            request.setAttribute("b",b);
//            request.setAttribute("c",c);
//            request.setAttribute("d",d);
        } catch (NumberFormatException e) {
            request.setAttribute("res2","Error");
        }

        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }

}