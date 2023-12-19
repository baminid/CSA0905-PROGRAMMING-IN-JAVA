import java.util.Scanner;
class NameSorter 
{
    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);
        String name;
        
        System.out.println("Enter names (type 'done' when finished):");
        name = scanner.nextLine();
        while (true) 
         {
            
         if (name.equalsIgnoreCase("done")) {
                break;
            }
            
        }

       
        System.out.print("Enter order (A for Ascending, D for Descending): ");
        char order = scanner.next().charAt(0);

        
        if (order == 'A' || order == 'a') {
            Collections.sort(names);
        } else if (order == 'D' || order == 'd') {
            Collections.sort(names, Collections.reverseOrder());
        } else {
            System.out.println("Invalid order preference. Please enter 'A' or 'D'.");
            return;
        }

        
        System.out.println("Sorted names:");
        for (String sortedName : names) {
            System.out.println(sortedName);
        }
    }
}
