/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author bucar
 */
import java.util.Scanner; 
import midtermexam_versiona_extensioncode.UserProfile;

public class TestUserProfile {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);

      System.out.println("Enter user ID: ");
      String userID = input.nextLine();
      System.out.println("Choose from the following genres: Comedy, Drama, Action, Mystery");
      String genre = input.nextLine();
      
      UserProfile obj = new UserProfile(userID, genre);
      obj.setUserID(userID);
      obj.setGenre(genre);

      System.out.println("Congratulations, " + obj.getUserID() + ". You selected: " + obj.getGenre() + ". Your account has been successfully created. ");
      
      
    }
}
