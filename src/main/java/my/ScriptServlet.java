package my;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/hello", loadOnStartup = 1)
public class ScriptServlet extends HttpServlet {
    private java.util.logging.Logger logger = java.util.logging.Logger
            .getLogger(ScriptServlet.class.getName());


    @Override
    public void init(ServletConfig config) throws ServletException {
    	logger.info("initinig");
    	super.init(config);
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	logger.info("doGet");
    	super.doGet(req, resp);
    }
}