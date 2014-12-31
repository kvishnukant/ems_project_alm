/* $$ This file has been instrumented by Clover 3.1.12#20130627143542579 $$ */package com.sample.mvc.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;



import org.junit.Test;

import com.sample.mvc.domain.Employee;
import com.sample.mvc.service.EmployeeService;

public class EmployeeServiceTest {static class __CLR3_1_127m7mi4cjvkqv{public static com_cenqua_clover.CoverageRecorder R;public static com_cenqua_clover.CloverProfile[] profiles = { };static{com_cenqua_clover.CoverageRecorder _R=null;try{com_cenqua_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___3_1_12();if(20130627143542579L!=com_cenqua_clover.CloverVersionInfo.getBuildStamp()){com_cenqua_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_cenqua_clover.Clover.l("[CLOVER] WARNING: Instr=3.1.12#20130627143542579,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum()+"#"+com_cenqua_clover.CloverVersionInfo.getBuildStamp());}R=com_cenqua_clover.Clover.getNullRecorder();_R=com_cenqua_clover.Clover.getNullRecorder();_R=com_cenqua_clover.Clover.getRecorder("\u0044\u003a\u005c\u005c\u006e\u0065\u0077\u0020\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u005c\u005c\u0045\u006d\u0070\u0070\u006c\u006f\u0079\u0065\u0065\u004d\u0061\u006e\u0061\u0067\u0065\u006d\u0065\u006e\u0074\u0053\u0079\u0073\u0074\u0065\u006d\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1420021063002L,8589935092L,378,profiles,new String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}
	List<Employee> employeeList = new ArrayList<Employee>();
	List<Employee> empList = new ArrayList<Employee>();
	EmployeeService empService = new EmployeeService();
	Employee emp = new Employee();
	Employee employee = new Employee();

	/**
	 * Check weather employeelist return from empservice and actual employee
	 * list are same
	 */
	@Test
	public void testAddTrue() {__CLR3_1_127m7mi4cjvkqv.R.globalSliceStart(getClass().getName(),274);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_12y9u2kc7m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_127m7mi4cjvkqv.R.rethrow($CLV_t2$);}finally{__CLR3_1_127m7mi4cjvkqv.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.service.EmployeeServiceTest.testAddTrue",274,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_12y9u2kc7m(){try{__CLR3_1_127m7mi4cjvkqv.R.inc(274);
		__CLR3_1_127m7mi4cjvkqv.R.inc(275);System.out.println(":::::");
		__CLR3_1_127m7mi4cjvkqv.R.inc(276);emp.setCode(11);
		__CLR3_1_127m7mi4cjvkqv.R.inc(277);emp.setName("cybage");
		__CLR3_1_127m7mi4cjvkqv.R.inc(278);emp.setCity("Delhi");
		__CLR3_1_127m7mi4cjvkqv.R.inc(279);System.out.println("Set City :::::" + emp.getCity());
		__CLR3_1_127m7mi4cjvkqv.R.inc(280);employeeList.add(emp);
		__CLR3_1_127m7mi4cjvkqv.R.inc(281);empService.setEmployeeList(employeeList);
		__CLR3_1_127m7mi4cjvkqv.R.inc(282);empList.add(emp);
		__CLR3_1_127m7mi4cjvkqv.R.inc(283);empService.addEmployee(emp);
		__CLR3_1_127m7mi4cjvkqv.R.inc(284);assertNotNull(emp);
	}finally{__CLR3_1_127m7mi4cjvkqv.R.flushNeeded();}}

	/**
	 * Pass emplist as Null and check weather employee list return from
	 * empservice and actual emplist are not same
	 */
	@Test
	public void testAddFalse() {__CLR3_1_127m7mi4cjvkqv.R.globalSliceStart(getClass().getName(),285);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_12l2mgl77x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_127m7mi4cjvkqv.R.rethrow($CLV_t2$);}finally{__CLR3_1_127m7mi4cjvkqv.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.service.EmployeeServiceTest.testAddFalse",285,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_12l2mgl77x(){try{__CLR3_1_127m7mi4cjvkqv.R.inc(285);
		__CLR3_1_127m7mi4cjvkqv.R.inc(286);emp.setCode(11);
		__CLR3_1_127m7mi4cjvkqv.R.inc(287);emp.setName("cybage");
		__CLR3_1_127m7mi4cjvkqv.R.inc(288);emp.setCity("Delhi");
		__CLR3_1_127m7mi4cjvkqv.R.inc(289);empService.setEmployeeList(employeeList);
		__CLR3_1_127m7mi4cjvkqv.R.inc(290);empList.add(null);
		__CLR3_1_127m7mi4cjvkqv.R.inc(291);empService.addEmployee(emp);
		__CLR3_1_127m7mi4cjvkqv.R.inc(292);assertNotSame(empList, empService.getEmployeeList());
	}finally{__CLR3_1_127m7mi4cjvkqv.R.flushNeeded();}}

