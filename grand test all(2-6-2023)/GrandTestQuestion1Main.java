/*Section - 1:   - 40 marks 

Question1: 

Write a Java program to track the performance of a basketball team throughout a season. Implement an array to store the team's scores and the corresponding opposing team's scores for each game and calculate various statistics, such as the average score, highest score, and lowest score. Additionally, the program should display the number of games won and lost. Consider a game won if the team scores more points than the opposing team and lost if the team scores fewer points. If the scores are equal, it can be considered a tie or handled as per the specific requirements of the program. 

 

Sample Input: 

Enter the number of games played: 4 
Enter the scores for each game: 
Game 1 - Team's Score: 85 
Game 1 - Opposing Team's Score: 70 
Game 2 - Team's Score: 92 
Game 2 - Opposing Team's Score: 80 
Game 3 - Team's Score: 78 
Game 3 - Opposing Team's Score: 82 
Game 4 - Team's Score: 90 
Game 4 - Opposing Team's Score: 95 
  

Sample Output: 

Average Score: 86.25 
Highest Score: 95 
Lowest Score: 70 
Games Won: 2 
Games Lost: 2 */

import java.util.Scanner;
public class GrandTestQuestion1Main{
  public static void main(String[] args){
    GrandTestQuestion1 a=new GrandTestQuestion1();
      a.question1();
    
  }
}
class GrandTestQuestion1{
  public void question1(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of games played: ");
    int n=sc.nextInt();
    System.out.println("enter the team 1 score ");
    int team1[]=new int[n];
    
    for(int i=0;i<team1.length;i++){
      team1[i]=sc.nextInt();
      
    }
    int team2[]=new int[n];
    System.out.println("enter the  opposite team score");
    
    for(int i=0;i<team2.length;i++){
      team2[i]=sc.nextInt();
      
    }
    int sum=0,highest=0,lowest=0,win=0,lost=0;
    float avg=0;
    
    
    
    for(int i=0;i<team1.length;i++){
      
      sum=sum+(team1[i]+team2[i]);
      
    }
    avg=(float)sum/(float)(team1.length*2);
    System.out.println("average score is "+avg);
    if(team1[0]<team2[0])
      highest=team2[0];
    else
      highest=team1[0];
    
    System.out.println("Highest score is "+highest);
    if(team1[0]<team2[0])
      lowest=team1[0];
    else
      lowest=team2[0];
    
    
    System.out.println("Lowest score is "+lowest);
    for(int i=0;i<team1.length;i++){
      if(team1[i]<team2[i])
        win++;
      else
        lost++;
    }
    System.out.println("games won"+win);
    System.out.println("games won"+lost);
    
  }
}