package in.mala;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecondController {
	@GetMapping("/best")
	public ModelAndView getWishMsg()
	{
		
		ModelAndView mav= new ModelAndView();
		mav.addObject("wish","All theBestss......");
		mav.setViewName("wish");
		return mav;
	}
}
