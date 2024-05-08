package appFeatures;

public class AppLogin {
	
	public boolean login(String user, String pwd) {
		
		boolean login_status = false;
		
		if(user.equals("admin") && pwd.equals("admin")) {
			
			login_status = true;
			
		}else if(!user.equals("admin") && !pwd.equals("admin")) {
			
			login_status = false;
			
		}
		
		return login_status;
	}

}
