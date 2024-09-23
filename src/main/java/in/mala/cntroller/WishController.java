package in.mala.cntroller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class WishController {
	
	
	
		@GetMapping("/wish")
		@ResponseBody
		public String getGreetMsg()
		{
			String msgtxt="All the bext.....";
			
			return "msgtxt";
		}

	}


