//7.Write a program to generate a six-digit OTP number using Math.random() method. Validate the numbers are unique by generating the OTP number 10 times and ensuring all the 10 OTPs are not the same

package MethodLevel3;
import java.util.Scanner;
public class OTPGenerate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] otps = new String[10];

        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("Generated OTP " + (i + 1) + ": " + otps[i]);
        }

        boolean areUnique = areOTPsUnique(otps);
        System.out.println("Are all generated OTPs unique? " + areUnique);

        scanner.close();
    }
    public static String generateOTP() {
        StringBuilder otp = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            int digit = (int)(Math.random() * 10);
            otp.append(digit);
        }
        return otp.toString();
    }
    public static boolean areOTPsUnique(String[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i].equals(otps[j])) {
                    return false;
                }
            }
        }
        return true;
    }

}
