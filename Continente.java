public class Continente {

        private String nombre;
        private String oceanoAsociado;
        private int numeroPaises;

        public Continente(String nombre, String oceanoAsociado, int numeroPaises) {
            this.nombre = nombre;
            this.oceanoAsociado = oceanoAsociado;
            this.numeroPaises = numeroPaises;
        }


        public String getNombre() {
            return nombre;
        }

        public String getOceanoAsociado() {
            return oceanoAsociado;
        }

        public int getNumeroPaises() {
            return numeroPaises;
        }


        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setOceanoAsociado(String oceanoAsociado) {
            this.oceanoAsociado = oceanoAsociado;
        }

        public void setNumeroPaises(int numeroPaises) {
            this.numeroPaises = numeroPaises;
        }
    }

