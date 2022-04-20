public class reverse {
     public static void main(String[] args) {
      int person = 21 ,reverse =0;
      while(person !=0){
          int ans =person % 10;
          reverse =reverse*10 +ans;
          person = person/10;
          
      }  
      System.out.println("reverse ans is" + reverse);
    }
}   


