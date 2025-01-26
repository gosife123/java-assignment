
public class Assignment1b {

	    public static void main(String[] args) {
	        int rows = 4;
	        int greenWidth = 4;
	        int whiteWidth = 4;

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < greenWidth * 2 + whiteWidth; j++) {
	                if (j < greenWidth || j >= greenWidth + whiteWidth) {
	                    System.out.print("*");
	                } else {
	                    System.out.print("=");
	                }
	            }
	            System.out.println(); 
	        }
	    }
	}
