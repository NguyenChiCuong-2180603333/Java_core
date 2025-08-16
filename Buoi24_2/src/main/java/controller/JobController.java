package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Jobs;
import service.JobService;

@WebServlet(name = "jobController", urlPatterns = {"/job"})
public class JobController extends HttpServlet{

	private JobService jobService = new JobService();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		List<Jobs> listJobs = jobService.getAllJob();
		System.out.println("Danh sách " + listJobs.size());
		req.setAttribute("listJob", listJobs);
		req.getRequestDispatcher("groupwork.jsp").forward(req, resp);
	}

}
