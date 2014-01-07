package java.lang;

public class StringIndexOutOfBoundsException extends RuntimeException {
  public StringIndexOutOfBoundsException() {
    super();
  }

  public StringIndexOutOfBoundsException(String message) {
      super(message);
    }

  public StringIndexOutOfBoundsException(int index) {
      super(String.valueOf(index));
  }
}
