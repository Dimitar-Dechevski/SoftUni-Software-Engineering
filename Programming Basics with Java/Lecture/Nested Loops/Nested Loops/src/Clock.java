public class Clock {

    public static void main(String[] args) {

        for (int h = 0; h <= 23; h++) {
            for (int m = 0; m <= 59; m++) {
                if (h < 10) {
                    if (m < 10) {
                        System.out.printf("0%d:0%d%n", h, m);
                    } else {
                        System.out.printf("0%d:%d%n", h, m);
                    }
                } else {
                    if (m < 10) {
                        System.out.printf("%d:0%d%n", h, m);
                    } else {
                        System.out.printf("%d:%d%n", h, m);
                    }
                }
            }
        }
    }
}
