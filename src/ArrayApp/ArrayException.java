package ArrayApp;

public class ArrayException extends Exception{

    public ArrayException()
    {
        super();
    }

    public ArrayException(String message)
    {
        super(message);
    }

    public ArrayException(String message, Throwable throwable)
    {
        super(message, throwable);
    }

    public ArrayException(Throwable throwable)
    {
        super(throwable);
    }

}
