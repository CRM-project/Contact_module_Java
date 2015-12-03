package net.bonvio.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/main/")
public class MainController {

    /**
     *
     * @param view
     * @return hello
     */
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getMainView(ModelAndView view) {

        view.setViewName("index");

        return view;
    }

//
//
//	@ExceptionHandler
//	@ResponseBody
//	public String see(Exception e) {
//
//		System.out.println("e=" + e.getLocalizedMessage() + "    " + e.getMessage() + "   " + e.toString());
//
//		return e.getLocalizedMessage();
//	}



}