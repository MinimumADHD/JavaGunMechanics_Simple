import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        M4A1 PlayerGun = new M4A1();
        while (true) {
            switch (sc.nextLine()) {
                case "S":
                    PlayerGun.ShootGun();
                    break;
                case "R":
                    PlayerGun.ReloadGun();
                    break;
                case "N":
                    PlayerGun.CheckGun();
                    break;
                case "V":
                    PlayerGun.SwitchMode();
                    break;
                default:
                    System.out.println("WRONG INPUT ERR");
                    break;
            }
        }
    }
}