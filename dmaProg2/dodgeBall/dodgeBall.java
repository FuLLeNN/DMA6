package dodgeBall;

import java.util.TreeSet;

public class dodgeBall
{
  private final TreeSet<Integer> players = new TreeSet<>();
  int distance;
  public void addPlayer(int x) {
    players.add(x); //add x into the TreeSet
  }

  public int throwBall(int x) {
    if(players.contains(x)) { //check if any player is on x position
      players.remove(x); // if it does delete that player from the TreeSet
      distance = 0; //distance will be 0 because the ball went to a player
    }else{
      if(players.lower(x)!= null && players.higher(x) != null){ //check if x got higher and lower number
        if((x-players.lower(x))<=(players.higher(x)-x)){ // if it has, check which player is closest to x position
          lower(x); // call lower method
        }else{
          higher(x);// call higher method
        }
      }else if(players.lower(x) != null && players.higher(x) == null){ //if has a player in a lower position but not a higher one
        lower(x); // call lower method
      }else if(players.lower(x) == null && players.higher(x) != null){ //if has a player in a higher position but not a lower one
        higher(x); // call higher method
      }
    }
    return distance; // return distance
  }

  public void lower(int x){
    int player = players.lower(x); //save nearest lower player to be easier to remove and add
    distance = x-player; // calculate distance from the player to the ball
    players.remove(player); //remove the player from the TreeSet
    players.add(player+distance); //add player with the new position after going to the ball position
  }

  public void higher(int x){
    int player = players.higher(x); //save nearest higher player to be easier to remove and add
    distance = player-x; //calculate distance from player to the ball
    players.remove(player); //remove the player from the TreeSet
    players.add(player-distance); //add player with the new position after going to the ball position
  }
}
