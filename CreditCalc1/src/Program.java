import java.io.*;
 
public class Program {
 
    public static void main(String[] args) {
        
        try(FileWriter writer = new FileWriter("SQL.txt", false))
        {
        	String login = "Artem"; //��������� �����
        	String password = "Kuzeev123"; //��������� ������
        	//����� ������� �� ����������
           // ������ ���� ������
            String text = ("Login: " + login);
            writer.write(text);
            // ������ �� ��������
            String text1 = ("\r\nPass: " + password);
            writer.write(text1);
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
    } 
}