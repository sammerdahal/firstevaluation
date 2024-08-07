import java.util.ArrayList;
import java.util.Scanner;

public class evaluation1 {
    public static void main(String[] args) {
        boolean enter = false;
        int attempts = 0;
        final String correctUsername = "Sameer";
        final String correctPassword = "swampy123";
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Want to login to KFC billing system (type 'continue' to proceed or 'quit' to exit):");
            String command = sc.nextLine().toLowerCase();

            if (command.equals("continue")) {
                if (!enter) {
                    enter = true;
                    while (attempts < 5) {
                        System.out.println("Enter a username:");
                        String username = sc.nextLine();
                        System.out.println("Enter a password:");
                        String password = sc.nextLine();

                        if (username.equals(correctUsername) && password.equals(correctPassword)) {
                            System.out.println("You have successfully logged in!");
                            int sum = 0;
                            ArrayList<Integer> price = new ArrayList<Integer>();
                            System.out.println("Number of food you ordered");
                            int num = sc.nextInt();
                            System.out.println("price of food you ordered");
                            for (int i = 0; i < num; i++) {
                                sum += sc.nextInt();
                            }
                            boolean added = false;

                            while (true) {
                                System.out.println("you want vat or not");
                                String vat = sc.nextLine().toLowerCase();

                                if (vat.equals("yes")) {
                                    if (!added) {
                                        added = true;
                                        System.out.println("you vat is  added");
                                        System.out.println(" please add dicount% ");
                                        int dis = sc.nextInt();
                                        if (dis <= 10) {
                                            int amount = (sum - ((dis / 100) * sum));
                                            int totalamount = (amount + ((13 / 100) * amount));
                                            System.out.println("You total amount is: " + totalamount);
                                            System.out.println("enter amount you want to give ");
                                            int money = sc.nextInt();
                                            if (money == totalamount) {
                                                System.out.println("You have successfully gived ");
                                            }
                                            else if (money < totalamount) {
                                                if (money >= 1000) {
                                                    int equal = money / 1000;
                                                    System.out.println("1000 =" + equal);
                                                    money = money - (1000 * equal);
                                                    break;
                                                }
                                                else if (money >= 500) {
                                                    int equal = money / 500;
                                                    System.out.println("500 =" + equal);
                                                    money = money - (500 * equal);
                                                    break;
                                                }
                                                else if (money >= 100) {
                                                    int equal = money / 100;
                                                    System.out.println("100 =" + equal);
                                                    money = money - (100 * equal);
                                                    break;

                                                }
                                                else if (money >= 50) {
                                                    int equal = money / 50;
                                                    System.out.println("50 =" + equal);
                                                    money = money - (50 * equal);
                                                    break;

                                                }
                                                else if (money >= 20) {
                                                    int equal = money / 20;
                                                    System.out.println("20 =" + equal);
                                                    money = money - (20 * equal);
                                                    break;

                                                }
                                                else if (money >= 10) {
                                                    int equal = money / 10;
                                                    System.out.println("10 =" + equal);
                                                    money = money - (10 * equal);
                                                    break;

                                                }
                                                else {
                                                    int equal = money / 5;
                                                    System.out.println("5 =" + equal);
                                                    money = money - (5 * equal);
                                                    break;
                                                }
                                            }
                                            else {
                                                System.out.println("sorry money is not enough");
                                                break;
                                            }
                                        }
                                        else {
                                            System.out.println("You discount is not avliable");
                                            break;
                                        }

                                    }
                                    else if (command.equals("no")) {
                                        System.out.println("you vat not is added");
                                        System.out.println("please add dicount% ");
                                        int dis = sc.nextInt();
                                        if (dis <= 10) {
                                            int totalamount = (sum - ((dis / 100) * sum));

                                            System.out.println("You total amount is: " + totalamount);
                                            System.out.println("enter amount you want to give ");
                                            int money = sc.nextInt();
                                            if (money == totalamount) {
                                                System.out.println("You have successfully gived ");
                                            }
                                            else if (money < totalamount) {
                                                if (money >= 1000) {
                                                    int equal = money / 1000;
                                                    System.out.println("1000 =" + equal);
                                                    money = money - (1000 * equal);
                                                    break;
                                                }
                                                else if (money >= 500) {
                                                    int equal = money / 500;
                                                    System.out.println("500 =" + equal);
                                                    money = money - (500 * equal);
                                                    break;
                                                }
                                                else if (money >= 100) {
                                                    int equal = money / 100;
                                                    System.out.println("100 =" + equal);
                                                    money = money - (100 * equal);
                                                    break;

                                                }
                                                else if (money >= 50) {
                                                    int equal = money / 50;
                                                    System.out.println("50 =" + equal);
                                                    money = money - (50 * equal);
                                                    break;

                                                }
                                                else if (money >= 20) {
                                                    int equal = money / 20;
                                                    System.out.println("20 =" + equal);
                                                    money = money - (20 * equal);
                                                    break;

                                                }
                                                else if (money >= 10) {
                                                    int equal = money / 10;
                                                    System.out.println("10 =" + equal);
                                                    money = money - (10 * equal);
                                                    break;

                                                }
                                                else {
                                                    int equal = money / 5;
                                                    System.out.println("5 =" + equal);
                                                    money = money - (5 * equal);
                                                    break;
                                                }
                                            }
                                            else {
                                                System.out.println("sorry money is not enough");
                                                break;
                                            }
                                        }
                                        else {
                                            System.out.println("You discount is not avliable");
                                            break;
                                        }

                                    }
                                    else {
                                        System.out.println("Invalid Command.");
                                        break;
                                    }
                                }
                            }
                        }
                        else {
                            System.out.println("Incorrect username or password");
                            attempts++;
                        }

                        if (attempts == 5) {
                            System.out.println("Too many attempts. Thank you.");
                            break;
                        }
                    }
                } else {
                    System.out.println("You are already logged in.");
                }
            } else if (command.equals("quit")) {
                System.out.println("Thank you.");
                break;
            } else {
                System.out.println("Invalid Command.");
            }
        }

        sc.close();
    }
}

