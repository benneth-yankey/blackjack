public enum Face {
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    QUEEN(10),
    KING(10),
    ACE(11);

    /** Weight representation of the face */
    private int value;

    private Face(int value){
        this.value = value;
    }

    /** Get the value of the card face */
    public Integer getValue(){
        return value;
    }
}
