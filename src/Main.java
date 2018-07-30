class Main {
    public static void main(String[] args) {
        if (args.length != 0) {
            new DrumPad().startUp(args[0]);
        } else {
            System.out.println("args[o] error");
        }
    }
}

