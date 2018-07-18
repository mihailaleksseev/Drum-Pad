class Main {
    public static void main(String[] args) {
        MiniMusicApp mini = new MiniMusicApp();
        if (args.length < 2) {
            System.out.println("Don`t forget arguments");
        } else {
            int instrument = Integer.parseInt(args[0]);
            int note = Integer.parseInt(args[1]);
            mini.play(instrument, note);
        }
    }
}

