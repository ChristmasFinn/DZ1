import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        for (; true; ) {
            Scanner scan = new Scanner(System.in);
            Scanner scan2 = new Scanner(System.in);
            System.out.println();
            System.out.println("Please enter task number(1,2,3,4,5,6)");
            int tn = scan.nextInt();

            switch (tn) {
                case 1: {
                    System.out.println("--------------------------Task number 1--------------------------");
                    System.out.print("Enter your name:");
                    String name = scan2.next();
                    System.out.println("Hello, " + name + "!!!");
                }
                break;

                case 2: {
                    System.out.println("--------------------------Task number 2--------------------------");
                    System.out.print("Enter anything here:");
                    char[] rev = scan2.nextLine().toCharArray();
                    System.out.print("It`s a kind of magic: ");
                    for (int i = rev.length; i > 0; i--) {
                        System.out.print(rev[i - 1]);
                    }
                    System.out.println();
                }
                break;

                case 3: {
                    System.out.println("--------------------------Task number 3--------------------------");
                    System.out.print("Enter how many random numbers you want to see: ");
                    int a = scan2.nextInt();
                    int q = 0;


                    System.out.println("Random numbers in a table");
                    for (int i = 1; i <= a; i++) {
                        System.out.println(i + "-e sluchainoe chislo: " + (q + (int) (Math.random() * a)));

                    }

                    System.out.println("Random numbers in a row");
                    for (int i = 1; i <= a; i++) {
                        System.out.print((q + (int) (Math.random() * a)) + "; ");
                    }
                    System.out.println();
                }
                break;

                case 4: {
                    System.out.println("--------------------------Task number 4--------------------------");
                    System.out.print("Enter password: ");
                    String truepass = "pass";
                    String pass = scan2.next();
                    if (truepass.equals(pass)) {
                        System.out.println("Password is right");
                    } else {
                        System.out.println("Password is wrong");
                    }
                }
                break;

                case 5: {
                    System.out.println("--------------------------Task number 5--------------------------");
                    System.out.print("Enter 4isla here:");
                    String[] box = scan2.nextLine().split(" ");
                    int q = 0;
                    for (int i = 0; i < box.length; i++) {
                        q = q + Integer.parseInt(box[i]);
                    }
                    System.out.println("Summa: " + q);
                    int w = 1;
                    for (int i = 0; i < box.length; i++) {
                        w = w * Integer.parseInt(box[i]);
                    }
                    System.out.println("Proizvedenie: " + w);
                }
                break;
                case 6: {
                    System.out.println("--------------------------Task number 6--------------------------");

                    Scanner scan3 = new Scanner(System.in);
                    int tn6 = scan.nextInt();

                    System.out.print("Enter 4isla here:");
                    String[] box = scan3.nextLine().split(" ");
//                        case 1: {

                    System.out.print("4etnie 4isla: ");

                    for (int i = 0; i < box.length; i++) {
                        int q = Integer.parseInt(box[i]);
                        if (q % 2 == 0) {
                            System.out.print(q + "; ");
                        }
                    }
                    System.out.println();

                    System.out.print("Ne 4etnie 4isla: ");
                    for (int i = 0; i < box.length; i++) {
                        int q = Integer.parseInt(box[i]);
                        if (q % 2 != 0) {
                            System.out.print(q + "; ");
                        }
                    }
                    System.out.println();

                    int w = Integer.parseInt(box[0]);
                    for (int i = 0; i < box.length; i++) {
                        int q = Integer.parseInt(box[i]);
                        if (w < q) {
                            w = q;
                        }
                    }
                    System.out.print("Max 4islo: " + w);
                    System.out.println();


                    int e = Integer.parseInt(box[0]);
                    for (int i = 0; i < box.length; i++) {
                        int q = Integer.parseInt(box[i]);
                        if (e > q) {
                            e = q;
                        }
                    }
                    System.out.print("Min 4islo: " + e);
                    System.out.println();


                    System.out.print("Del9ts9 na 3 ili na 9: ");

                    for (int i = 0; i < box.length; i++) {
                        int q = Integer.parseInt(box[i]);
                        if (q % 3 == 0 || q % 9 == 0) {
                            System.out.print(q + "; ");
                        }
                    }
                    System.out.println();

                    System.out.print("Del9ts9 na 5 i na 7: ");

                    for (int i = 0; i < box.length; i++) {
                        int q = Integer.parseInt(box[i]);
                        if (q % 5 == 0 && q % 7 == 0) {
                            System.out.print(q + "; ");
                        }
                    }
                    System.out.println();
//                        }
                    //     dz 6.5
                    char[] srv;
                    int q;
                    System.out.print("4isla s raznimi ciframi:");
                    for (int i = 0; i < box.length; i++) {
                        q = Integer.parseInt(box[i]);

                        if (q > 99 && q < 1000) {

                            srv = box[i].toCharArray();
                            if (srv[0] != srv[1] && srv[0] != srv[2] && srv[1] != srv[2]) {

                                System.out.print(" " + srv[0] + srv[1] + srv[2] + "; ");

                            }
                        }
                    }
//                                                   DZ 6.6

                    for (int i = 0; i < box.length; i++) {

                        srv = box[i].toCharArray();
                        if (srv.length % 2 == 0) {
                            int q1 = 0, q2 = 0;
                            for (int j = 0; j < srv.length / 2; j++) {
                                q1 = q1 + Character.getNumericValue(srv[j]);
                            }
                            for (int k = srv.length - 1; k >= srv.length / 2; k--) {
                                q2 = q2 + Character.getNumericValue(srv[k]);
                            }
                            if (q1 == q2) {
                                System.out.println(box[i]);
                            }
                        }
                    }

                                            //  DZ 6.7

                    for (int i = 0; i < box.length; i++) {

                        srv = box[i].toCharArray();
                        if (srv.length >= 3) {
                            System.out.println();
                            System.out.print("Elementi 4isla " + box[i] + ": ");
                            int s = 0;
                            for (int j = 1; j < srv.length - 1; j++) {

                                if ((Character.getNumericValue(srv[j - 1]) + Character.getNumericValue(srv[j + 1])) / 2 == Character.getNumericValue(srv[j]) && (Character.getNumericValue(srv[j - 1]) + Character.getNumericValue(srv[j + 1])) % 2 == 0) {
                                    System.out.print(srv[j]);
                                    s++;
                                }
                            }
                            if (s == 0) {
                                System.out.print("There is nothing to show");
                                System.out.println();
                            }

                        } else {
                            System.out.println();
                            System.out.print("There is nothing to show for number " + box[i]);
                        }

                    }

                }

            }

        }
    }
}

