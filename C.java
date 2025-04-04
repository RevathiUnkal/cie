package constructor;
    public class C extends B{
        C(){
           System.out.println("Constructor C");
       }
   }


   class print {
    public static void main(String[] args) {
        C obj = new C();
    }
}
    