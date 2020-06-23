import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "AddEquipment", urlPatterns = {"/add"})
public class AddEquipmentServlet extends HttpServlet {

        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String imie = req.getParameter("imie");
            String nazwisko = req.getParameter("nazwisko");
            String odp = new Run().Run(imie,nazwisko);
            resp.getWriter().write(odp);
        }
    }

