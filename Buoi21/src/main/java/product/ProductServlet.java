package product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "productServlet", urlPatterns = {"/product"})
public class ProductServlet extends HttpServlet{

	@SuppressWarnings("unchecked")
	private List<Product> getProducts(){
		Object obj = getServletContext().getAttribute("products");
		if(obj == null) {
			List<Product> list = new ArrayList<Product>();
			getServletContext().setAttribute("products", list);
			return list;
		}
		return (List<Product>) obj;
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("products", getProducts());
		req.getRequestDispatcher("product.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8");
		
		String name = req.getParameter("name");
		String quantity1 = req.getParameter("quantity");
		String price1 = req.getParameter("price");
		
		String error = null;
		int quantity2 = 0;
		double price2 = 0;
		
		if(name == null || name.trim().isEmpty()) {
			error = "Tên sản phẩm không được để trống";
		}else {
			try {quantity2 = Integer.parseInt(quantity1);}
			catch (Exception e) {
				error = "Số lượng phải là số nguyên";}
			if(error == null) {
				try { price2 = Double.parseDouble(price1);}
				catch (Exception e) {
					error = "Giá bán phải là số ";
				}
			}
			if (error == null) {
	            if (quantity2 < 0) error = "Số lượng không được âm";
	            if (price2 < 0)    error = "Giá bán không được âm";
	        }
		}
		
		if(error != null) {
			req.setAttribute("error", error);
			req.setAttribute("name", name);
			req.setAttribute("quantity", quantity1);
			req.setAttribute("price", price1);
			req.setAttribute("products", getProducts());
			req.getRequestDispatcher("product.jsp").forward(req, resp);
			return;
		}
		getProducts().add(new Product(name.trim(),quantity2,price2));
		
		resp.sendRedirect(req.getContextPath() + "/product");
	}
	

}
