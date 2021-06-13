package parkplus;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import common.LaunchBrowser;

public class Tenant extends LaunchBrowser {
	
	
	
	

	@Test(priority = 0)
	public void open_tetant_login_page() throws Exception {

		try {
			System.out.println("==================================");
			
			openURL(propConfig.getProperty("tenant_home_page_prod"));
			System.out.println("=====================================");
			System.out.println("Opened Tenant PWA Page.");

		} catch (Exception e) {
			addErrorlogs(e, "Error while tenant PWA home page is opening.");
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

			click(By.xpath(propObjctRepo.getProperty("xpath_opearator_oto_box1")));
			clear(By.xpath(propObjctRepo.getProperty("xpath_opearator_oto_box1")));
			type(By.xpath(propObjctRepo.getProperty("xpath_opearator_oto_box1")), "1");
			
			click(By.xpath(propObjctRepo.getProperty("xpath_opearator_oto_box2")));
			clear(By.xpath(propObjctRepo.getProperty("xpath_opearator_oto_box2")));
			type(By.xpath(propObjctRepo.getProperty("xpath_opearator_oto_box2")), "2");
			
			click(By.xpath(propObjctRepo.getProperty("xpath_opearator_oto_box3")));
			clear(By.xpath(propObjctRepo.getProperty("xpath_opearator_oto_box3")));
			type(By.xpath(propObjctRepo.getProperty("xpath_opearator_oto_box3")), "3");
			
			click(By.xpath(propObjctRepo.getProperty("xpath_opearator_oto_box4")));
			clear(By.xpath(propObjctRepo.getProperty("xpath_opearator_oto_box4")));
			type(By.xpath(propObjctRepo.getProperty("xpath_opearator_oto_box4")), "4");


		} catch (Exception e) {
			addErrorlogs(e, "Error while typing otp in otp input boxes.");
		}

	}	
	
	
	@Test(priority = 5)
	public void submit_otp() throws Exception {

		try {
			Thread.sleep(1000);
		    click(By.xpath(propObjctRepo.getProperty("xpath_operator_submit_otp_button")));


		} catch (Exception e) {
			addErrorlogs(e, "Error clicking on otp submit button.");
		}

	}

	@Test(priority = 6)
	public void Click_on_scan_qr_code_button_to_entry() throws Exception {

		try {
			Thread.sleep(1000);
		    click(By.xpath(propObjctRepo.getProperty("xpath_scan_qr_code_button")));


		} catch (Exception e) {
			addErrorlogs(e, "Error clicking on qr code button.");
		}

	}
	
	@Test(priority = 7)
	public void Enter_qr_code_to_store_entry() throws Exception {

		try {
			
		
			String pin_to_entry = Visitor.QRpin;
			System.out.println("pin_to_entry : "  +pin_to_entry);
			escape();
			click(By.xpath(propObjctRepo.getProperty("xpath_scan_qr_code_enter_textbox")));
			clear(By.xpath(propObjctRepo.getProperty("xpath_scan_qr_code_enter_textbox")));
			type(By.xpath(propObjctRepo.getProperty("xpath_scan_qr_code_enter_textbox")),pin_to_entry );


		} catch (Exception e) {
			addErrorlogs(e, "Error while entering qr code.");
		}

	}
	
	@Test(priority = 8)
	public void submit_qr_code_for__visitor_entry() throws Exception {

		try {
			
		
			click(By.xpath(propObjctRepo.getProperty("xpath_operator_qr_submit_button")));



		} catch (Exception e) {
			addErrorlogs(e, "Error while submitting the qr code to make an entry");
		}

	}	
	
	
	@Test(priority = 9)
	public void enter_vistors_in_store() throws Exception {

		try {
			
			Thread.sleep(1000);
			click(By.xpath(propObjctRepo.getProperty("xpath_tenant_entry_submit_button")));
			Thread.sleep(1000);
			click(By.xpath(propObjctRepo.getProperty("xpath_tenant_entry_done_close_overlay")));


		} catch (Exception e) {
			addErrorlogs(e, "Error while submitting the qr code to make an entry");
		}

	}
	
	

	

	@Test(priority = 10)
	public void Click_on_scan_qr_code_button_to_exit() throws Exception {

		try {
			Thread.sleep(1000);
		    click(By.xpath(propObjctRepo.getProperty("xpath_scan_qr_code_button")));


		} catch (Exception e) {
			addErrorlogs(e, "Error clicking on qr code button to exit.");
		}

	}
	
	@Test(priority = 11)
	public void Enter_qr_code_to_exit() throws Exception {

		try {
			
		
			String pin_to_entry = Visitor.QRpin;
			System.out.println("pin_to_entry : "  +pin_to_entry);
			escape();
			click(By.xpath(propObjctRepo.getProperty("xpath_scan_qr_code_enter_textbox")));
			clear(By.xpath(propObjctRepo.getProperty("xpath_scan_qr_code_enter_textbox")));
			type(By.xpath(propObjctRepo.getProperty("xpath_scan_qr_code_enter_textbox")),pin_to_entry );
			Thread.sleep(1000);

		} catch (Exception e) {
			addErrorlogs(e, "Error while entering qr code to exit.");
		}

	}
	
	@Test(priority = 12)
	public void submit_qr_code_for_exit() throws Exception {

		try {
			
		
			click(By.xpath(propObjctRepo.getProperty("xpath_operator_qr_submit_button")));
			Thread.sleep(1000);

		} catch (Exception e) {
			addErrorlogs(e, "Error while submitting the qr code to make an exit");
		}

	}	
	
	
	@Test(priority = 13)
	public void exit_vistors_from_store() throws Exception {

		try {
			
			Thread.sleep(1000);
			click(By.xpath(propObjctRepo.getProperty("xpath_tenant_entry_submit_button")));
			Thread.sleep(1000);
			click(By.xpath(propObjctRepo.getProperty("xpath_tenant_entry_done_close_overlay")));

		} catch (Exception e) {
			addErrorlogs(e, "Error while exiting the visitor from the store");
		}

	}	
	
	@Test(priority = 14)
	public void tenant_logout() throws Exception {

		try {
			

			click(By.xpath(propObjctRepo.getProperty("xpath_operator_logout_button")));
			
		
		} catch (Exception e) {
			addErrorlogs(e, "Error while logging out the tenant.");
		}

	}	
	
}
