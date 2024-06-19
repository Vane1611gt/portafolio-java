package prueba4;

public class Estudiante {

    public Estudiante ( String anaGarcía, String mail, int i, boolean b ) {
    }

    // Clase Estudiante
    class Estudiante {
        private String nombre;
        private String correo;
        private int nota;
        private boolean activo;

        public Estudiante(String nombre, String correo, int nota, boolean activo) {
            this.nombre = nombre;
            this.correo = correo;
            this.nota = nota;
            this.activo = activo;
        }

        public String getNombre() {
            return nombre;
        }

        public String getCorreo() {
            return correo;
        }
    }

    // Clase Curso
    class Curso {
        private String nombre;
        private String categoria;
        private String periodo;

        public Curso(String nombre, String categoria, String periodo) {
            this.nombre = nombre;
            this.categoria = categoria;
            this.periodo = periodo;
        }

        public String getNombre() {
            return nombre;
        }

        public String getCategoria() {
            return categoria;
        }

        public String getPeriodo() {
            return periodo;
        }
    }


            }

         


