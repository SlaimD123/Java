package com.SlaimD;

import java.util.*;

public class Main {

    static ArrayList<Integer> playerPosition = new ArrayList<Integer>();
    static ArrayList<Integer> cpuPosition = new ArrayList<Integer>();

    public static void main(String[] args) {

        int userPos = 0;
        int cpuPos = 0;
        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};

        printGameBoard(gameBoard);


        int m = 1;
        while(m == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please input a number between 1 to 9: ");
            userPos = scanner.nextInt();
            while (playerPosition.contains(userPos) || cpuPosition.contains(userPos)){
                System.out.println("Position taken! Enter a correct position.");
                userPos = scanner.nextInt();
            }


            placePiece(gameBoard, userPos, "player");


            Random rand = new Random();
            cpuPos = rand.nextInt(9) + 1;

            while(playerPosition.contains(cpuPos) || cpuPosition.contains(cpuPos)) {
                System.out.println("Position taken! Enter a correct position.");
                cpuPos = rand.nextInt(9) + 1;
            }
            placePiece(gameBoard, cpuPos, "cpu");
            printGameBoard(gameBoard);

            String result = checkWinner();
            if (result.length() > 0) {
                System.out.println(result);
                break;
            }
            System.out.println(result);
        }

    }

    public static void printGameBoard(char[][] gameBoard) {
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                System.out.print(gameBoard[x][y]);
            }
            System.out.println();
        }
    }

    public static void placePiece(char[][] gameBoard, int userPosition, String user) {

        char symbol= 0;

        if(user.equals("player")){
            symbol = 'X';
            playerPosition.add(userPosition);
        }
        else if (user.equals("cpu")){
            symbol = 'O';
            cpuPosition.add(userPosition);
        }

        switch (userPosition) {
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                break;
        }
    }

    public static String checkWinner() {

        List topRow = Arrays.asList(1, 2, 3);
        List midRow = Arrays.asList(4, 5, 6);
        List botRow = Arrays.asList(7, 8, 9);
        List leftCol = Arrays.asList(1, 4, 7);
        List midCol = Arrays.asList(2, 5, 8);
        List rightCol = Arrays.asList(3, 6, 9);
        List cross1 = Arrays.asList(1, 5, 9);
        List cross2 = Arrays.asList(7, 5, 3);

        List<List> winning = new ArrayList<List>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(botRow);
        winning.add(leftCol);
        winning.add(midCol);
        winning.add(rightCol);
        winning.add(cross1);
        winning.add(cross2);

        for (List l : winning) {
            if (playerPosition.containsAll(l)) {
                return "Congratulations you won!";
            }else if (cpuPosition.containsAll(l)) {
                return "CPU wins! Sorry :(";
            }else if (playerPosition.size() + cpuPosition.size() == 9) {
                return "CAT!";
            }

        }

        return "";
    }
}




