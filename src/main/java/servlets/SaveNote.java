package servlets;
import entity.Note;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet(name = "save", value = "/saveNote")
public class SaveNote extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try{
            String title = req.getParameter("title");
            String content = req.getParameter("content");

            Note note = new Note(title, content, new Date());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
