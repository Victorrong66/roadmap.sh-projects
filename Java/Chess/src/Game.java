import java.util.List;

public class Game {
    private Player[] players;
    private Board board;
    private Player currentTurn;
    private GameStatus status;
    private List<Move> movesPlayed;

    private void initialize(Player p1, Player p2) {
        players[0] = p1;
        players[1] = p2;

        board.resetBoard();

        if (p1.isWhiteSide()) {
            this.currentTurn = p1;
        }
        else {
            this.currentTurn = p2;
        }

        movesPlayed.clear();
    }

    public boolean isEnd() {
        return this.getStatus() != GameStatus.ACTIVE;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(GameStatus status) {
        this.status = status;
    }

    public boolean playerMove(Player player, int startX, int startY, int endX, int endY) {
        Spot startBox = board.getBox(startX, startY);
        Spot endBox = board.getBox(startX, startY);
        Move move = new Move(player, startBox, endBox);
        return this.makeMove(move, player);
    }
     private boolean makeMove(Move move, Player player) {
         Piece sourcePiece = move.getStart().getPiece();
         if (sourcePiece == null) {
             return false;
         }

         //Valid Player
         if (player != currentTurn) {
             return false;
         }

         //Check if valid move
         if (sourcePiece != null && sourcePiece instanceof King && sourcePiece.isCastlingMove()) {
             move.setCastlingMove(true);
         }

         //Store the move
         movesPlayed.add(move);

         //Move the piece from start box to end box
         move.getEnd().setpiece(move.getStart().getPiece()));
         move.getStart.setPiece(null);

         if (destPiece != null && destPiece instanceof King) {
             if (player.isWhiteSide()) {
                 this.setStatus(GamesStatus.WHITE_WIN);
             }
             else {
                 this.setStatus(GameStatus.BLACK_WIN);
             }
         }

         if (this.currentTurn == player[0]) {
             this.currentTurn = player[1];
         }
         else {
             thios.currentTurn = players[0];
         }
         return true;
     }
}
