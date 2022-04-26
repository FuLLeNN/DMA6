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
    //1 add = log n
  }
  

  public int throwBall(int x) {
    if(players.contains(x)) { //check if any player is on x position
      //1 comparation = log n
      players.remove(x); // if it does delete that player from the TreeSet
      //1 remove = log n
      distance = 0; //distance will be 0 because the ball went to a player
      //1 inicialization = 1
    }else{
      if(players.lower(x)!= null && players.higher(x) != null){ //check if x got higher and lower number
        //1 "!=", 1 "&&",1 "!=", 2 method call = 3 + 2 log n
        if((x-players.lower(x))<=(players.higher(x)-x)){ // if it has, check which player is closest to x position
          //1 - , 2 method call, 1 <=, 1 -  = 3 + 2 log n
          lower(x); // call lower method
          //1 method call = 1
        }else{
          higher(x);// call higher method
              //1 method call = 1
        }
      }else if(players.lower(x) != null && players.higher(x) == null){ //if has a player in a lower position but not a higher one
        //2 method call = 2 log n
        lower(x); // call lower method
            //1 method call = 1
      }else if(players.lower(x) == null && players.higher(x) != null){ //if has a player in a higher position but not a lower one
        //2 method call = 2 log n
        higher(x); // call higher method
            //1 method call = 1
      }
    }
    return distance; // return distance
        //1 return = 1
  }

  public void lower(int x){
    distance = x-players.lower(x); // calculate distance from the player to the ball
    //1 assignment, 1 method call, 1 "-" = 2 + log n
    players.remove(players.lower(x)); //remove the player from the TreeSet
    //2 method call = 2 log n
    players.add(x); //add player with the new position
    //1 method call = log n
  }

  public void higher(int x){
    distance = players.lower(x)-x; //calculate distance from player to the ball
    //1 assignment, 1 method call, 1 "-" = 2 + log n
    players.remove(players.lower(x)); //remove the player from the TreeSet
    //2 method call = 2 log n
    players.add(x); //add player with the new position
   //1 method call = log n
  }
}
/*
In the worst case we can get
T(n) = 2 + 1 + log n + 3 + 2log n + 3 + 2log n + 1 + 2 + log n + 2log n + log n
T(n) = 12 + 9log n
So ignoring constants
T(n) = O(log n)
*/
