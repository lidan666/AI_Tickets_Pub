package AIETickets.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
@RequestMapping("login")
public class LoginController {
	@RequestMapping("index")
	public String login(HttpServletRequest request,HttpServletResponse response,Model model){
		return "AI/layout";
	}
	@RequestMapping("register")
	public String register(HttpServletRequest request,HttpServletResponse response,Model model){
		return "AI/register";
	}
}
