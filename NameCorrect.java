import java.util.Scanner;

public class NameCorrect {
    public static void main(String[] args) {
        try{
        int vowelCount = 0;
        int consonantCount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String input = sc.nextLine();
        System.out.println("\nCorrect name would be :");

        String[] name = input.split(" ");
        for(int i=0;i<=name.length-1;i++) {
            if(i!= name.length-1 ) {
                name[i] = name[i].toUpperCase();
                //System.out.println(name[i]);

                char firstLetter = name[i].charAt(0);
                System.out.print(firstLetter + ". ");
            }
            else{
                //System.out.println("last :" +name[i] );
                name[i]=name[i].toLowerCase();
                //System.out.println("last :" +name[i] );

                char[] lastname = name[i].toCharArray();
                lastname[0]=Character.toUpperCase(lastname[0]);
                lastname.toString();
                System.out.println(lastname);
                //name[i].toUpperCase(name.charAt(0));
            }
        }
        //String lastName = name[name.length-1];
       //     lastName = lastName.toLowerCase();
         //   lastName = lastName.toUpperCase(.charAt(0));
        //System.out.print(lastName);

    } catch(Exception e){
        System.out.println(e);
    }}

}
