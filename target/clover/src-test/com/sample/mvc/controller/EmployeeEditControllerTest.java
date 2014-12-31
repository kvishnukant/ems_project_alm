/* $$ This file has been instrumented by Clover 3.1.12#20130627143542579 $$ */package com.sample.mvc.controller;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;

import com.sample.mvc.command.EmployeeCommand;
import com.sample.mvc.domain.Employee;
import com.sample.mvc.service.EmployeeService;

public class EmployeeEditControllerTest {static class __CLR3_1_126363i4cjvkq0{public static com_cenqua_clover.CoverageRecorder R;public static com_cenqua_clover.CloverProfile[] profiles = { };static{com_cenqua_clover.CoverageRecorder _R=null;try{com_cenqua_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___3_1_12();if(20130627143542579L!=com_cenqua_clover.CloverVersionInfo.getBuildStamp()){com_cenqua_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_cenqua_clover.Clover.l("[CLOVER] WARNING: Instr=3.1.12#20130627143542579,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum()+"#"+com_cenqua_clover.CloverVersionInfo.getBuildStamp());}R=com_cenqua_clover.Clover.getNullRecorder();_R=com_cenqua_clover.Clover.getNullRecorder();_R=com_cenqua_clover.Clover.getRecorder("\u0044\u003a\u005c\u005c\u006e\u0065\u0077\u0020\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u005c\u005c\u0045\u006d\u0070\u0070\u006c\u006f\u0079\u0065\u0065\u004d\u0061\u006e\u0061\u0067\u0065\u006d\u0065\u006e\u0074\u0053\u0079\u0073\u0074\u0065\u006d\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1420021063002L,8589935092L,274,profiles,new String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}

	Object command = new EmployeeCommand();
	BindException errors;
	EmployeeCommand empCommand = new EmployeeCommand();
	Employee emp = new Employee();
	Employee employee = new Employee();
	private HttpServletRequest HttpServletRequest;
	private HttpServletResponse HttpServletResponse;
	List<Employee> employeeList = new ArrayList<Employee>();
	EmployeeService empService = new EmployeeService();
	
	/**
	 * Test EmployeeEditController with positive and negative scenario
	 * 
	 * @throws Exception
	 */
	@Test
	public void testEmployeeEditControllerTrue() throws Exception {__CLR3_1_126363i4cjvkq0.R.globalSliceStart(getClass().getName(),219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_12srpvzv63();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_126363i4cjvkq0.R.rethrow($CLV_t2$);}finally{__CLR3_1_126363i4cjvkq0.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.controller.EmployeeEditControllerTest.testEmployeeEditControllerTrue",219,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_12srpvzv63() throws Exception{try{__CLR3_1_126363i4cjvkq0.R.inc(219);
		__CLR3_1_126363i4cjvkq0.R.inc(220);EmployeeEditController employeeEditController = new EmployeeEditController();
		__CLR3_1_126363i4cjvkq0.R.inc(221);assertNotNull(command);
		__CLR3_1_126363i4cjvkq0.R.inc(222);empCommand.getCode();
		__CLR3_1_126363i4cjvkq0.R.inc(223);empCommand.getName();
		__CLR3_1_126363i4cjvkq0.R.inc(224);HttpServletRequest mockRequest = (HttpServletRequest) mock(HttpServletRequest.class);
		__CLR3_1_126363i4cjvkq0.R.inc(225);HttpServletResponse mockResponse = (HttpServletResponse) mock2(HttpServletResponse.class);
		__CLR3_1_126363i4cjvkq0.R.inc(226);assertNotNull(emp);
		__CLR3_1_126363i4cjvkq0.R.inc(227);emp.setCode(11);
		__CLR3_1_126363i4cjvkq0.R.inc(228);emp.setName("cybage");
		__CLR3_1_126363i4cjvkq0.R.inc(229);((EmployeeCommand) command).setCode(11);
		__CLR3_1_126363i4cjvkq0.R.inc(230);((EmployeeCommand) command).setName("cybage");
		__CLR3_1_126363i4cjvkq0.R.inc(231);((EmployeeCommand) command).setCity("Delhi");
		__CLR3_1_126363i4cjvkq0.R.inc(232);assertNotNull(empService);
		__CLR3_1_126363i4cjvkq0.R.inc(233);assertNotNull(employeeList);
		__CLR3_1_126363i4cjvkq0.R.inc(234);employeeList.add(emp);
		__CLR3_1_126363i4cjvkq0.R.inc(235);empService.setEmployeeList(employeeList);
		__CLR3_1_126363i4cjvkq0.R.inc(236);assertEquals("Employee Object Successfully set", empService
				.getEmployeeList().get(0), emp);
		__CLR3_1_126363i4cjvkq0.R.inc(237);assertNotSame(empService.getEmployeeList().get(0), employee);
		__CLR3_1_126363i4cjvkq0.R.inc(238);employeeEditController.setEmployeeService(empService);
	}finally{__CLR3_1_126363i4cjvkq0.R.flushNeeded();}}

	private HttpServletRequest mock(Class<HttpServletRequest> class1) {try{__CLR3_1_126363i4cjvkq0.R.inc(239);
		__CLR3_1_126363i4cjvkq0.R.inc(240);return HttpServletRequest;
	}finally{__CLR3_1_126363i4cjvkq0.R.flushNeeded();}}

	private HttpServletResponse mock2(Class<HttpServletResponse> class1) {try{__CLR3_1_126363i4cjvkq0.R.inc(241);
		__CLR3_1_126363i4cjvkq0.R.inc(242);return HttpServletResponse;
	}finally{__CLR3_1_126363i4cjvkq0.R.flushNeeded();}}

	@Test
	public void testSetEmployeeService() {__CLR3_1_126363i4cjvkq0.R.globalSliceStart(getClass().getName(),243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_12pqhq0y6r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_126363i4cjvkq0.R.rethrow($CLV_t2$);}finally{__CLR3_1_126363i4cjvkq0.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.controller.EmployeeEditControllerTest.testSetEmployeeService",243,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_12pqhq0y6r(){try{__CLR3_1_126363i4cjvkq0.R.inc(243);
		__CLR3_1_126363i4cjvkq0.R.inc(244);EmployeeService employeeService = new EmployeeService();
		__CLR3_1_126363i4cjvkq0.R.inc(245);assertNotNull(employeeService);
	}finally{__CLR3_1_126363i4cjvkq0.R.flushNeeded();}}

	@Test
	public void testOnsubmit() {__CLR3_1_126363i4cjvkq0.R.globalSliceStart(getClass().getName(),246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_128dk6eo6u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_126363i4cjvkq0.R.rethrow($CLV_t2$);}finally{__CLR3_1_126363i4cjvkq0.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.controller.EmployeeEditControllerTest.testOnsubmit",246,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_128dk6eo6u(){try{__CLR3_1_126363i4cjvkq0.R.inc(246);
		__CLR3_1_126363i4cjvkq0.R.inc(247);emp.setCode(11);
		__CLR3_1_126363i4cjvkq0.R.inc(248);emp.setName("cybage");
		__CLR3_1_126363i4cjvkq0.R.inc(249);emp.setCity("Delhi");
		__CLR3_1_126363i4cjvkq0.R.inc(250);employee.setCode(12);
		__CLR3_1_126363i4cjvkq0.R.inc(251);employee.setName("cyb");
		__CLR3_1_126363i4cjvkq0.R.inc(252);employee.setCity("Delhi");
		__CLR3_1_126363i4cjvkq0.R.inc(253);employeeList.add(emp);
		__CLR3_1_126363i4cjvkq0.R.inc(254);employeeList.add(employee);
		__CLR3_1_126363i4cjvkq0.R.inc(255);empService.setEmployeeList(employeeList);
		__CLR3_1_126363i4cjvkq0.R.inc(256);EmployeeEditController test = new EmployeeEditController();
		__CLR3_1_126363i4cjvkq0.R.inc(257);test.setEmployeeService(empService);
		__CLR3_1_126363i4cjvkq0.R.inc(258);((EmployeeCommand) command).setCode(12);
		__CLR3_1_126363i4cjvkq0.R.inc(259);((EmployeeCommand) command).setName("Manjul");
		__CLR3_1_126363i4cjvkq0.R.inc(260);((EmployeeCommand) command).setCity("Delhi");
		__CLR3_1_126363i4cjvkq0.R.inc(261);try {
			__CLR3_1_126363i4cjvkq0.R.inc(262);assertNotNull(command);
			__CLR3_1_126363i4cjvkq0.R.inc(263);ModelAndView check= test.onSubmit(HttpServletRequest, HttpServletResponse, command, errors);
			__CLR3_1_126363i4cjvkq0.R.inc(264);assertNotNull(check);
		} catch (Exception e) {
			__CLR3_1_126363i4cjvkq0.R.inc(265);System.out.println(((EmployeeCommand) command).getCode()+" "+((EmployeeCommand) command).getName()+" "+((EmployeeCommand) command).getCity());
			__CLR3_1_126363i4cjvkq0.R.inc(266);e.printStackTrace();
		}
		__CLR3_1_126363i4cjvkq0.R.inc(267);assertNotNull(command);
	}finally{__CLR3_1_126363i4cjvkq0.R.flushNeeded();}}

	@Test
	public void testOnsubmitCode() {__CLR3_1_126363i4cjvkq0.R.globalSliceStart(getClass().getName(),268);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_12yfbe6b7g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_126363i4cjvkq0.R.rethrow($CLV_t2$);}finally{__CLR3_1_126363i4cjvkq0.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.controller.EmployeeEditControllerTest.testOnsubmitCode",268,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_12yfbe6b7g(){try{__CLR3_1_126363i4cjvkq0.R.inc(268);
		__CLR3_1_126363i4cjvkq0.R.inc(269);Employee emp = new Employee();
		__CLR3_1_126363i4cjvkq0.R.inc(270);emp.setCode(10665);
		__CLR3_1_126363i4cjvkq0.R.inc(271);emp.setName("Vidya");
		__CLR3_1_126363i4cjvkq0.R.inc(272);assertEquals("Code set is correct", 10665, 10665);
		__CLR3_1_126363i4cjvkq0.R.inc(273);assertNotNull(emp);
	}finally{__CLR3_1_126363i4cjvkq0.R.flushNeeded();}}

}
