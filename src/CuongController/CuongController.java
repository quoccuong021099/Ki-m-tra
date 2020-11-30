package CuongController;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CuongBean.Cuongbean;
import CuongBo.Cuongbo;

@WebServlet("/CuongController")
public class CuongController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public CuongController() {
        super();
    }
	
	Cuongbo cbo = new Cuongbo();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			request.setCharacterEncoding("utf-8"); //lâìy dýÞ lên bãÌng unicode
			response.setCharacterEncoding("utf-8"); //lâìy dýÞ liêòu vêÌ bãÌng unicode
			String key = request.getParameter("txttk");
			ArrayList<Cuongbean> dscuong = Cuongbo.getcuong();
			if(key != null)
				request.setAttribute("cuong1", cbo.TimTin(key));
				
			else
				request.setAttribute("cuong1", dscuong);
			RequestDispatcher rd = request.getRequestDispatcher("Tintuc.jsp");
			rd.forward(request, response);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
