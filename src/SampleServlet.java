import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class SampleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("SampleServlet doGet.");

        resp.setContentType("text/html; charset=utf-8");

        PrintWriter pw = resp.getWriter();

        pw.println("<html>");

        pw.println("<head>");
        pw.println("<title>제목</title>");
        pw.println("</head>");

        pw.println("<body>");

        // [ Forward (Request Attribute) ]
        String name = req.getParameter("name");
        String age = req.getParameter("age");
        String sex = req.getParameter("sex");
        String[] hobbies = req.getParameterValues("hobby");

        pw.println("<p>이름: " + name + "</p>");
        pw.println("<p>연령대: " + age + "</p>");
        pw.println("<p>성별: " +sex + "</p>");
        pw.println("<p>취미: " + Arrays.toString(hobbies) + "</p>");

        pw.println("</body>");

        pw.println("</html>");
        pw.close();
    }
}
