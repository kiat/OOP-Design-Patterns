package edu.bu.met.cs665.webexample;

import edu.bu.met.cs665.webexample.models.Teacher;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
    name = "TeacherServlet",
    urlPatterns = "/teacher-record")
public class TeacherServletController extends HttpServlet {
  /*
   * TeacherServletController
   * Handling transporting models to the client to be rendered on front end
   * */

  /** Method to handle processing http request
   * @param request what will be sent to the server
   * @param response what will be recieved from the server
   * */
  private void processRequest(
      HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    // will get the teacher ID based on the request

    Teacher teacher1 = new Teacher(1, "Josh", "Samuels", "Math");
    Teacher teacher2 = new Teacher(2, "Sarah", "Silverman", "History");
    Teacher teacher3 = new Teacher(3, "Isarel", "Adens", "sports");

    ArrayList<Teacher> teachers = new ArrayList<>(Arrays.asList(teacher1, teacher2, teacher3));

    request.setAttribute("teachers", teachers);

    RequestDispatcher dispatcher = request.getRequestDispatcher(
        "/WEB-INF/jsp/teacher-record.jsp");
    dispatcher.forward(request, response);
  }

  @Override
  protected void doGet(
      HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    processRequest(request, response);
  }

  @Override
  protected void doPost(
      HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    processRequest(request, response);
  }
}
