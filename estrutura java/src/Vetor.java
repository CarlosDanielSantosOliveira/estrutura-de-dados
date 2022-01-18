public class Vetor {

    /*
    Classe Vetor:
    Definição
    Adicionar elemento final do vetor
    Verificar quantidade de elementos no vetor
    imprimir elementos do vetor
    obter elemento de uma posição
    verificar se elemeento existe no vetor
    adicionar elemento em qualquer posição
    adicionar mais capacidade ao vetor
    remover elemento do vetor
    generalizar o tipo dos elementos
    definindo o tipo do vetor dinamicamente
    API java ArrayList
    Exercicios
     */

    private String[] elementos; //Todos os elementos do vetor
    private int tamanho; //Vai controlar o tamanho real do vetor

    public Vetor(int capacidade) { //capacidade de elementos que vou criar
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    //Método para adicionar elemento no Vetor:

    /*
    public void adiciona(String elemento) { //Nesse parametro colocamos o elemento que queremos adicionar no Vetor
        for (int i=0; i<this.elementos.length; i++){
            if (this.elementos[i] == null) {
                this.elementos[i] = elemento;
                break;
            }
        }
    }
     */

    /*
    public void adiciona(String elemento) throws Exception {

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Vetor ja esta cheio, nao é possivel adicionar mais elementos");
        }

    }
     */

    public boolean adiciona(String elemento)  {

        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

}
