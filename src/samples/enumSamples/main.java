package samples.enumSamples;


public class main {

    public static void main(String[] args) {

        GameStatus.check(GameStatus.DRAW);

        System.out.println(GameStatus.WIN);

        GameStatus x = GameStatus.WIN;
        System.out.println(x);

    }

}


