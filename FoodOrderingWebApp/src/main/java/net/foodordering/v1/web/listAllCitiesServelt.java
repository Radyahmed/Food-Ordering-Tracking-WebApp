package net.foodordering.v1.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.FoodOrdering.v1.bll.FoodOrderingBLGateway;
import net.foodordering.v1.common.bean.CityBean;

public class listAllCitiesServelt extends HttpServlet {

    private static final long serialVersionUID = 3963174047181328354L;

    private FoodOrderingBLGateway foodOrderingBLGateway = new FoodOrderingBLGateway();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	response.setContentType("text/html;charset=UTF-8");
	try (PrintWriter out = response.getWriter()) {
	    List<CityBean> findListOfCities = foodOrderingBLGateway.findListOfCities();
	    out.println("<!DOCTYPE html>");
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<title>Servlet listAllCitiesServelt</title>");
	    out.println("</head>");
	    out.println("<body>");
	    out.println("<table border=1>");
	    out.println("<tr>");
	    out.println("<th>Name</th>");
	    out.println("<th>ID</td>");
	    out.println("</tr>");
	    for (CityBean findListOfCity : findListOfCities) {
		out.println("<tr>");
		out.println("<td>" + findListOfCity.getNameEn()+ "</td>");
		out.println("<td>" + findListOfCity.getId() + "</td>");
		out.println("</tr>");
	    }
	    out.println("</table>");
	    out.println("</body>");
	    out.println("</html>");
	}
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	//	processRequest(request, response);
	response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED);

    }

    @Override
    public String getServletInfo() {
	return "Short description";
    }

}
