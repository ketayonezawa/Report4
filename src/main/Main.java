/*import java.io.IOException;

public class Main {
    public static void main(String[] args){
        try{
        String str = null;
        System.out.println(str.length());
        }catch(NullPointerException e) {
            System.out.println("例外起きた");
            System.out.println(e.getMessage());
        }
    }
}*/
public class Main{
    public static void main(String[] args){
       try{
        String str = "百二十三";
        int value = 0;
        value = Integer.parseInt(str);
       }catch (NumberFormatException e){
           System.out.println("例外が発生しました");
       }

    }
}