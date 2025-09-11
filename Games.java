package p1;

public class Games {
    public static void main(String[] args) {
        System.out.println(" \n This is the App Class! \n");

        Apps games = new Apps();

        games.favoriteGame = "Left 4 Dead";
        games.leastFavoriteGame = "Quiet Game";
        games.yearsPlaying = 18;
        games.playingGames = true;

        System.out.println("My favorite game is " + games.favoriteGame);
    }
}
