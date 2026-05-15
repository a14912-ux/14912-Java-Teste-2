public class Animais {
    
    public int numeroCA;

    public String nomeAnimal;

    public String dataNascimento;

    

    




    public Animais(int numeroCA, String nomeAnimal, String dataNascimento) {

        this.numeroCA = numeroCA;

        this.nomeAnimal = nomeAnimal;

        this.dataNascimento = dataNascimento;

        

    }


    @Override

    public String toString() {

        return nomeAnimal;

    }
}
