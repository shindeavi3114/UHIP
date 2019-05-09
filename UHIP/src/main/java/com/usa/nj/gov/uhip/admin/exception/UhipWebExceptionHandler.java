package com.usa.nj.gov.uhip.admin.exception;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.usa.nj.gov.uhip.admin.constant.AppConstant;

/**
 * HERE,HANDLING ALL EXCEPTION AND SENDING THE MESSAGE
 * @author Avinash
 *
 */
@Controller
@ControllerAdvice
public class UhipWebExceptionHandler {
	@ExceptionHandler(value = { AdminExceptin.class })
	public String handlerException(Model model) {
		model.addAttribute(AppConstant.ERROR, AppConstant.ERROR_MESSAGE);

		return "error";

	}
}