	/**
	 * Positive scenario test for findEmployeeCode method
	 */
	@Test
	public void findByEmployeeCodeTrue() {__CLR3_1_127m7mi4cjvkqv.R.globalSliceStart(getClass().getName(),293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_126853c085();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_127m7mi4cjvkqv.R.rethrow($CLV_t2$);}finally{__CLR3_1_127m7mi4cjvkqv.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.service.EmployeeServiceTest.findByEmployeeCodeTrue",293,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_126853c085(){try{__CLR3_1_127m7mi4cjvkqv.R.inc(293);

		__CLR3_1_127m7mi4cjvkqv.R.inc(294);emp.setCode(1);
		__CLR3_1_127m7mi4cjvkqv.R.inc(295);emp.setName("cybage");
		__CLR3_1_127m7mi4cjvkqv.R.inc(296);emp.setCity("Delhi");
		__CLR3_1_127m7mi4cjvkqv.R.inc(297);employee.setCode(2);
		__CLR3_1_127m7mi4cjvkqv.R.inc(298);employee.setName("cyb");
		__CLR3_1_127m7mi4cjvkqv.R.inc(299);employee.setCity("Delhi");
		__CLR3_1_127m7mi4cjvkqv.R.inc(300);employeeList.add(emp);
		__CLR3_1_127m7mi4cjvkqv.R.inc(301);employeeList.add(employee);

		__CLR3_1_127m7mi4cjvkqv.R.inc(302);empService.setEmployeeList(employeeList);
		__CLR3_1_127m7mi4cjvkqv.R.inc(303);assertEquals("Find Employee Successfully done", 1, empService
				.findByEmployeeCode(1).getCode());
	}finally{__CLR3_1_127m7mi4cjvkqv.R.flushNeeded();}}

	/**
	 * Negative scenario test for findEmployeeCode method
	 */
	@Test
	public void findByEmployeeCodeFalse() {__CLR3_1_127m7mi4cjvkqv.R.globalSliceStart(getClass().getName(),304);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_12204g4h8g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_127m7mi4cjvkqv.R.rethrow($CLV_t2$);}finally{__CLR3_1_127m7mi4cjvkqv.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.service.EmployeeServiceTest.findByEmployeeCodeFalse",304,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_12204g4h8g(){try{__CLR3_1_127m7mi4cjvkqv.R.inc(304);

		__CLR3_1_127m7mi4cjvkqv.R.inc(305);emp.setCode(11);
		__CLR3_1_127m7mi4cjvkqv.R.inc(306);emp.setName("cybage");
		__CLR3_1_127m7mi4cjvkqv.R.inc(307);emp.setCity("Delhi");
		__CLR3_1_127m7mi4cjvkqv.R.inc(308);employee.setCode(12);
		__CLR3_1_127m7mi4cjvkqv.R.inc(309);employee.setName("cyb");
		__CLR3_1_127m7mi4cjvkqv.R.inc(310);employee.setCity("Delhi");
		__CLR3_1_127m7mi4cjvkqv.R.inc(311);employeeList.add(emp);
		__CLR3_1_127m7mi4cjvkqv.R.inc(312);employeeList.add(employee);

		__CLR3_1_127m7mi4cjvkqv.R.inc(313);empService.setEmployeeList(employeeList);
		__CLR3_1_127m7mi4cjvkqv.R.inc(314);assertNotSame(12, empService.findByEmployeeCode(11).getCode());
		__CLR3_1_127m7mi4cjvkqv.R.inc(315);assertNull(empService.findByEmployeeCode(13));
	}finally{__CLR3_1_127m7mi4cjvkqv.R.flushNeeded();}}
	
