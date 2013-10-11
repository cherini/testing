package minefield;

public class Minefield {

	private Mine[][] field;
	
	public Minefield() {
		field = new Mine[8][8];
		for (int i=0; i<8; i++) {
			for (int j=0; j<8; j++) {
				field[i][j] = new Mine();
			}
		}	
	}
	
	public void open(int x, int y) {
		field[x][y].setOpened(true);
	}

	public void close(int x, int y) {
		field[x][x].setOpened(false);
	}

	public void mark(int x, int y) {
		field[x][x].setMarked(true);
	}

	public void unmark(int x, int y) {
		field[x][y].setMarked(false);
	}

	public void putMine(int x, int y) {
		field[x][y].setMined(true);
	}

	public void removeMine(int x, int y) {
		field[x][y].setMined(false);
	}
	
	public int minedNeighbours(int x, int y) {
		// TODO: Debe devolver el numero de vecinos de
		// (x,y) con minas.
		return 0;
	}
}
