// https://javaconceptoftheday.com/print-odd-and-even-numbers-by-two-threads-in-java/
// https://www.baeldung.com/java-even-odd-numbers-with-2-threads

public class OddEvenThread {
    public static void main(String[] args) {
        PrintManager printManager = new PrintManager();

        OddEvenRunnable oddRunnable = new OddEvenRunnable(10, printManager, false);
        OddEvenRunnable evenRunnable = new OddEvenRunnable(10, printManager, true);

        new Thread(oddRunnable).start();
        new Thread(evenRunnable).start();
    }
}

class OddEvenRunnable implements Runnable{
    int max;
    PrintManager printManager;
    boolean isEven;

    public OddEvenRunnable(int max, PrintManager printManager, boolean isEven) {
        this.max = max;
        this.printManager = printManager;
        this.isEven = isEven;
    }

    @Override
    public void run() {
        int number = isEven ? 2 : 1;
        while(number <= max){
            System.out.println("OddEvenRunnable number : " + number + " , isEven : " + isEven);
            if(isEven) {
                printManager.printEvenNumber(number);
            }else{
                printManager.printOddNumber(number);
            }
            number += 2;
        }
    }
}

class PrintManager{
    private volatile boolean isOddPrinted;

    synchronized void printEvenNumber(int number){
        System.out.println("printEvenNumber : " + number + " , isOddPrinted : " + isOddPrinted);
        while(!isOddPrinted){
            System.out.println("calling printEvenNumber wait() isOddPrinted : " + isOddPrinted);
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " : " + number);
        isOddPrinted = false;
        System.out.println("calling printEvenNumber notify()");
        notify();
    }

    synchronized void printOddNumber(int number){
        System.out.println("printOddNumber : " + number + " , isOddPrinted : " + isOddPrinted);
        while(isOddPrinted){
            System.out.println("calling printOddNumber wait() isOddPrinted : " + isOddPrinted);
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " : " + number);
        isOddPrinted = true;
        System.out.println("calling printOddNumber notify()");
        notify();
    }
}


