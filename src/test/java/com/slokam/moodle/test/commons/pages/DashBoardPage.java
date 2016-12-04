package com.slokam.moodle.test.commons.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.slokam.moodle.test.commons.CustomConstants;
import com.slokam.moodle.test.commons.Navigation;

public class DashBoardPage {
	WebDriver driver;

	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
	}

	public void search(String searchString) {

	}

	public void navigateToNewUserPage() {

		driver.findElement(By.xpath("//span[text()='"+CustomConstants.SITE_ADMINISTRATION+"']")).click();
		driver.findElement(By.xpath("//span[text()='"+CustomConstants.USERS+"']")).click();
		driver.findElement(By.xpath("//span[text()='"+CustomConstants.ACCOUNTS+"']")).click();
		driver.findElement(By.xpath("//span[text()='Add a new user']")).click();

	}

	public void navigateToBulkUserPage() {

		driver.findElement(By.xpath("//span[text()='Site administration']")).click();
		driver.findElement(By.xpath("//span[text()='Users']")).click();
		driver.findElement(By.xpath("//span[text()='Accounts']")).click();
		driver.findElement(By.xpath("//span[text()='Bulk user actions']")).click();

	}

	public void navigateToDefineRolesPage() {

		driver.findElement(By.xpath("//span[text()='Site administration']")).click();
		driver.findElement(By.xpath("//span[text()='Users']")).click();
		driver.findElement(By.xpath("//span[text()='Permissions']")).click();
		driver.findElement(By.xpath("//span[text()='Define roles']")).click();

	}

	public void navigateToManageAuthentication() {

		driver.findElement(By.xpath("//span[text()='Site administration']")).click();
		driver.findElement(By.xpath("//span[text()='Plugins']")).click();
		driver.findElement(By.xpath("//span[text()='Authentication']")).click();
		driver.findElement(By.xpath("//span[text()='Manage authentication']")).click();

	}

	public void navigateToPage(String category, String subCat, String item) {
		driver.findElement(By.xpath("//span[text()='"+CustomConstants.SITE_ADMINISTRATION+"']")).click();
		driver.findElement(By.xpath("//span[text()='" + category + "']")).click();
		driver.findElement(By.xpath("//span[text()='" + subCat + "']")).click();
		driver.findElement(By.xpath("//span[text()='" + item + "']")).click();
	}
	public void navigateToPage(String category,  String item) {
		driver.findElement(By.xpath("//span[text()='Site administration']")).click();
		driver.findElement(By.xpath("//span[text()='" + category + "']")).click();
		driver.findElement(By.xpath("//span[text()='" + item + "']")).click();
	}
	public void navigateToPage( String item) {
		driver.findElement(By.xpath("//span[text()='Site administration']")).click();
		driver.findElement(By.xpath("//span[text()='" + item + "']")).click();
	}
	
	/*public void navigateToPage(Navigation nav) {
		driver.findElement(By.xpath("//span[text()='"+CustomConstants.SITE_ADMINISTRATION+"']")).click();
		driver.findElement(By.xpath("//span[text()='" + category + "']")).click();
		driver.findElement(By.xpath("//span[text()='" + subCat + "']")).click();
		driver.findElement(By.xpath("//span[text()='" + item + "']")).click();
	}*/
	
	public void gotoParticipantsPage() {
		String value = driver
				.findElement(By.xpath("//p[@id='expandable_branch_0_courses']//a[text()='Courses']/ancestor::li[1]"))
				.getAttribute("aria-expanded");
		if (value.equals("false")) {
			driver.findElement(By.xpath("//a[text()='Courses']/..")).click();
		}

		driver.findElement(By.xpath("//a[@title='Selenium Course1']")).click();
		driver.findElement(By.xpath("//a[text()='Participants']")).click();

	}
}
