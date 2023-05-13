import java.util.*;

class Header {
    void mainHeader(){
        System.out.println("\n======================================================");
        System.out.println("\t\t Netflix Fek \t\t  ");
        System.out.println("======================================================");
    }
    void subHeader(){
        System.out.println("\n======================================================");
        System.out.println("\t\t Netflix Fek \t\t  ");
        System.out.println("======================================================\n");
    }
    void landPageHeader(){
        System.out.println("\n======================================================");
        System.out.println("\t\t Netflix Fek \t\t  ");
        System.out.println("======================================================");
    }
}

class Menu {
    int pil1, pil2;
    boolean next = true;

    Header header = new Header();

    MovieInitiate x1 = new MovieInitiate();
    MovieDetails[] movie = x1.seedMovies();

    SeriesInitiate x2 = new SeriesInitiate();
    SeriesDetails[] seri = x2.seedSeries();

    Scanner input = new Scanner(System.in);
    Cls cls = new Cls();
    threadSleep sleep = new threadSleep();

    void mainMenu(){
        while(next){ //agar ketika input salah atau untuk kembali akan dialihkan kesini 
        header.mainHeader();
        System.out.println("\n");
        System.out.println("Welcome to Netflix Fek\n\n");
        System.out.println("\n[1] Lihat list Film");
        System.out.println(" \n[2] Lihat list Series");
        System.out.println(" \n[0] Exit\n\n");
        System.out.println("======================================================");
        System.out.print("Pilihan anda : ");
        pil1 = input.nextInt();

        switch (pil1){
            case 1 : 
                cls.clearscreen(); menuMovie();
                break;
            case 2 : 
                cls.clearscreen(); menuSeri(); 
                break;
            case 0 : 
                System.out.println("\nGood Bye~");
                sleep.delay500(); cls.clearscreen(); 
                System.exit(0);
            default : System.out.println(" ~ 404 not found ~ "); 
                        sleep.delay500(); cls.clearscreen();
                break;
            }
        }
    }
    void menuMovie(){
        header.subHeader();
        System.out.print("\n[1] ");movie[0].showMovieinList();
        System.out.print("\n[2] ");movie[1].showMovieinList();  
        System.out.print("\n[3] ");movie[2].showMovieinList(); 
        System.out.println("\n======================================================");
        System.out.print("\nPilih film untuk melihat detail  ");
        pil2 = input.nextInt();
        cls.clearscreen();
            switch(pil2){
                case 1 : header.subHeader(); movie[0].ShowDetails(); 
                    break;
                case 2 : header.subHeader(); movie[1].ShowDetails(); 
                    break;
                case 3 : header.subHeader();; movie[2].ShowDetails();
                    break;
                case 0 : cls.clearscreen(); 
                    break;
                default : System.out.println(" ~ 404 not found ~ ");
                            sleep.delay500();  cls.clearscreen();
                    break;
            }
    }
    void menuSeri(){
        header.subHeader();
        System.out.print("\n[1] ");seri[0].showSeriesinList();
        System.out.print("\n[2] ");seri[1].showSeriesinList();
        System.out.println("\n\n[0] Kembali"); 
        System.out.println("\n======================================================");
        System.out.print("\nPilih :  ");
        pil2 = input.nextInt();
        cls.clearscreen();
            switch(pil2){
                case 1 : header.subHeader(); seri[0].ShowDetails(); 
                    break;
                case 2 : header.subHeader(); seri[1].ShowDetails(); 
                    break;
                case 0 : cls.clearscreen(); 
                    break;
                default : System.out.println(" ~ 404 not found ~ ");
                            sleep.delay500();  cls.clearscreen();
                    break;
            }
    }
}
