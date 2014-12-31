package com.sample.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.servlet.view.RedirectView;

import com.sample.mvc.command.EmployeeCommand;
import com.sample.mvc.domain.Employee;
import com.sample.mvc.service.EmployeeService;

public class EmployeeAddController extends SimpleFormController{
	
	private EmployeeService employeeService;

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	/* 
	 * submit employee data
	 */
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		
		EmployeeCommand empCommand = (EmployeeCommand) command;
			Employee e = new Employee();
			e.setCode(empCommand.getCode());
			e.setName(empCommand.getName());
			e.setCity(empCommand.getCity());
			employeeService.addEmployee(e);
		return new ModelAndView(new RedirectView(getSuccessView()));
	}
}
