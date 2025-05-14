package ex7;

public class Hospital {
    public static void main(String[] args) {


        Paciente paciente1 = new Paciente("João",3, 5);
        Paciente paciente2 = new Paciente("Maria",3, 10);
        Paciente paciente3 = new Paciente("Lucas",5, 2);


        Paciente[] pacientes = {paciente1,paciente2,paciente3};


        ordenaPacientes(pacientes);


        imprimePacientes(pacientes);


    }


    public static void ordenaPacientes(Paciente[] pacientes) {
        for (int ciclo = 0; ciclo < pacientes.length-1; ciclo++) {
            for (int p = 0; p < pacientes.length-1; p++) {
                if(pacientes[p].gravidade < pacientes[p+1].gravidade || (pacientes[p].gravidade == pacientes[p+1].gravidade && pacientes[p].tempo < pacientes[p+1].tempo)) {
                    Paciente aux = pacientes[p];
                    pacientes[p] = pacientes[p+1];
                    pacientes[p+1] = aux;
                }
            }
        }
    }


    public static void imprimePacientes(Paciente[] pacientes) {
        for (int i = 0; i < pacientes.length; i++) {
            System.out.print(pacientes[i].nome + " ");
        }
        System.out.println();
    }

}
