public class Board {
    Spot [][] boxes;

    public Board() {
        this.resetBoard();
    }

    public Spot getBox(int x, int y) {
        if (x < 0 || x > 7 || y < 0 || y > 7) {
            throw new Exception("Index out of bound");
        }
        return boxes[x][y];
    }

    public void resetBoard() {
        //Initialize white pieces
        boxes[0][0] = new Spot (0, 0, new Rook(true));
        boxes[0][1] = new Spot (0, 1, new Knight(true));
        boxes[0][2] = new Spot (0, 2, new Bishop()(true));
        //...
        boxes[1][0] = new Spot (1, 0, new Pawn(true));
        boxes[1][1] = new Spot (1, 1, new Pawn(true));
        //...

        //Initialize black pieces
        boxes[0][0] = new Spot (0, 0, new Rook(true));
        boxes[0][1] = new Spot (0, 1, new Knight(true));
        boxes[0][2] = new Spot (0, 2, new Bishop()(true));
        //...
        boxes[6][0] = new Spot(6,0, new Pawn(false));
        boxes[6][1] = new Spot(6,1, new Pawn(false));
        //...

        //Initialize remaining boxes without any piece
        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                boxes [i][j] = new Spot (i, j, null);
            }
        }

    }
}
