class D6 {
    public static void main(String [] args) {
        int output;
        for (int i = 1; i <= 10; i ++) {
            output = (int) (Math.random() * 6 + 1);
            System.out.println("Die roll " + i + ": " + output);
        }
    }
}