package Jour04.Job01;

public class ThreadProject {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start(); // Démarre le thread et appelle la méthode run()
    }
}
