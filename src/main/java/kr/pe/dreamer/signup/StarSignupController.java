package kr.pe.dreamer.signup;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StarSignupController {
	private static final Logger logger = Logger.getLogger(StarSignupController.class);

	@RequestMapping(value = "/signup.star", method = RequestMethod.POST)
	public @ResponseBody StarBooleanResult init(@RequestBody StarSignupDTO dto) {
		System.out.println("init called!!!");
		System.out.println(dto.getInputId());
		System.out.println(dto.getInputName());
		System.out.println(dto.getInputPassword());
		System.out.println(dto.getInputPhone());
		return null;
	}
}
