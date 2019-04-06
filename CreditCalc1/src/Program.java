import java.io.*;
 
public class Program {
 
    public static void main(String[] args) {
        
        try(FileWriter writer = new FileWriter("SQL.txt", false))
        {
        	String login = "Artem"; //начальный логин
        	String password = "Kuzeev123"; //начальный пароль
        	//далее берутся из изменненых
           // запись всей строки
            String text = ("Login: " + login);
            writer.write(text);
            // запись по символам
            String text1 = ("\r\nPass: " + password);
            writer.write(text1);
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
    } 
}