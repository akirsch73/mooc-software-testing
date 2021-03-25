package alex.romanNumbers;

public class MirrorEnd {

	public boolean gHappy(String str){
	    assert  str!=null; 	// Stirng ist nicht leer
	    for(int i = 0; i < str.length(); i++){ // iteriere über den String
	     if(str.charAt(i) == 'g'){ // Wenn an der Stelle i ein g ist, dann 
	         if(i > 0 && str.charAt(i-1) == 'g'){continue;}
	         if(i+1 < str.length() && str.charAt(i+1) == 'g'){continue;}
	         return false;
	        }
	    }
	    return true;
	}


	public static void main (String [] args) {
		MirrorEnd mE = new MirrorEnd();
		System.out.println(mE.gHappy(null));
	}
	
}
