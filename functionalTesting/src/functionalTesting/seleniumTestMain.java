package functionalTesting;

public class seleniumTestMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		addNewAdmin addAdmin = new addNewAdmin();
		addNewGenUser addGenUser = new addNewGenUser();
		SearchBlockedVehicles searchBlockedVehicles = new SearchBlockedVehicles();
		SearchAdmin searchAdmin = new SearchAdmin();
		SearchGenUser searchGenUser = new SearchGenUser();
		EditAdminDetails editAdminDetails = new EditAdminDetails();
		EditGenUser editGenUser = new EditGenUser();
		EditAdmin editAdmin = new EditAdmin();
		
		System.setProperty("webdriver.chrome.driver", "F:\\softwares\\new selenium\\exefiles\\chromedriver.exe");
		
		//adding an admin
//		addAdmin.testAddAdmin();
		
		//adding a gen user
//		addGenUser.testAddGenUser();
		
		//search a blocked vehicle
//		searchBlockedVehicles.testSearchABlockedVehicle();
		
		//search admin
//		searchAdmin.testSearchAdmin();
		
		//search gen user
//		searchGenUser.testSearchGeneralUser();
		
		//edit admin 
//		editAdminDetails.testEditAdmin();
		
		//edit gen user
//		editGenUser.testEditGenUser();
		
		//edit admin
		editAdmin.testEditAdmin();
	}

}
