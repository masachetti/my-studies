package collections.list.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
- Recebe a temperatura media dos 6 primeiros meses do ano
- Calcula a media semestral
- Mostra todas as temperaturas acima da média, apresentando o nome do mês.
*/
public class Temperature {
    public static void main(String[] args) {
        List<Double> temperatures = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println("Type temperature for Month " + (i+1));
            Double temp = scanner.nextDouble();
            temperatures.add(temp);
        }

        System.out.println("Temperatures: " + temperatures);

        Iterator<Double> iterator = temperatures.iterator();
        double total = 0d;
        while (iterator.hasNext()){
            total += iterator.next();
        }
        double averageTemperature = total / temperatures.size();
        System.out.println("Average temperature: " + averageTemperature);

        for (int i = 0; i < temperatures.size(); i++) {
            if (temperatures.get(i) > averageTemperature)
                System.out.println("Month: " + Temperature.getMonthName(i+1));
        }

    }

    public static String getMonthName(int monthNumber){
        switch (monthNumber){
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            default:
                return "";
        }
    }
}
