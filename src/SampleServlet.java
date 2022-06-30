import dto.FormRequestDto;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SampleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("SampleServlet doGet.");

        FormRequestDto formRequestDto = (FormRequestDto) req.getAttribute("formRequestDto");

        // Query Parameter 생성
        StringBuilder url = new StringBuilder("detail.html?")
                            .append("name=").append(formRequestDto.getName())
                            .append("&age=").append(formRequestDto.getAge())
                            .append("&sex=").append(formRequestDto.getSex());
        for (String h : formRequestDto.getHobbies()) {
            url.append("&hobby=").append(h);
        }

        System.out.println("url = " + url);

        req.getRequestDispatcher(url.toString()).forward(req, resp);
    }
}
