import java.util.*;

/*Abstract class */

 abstract class Account{   
    String username, password;
    abstract void reg();
}
/*inheritance */
class Register extends Account {
    String userUsn, userPw;
    Scanner z = new Scanner(System.in);

    Cls cls = new Cls();
    
    /* ploymorphism method overriding */

    void reg(){
        System.out.println("==========================================================");
        System.out.println("\nDaftarkan akun anda\n");
        System.out.println("Masukkan username   : ");
        username = z.nextLine();
        System.out.println("Masukkan Password   : ");
        password = z.nextLine();
        System.out.println("==========================================================");
    }

    void login(){
        System.out.println("==========================================================");
        System.out.println("\n\nSilahkan login dengan akun yang telah di registrasi\n\n");
        System.out.print("Username  : ");
        userUsn = z.nextLine();
        System.out.print("Password  : ");
        userPw = z.nextLine();
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


