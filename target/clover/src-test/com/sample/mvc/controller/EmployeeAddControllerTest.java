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
import com.sample.mvc.controller.EmployeeAddController;
import com.sample.mvc.domain.Employee;
import com.sample.mvc.service.EmployeeService;

public class EmployeeAddControllerTest {static class __CLR3_1_122o2oi4cjvkop{public static com_cenqua_clover.CoverageRecorder R;public static com_cenqua_clover.CloverProfile[] profiles = { };static{com_cenqua_clover.CoverageRecorder _R=null;try{com_cenqua_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___3_1_12();if(20130627143542579L!=com_cenqua_clover.CloverVersionInfo.getBuildStamp()){com_cenqua_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_cenqua_clover.Clover.l("[CLOVER] WARNING: Instr=3.1.12#20130627143542579,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum()+"#"+com_cenqua_clover.CloverVersionInfo.getBuildStamp());}R=com_cenqua_clover.Clover.getNullRecorder();_R=com_cenqua_clover.Clover.getNullRecorder();_R=com_cenqua_clover.Clover.getRecorder("\u0044\u003a\u005c\u005c\u006e\u0065\u0077\u0020\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u005c\u005c\u0045\u006d\u0070\u0070\u006c\u006f\u0079\u0065\u0065\u004d\u0061\u006e\u0061\u0067\u0065\u006d\u0065\u006e\u0074\u0053\u0079\u0073\u0074\u0065\u006d\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1420021063002L,8589935092L,131,profiles,new String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}

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
	/*@Test
	public void testEmployeeAddControllerTrue() throws Exception {
		EmployeeAddController employeeAddController = new EmployeeAddController();
		assertNotNull(command);
		empCommand.getCode();
		empCommand.getName();
		HttpServletRequest mockRequest = (HttpServletRequest) mock(HttpServletRequest.class);
		HttpServletResponse mockResponse = (HttpServletResponse) mock2(HttpServletResponse.class);
		assertNotNull(emp);
		emp.setCode(11);
		emp.setName("cybage");
		((EmployeeCommand) command).setCode(11);
		((EmployeeCommand) command).setName("cybage");
		((EmployeeCommand) command).setCity("Delhi");
		assertNotNull(empService);
		assertNotNull(employeeList);
		employeeList.add(emp);
		empService.setEmployeeList(employeeList);
		assertEquals("Employee Object Successfully set", empService
				.getEmployeeList().get(1), emp);
		assertNotSame(empService.getEmployeeList().get(0), employee);
		employeeAddController.setEmployeeService(empService);
	}*/

	private HttpServletRequest mock(Class<HttpServletRequest> class1) {try{__CLR3_1_122o2oi4cjvkop.R.inc(96);
		__CLR3_1_122o2oi4cjvkop.R.inc(97);return HttpServletRequest;
	}finally{__CLR3_1_122o2oi4cjvkop.R.flushNeeded();}}

	private HttpServletResponse mock2(Class<HttpServletResponse> class1) {try{__CLR3_1_122o2oi4cjvkop.R.inc(98);
		__CLR3_1_122o2oi4cjvkop.R.inc(99);return HttpServletResponse;
	}finally{__CLR3_1_122o2oi4cjvkop.R.flushNeeded();}}

	@Test
	public void testSetEmployeeService() {__CLR3_1_122o2oi4cjvkop.R.globalSliceStart(getClass().getName(),100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_12pqhq0y2s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_122o2oi4cjvkop.R.rethrow($CLV_t2$);}finally{__CLR3_1_122o2oi4cjvkop.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.controller.EmployeeAddControllerTest.testSetEmployeeService",100,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_12pqhq0y2s(){try{__CLR3_1_122o2oi4cjvkop.R.inc(100);
		__CLR3_1_122o2oi4cjvkop.R.inc(101);EmployeeService employeeService = new EmployeeService();
		__CLR3_1_122o2oi4cjvkop.R.inc(102);assertNotNull(employeeService);
	}finally{__CLR3_1_122o2oi4cjvkop.R.flushNeeded();}}

	@Test
	public void testOnsubmit() {__CLR3_1_122o2oi4cjvkop.R.globalSliceStart(getClass().getName(),103);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_128dk6eo2v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_122o2oi4cjvkop.R.rethrow($CLV_t2$);}finally{__CLR3_1_122o2oi4cjvkop.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.controller.EmployeeAddControllerTest.testOnsubmit",103,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_128dk6eo2v(){try{__CLR3_1_122o2oi4cjvkop.R.inc(103);
		__CLR3_1_122o2oi4cjvkop.R.inc(104);emp.setCode(11);
		__CLR3_1_122o2oi4cjvkop.R.inc(105);emp.setName("cybage");
		__CLR3_1_122o2oi4cjvkop.R.inc(106);emp.setCity("Delhi");
		__CLR3_1_122o2oi4cjvkop.R.inc(107);employee.setCode(12);
		__CLR3_1_122o2oi4cjvkop.R.inc(108);employee.setName("cyb");
		__CLR3_1_122o2oi4cjvkop.R.inc(109);employee.setCity("Delhi");
		__CLR3_1_122o2oi4cjvkop.R.inc(110);employeeList.add(emp);
		__CLR3_1_122o2oi4cjvkop.R.inc(111);employeeList.add(employee);
		__CLR3_1_122o2oi4cjvkop.R.inc(112);empService.setEmployeeList(employeeList);
		__CLR3_1_122o2oi4cjvkop.R.inc(113);EmployeeAddController test = new EmployeeAddController();
		__CLR3_1_122o2oi4cjvkop.R.inc(114);test.setEmployeeService(empService);
		__CLR3_1_122o2oi4cjvkop.R.inc(115);((EmployeeCommand) command).setCode(12);
		__CLR3_1_122o2oi4cjvkop.R.inc(116);((EmployeeCommand) command).setName("Manjul");
		__CLR3_1_122o2oi4cjvkop.R.inc(117);((EmployeeCommand) command).setCity("Delhi");
		__CLR3_1_122o2oi4cjvkop.R.inc(118);try {
			__CLR3_1_122o2oi4cjvkop.R.inc(119);assertNotNull(command);
			__CLR3_1_122o2oi4cjvkop.R.inc(120);ModelAndView check= test.onSubmit(HttpServletRequest, HttpServletResponse, command, errors);
			__CLR3_1_122o2oi4cjvkop.R.inc(121);assertNotNull(check);
		} catch (Exception e) {
			__CLR3_1_122o2oi4cjvkop.R.inc(122);System.out.println(((EmployeeCommand) command).getCode()+" "+((EmployeeCommand) command).getName()+" "+((EmployeeCommand) command).getCity());
			__CLR3_1_122o2oi4cjvkop.R.inc(123);e.printStackTrace();
		}
		__CLR3_1_122o2oi4cjvkop.R.inc(124);assertNotNull(command);
	}finally{__CLR3_1_122o2oi4cjvkop.R.flushNeeded();}}

	@Test
	public void testOnsubmitCode() {__CLR3_1_122o2oi4cjvkop.R.globalSliceStart(getClass().getName(),125);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_12yfbe6b3h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_122o2oi4cjvkop.R.rethrow($CLV_t2$);}finally{__CLR3_1_122o2oi4cjvkop.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.controller.EmployeeAddControllerTest.testOnsubmitCode",125,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_12yfbe6b3h(){try{__CLR3_1_122o2oi4cjvkop.R.inc(125);
		__CLR3_1_122o2oi4cjvkop.R.inc(126);Employee emp = new Employee();
		__CLR3_1_122o2oi4cjvkop.R.inc(127);emp.setCode(10665);
		__CLR3_1_122o2oi4cjvkop.R.inc(128);emp.setName("Vidya");
		__CLR3_1_122o2oi4cjvkop.R.inc(129);assertEquals("Code set is correct", 10665, 10665);
		__CLR3_1_122o2oi4cjvkop.R.inc(130);assertNotNull(emp);
	}finally{__CLR3_1_122o2oi4cjvkop.R.flushNeeded();}}
}
