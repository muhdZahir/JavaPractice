/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package designprinciples;

/**
 *
 * @author Othman Family
 */
public class HighBalanceException extends Exception {

    /**
     * Creates a new instance of <code>HighBalanceException</code> without
     * detail message.
     */
    public HighBalanceException() {
    }

    /**
     * Constructs an instance of <code>HighBalanceException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public HighBalanceException(String msg) {
        super(msg);
    }
}
