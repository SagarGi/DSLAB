class Multithreading extends Thread {
    public void run() {
        System.out.println("My thread is running in running state");
    }

    public static void main(String[] args) {
        Multithreading mt = new Multithreading();
        mt.start();
    }
}