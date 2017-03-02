package org.amadeus.charon;


public class emailValidator {
 
       	public int validator(String mail){
         
        int atIndex = 0;
        int fullIndex = 0;
		int count = 0;
        
        atIndex = mail.indexOf('@', 0);
        fullIndex = mail.indexOf('.', 0);
        
        //To determine contains at least one .
        if(	mail.contains("."))
        	count++;
        
        //To determine only one @ in email address
        if(mail.indexOf('@', 0) == mail.lastIndexOf('@')) 
            count++;
        //To determine only 2 or 3 characters behind .
        if ((mail.length() - fullIndex -1 == 2) || (mail.length() - fullIndex -1 == 3)){
            count++;
        }
        //To determine . behind @
        if(atIndex < fullIndex) {
            count++;
        }       
        return count;  
    }
 
}