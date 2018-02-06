package net.codejava.spring.controller;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Đây là trang Load hình ảnh lên Server.
 * 
 * @author DungLT-05/03/2017
 * 
 */
@MultipartConfig(maxFileSize = 16177215)	// upload file's size up to 16MB
@Controller
public class UploadController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String dbURL = "jdbc:mysql://localhost:3306/AppDB";
	private String dbUser = "root";
	private String dbPass = "";

    @RequestMapping(value = "/upload", method = RequestMethod.GET)
    public ModelAndView getUpload(ModelAndView model) {

        model.setViewName("admins/Upload");
        return model;
    }

//    @RequestMapping(value = "/uploadServlet", method = RequestMethod.POST)
//    public ModelAndView doUpload(ModelAndView model, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//    	String firstName = request.getParameter("firstName");
//		String lastName = request.getParameter("lastName");
//		InputStream inputStream = null;	// input stream of the upload file
//
//		// obtains the upload file part in this multipart request
//		Part filePart = request.getPart("photo");
//		if (filePart != null) {
//			// prints out some information for debugging
//			System.out.println(filePart.getName());
//			System.out.println(filePart.getSize());
//			System.out.println(filePart.getContentType());
//			
//			// obtains input stream of the upload file
//			inputStream = filePart.getInputStream();
//		}
//		
//		Connection conn = null;	// connection to the database
//		String message = null;	// message will be sent back to client
//		
//		try {
//			// connects to the database
//			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//			conn = DriverManager.getConnection(dbURL, dbUser, dbPass);
//
//			// constructs SQL statement
//			String sql = "INSERT INTO contacts (first_name, last_name, photo) values (?, ?, ?)";
//			PreparedStatement statement = conn.prepareStatement(sql);
//			statement.setString(1, firstName);
//			statement.setString(2, lastName);
//			
//			if (inputStream != null) {
//				// fetches input stream of the upload file for the blob column
//				statement.setBlob(3, inputStream);
//			}
//			// sends the statement to the database server
//			int row = statement.executeUpdate();
//			if (row > 0) {
//				message = "File uploaded and saved into database";
//			}
//		} catch (SQLException ex) {
//			message = "ERROR: " + ex.getMessage();
//			ex.printStackTrace();
//		} finally {
//			if (conn != null) {
//				// closes the database connection
//				try {
//					conn.close();
//				} catch (SQLException ex) {
//					ex.printStackTrace();
//				}
//			}
//			// sets the message in request scope
//			request.setAttribute("Message", message);
//		}
//		
//        model.setViewName("admins/Message");
//        return model;
//    }
}
