class class2 {
    public static void main(String[] args) {
        int i,j;
        for ( i = 1; i<6; i++) {
            for (j=1; j<=i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("another");
        for ( i = 1; i<6; i++) {
            for (j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("another");
        for ( i = 1; i<6; i++) {
            int A=65;
            for (j=1; j<=i; j++) {
                System.out.print((char)A);
                A++;
            }
            System.out.println();
        }
        for (int k = 1; k <=6; k++) {
            int F=71;
            for (int m = 6; m >=k; m--) {
                System.out.print((char)F);
                F--;
            }
            System.out.println();
        }
    }
}
