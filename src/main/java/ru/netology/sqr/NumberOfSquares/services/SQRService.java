package ru.netology.sqr.NumberOfSquares.services;

public class SQRService {

    public int calcNumberSquares(int x, int y) {
        int quantity=0;
        for (int i=10; i <= 99; i++) {
            if ((i * i <= x) && (y <= i * i)) {
                quantity=quantity + 1;
            }


        }
        return quantity;
    }
}