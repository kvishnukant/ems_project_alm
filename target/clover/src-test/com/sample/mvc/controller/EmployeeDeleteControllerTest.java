/* $$ This file has been instrumented by Clover 3.1.12#20130627143542579 $$ */package com.sample.mvc.controller;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;

import com.sample.mvc.command.EmployeeCommand;
import com.sample.mvc.domain.Employee;
import com.sample.mvc.service.EmployeeService;

public class EmployeeDeleteControllerTest {static class __CLR3_1_124l4li4cjvkpk{public static com_cenqua_clover.CoverageRecorder R;public static com_cenqua_clover.CloverProfile[] profiles = { };static{com_cenqua_clover.CoverageRecorder _R=null;try{com_cenqua_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___3_1_12();if(20130627143542579L!=com_cenqua_clover.CloverVersionInfo.getBuildStamp()){com_cenqua_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_cenqua_clover.Clover.l("[CLOVER] WARNING: Instr=3.1.12#20130627143542579,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum()+"#"+com_cenqua_clover.CloverVersionInfo.getBuildStamp());}R=com_cenqua_clover.Clover.getNullRecorder();_R=com_cenqua_clover.Clover.getNullRecorder();_R=com_cenqua_clover.Clover.getRecorder("\u0044\u003a\u005c\u005c\u006e\u0065\u0077\u0020\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u005c\u005c\u0045\u006d\u0070\u0070\u006c\u006f\u0079\u0065\u0065\u004d\u0061\u006e\u0061\u0067\u0065\u006d\u0065\u006e\u0074\u0053\u0079\u0073\u0074\u0065\u006d\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1420021063002L,8589935092L,219,profiles,new String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}

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
	 * Test EmployeeAddController with positive and negative scenario
	 * 
	 * @throws Exception
	 */
	@Test
	public void testEmployeeDeleteControllerTrue() throws Exception {__CLR3_1_124l4li4cjvkpk.R.globalSliceStart(getClass().getName(),165);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_12dd0tfg4l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_124l4li4cjvkpk.R.rethrow($CLV_t2$);}finally{__CLR3_1_124l4li4cjvkpk.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.controller.EmployeeDeleteControllerTest.testEmployeeDeleteControllerTrue",165,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_12dd0tfg4l() throws Exception{try{__CLR3_1_124l4li4cjvkpk.R.inc(165);
		__CLR3_1_124l4li4cjvkpk.R.inc(166);EmployeeDeleteController employeeDeleteController = new EmployeeDeleteController();
		__CLR3_1_124l4li4cjvkpk.R.inc(167);assertNotNull(command);
		__CLR3_1_124l4li4cjvkpk.R.inc(168);empCommand.getCode();
		__CLR3_1_124l4li4cjvkpk.R.inc(169);empCommand.getName();
		__CLR3_1_124l4li4cjvkpk.R.inc(170);HttpServletRequest mockRequest = (HttpServletRequest) mock(HttpServletRequest.class);
		__CLR3_1_124l4li4cjvkpk.R.inc(171);HttpServletResponse mockResponse = (HttpServletResponse) mock2(HttpServletResponse.class);
		__CLR3_1_124l4li4cjvkpk.R.inc(172);assertNotNull(emp);
		__CLR3_1_124l4li4cjvkpk.R.inc(173);emp.setCode(11);
		__CLR3_1_124l4li4cjvkpk.R.inc(174);emp.setName("cybage");
		__CLR3_1_124l4li4cjvkpk.R.inc(175);((EmployeeCommand) command).setCode(11);
		__CLR3_1_124l4li4cjvkpk.R.inc(176);((EmployeeCommand) command).setName("cybage");
		__CLR3_1_124l4li4cjvkpk.R.inc(177);((EmployeeCommand) command).setCity("Delhi");
		__CLR3_1_124l4li4cjvkpk.R.inc(178);assertNotNull(empService);
		__CLR3_1_124l4li4cjvkpk.R.inc(179);assertNotNull(employeeList);
		__CLR3_1_124l4li4cjvkpk.R.inc(180);employeeList.add(emp);
		__CLR3_1_124l4li4cjvkpk.R.inc(181);empService.setEmployeeList(employeeList);
		__CLR3_1_124l4li4cjvkpk.R.inc(182);assertEquals("Employee Object Successfully set", empService
				.getEmployeeList().get(0), emp);
		__CLR3_1_124l4li4cjvkpk.R.inc(183);assertNotSame(empService.getEmployeeList().get(0), employee);
		__CLR3_1_124l4li4cjvkpk.R.inc(184);employeeDeleteController.setEmployeeService(empService);
	}finally{__CLR3_1_124l4li4cjvkpk.R.flushNeeded();}}

	private HttpServletRequest mock(Class<HttpServletRequest> class1) {try{__CLR3_1_124l4li4cjvkpk.R.inc(185);
		__CLR3_1_124l4li4cjvkpk.R.inc(186);return HttpServletRequest;
	}finally{__CLR3_1_124l4li4cjvkpk.R.flushNeeded();}}

