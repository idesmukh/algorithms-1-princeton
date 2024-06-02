public class HelloGoodbye {
    public static void main(String[] args) {
        for (int i = 0; i < (args.length - 1); i++) {
            System.out.println("Hello " + args[i] + " and " + args[i + 1] + ".");
        }
        for (int i = (args.length - 1); i > 0; i--) {
            System.out.println("Goodbye " + args[i] + " and " + args[i - 1] + ".");
        }
    }
}
