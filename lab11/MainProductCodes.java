package lab11;

import java.util.Scanner;

/**Gets product codes and returns the number of valid codes and banned codes
 * valid codes are entered as: CCCNNNNCCC
 *                             N-number
 *                             C-any character
 * banned codes are such that 10-th character = 'R' and NNNN>2000.
 *
 */
public class MainProductCodes {
    public static void main(String[] args) {
        String code;
        int valid = 0, banned = 0, countV = 0;
        Scanner scanner = new Scanner(System.in);
//        String str="VDF 100TTR";
//        System.out.println(str.length());
        System.out.println("""
                Enter product-code CCCNNNNCCC 
                N-number 
                C-any character 
                or
                XXX to quit:\t""");
        code = scanner.nextLine();

//        while (!code.equals("XXX")) {
//            try {
//                if (code.length() < 10) {
//                    throw new Exception(":Index 9 out of bounds for length 9");
//                }
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//            try {
//                int temp = Integer.parseInt(code.substring(3, 7));
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//            try {
//                if (code.charAt(9) == 'R' && Integer.parseInt(code.substring(3, 7)) > 2000)
//                    banned++;
//            }catch (Exception e) {
//                System.out.println(e);
//            }
//            System.out.println("Enter product-code CCCNNNNCCL:\n");
//            code = scanner.nextLine();
//        }
//        System.out.println("Summary:\n============");
//        System.out.println("number of valid codes: " + valid);
//        System.out.println("number of banned codes: " + banned);


        while (!code.equals("XXX")) {
            try {
                if (code.length() < 10) {
                    throw new Exception(":Index 9 out of bounds for length 9");
                }
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Enter product-code CCCNNNNCCL:\n");
                code = scanner.nextLine();
                continue;
            }
            try {
                int temp = Integer.parseInt(code.substring(3, 7));
            } catch (Exception e) {
                System.out.println("is not numeric:");
                System.out.println("Enter product-code CCCNNNNCCL:\n");
                code = scanner.nextLine();
                continue;
            }

                if (code.charAt(9) == 'R' && Integer.parseInt(code.substring(3, 7)) > 2000) {
                    banned++;
                }
                else {
                    valid++;
                }
            System.out.println("Enter product-code CCCNNNNCCL:\n");
            code = scanner.nextLine();
        }
            System.out.println("Summary:\n============");
            System.out.println("number of valid codes: " + valid);
            System.out.println("number of banned codes: " + banned);
    }
}

//fill in the while loop
//check the code and update the variables:
//valid - counts the number of valid codes received
//banned - counts the number of valid codes that have:
//         'R' in the 10th character and
//         the 'city code' >2000


