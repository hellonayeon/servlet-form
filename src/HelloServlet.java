import dto.FormRequestDto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("HelloServlet doGet.");

        String name = req.getParameter("name");
        String age = req.getParameter("age");
        String sex = req.getParameter("sex");
        String[] hobbies = req.getParameterValues("hobby");

        FormRequestDto formRequestDto = new FormRequestDto(name, age, sex, hobbies);

        // [forward]
        req.setAttribute("formRequestDto", formRequestDto);
        RequestDispatcher dispatcher = req.getRequestDispatcher("sample");
        dispatcher.forward(req, resp);
    }

}
