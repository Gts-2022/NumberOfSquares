package ru.netology.sqr.NumberOfSquares.services;

public class SQRService {

    public int calcNumberSquares(int maxLimit, int minLimit) {
        int quantity = 0;
        for (int i = 10; i <= 99; i++) {
            if ((i * i <= maxLimit) && (minLimit <= i * i)) {
                quantity = quantity + 1;
            }


        }
        return quantity;
    }
}