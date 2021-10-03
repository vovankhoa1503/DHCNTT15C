import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    String message;
    System.out.println("\n\nNhap vao chuoi can in hoa: ");
    message = sc.nextLine();
   
    char[] charArray = message.toCharArray();
    
    for(int i = 0; i < charArray.length; i++) {
      if(charArray[i] >= 97 && charArray[i] <= 122){
        charArray[i] -= 32;
      }
    }
   
    message = String.valueOf(charArray);
    System.out.println("Chuoi sau khi in hoa: \n" + message);
 
    
  }
}