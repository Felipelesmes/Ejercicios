public class Lasagna {
    
    // Método principal
    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();
        System.out.println("Expected minutes in oven: " + lasagna.expectedMinutesInOven());
        System.out.println("Remaining minutes in oven: " + lasagna.remainingMinutesInOven(20));
        System.out.println("Preparation time in minutes: " + lasagna.preparationTimeInMinutes(3));
        System.out.println("Total time in minutes: " + lasagna.totalTimeInMinutes(3, 20));
    }
    
    // Método que devuelve los minutos esperados en el horno
    public int expectedMinutesInOven() {
        return 40;
    }

    // Método que devuelve los minutos restantes en el horno
    public int remainingMinutesInOven(int minInOven) {
        return expectedMinutesInOven() - minInOven;
    }

    // Método que calcula el tiempo de preparación en minutos
    public int preparationTimeInMinutes(int lLayers) {
        return lLayers * 2;
    }

    // Método que calcula el tiempo total en minutos
    public int totalTimeInMinutes(int lLayer, int min) {
        return preparationTimeInMinutes(lLayer) + min;
    }
}
