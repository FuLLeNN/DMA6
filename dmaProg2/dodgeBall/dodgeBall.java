package dodgeBall;

import java.util.TreeSet;

public class dodgeBall
{
  private final TreeSet<Integer> players = new TreeSet<>();
  //1 declaration , 1 inicialization = 2
  int distance;
  //1 declaration =1
  public void addPlayer(int x) {
    players.add(x); //add x into the TreeSet
    //1 add = 1
  }
  //addPLayer is O(1)

  public int throwBall(int x) {
    
    
    if(players.contains(x)) { //check if any player is on x position
      //1 comparation =1
      players.remove(x); // if it does delete that player from the TreeSet
      //1 remove = 1
      distance = 0; //distance will be 0 because the ball went to a player
      //1 inicialization = 1
    }else{
      if(players.lower(x)!= null && players.higher(x) != null){ //check if x got higher and lower number
        //1 "!=", 1 method call, 1 "&&",1 "!=", 1 method call = 5
        if((x-players.lower(x))<=(players.higher(x)-x)){ // if it has, check which player is closest to x position
          //1 - , 1 method call, 1 <=, 1 method call, 1 -  = 5
          lower(x); // call lower method
          //1 method call = 1
        }else{
          higher(x);// call higher method
              //1 method call = 1
        }
      }else if(players.lower(x) != null && players.higher(x) == null){ //if has a player in a lower position but not a higher one
        //
        lower(x); // call lower method
            //1 method call = 1
      }else if(players.lower(x) == null && players.higher(x) != null){ //if has a player in a higher position but not a lower one
        higher(x); // call higher method
            //1 method call = 1
      }
    }
    return distance; // return distance
        //1 return = 1
  }

  public void lower(int x){
    distance = x-players.lower(x); // calculate distance from the player to the ball
    players.remove(players.lower(x)); //remove the player from the TreeSet
    players.add(x); //add player with the new position
  }

  public void higher(int x){
    distance = players.lower(x)-x; //calculate distance from player to the ball
    players.remove(players.lower(x)); //remove the player from the TreeSet
    players.add(x); //add player with the new position
  }
}
