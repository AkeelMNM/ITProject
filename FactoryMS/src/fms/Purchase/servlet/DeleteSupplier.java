package fms.Purchase.servlet;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import fms.Purchase.service.SupplierService;
import fms.Purchase.service.SupplierServiceImpt;

/**
 * Servlet implementation class DeleteSupplier
 */
@WebServlet("/DeleteSupplier")
public class DeleteSupplier extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteSupplier() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		response.setContentType("text/html");

		String SupID = request.getParameter("SupplierID");			
		
		SupplierService supplierService = new SupplierServiceImpt();
		supplierService.removeSupplier(SupID);

	
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Interfaces/Purchase/Add_TeaLeaf_Suppliers.jsp");
		dispatcher.forward(request, response);
		
	
	}

}