	@Test
	public void deleteEmployeeTrue() {__CLR3_1_127m7mi4cjvkqv.R.globalSliceStart(getClass().getName(),316);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_12q0ooi8s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_127m7mi4cjvkqv.R.rethrow($CLV_t2$);}finally{__CLR3_1_127m7mi4cjvkqv.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.service.EmployeeServiceTest.deleteEmployeeTrue",316,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_12q0ooi8s(){try{__CLR3_1_127m7mi4cjvkqv.R.inc(316);
		__CLR3_1_127m7mi4cjvkqv.R.inc(317);emp.setCode(11);
		__CLR3_1_127m7mi4cjvkqv.R.inc(318);emp.setName("cybage");
		__CLR3_1_127m7mi4cjvkqv.R.inc(319);emp.setCity("Delhi");
		__CLR3_1_127m7mi4cjvkqv.R.inc(320);employee.setCode(12);
		__CLR3_1_127m7mi4cjvkqv.R.inc(321);employee.setName("cyb");
		__CLR3_1_127m7mi4cjvkqv.R.inc(322);employee.setCity("Delhi");
		__CLR3_1_127m7mi4cjvkqv.R.inc(323);employeeList.add(emp);
		__CLR3_1_127m7mi4cjvkqv.R.inc(324);employeeList.add(employee);
		__CLR3_1_127m7mi4cjvkqv.R.inc(325);empService.setEmployeeList(employeeList);
		__CLR3_1_127m7mi4cjvkqv.R.inc(326);boolean actual = empService.deleteEmployee(12);
		__CLR3_1_127m7mi4cjvkqv.R.inc(327);boolean expected = true;
		__CLR3_1_127m7mi4cjvkqv.R.inc(328);empList.add(emp);
		__CLR3_1_127m7mi4cjvkqv.R.inc(329);assertSame(expected, actual);
	}finally{__CLR3_1_127m7mi4cjvkqv.R.flushNeeded();}}
	
	@Test
	public void deleteEmployeeFalse() {__CLR3_1_127m7mi4cjvkqv.R.globalSliceStart(getClass().getName(),330);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_124bremn96();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_127m7mi4cjvkqv.R.rethrow($CLV_t2$);}finally{__CLR3_1_127m7mi4cjvkqv.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.service.EmployeeServiceTest.deleteEmployeeFalse",330,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_124bremn96(){try{__CLR3_1_127m7mi4cjvkqv.R.inc(330);
		__CLR3_1_127m7mi4cjvkqv.R.inc(331);emp.setCode(11);
		__CLR3_1_127m7mi4cjvkqv.R.inc(332);emp.setName("cybage");
		__CLR3_1_127m7mi4cjvkqv.R.inc(333);emp.setCity("Delhi");
		__CLR3_1_127m7mi4cjvkqv.R.inc(334);employee.setCode(12);
		__CLR3_1_127m7mi4cjvkqv.R.inc(335);employee.setName("cyb");
		__CLR3_1_127m7mi4cjvkqv.R.inc(336);employee.setCity("Delhi");
		__CLR3_1_127m7mi4cjvkqv.R.inc(337);employeeList.add(emp);
		__CLR3_1_127m7mi4cjvkqv.R.inc(338);employeeList.add(employee);
		__CLR3_1_127m7mi4cjvkqv.R.inc(339);empService.setEmployeeList(employeeList);
		__CLR3_1_127m7mi4cjvkqv.R.inc(340);boolean actual = empService.deleteEmployee(13);
		__CLR3_1_127m7mi4cjvkqv.R.inc(341);boolean expected = false;
		__CLR3_1_127m7mi4cjvkqv.R.inc(342);empList.add(emp);
		__CLR3_1_127m7mi4cjvkqv.R.inc(343);assertSame(expected, actual);	
	}finally{__CLR3_1_127m7mi4cjvkqv.R.flushNeeded();}}
	
