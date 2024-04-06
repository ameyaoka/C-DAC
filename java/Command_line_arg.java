





public class Command_line_arg {

    public static void main(String[] args) {
        System.out.println("Number of Command Line Arguments = " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println(String.format("Command Line Argument %d is %s", i, args[i]));
        }
    }
}

