package ru.netology.javaqa;

public class VacationService {

    public int calcVacation(int income, int expense, int threshold){
        int balance = 0;
        int vacation = 0;
        for (int i = 1; i < 13; i++){
            if (balance < threshold){
                balance += income - expense;
            }
            else {
                balance = (balance - expense) / 3;
                vacation += 1;
            }
        }
        return vacation;
    }
}
