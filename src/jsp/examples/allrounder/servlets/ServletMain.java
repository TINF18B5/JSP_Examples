package jsp.examples.allrounder.servlets;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import jsp.examples.allrounder.beans.Bohne;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Date;

@WebServlet(name = "ServletMain", value = "/main")
public class ServletMain extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final Bohne bohne = new Bohne(request.getParameter("user_name"), request.getParameter("date"));

        request.setAttribute("unsere_bean", bohne);

        if (bohne.isValid()) {
            final RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/allrounder/Result.jsp");
            requestDispatcher.forward(request, response);
        } else {
            response.getWriter().write("INVALID");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/allrounder/Form.jsp").forward(request, response);
    }
}
