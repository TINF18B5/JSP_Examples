package jsp.examples.allrounder.servlets;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletData", value = "/data")
public class ServletData extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doPost(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final Gson gson = new GsonBuilder().create();

        final MyData myData = new MyData(100, "myName", "Hallo", "Welt", "Abc");


        response.getWriter().println(gson.toJson(myData));
    }


    private static final class MyData {
        @Expose(serialize = false)
        private final int a;
        private final String name;
        private final String[] values;

        private MyData(int a, String name, String... values) {
            this.a = a;
            this.name = name;
            this.values = values;
        }
    }
}
