import java.util.Scanner;

class A {
    int a, b, d;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        a = sc.nextInt();
        System.out.print("Enter the value: ");
        b = sc.nextInt();

    }

    void add() {
        d = (a + b);
    }

}

class B extends A {
    int c;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        c = sc.nextInt();
    }

    void display() {
        System.out.println("Addition is " + (d + c));
    }
}

class C {
    public static void main(String[] args) {
        B bb = new B();
        bb.input();
        bb.getdata();
        bb.add();
        bb.display();

    }
}