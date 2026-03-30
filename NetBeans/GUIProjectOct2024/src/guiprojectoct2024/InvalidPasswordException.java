/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package guiprojectoct2024;

/**
 *
 * @author Othman Family
 */
public class InvalidPasswordException extends Exception {

    /**
     * Creates a new instance of <code>InvalidPasswordException</code> without
     * detail message.
     */
    public InvalidPasswordException() {
        super("You have entered an invalid password");
    }

    public String getMessage()
    {
        return "You have entered an invalid password";
    }
    /**
     * Constructs an instance of <code>InvalidPasswordException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public InvalidPasswordException(String msg) {
        super(msg);
    }
}
