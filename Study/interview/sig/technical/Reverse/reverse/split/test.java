public class test{
   public static void main(String args[]){
       String str = new String("Seung ki Jeong");
       System.out.println("split(String regex):");
       String array1[]= str.split(" ");
       for (String temp: array1){
          System.out.println(temp);
       }
   }
}
