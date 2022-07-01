
public class Player { // new class created named player
    int number = 0;   // intilizing the number. 

    public void guess (){
        number = (int) (Math.random()*10);
        System.out.println("i'm guessing" + number);
    }

}
