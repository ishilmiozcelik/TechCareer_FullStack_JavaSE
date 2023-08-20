package ishilmiozcelik;

//threading allows us to run more than one operation at the same time
//we can use it in 3 ways

public class _13_Threading1 extends Thread{
//extends - kalıtımlama
    @Override
    public void run() {
        try {
            System.out.println("Started");
            for (int i = 1; i <=10 ; i++) {
            Thread.sleep(1000);
                System.out.print(i+" ");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("1st Class");
        _13_Threading1 threadingA=new _13_Threading1();
        _13_Threading1 threadingB=new _13_Threading1();
        _13_Threading1 threadingC=new _13_Threading1();

        System.out.println(threadingA.getId());
        System.out.println(threadingA.getName());
        threadingA.setName("Changed44");
        System.out.println(threadingA.getName());
        System.out.println(threadingA.isAlive());

        threadingA.start();
        threadingA.join();
        threadingB.start();
        threadingC.start();


    }


}

class _13_Threading2 implements Runnable {
    //implements
    @Override
    public void run() {
        try {
            System.out.println("Started");
            for (int i = 1; i <=10 ; i++) {
                Thread.sleep(1000);
                System.out.print(i+" ");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        System.out.println("2nd Class");
    }


}

class _13_Threading3 {
//Anonymous
public static void main(String[] args) {
    System.out.println("3rd Class");
    Thread thread=new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                System.out.println("Started");
                for (int i = 1; i <=10 ; i++) {
                    Thread.sleep(1000);
                    System.out.print(i+" ");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    });

}

}