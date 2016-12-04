package com.slokam.moodle.test.commons.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ParticipantPage {

	WebDriver driver;

	public ParticipantPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getUserDetails() {

		// Verify user details - Participants Page --- Testdata

		String actual = driver.findElement(By.xpath("//table[@id='participants']//tr[1]/td[4]")).getText();
		return actual;
	}
}
