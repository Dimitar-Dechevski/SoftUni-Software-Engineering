import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        String password = "";
        int s1;
        int s2;
        char s3;
        char s4;
        int s5 = 0;

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                s1 = i;
                s2 = j;
                char symbol = (char) (97 + l);
                for (char k = 'a'; k < symbol; k++) {
                    for (char m = 'a'; m < symbol; m++) {
                        s3 = k;
                        s4 = m;
                        for (int o = 1; o <= n; o++) {
                            if (o > s1) {
                                if (o > s2) {
                                    s5 = o;
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                            password = password.concat(String.valueOf(s1));
                            password = password.concat(String.valueOf(s2));
                            password = password.concat(String.valueOf(s3));
                            password = password.concat(String.valueOf(s4));
                            password = password.concat(String.valueOf(s5));
                            System.out.print(password + " ");
                            password = "";
                        }
                    }
                }
            }
        }
    }
}