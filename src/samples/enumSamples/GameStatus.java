package samples.enumSamples;

public enum GameStatus {

    WIN, LOOSE, DRAW;

    public static void check(GameStatus status){

        switch (status){

            case WIN  :
                System.out.println("Win Day");
                break;

            case DRAW :
                System.out.println("Draw Day");
                break;

            case LOOSE:
                System.out.println("Loose Day");
                break;
        }
    }
}
