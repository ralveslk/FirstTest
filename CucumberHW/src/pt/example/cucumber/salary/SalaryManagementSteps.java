package pt.example.cucumber.salary;

import static org.junit.Assert.assertEquals;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SalaryManagementSteps {

	private SalaryManager sManager = null;

	@Given("^the salary management system is initialized with the following data$")
	public void the_salary_management_system_is_initialized_with_the_following_data(List<Employee> arg1)
			throws Throwable {
		this.sManager = new SalaryManager(arg1);
	}

	@When("^the boss increases the salary for the employee with id '(\\d+)' by (\\d+)%$")
	public void the_boss_increases_the_salary_for_the_employee_with_id_by(int arg1, int arg2) throws Throwable {
		this.sManager.increaseSalary(arg1, arg2);
	}

	@Then("^the payroll for the employee with id '(\\d+)' should display a salary of (\\d+)$")
	public void the_payroll_for_the_employee_with_id_should_display_a_salary_of(int arg1, double arg2) throws Throwable {
		assertEquals(arg2, this.sManager.getPayroll(arg1).getSalary(), 0);
	}
}
