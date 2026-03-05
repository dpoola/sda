public class Gameboard {
    private static final int HOME = 0;
    private static final int END = 5;
    private static final int LENGTH = END - HOME + 1;
    private int index;

    GameBoard() {
        setIndex(HOME);
    }

    private void setIndex(int newIndex) {
        if (newIndex >= HOME && newIndex <= END) {
            index = newIndex;
        } else {
            throw new IndexOutOfBoundsException(newIndex);
        }
    }

    public int getCurrentPosition() {
        return index + 1;
    }

    @Override
    public void advance(int count) {
        int newIndex = index + count;
        setIndex(newIndex % LENGTH);
    }
}
