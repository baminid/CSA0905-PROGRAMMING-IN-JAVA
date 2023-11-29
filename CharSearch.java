import java.util.Scanner;
class CharSearch {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        
        System.out.print("Enter the character to be searched: ");
        char c = sc.next().charAt(0);
        
        boolean found = false;
        int index = -1;
        
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == c) {
                found = true;
                index = i;
                break;
            }
        }
        
        if(found) {
            System.out.println(c+" is found in the string at index: "+index);
        }
        else {
            System.out.println(c+" not found in the string.");
        }
        
        sc.close();
    }
}