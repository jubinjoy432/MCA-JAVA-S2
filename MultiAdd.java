import java.io.*;
class C1{
    public int add(int x, int y){
        int sum = x + y;
        return sum;
    }
     public String add(String str1, String str2){
        String result = str1 + str2;
        return result;
    }
}
class MultiAdd{
    public static void main(String args[]){
        C1 obj = new C1();
        int intResult = obj.add(5, 10);
        System.out.println("Sum of integers: " + intResult);
        
        String strResult = obj.add("Jubin ", "Joy");
        System.out.println("Concatenated String: " + strResult);
    }
}