import java.util.*;
class SuperClass {
    int superMember;

    public SuperClass(int superMember) {
        this.superMember = superMember;
    }

    public void display() {
        System.out.println("SuperClass Member: " + superMember);
    }
}

class SubClass extends SuperClass {
    int subMember;

    public SubClass(int superMember, int subMember) {
        super(superMember); // Call the parameterized constructor of the SuperClass
        this.subMember = subMember;
    }

    @Override
    public void display() {
        super.display(); // Call the display method of the SuperClass
        System.out.println("SubClass Member: " + subMember);
    }
}

 class main2 {
    public static void main(String[] args) {
        SubClass sub = new SubClass(100, 200);
        sub.display();
    }
}