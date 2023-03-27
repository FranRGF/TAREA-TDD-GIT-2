public class Operaciones {
    public int suma (String num){
        int j = 0;
        String finalComa = "";
        String[] subcadenas = num.split(",");
        int sumatorio = 0;
        int numero = 0;

        while (j < num.length()) {
            finalComa = num.substring(j);
            j++;
        }
        if (finalComa.equalsIgnoreCase(",")){
            return -1;
        } else if (!num.isEmpty()){
            for (int i = 0; i < subcadenas.length; i++) {
                sumatorio += Integer.parseInt(subcadenas[i]);
                numero = Integer.parseInt(subcadenas[i]);
                if (numero < 0){
                    return -1;
                } else if (numero > 1000){
                    sumatorio -= Integer.parseInt(subcadenas[i]);
                    System.out.println("Número superior a 1000 ignorado");
                }
            }
            return sumatorio;
        } else {
            return 0;
        }
    }
}
