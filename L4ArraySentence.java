import java.util.Scanner;
import java.util.Arrays;
public class L4ArraySentence
{
public static void main(String[] args)
{
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter a sentence: ");
   String sentence = scan.nextLine();

    char[] ch = new char[sentence.length()];
    for (int i=0; i<sentence.length(); i++)
    {
      ch[i] = sentence.charAt(i);
    }

      System.out.println("Character array forwards: ");
      for (int i = 0; i < ch.length; i++)
      {
          System.out.print(ch[i] + " ");
          }
          System.out.println("\nCharacter array backwards: ");
          for (int i = ch.length-1; i >= 0; i--)
          {
              System.out.print(ch[i] + " ");
          }
          int vowelnum = 0;
          for (int i= 0; i < ch.length; i++)
          {
            if (ch[i] == 'a'|| ch[i] =='A' || ch[i] == 'e'|| ch[i] == 'E' || ch[i] == 'i' || ch[i] == 'I' || ch[i] == 'o'|| ch[i] == 'O' || ch[i] == 'u'|| ch[i] == 'U')
            {
               vowelnum++;
            }
          }
         System.out.println("\nThe number of vowels: " + vowelnum);
       }
     }