	@Test
	public void editEmployeeTrue() {__CLR3_1_127m7mi4cjvkqv.R.globalSliceStart(getClass().getName(),344);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_12y7mkt9k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_127m7mi4cjvkqv.R.rethrow($CLV_t2$);}finally{__CLR3_1_127m7mi4cjvkqv.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.service.EmployeeServiceTest.editEmployeeTrue",344,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_12y7mkt9k(){try{__CLR3_1_127m7mi4cjvkqv.R.inc(344);
		__CLR3_1_127m7mi4cjvkqv.R.inc(345);emp.setCode(11);
		__CLR3_1_127m7mi4cjvkqv.R.inc(346);emp.setName("cybage");
		__CLR3_1_127m7mi4cjvkqv.R.inc(347);emp.setCity("Delhi");
		__CLR3_1_127m7mi4cjvkqv.R.inc(348);employee.setCode(12);
		__CLR3_1_127m7mi4cjvkqv.R.inc(349);employee.setName("cyb");
		__CLR3_1_127m7mi4cjvkqv.R.inc(350);employee.setCity("Delhi");
		__CLR3_1_127m7mi4cjvkqv.R.inc(351);employeeList.add(emp);
		__CLR3_1_127m7mi4cjvkqv.R.inc(352);employeeList.add(employee);
		__CLR3_1_127m7mi4cjvkqv.R.inc(353);empService.setEmployeeList(employeeList);
		
		__CLR3_1_127m7mi4cjvkqv.R.inc(354);Employee editEmp = new Employee();
		__CLR3_1_127m7mi4cjvkqv.R.inc(355);editEmp.setCode(12);
		__CLR3_1_127m7mi4cjvkqv.R.inc(356);editEmp.setName("Manjul");
		__CLR3_1_127m7mi4cjvkqv.R.inc(357);editEmp.setCity("Kanpur");
		__CLR3_1_127m7mi4cjvkqv.R.inc(358);boolean actual=empService.editEmployee(editEmp);
		__CLR3_1_127m7mi4cjvkqv.R.inc(359);boolean expected = true;
		__CLR3_1_127m7mi4cjvkqv.R.inc(360);assertSame(expected, actual);
	}finally{__CLR3_1_127m7mi4cjvkqv.R.flushNeeded();}}
	
	@Test
	public void editEmployeeFalse() {__CLR3_1_127m7mi4cjvkqv.R.globalSliceStart(getClass().getName(),361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_12nhprlaa1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_127m7mi4cjvkqv.R.rethrow($CLV_t2$);}finally{__CLR3_1_127m7mi4cjvkqv.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.service.EmployeeServiceTest.editEmployeeFalse",361,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_12nhprlaa1(){try{__CLR3_1_127m7mi4cjvkqv.R.inc(361);
		__CLR3_1_127m7mi4cjvkqv.R.inc(362);emp.setCode(11);
		__CLR3_1_127m7mi4cjvkqv.R.inc(363);emp.setName("cybage");
		__CLR3_1_127m7mi4cjvkqv.R.inc(364);emp.setCity("Delhi");
		__CLR3_1_127m7mi4cjvkqv.R.inc(365);employee.setCode(12);
		__CLR3_1_127m7mi4cjvkqv.R.inc(366);employee.setName("cyb");
		__CLR3_1_127m7mi4cjvkqv.R.inc(367);employee.setCity("Delhi");
		__CLR3_1_127m7mi4cjvkqv.R.inc(368);employeeList.add(emp);
		__CLR3_1_127m7mi4cjvkqv.R.inc(369);employeeList.add(employee);
		__CLR3_1_127m7mi4cjvkqv.R.inc(370);empService.setEmployeeList(employeeList);
		
		__CLR3_1_127m7mi4cjvkqv.R.inc(371);Employee editEmp = new Employee();
		__CLR3_1_127m7mi4cjvkqv.R.inc(372);editEmp.setCode(13);
		__CLR3_1_127m7mi4cjvkqv.R.inc(373);editEmp.setName("Manjul");
		__CLR3_1_127m7mi4cjvkqv.R.inc(374);editEmp.setCity("Kanpur");
		__CLR3_1_127m7mi4cjvkqv.R.inc(375);boolean actual=empService.editEmployee(editEmp);
		__CLR3_1_127m7mi4cjvkqv.R.inc(376);boolean expected = true;
		__CLR3_1_127m7mi4cjvkqv.R.inc(377);assertNotSame(expected, actual);
	}finally{__CLR3_1_127m7mi4cjvkqv.R.flushNeeded();}}
}