	private HttpServletResponse mock2(Class<HttpServletResponse> class1) {try{__CLR3_1_124l4li4cjvkpk.R.inc(187);
		__CLR3_1_124l4li4cjvkpk.R.inc(188);return HttpServletResponse;
	}finally{__CLR3_1_124l4li4cjvkpk.R.flushNeeded();}}

	@Test
	public void testSetEmployeeService() {__CLR3_1_124l4li4cjvkpk.R.globalSliceStart(getClass().getName(),189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_12pqhq0y59();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_124l4li4cjvkpk.R.rethrow($CLV_t2$);}finally{__CLR3_1_124l4li4cjvkpk.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.controller.EmployeeDeleteControllerTest.testSetEmployeeService",189,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_12pqhq0y59(){try{__CLR3_1_124l4li4cjvkpk.R.inc(189);
		__CLR3_1_124l4li4cjvkpk.R.inc(190);EmployeeService employeeService = new EmployeeService();
		__CLR3_1_124l4li4cjvkpk.R.inc(191);assertNotNull(employeeService);
	}finally{__CLR3_1_124l4li4cjvkpk.R.flushNeeded();}}

	@Test
	public void testOnsubmit() {__CLR3_1_124l4li4cjvkpk.R.globalSliceStart(getClass().getName(),192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_128dk6eo5c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_124l4li4cjvkpk.R.rethrow($CLV_t2$);}finally{__CLR3_1_124l4li4cjvkpk.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.controller.EmployeeDeleteControllerTest.testOnsubmit",192,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_128dk6eo5c(){try{__CLR3_1_124l4li4cjvkpk.R.inc(192);
		__CLR3_1_124l4li4cjvkpk.R.inc(193);emp.setCode(11);
		__CLR3_1_124l4li4cjvkpk.R.inc(194);emp.setName("cybage");
		__CLR3_1_124l4li4cjvkpk.R.inc(195);emp.setCity("Delhi");
		__CLR3_1_124l4li4cjvkpk.R.inc(196);employee.setCode(12);
		__CLR3_1_124l4li4cjvkpk.R.inc(197);employee.setName("cyb");
		__CLR3_1_124l4li4cjvkpk.R.inc(198);employee.setCity("Delhi");
		__CLR3_1_124l4li4cjvkpk.R.inc(199);employeeList.add(emp);
		__CLR3_1_124l4li4cjvkpk.R.inc(200);employeeList.add(employee);
		__CLR3_1_124l4li4cjvkpk.R.inc(201);empService.setEmployeeList(employeeList);
		__CLR3_1_124l4li4cjvkpk.R.inc(202);EmployeeDeleteController test = new EmployeeDeleteController();
		__CLR3_1_124l4li4cjvkpk.R.inc(203);test.setEmployeeService(empService);
		__CLR3_1_124l4li4cjvkpk.R.inc(204);((EmployeeCommand) command).setCode(12);
		__CLR3_1_124l4li4cjvkpk.R.inc(205);((EmployeeCommand) command).setName("Manjul");
		__CLR3_1_124l4li4cjvkpk.R.inc(206);((EmployeeCommand) command).setCity("Delhi");
		__CLR3_1_124l4li4cjvkpk.R.inc(207);try {
			__CLR3_1_124l4li4cjvkpk.R.inc(208);assertNotNull(command);
			__CLR3_1_124l4li4cjvkpk.R.inc(209);ModelAndView check= test.onSubmit(HttpServletRequest, HttpServletResponse, command, errors);
			__CLR3_1_124l4li4cjvkpk.R.inc(210);assertNotNull(check);
		} catch (Exception e) {
			__CLR3_1_124l4li4cjvkpk.R.inc(211);e.printStackTrace();
		}
		__CLR3_1_124l4li4cjvkpk.R.inc(212);assertNotNull(command);
	}finally{__CLR3_1_124l4li4cjvkpk.R.flushNeeded();}}

	@Test
	public void testOnsubmitCode() {__CLR3_1_124l4li4cjvkpk.R.globalSliceStart(getClass().getName(),213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_12yfbe6b5x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_124l4li4cjvkpk.R.rethrow($CLV_t2$);}finally{__CLR3_1_124l4li4cjvkpk.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.controller.EmployeeDeleteControllerTest.testOnsubmitCode",213,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_12yfbe6b5x(){try{__CLR3_1_124l4li4cjvkpk.R.inc(213);
		__CLR3_1_124l4li4cjvkpk.R.inc(214);Employee emp = new Employee();
		__CLR3_1_124l4li4cjvkpk.R.inc(215);emp.setCode(10665);
		__CLR3_1_124l4li4cjvkpk.R.inc(216);emp.setName("Vidya");
		__CLR3_1_124l4li4cjvkpk.R.inc(217);assertEquals("Code set is correct", 10665, 10665);
		__CLR3_1_124l4li4cjvkpk.R.inc(218);assertNotNull(emp);
	}finally{__CLR3_1_124l4li4cjvkpk.R.flushNeeded();}}
}
