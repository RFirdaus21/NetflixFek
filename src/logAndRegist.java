import java.util.Scanner;

/*Abstract class */

 abstract class Account{   
    String username, password;
    abstract void reg();
    abstract void login();
    abstract boolean loginLogic();
}
/*inheritance */
class Register extends Account {
    String userUsn, userPw;
    Scanner z = new Scanner(System.in);

    Cls cls = new Cls();
    threadSleep sleep = new threadSleep();
    Header header = new Header();
    
    /* ploymorphism method overriding */

    void reg(){
        header.landPageHeader();
        System.out.println("\n\nDaftarkan akun anda\n");
        System.out.println("Masukkan username   : ");
        username = z.nextLine();
        System.out.println("Masukkan Password   : ");
        password = z.nextLine();
        System.out.println("Akun anda telah terdaftar");
        System.out.println("==========================================================");
        sleep.delay500(); cls.clearscreen();
    }

    void login(){
        header.landPageHeader();
        System.out.println("\n\nSilahkan login dengan akun yang telah terdaftar\n\n");
        System.out.print("Username  : ");
        userUsn = z.nextLine();
        System.out.print("Password  : ");
        userPw = z.nextLine();
        System.out.println("\nSedang Masuk......");
        sleep.delay750(); cls.clearscreen();
        System.out.println("==========================================================");
    }
    /*cek akun terdaftar dan akun login */
    boolean loginLogic(){
        if (userUsn.equals(username) && userPw.equals(password)){
            System.out.println("Login sukses");
            cls.clearscreen();
            return true;
        } else {
            System.out.println("Login failed");
            cls.clearscreen(); 
            return false;
        }
    }
}


