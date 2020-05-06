package edu.mum.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import edu.mum.exception.UploadImageError;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.mum.domain.Employee;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Controller
public class EmployeeController {

	private static final Log logger = LogFactory.getLog(EmployeeController.class);

	@RequestMapping(value = { "/", "employee_input" })
	public String inputEmployee(@ModelAttribute("employee") Employee employee) {
		return "EmployeeForm";
	}

	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public String saveEmployee(@Valid @ModelAttribute("employee") Employee emp, BindingResult bindingResult,
			Model model, HttpServletRequest request) {
		
		if (bindingResult.hasErrors()) {
			return "EmployeeForm";
		}

		String[] suppressedFields = bindingResult.getSuppressedFields();
		if (suppressedFields.length > 0) {
			throw new RuntimeException("Attempt to bind fields that haven't been allowed in initBinder(): "
					+ StringUtils.addStringToArray(suppressedFields, ", "));
		}


		MultipartFile employeeImage = emp.getEmployeeImage();
		String rootDirectory = request.getSession().getServletContext().getRealPath("/");
		if (employeeImage != null && !employeeImage.isEmpty()) {
			try {

				employeeImage.transferTo(
						new File(rootDirectory + "resources\\images\\ a.png"));

			} catch (Exception e) {
				throw new UploadImageError("Employee Image saving failed");
			}
		}

		// save product here
		model.addAttribute("employee", emp);

		return "EmployeeDetails";
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		// binder.setDisallowedFields(new String[]{"firstName"});
	}
}
