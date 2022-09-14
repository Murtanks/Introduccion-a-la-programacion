public class Main {

    public static void main(String[] args){
        var estacion = "OTOÑO";

        switch(estacion) {
            case"VERANO":
                System.out.println("Es Verano");
                break;
            case "INVIERNO":
                System.out.println("Es Invierno");
                break;
            case "OTOÑO":
                System.out.println("Es Otoño");
                break;
            case "PRIMAVERA":
                System.out.println("Es Primavera");
                break;
            default:
                System.out.println("No es una Estacion");

        }
    }

}
