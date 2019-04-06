import java.io.*;
import java.util.*;
 
public class Programm {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("SQL.txt"));
        String s;
        while(in.hasNextLine()){
                s = in.nextLine();
                String words[] = s.split(" ");
                System.out.println(words[1]);
        }
        in.close();
    }
}