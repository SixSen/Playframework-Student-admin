package controllers;
 
import models.*;
 
public class Security extends Secure.Security {
	 static boolean authenticate(String username, 
				String password) {
			    return User.connect(username, password) != null;
	 	}
	 public static boolean check(String profile) {
		    if(Security.isConnected()){
		    	if(profile.equals("admin")) {
		    		String user = Security.connected();
		   	 	User u = User.find("byEmail", user).first();
		   	 	return u.isAdmin;
		    	}
		    	else {
		    	if (profile.equals("")) {
					
				}
		    	return true;
		    	}
		    }
		    else
		    	return false;
		}


}
