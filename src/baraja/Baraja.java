package baraja;

public class Baraja {
     
    // método simulación extrracción carta
    
    private static void extraccionCarta(){
                int Carta =(int) ((Math.random()*40));
        if (Carta < 10){
            switch (Carta) {
                case 8:
                    System.out.println("Sota de Oros");
                    break;
                case 9:
                    System.out.println("Caballo de Oros");
                    break;
                case 0:
                    System.out.println("Rey de Oros");
                    break;
                default:
                    System.out.println(Carta + " de Oros");
                    break;
            }
    }else if(Carta < 20){
            switch (Carta) {
                case 18:
                    System.out.println("Sota de Bastos");
                    break;
                case 19:
                    System.out.println("Caballo de Bastos");
                    break;
                case 10:
                    System.out.println("Rey de Bastos");
                    break;
                default:
                    System.out.println(Carta - 10 + " de Bastos");
                    break;
            }
    }else if (Carta < 30){
            switch (Carta) {
                case 28:
                    System.out.println("Sota de Espadas");
                    break;
                case 29:
                    System.out.println("Caballo de Espadas");
                    break;
                case 20:
                    System.out.println("Rey de Espadas");
                    break;
                default:
                    System.out.println(Carta - 20 + " de Espadas");
                    break;
            }
    }else if (Carta <40){
            switch (Carta) {
                case 38:
                    System.out.println("Sota de Copas");
                    break;
                case 39:
                    System.out.println("Caballo de Copas");
                    break;
                case 30:
                    System.out.println("Rey de Copas");
                    break;
                default:
                    System.out.println(Carta - 30 + " de Copas");
                    break;
            }
         }
    }

    public static void main(String[] args) {
    
        System.out.println("Carta de la baraja española extraída al azar:\n");
        extraccionCarta();
                 
       }
    
}
