package hw9;

public class MyArrayDataException extends NumberFormatException {
    private String info;

    public MyArrayDataException(String s, String info) {
        super(s);
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
