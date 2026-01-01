import java.util.*;
class reverse_string_344 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a string to reverse : ");

         // taking the string and converting  into character array
         String input = sc.nextLine();
         char[] s = input.toCharArray();

         // Creating an object of this class to call an non-static method
         reverse_string_344 obj = new reverse_string_344();
         obj.reverseString(s);

         // finally printing the value of char, converting them into String format again
         System.out.println("The reversed String is : "+ String.valueOf(s));
         sc.close();
}

    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;
        while(start<end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
            }
    }
}
