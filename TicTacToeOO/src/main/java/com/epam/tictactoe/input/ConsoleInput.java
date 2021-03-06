package com.epam.tictactoe.input;

import java.io.InputStream;
import java.util.Scanner;

/**
 * @author Grzegorz Sledz
 *
 * Class responsible for getting integer number from console
 */
public class ConsoleInput implements IInput {
    private final Scanner in;

    public ConsoleInput() {
        this.in = new Scanner(System.in);
    }

    public ConsoleInput(InputStream in) {
        this.in = new Scanner(in);
    }

    public int readInt() {
        int number;
        while (!in.hasNextInt()) {
            String input = in.next();
            System.out.printf("%s is not a valid number.\n", input);
        }
        number = in.nextInt();
        return number;
    }
}
