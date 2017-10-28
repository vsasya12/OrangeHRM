package com.orangehrm.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.constants.Orangehrmconstants;
import com.orangehrm.library.AdminHomePage;
import com.orangehrm.library.Employee;
import com.orangehrm.library.Login;

public class NewEmployeeRegTest extends Orangehrmconstants
{
	@Test
	public void empregTest()
	{		
		Login li=new Login();		
		li.adminLogin("Admin", "Admin");		
		AdminHomePage ahome=new AdminHomePage();
		ahome.gotoEmpRegPage();		
		Employee emp=new Employee();
		boolean res=emp.addEmployee("sekar", "demo");
		Assert.assertTrue(res);
		ahome.adminLogout();		
	}
}
