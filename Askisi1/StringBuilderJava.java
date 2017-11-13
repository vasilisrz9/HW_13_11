package stringbuilderjava;


public class StringBuilderJava {

    public static void main(String[] args) {
        
         StringBuilder buffer2= new StringBuilder();
         buffer2.append("10hel10lo10");
         System.out.println("Thesi xarakthra "+findLastChar(buffer2,'l'));
    }
    
    private static int findLastChar(StringBuilder sb,char c){
       String kati=sb.reverse().toString();
       int len=kati.length();
       int thesi=0;
       do{
          if(kati.indexOf(c)!=-1){
              thesi=len-(kati.indexOf(c)+1);
              break;
          } 
       }while(true);
       return thesi;
    }
    
}