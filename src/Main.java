public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        boolean currentUser = false;
        boolean lanjut = true;
        Register reg = new Register();
        
        reg.reg();
    /*agar ketika username atau password salah loop di bagian login */
    while(lanjut){
        reg.login();
        currentUser = reg.loginLogic();

        if (currentUser){
            menu.mainMenu();
        } else {
            continue;
            }
        }
    }
}


