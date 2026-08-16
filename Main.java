public class Main {
    static void task1(int n) {

       for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("    ");
            }
            System.out.println(i);
        }
    }


    static void task2(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("    ");
            }
            System.out.println(i);
        }
    }


    static void task3(int n) {
        boolean tub = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                tub = false;
                break;
            }
        }
        if (n > 1 && tub) {
            System.out.println("tub son");
        } else {
            System.out.println("tub son emas");
        }
    }


    static void task4(int n) {
        boolean murakkab = false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                murakkab = true;
                break;
            }
        }
        if (murakkab) {
            System.out.println("Murakkab son");
        } else {
            System.out.println("Murakkab son emas");
        }
    }

    static void task5() {

        int i = 2;
        while (i <= 9) {
            int j = 1;
            while (j <= 9) {
                System.out.println(i + " x " + j + " = " + (i * j));
                j++;
            }
            System.out.println();
            i++;
        }
    }

    static void task6() {
        int i = 1;
        while (i <= 9) {
            int j = 1;
            while (j <= 10) {
                System.out.println(i + " x " + j + " = " + (i * j));
                j++;
            }
            System.out.println();
            i += 2;
        }
    }

    static void task7() {
        int i = 2;
        while (i <= 9) {
            int j = 1;
            while (j < 10) {
                System.out.println(i + " x " + j + " = " + (i * j));
                j++;
            }
            System.out.println();
            i += 2;
        }
    }
    static void task8(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                if (i % 2 == 1 || j % 2 == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }

    static void task9(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

    static void task10(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n || i == (n + 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


    static void task11(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n; j++) {
                if (j == i || j == n - i + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }

    static void task12(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }



    static void task13(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                System.out.print("*  ");

            }
            System.out.println();
            if (i == (n - 1) / 2) {
                System.out.println();
            }
        }
    }

    static void task14(int n) {
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void task15(int n) {
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }


    }








