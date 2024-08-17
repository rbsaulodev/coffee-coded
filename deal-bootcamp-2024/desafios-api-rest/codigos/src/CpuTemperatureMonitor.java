/*Entrada
Leituras de temperatura: Uma string contendo leituras de temperatura separadas por vírgulas. A string pode conter espaços extras ao redor das leituras.

Saída
Retorna uma string no formato "Maior temperatura: X°C", onde X é a maior temperatura registrada.
 */


import java.util.Scanner;

public class CpuTemperatureMonitor {
    public static String findHighestTemperature(String input) {
        String[] readings = input.split(",");
        int maxTemperature = Integer.MIN_VALUE;
        
        for (String reading : readings) {
            int temperature = Integer.parseInt(reading.trim());
            if (temperature > maxTemperature) {
                maxTemperature = temperature;
            }
        }

        return "Maior temperatura: " + maxTemperature + "C";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = findHighestTemperature(input);
        System.out.println(output);
    }
}
