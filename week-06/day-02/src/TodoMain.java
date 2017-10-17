public class TodoMain {
    public static void main(String[] args) {
        TodoApp app = new TodoApp();

        if (args.length == 0) {
            app.manual();
        } else if (args[0].equals("-l")) {
            app.listTasks();
        } else if (args[0].equals("-a")) {
            if (args.length == 1) {
                System.out.println("Unable to add: no task provided");
            } else {
                app.addTask(args[1]);
                app.listTasks();
            }
        } else if (args[0].equals("-r")) {
            if (args.length == 1) {
                System.out.println("No can do: no index provided");
            } else {
                app.removeTask((args[1]));
            }
        } else if (args[0].equals("-c")) {
            if (args.length == 1) {
                System.out.println("No can do: no index provided");
            } else {
                try {
                    app.checkTask(Integer.valueOf(args[1]));
                    app.listTasks();
                } catch (NumberFormatException e) {
                    System.out.println("Unable to check: index is not a number");
                }
            }
        } else if (args[0].equals("-o")) {
            app.orderTasks();
        } else {
            System.out.println("Unsupported argument");
            app.manual();
        }
    }
}
