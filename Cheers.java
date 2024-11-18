// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String word = args[0];
            int num = Integer.parseInt(args[1]);
            int length = word.length();
            String capitalWord = "";

            for (int i = 0; i <= length - 1; i++) {
                capitalWord = capitalWord + Character.toUpperCase(word.charAt(i));
            }
            
            for (int i = 0; i <= length - 1; i++) {
                switch (capitalWord.charAt(i)) {
                        case 'A':
                        System.out.println("Give me an " + capitalWord.charAt(i) + ": " + capitalWord.charAt(i) + "!");
                                break;
                        case 'E':
                        System.out.println("Give me an " + capitalWord.charAt(i) + ": " + capitalWord.charAt(i) + "!");
                                break;
                        case 'F':
                        System.out.println("Give me an " + capitalWord.charAt(i) + ": " + capitalWord.charAt(i) + "!");
                                break;
                        case 'H':
                        System.out.println("Give me an " + capitalWord.charAt(i) + ": " + capitalWord.charAt(i) + "!");
                                break;
                        case 'I':
                        System.out.println("Give me an " + capitalWord.charAt(i) + ": " + capitalWord.charAt(i) + "!");
                                break;
                        case 'L':
                        System.out.println("Give me an " + capitalWord.charAt(i) + ": " + capitalWord.charAt(i) + "!");
                                break;
                        case 'M':
                        System.out.println("Give me an " + capitalWord.charAt(i) + ": " + capitalWord.charAt(i) + "!");
                                break;
                        case 'N':
                        System.out.println("Give me an " + capitalWord.charAt(i) + ": " + capitalWord.charAt(i) + "!");
                                break;
                        case 'O':
                        System.out.println("Give me an " + capitalWord.charAt(i) + ": " + capitalWord.charAt(i) + "!");
                                break;
                        case 'R':
                        System.out.println("Give me an " + capitalWord.charAt(i) + ": " + capitalWord.charAt(i) + "!");
                                break;
                        case 'S':
                        System.out.println("Give me an " + capitalWord.charAt(i) + ": " + capitalWord.charAt(i) + "!");
                                break;
                        case 'X':
                        System.out.println("Give me an " + capitalWord.charAt(i) + ": " + capitalWord.charAt(i) + "!");
                                break;
                             
        
                        default:
                        System.out.println("Give me a  " + capitalWord.charAt(i) + ": " + capitalWord.charAt(i) + "!");
                        
                }
                
            }
            
            System.out.println("What does that spell?");
            for (int i = 0; i <= num - 1; i++) {
                System.out.println(capitalWord + "!!!");
            }
            

        


        }
}
