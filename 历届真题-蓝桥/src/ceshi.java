public class ceshi {

    public static void main(String[] args) {
        out ou = new out(){
            @Override
            void run(){
                System.out.println("zzzz");
            }
        };
        ou.run();
    }
}
class out{
    void run(){
        System.out.println("hh");
    }
}
