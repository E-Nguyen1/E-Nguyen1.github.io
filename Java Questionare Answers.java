/*
Question 1a - The garden (answer: A:Welcome Peter to the wizard world!)
Question 1b - The forest (answer: C: Welcome Beatrix to the wizard world!)
Question 2a - Library (answer: B: The cost will be 2 Doubloon coins.)
Question 2b - Classroom 394 (answer: C: The cost will be 1 Doubloon coin.)
Question 3a - Lost & Found room (answer: B:5)
Question 3b - Dormitory (answer: A:6)
Question 4a - Dragon's Den (answer: A: The current highest house point is: 104!)
Question 4b - Pixie Cottage (answer:B: The current highest house point is: 110!)
*/


//Question 1a - The garden (answer: A:Welcome Peter to the wizard world!)
import java.util.Scanner;
    public class HelloWizard {
        public static void main(String[] args) {
            Scanner scnr = new Scanner(System.in);
            String userInput;

            System.out.println("Enter first name: ");
            userInput = scnr.nextLine();

            System.out.println();
            System.out.println("Welcome " + userInput + " " + "to the wizard world" + "!");
        }
    }

//Question 1b - The forest (answer: C: Welcome Beatrix to the wizard world!)
import java.util.Scanner;
    public class HelloWizard {
        public static void main(String[] args) {
            Scanner scnr = new Scanner(System.in);
            String userInput;

            System.out.println("Enter first name: ");
            userInput = scnr.nextLine();

            System.out.println();
            System.out.println("Welcome " + userInput + " " + "to the wizard world" + "!");
        }
    }

//Question 2a - Library (answer: B: The cost will be 2 Doubloon coins.)
import java.util.Scanner;

    public class HologramJellybeans {
        public static void main(String[] args) {
            int jellyBeans;
            int doubloonCoins = 0;
            Scanner scnr = new Scanner(System.in);

            System.out.println("How many cartons of Hologram Jellybeans would you like: ");
            jellyBeans = scnr.nextInt();

            if (jellyBeans == 1) { 
                doubloonCoins = 1;
            }
            else if (jellyBeans == 2) {
                doubloonCoins = 2;
            }
            else if (jellyBeans > 2) {
                System.out.println("Sorry cannot buy more than 2 cartons.");
            }
            
            if (jellyBeans > 0 && jellyBeans < 3) {
                if (jellyBeans == 1) {
                    System.out.println("The cost will be " + doubloonCoins + " Doubloon coin.");
                }
                else {
                    System.out.println("The cost will be " + doubloonCoins + " Doubloon coins.");
                }
            }
            
        }
    }

//Question 2b - Classroom 394 (answer: C: The cost will be 1 Doubloon coin.)
import java.util.Scanner;

    public class GalaxyLollypop {
        public static void main(String[] args) {
            int galaxyLollypop;
            int doubloonCoins = 0;
            Scanner scnr = new Scanner(System.in);

            System.out.println("How many cartons of Hologram Jellybeans would you like: ");
            galaxyLollypop = scnr.nextInt();

            if (galaxyLollypop == 1) { 
                doubloonCoins = 1;
            }
            else if (galaxyLollypop == 2) {
                doubloonCoins = 2;
            }
            else if (galaxyLollypop > 2) {
                System.out.println("Sorry, cannot buy more than 2 Galaxy Lollipops.");
            }
            
            if (galaxyLollypop > 0 && galaxyLollypop < 3) {
                if (galaxyLollypop == 1) {
                    System.out.println("The cost will be " + doubloonCoins + " Doubloon coin.");
                }
                else {
                    System.out.println("The cost will be " + doubloonCoins + " Doubloon coins.");
                }
            }
            
        }
    }

//Question 3a - Lost & Found room (answer: B:5)
import java.util.Scanner;

    public class MagicPassword {
        public static void main(String[] args) {
            Scanner scnr = new Scanner(System.in);
            String secretMessage;
            int numDigits;
            int i;

            secretMessage = "KAS13SWER459ASSGOODLUCK";

            numDigits = 0;
            for (i = 0; i < secretMessage.length(); ++i) {
                if (Character.isDigit(secretMessage.charAt(i))) {
                    numDigits += 1;
                }
            }

            System.out.println("The code passcode is: " + numDigits);
        }
    }

//Question 3b - Dormitory (answer: A:6)
import java.util.Scanner;

    public class MagicPassword {
        public static void main(String[] args) {
            Scanner scnr = new Scanner(System.in);
            String secretMessage;
            int numDigits;
            int i;

            secretMessage = "HELLO13SWER459ASSGOODLUCK3";

            numDigits = 0;
            for (i = 0; i < secretMessage.length(); ++i) {
                if (Character.isDigit(secretMessage.charAt(i))) {
                    numDigits += 1;
                }
            }

            System.out.println("The code passcode is: " + numDigits);
        }
    }

//Question 4a - Dragon's Den (answer: A: The current highest house point is: 104!)
import java.util.Scanner;

    public class MaxHousePoints {
        public static void main(String[] args) {
            Scanner scnr = new Scanner(System.in);
            final int NUM_ELEMENTS = 4;            
            int[] userNums = new int[NUM_ELEMENTS]; 
            int i;                                  
            int maxHousePoints;                             

            System.out.println("Enter the points for all " + NUM_ELEMENTS + " houses.");
            
            for (i = 0; i < userNums.length; ++i) {
                userNums[i] = scnr.nextInt();
            }
            
            maxHousePoints = userNums[0];
            for (i = 0; i < userNums.length; ++i) {
                if (userNums[i] > maxHousePoints) {
                    maxHousePoints = userNums[i];
                }
            }
            System.out.println("The current highest house point is: " + maxHousePoints + "!");
        }
    }

//Question 4b - Pixie Cottage (answer:B: The current highest house point is: 110!)
import java.util.Scanner;

    public class MaxHousePoints {
        public static void main(String[] args) {
            Scanner scnr = new Scanner(System.in);
            final int NUM_ELEMENTS = 4;            
            int[] userNums = new int[NUM_ELEMENTS]; 
            int i;                                  
            int maxHousePoints;                             

            System.out.println("Enter the points for all " + NUM_ELEMENTS + " houses.");
            
            for (i = 0; i < userNums.length; ++i) {
                userNums[i] = scnr.nextInt();
            }

            
            maxHousePoints = userNums[0];
            
            for (i = 0; i < userNums.length; ++i) {
                if (userNums[i] > maxHousePoints) {
                    maxHousePoints = userNums[i];
                }
            }
            System.out.println("The current highest house point is: " + maxHousePoints + "!");
        }
    }