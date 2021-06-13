package parkplus;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import common.LaunchBrowser;

public class Visitor extends LaunchBrowser {
	
	static String QRpin;

	@Test(priority = 0)
	public void open_visitor_login_page() throws Exception {

		try {
			System.out.println("==================================");
			openURL(propConfig.getProperty("visitor_home_page_prod"));
			System.out.println("=====================================");
			System.out.println("Opened Visitor PWA Page.");

		} catch (Exception e) {
			addErrorlogs(e, "Error on visitor PWA home page opening.");
		}

	}

	@Test(priority = 1)
	public void clear_phone_text_field() throws Exception {

		try {

			clear(By.name(propObjctRepo.getProperty("name_input_phone")));

		} catch (Exception e) {
			addErrorlogs(e, "Error on clearing the phone input field.");
		}

	}

	@Test(priority = 2)
	public void input_phone_number_in_text_field() throws Exception {

		try {

			type(By.name(propObjctRepo.getProperty("name_input_phone")), "5555555555");

		} catch (Exception e) {
			addErrorlogs(e, "Error while inputing the phone number");
		}

	}
	

	@Test(priority = 3)
	public void Click_on_verify_button() throws Exception {

		try {

		    click(By.xpath(propObjctRepo.getProperty("xpath_phone_verify_button")));


		} catch (Exception e) {
			addErrorlogs(e, "Error clicking on verify button.");
		}

	}	
	
	@Test(priority = 4)
	public void enter_otp_in_otp_boxes() throws Exception {

		try {

			
			click(By.xpath(propObjctRepo.getProperty("xpath_oto_box1")));
			clear(By.xpath(propObjctRepo.getProperty("xpath_oto_box1")));
			type(By.xpath(propObjctRepo.getProperty("xpath_oto_box1")), "1");
			
			click(By.xpath(propObjctRepo.getProperty("xpath_oto_box2")));
			clear(By.xpath(propObjctRepo.getProperty("xpath_oto_box2")));
			type(By.xpath(propObjctRepo.getProperty("xpath_oto_box2")), "2");
			
			click(By.xpath(propObjctRepo.getProperty("xpath_oto_box3")));
			clear(By.xpath(propObjctRepo.getProperty("xpath_oto_box3")));
			type(By.xpath(propObjctRepo.getProperty("xpath_oto_box3")), "3");
			
			click(By.xpath(propObjctRepo.getProperty("xpath_oto_box4")));
			clear(By.xpath(propObjctRepo.getProperty("xpath_oto_box4")));
			type(By.xpath(propObjctRepo.getProperty("xpath_oto_box4")), "4");


		} catch (Exception e) {
			addErrorlogs(e, "Error while typing otp in otp input boxes.");
		}

	}	
	
	
	@Test(priority = 5)
	public void submit_otp() throws Exception {

		try {
			Thread.sleep(1000);
		    click(By.xpath(propObjctRepo.getProperty("xpath_submit_otp_button")));


		} catch (Exception e) {
			addErrorlogs(e, "Error clicking on otp submit button.");
		}

	}

	@Test(priority = 6)
	public void add_visitor() throws Exception {

		try {
			Thread.sleep(1000);
		    click(By.xpath(propObjctRepo.getProperty("xpath_plus_button")));
		    Thread.sleep(1000);
		    click(By.xpath(propObjctRepo.getProperty("xpath_plus_button")));
		    Thread.sleep(1000);
		    click(By.xpath(propObjctRepo.getProperty("xpath_plus_button")));
		    Thread.sleep(1000);
		    click(By.xpath(propObjctRepo.getProperty("xpath_plus_button")));


		} catch (Exception e) {
			addErrorlogs(e, "Error on clicking the plus visitor button.");
		}

	}
	
	
	@Test(priority = 7)
	public void accept_terms_and_conditions() throws Exception {

		try {
			Thread.sleep(1000);
		    click(By.xpath(propObjctRepo.getProperty("xpath_tnc_checkbox")));



		} catch (Exception e) {
			addErrorlogs(e, "Error on clicking the terms and conditions checkbox.");	
		}

	}
	
	@Test(priority = 8)
	public void Confirm_terms_and_conditions_and_submit() throws Exception {

		try {
			Thread.sleep(1000);
		    click(By.xpath(propObjctRepo.getProperty("xpath_accept_tnc_submit_button")));



		} catch (Exception e) {
			addErrorlogs(e, "Error on clicking the terms submit button.");	
		}

	}	
	
	
	@Test(priority = 9)
	public void read_qr_go_to_home() throws Exception {

		try {
			Thread.sleep(1000);
			
		    String pin= getText(By.xpath(propObjctRepo.getProperty("xpath_qr_code_text")));
		    
		    
		    String qr = pin;
		    qr = qr.replaceAll("\\D+","");
		    
		    System.out.println("User QR Code/PIN Generated : " + qr);
		    
		    QRpin= qr;
		    
		    
		    
		    
		    click(By.xpath(propObjctRepo.getProperty("xpath_read_qr_goto_home_button")));



		} catch (Exception e) {
			addErrorlogs(e, "Error on clicking go to home button click");	
		}

	}
	
	@Test(priority = 10)
	public void home_goto_my_bookings() throws Exception {

		try {
			Thread.sleep(1000);
		    click(By.xpath(propObjctRepo.getProperty("xpath_home_mybookings_button")));



		} catch (Exception e) {
			addErrorlogs(e, "Error on clicking go to my bookings on home screen.");	
		}

	}
	
	@Test(priority = 11)
	public void bookings_screen_shoping_parking_tab_switch() throws Exception {

		try {
			
			Thread.sleep(1000);
		    click(By.xpath(propObjctRepo.getProperty("xpath_mybooking_shoping_tab")));

		    Thread.sleep(1000);
		    click(By.xpath(propObjctRepo.getProperty("xpath_mybooking_parking_tab")));


		} catch (Exception e) {
			addErrorlogs(e, "Error on swiching shoping and parking tab on my bookings screen");	
		}

	}	
	
	@Test(priority = 12)
	public void go_back_from_my_bookings_to_home_screen() throws Exception {

		try {
			
			Thread.sleep(1000);
		    click(By.xpath(propObjctRepo.getProperty("xpath_mybooking_to_home_back_button")));



		} catch (Exception e) {
			addErrorlogs(e, "Error while coming back from bookings screen to home screen");	
		}

	}


	
}
