/*
* Crea un juego de adivinar un número aleatorio:

El número aleatorio tiene que estar entre 1 y 10
la partida tiene 10 rondas
El usuario tiene dos intentos por ronda
El juego da una pista despues del primer fallo, dice si es mayor o menor
Se gurada el nombre del usuario y la puntuación en caso de record
* */

/**
 * @author Santiago Romero
 * @version v1.0
 *
 */
public class Main {
    public static void main(String[] args) {
        /**
         * Creacion de objetos a partir de las clases
         */


        System.out.println("bienvenido al juego de adivinar numero");
        comprobarNum num = new comprobarNum();
        comprobarRecord record = new comprobarRecord();
        num.metodoP();
        /**
         * @param score
         * @return void
         */
        record.compararPuntuaciones();
        user us = new user(/*datos*/);
        System.out.println("tus datos:");
        /**
         * recoge los datos del user
         */
        us.getnUser();
        us.getScore();
    }
}

class comprobarNum{
    /**
     *  Comprueba los numeros introducidos
     */

    private static int numeroAleatorio = 1; // numaleatorio
    private static int numAdivinado;

    /**
     * compruebo que el numero aleatorio es equivalente al adivinado por el usuario
     */
    public static void metodoP() {
        rondas ronda = new rondas();
        if (numeroAleatorio == numAdivinado) {
            System.out.println("fin de juego");
        } else {
            System.out.println("pista");
            // llamada al metodo de rondas e intentos por ronda
            ronda.comprobacionIntentos();

        }
    }
}

class rondas{
    /**
     * el numero de rondas es mayor a cero
     * o el numero de intentos y de rondas es mayor a cero.
     */
    private int numRondas = 10;
    private int numIntentos = 2;
    private int contador = 1;

    /**
     * especifica si se acabaron todos los intentos y rondas
     */
    public rondas () {
    }
    public void comprobacionIntentos(){
        /**
         * @param numRondas
         * @param numIntentos
         *
         * aqui el bucle comprueba lo dicho al principio del metodo
         */
        while (numRondas != 0 && numIntentos != 0)
       {
            if (contador > numIntentos) {
                /**
                 * contador modificado dependiendo de la condicion
                 */
                System.out.println("te has quedado sin intentos esta ronda");
                contador=1;
                numRondas--;
            } else {
                System.out.println("te quedan X intentos");
                contador++;
            }
        }
        /**
         * al salir del bucle salta esto por pantalla y esto es porque se han acabado las rondas y los intentos por ronda
         */
        System.out.println("te has quedado sin intentos y sin rondas");
    }
}

class comprobarRecord{
    /**
     * @param score
     *
     * compruebo el record que haya y para eso se necesitan mas registros.
     * La primera partida siempre será record y si es que se almacenan mas datos, se podran comparar y marcar un nuevo record
     */
    private String[] puntuacion;
    /**
     * compara puntuaciones para ver si existe un record o no, de cualquier manera se guardara la puntuacion actual
     */
    public void compararPuntuaciones(){
        /**
         * este metodo comprueba las puntuaciones actuales con las pasadas y da un nuevo record o no
         */
        /*
        for (int x=0, x<puntuacion.length(),x++){
            for (int i=0,i<puntuacion[x],i++)
                if (puntuacion[x]>puntuacionuser){
                    //guarda
                }
        }*/
    }
}

class user {
    /**
     * el metodo se usa para guardar datos del jugador actual
     */
    private String nUser;
    private String score;

    /**
     *
     * @param user
     * @param score
     * guarda la puntuacion del jugador
     */
    public user(String user, String score){
        nUser = user;
        this.score = score;
    }

    public user() {

    }

    /**
     * estos getters sirven para sacar los datos del usuario actual
     * @return
     */
    public String getnUser(){
        return nUser;
        /**
         * @return String
         */
    }
    public String getScore(){
        return score;
        /**
         * @return String
         */
    }
}