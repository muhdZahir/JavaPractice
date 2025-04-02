/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package guiassignment;

/**
 *
 * @author Othman Family
 */
public class InvalidUserException extends Exception {

    /**
     * Creates a new instance of <code>InvalidUserException</code> without
     * detail message.
     */
    public InvalidUserException() {
        super("You have entered an invalid username");
    }
    
    public String getMessage()
    {
        return "You have entered an invalid username";
    }

    /**
     * Constructs an instance of <code>InvalidUserException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public InvalidUserException(String msg) {
        super(msg);
    }
}
