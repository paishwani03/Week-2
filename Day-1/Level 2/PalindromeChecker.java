
// Class to check for Palindrome
public class PalindromeChecker {
    // Private fields for encapsulation
    private String text;

    // Constructor to initialize text
    public PalindromeChecker(String text) {
        this.text=text;
    }
	
	 // Method to check if the text is a palindrome
	public boolean check(String text){
		int l=text.length();
		char [] arr=new char[l];
		for(int i=0;i<l;i++){
		 arr[i]=text.charAt(i);
		 }
		 
		 // loop to check the revrsed string
		 int index=0;
		 for(int i=l-1;i>=0;i--){
			if(text.charAt(index)!=arr[i]){
			 return false;
			 }
			 index++;
			}
			return true;
			}

    // Method to display result
    public void displayResult() {
		if(check(text)){
			System.out.println("Result: The text is a palindrome.");
		} else {
            System.out.println("Result: The text is not a palindrome.");
        }
    }
 

       // Main method to test the PalindromeChecker class
    public static void main(String[] args) {
        // Creating a PalindromeChecker object
        PalindromeChecker obj = new PalindromeChecker("qwertrewq");
        
        // Displaying result
        obj.displayResult();
        
   
    }
}

