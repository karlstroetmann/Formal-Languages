public class Token {
    private String mImage;

    public Token(String image) {
        mImage = image;
    }
    public String getImage() { return mImage; }
};


class NumberToken extends Token {
    private Integer mNumber;

    NumberToken(String number) {
        super(number);
        mNumber = new Integer(number);
    }
    Integer getNumber() { return mNumber; }
}
