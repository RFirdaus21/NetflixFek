/*clearscreen */

class Cls {
    public void clearscreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

/* delay */
class threadSleep {
    void delay500(){
        try { 
            Thread.sleep(500);
        }
        catch (InterruptedException e){
                throw new RuntimeException(e);
        }
    }
    void delay750(){
        try { 
            Thread.sleep(750);
        }
        catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
