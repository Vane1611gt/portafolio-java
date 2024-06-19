package Lista_opcines.progrmas;

public class ListadodeOpciones {
    public static  void cargarOpciones(){}

    void listaDeopciones() {

        String[] listadeopcines;
        listadeopcines = new String[]{
                "calculadora1", "IMC",
                "login", "calcular edad",
                "covertir.grados,", "opcion6",
                "opcion_7,", "opcion_8",
                "opcion_9", "opcion_10"
        };
        int columnas=0;//contador-

        for (int i = 0; i < listadeopcines.length; i++) {
            System.out.printf( "[%d]%s", i + 1, listadeopcines[i] );

            for (int j = 0; j < (13 -listadeopcines[i].length()); j++) {
                System.out.print(" ");
            }
            if ((i + 1) % 2 == 0) {
                System.out.println( "" );
            }
        }
        };

    public void cargarOpciones ( String[] listaDeOpciones ) {

    }
}



