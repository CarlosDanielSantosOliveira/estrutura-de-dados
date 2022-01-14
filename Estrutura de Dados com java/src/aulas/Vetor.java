package aulas;

public class Vetor {

    private String[] elementos; //vetor de elementos
    private int tamanho;

    public Vetor(int capacidade) { //Essa capacidade é o tanto de elementos que eu vou criar
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    //Método para adicionar um elemento no Vetor

    /*
    Vetor do tipo String: Sempre tera o valor inicial de Null
   Boolean: false
   int: 0
     */
    //METODO 1:
    /*
    public void adiciona(String elemento) { //O parametro é o elemento que queremos adicionar no vetor
        /*
        Nesse caso vamos iterar o vetor, vamos passar por todos os elementos e verificar
        se esse vetor tem uma posição nula, significa que esta disponivel para nos usarmos e adicionar o elemento nessa posição do vetor


        for(int i = 0; i<this.elementos.length; i++) {
            //Agpra vamos verificar se a posição do elemento esta nula para podermos adicionar um elemento na posição
            if (this.elementos[i] == null) { //Se elementos na posição i do vetor for igual a null
                this.elementos[i] = elemento; //vamos vir aqui e atribuir o valor do nosso parametro.
                //a gente quer que o nosso codigo pare de ser executado na primeira posição nula, entao:
                break;
                //E assim o elemento é adicionado no vetor
            }
        }
        */

        //METODO 2
    /*
        public void adiciona(String elemento) throws Exception {

            if (this.tamanho < this.elementos.length) { //Se o tamanho for menor que a capacidade de elementos do meu vetor, ai sim eu adiciono mais elementos no meu vetor
                this.elementos[this.tamanho] = elemento; //Estamos guardando qual foi a aultima posição que guardamos um elemento.
                this.tamanho++; //acrescentamos 1 no valor do tamanho
            } else {
                throw new Exception("Vetor ja está cheio, nao é possivel adicionar mais elementos.");
            }
        }
        */

    //METODO 3
    public boolean adiciona(String elemento) throws Exception {

        if (this.tamanho < this.elementos.length) { //Se o tamanho for menor que a capacidade de elementos do meu vetor, ai sim eu adiciono mais elementos no meu vetor
            this.elementos[this.tamanho] = elemento; //Estamos guardando qual foi a aultima posição que guardamos um elemento.
            this.tamanho++; //acrescentamos 1 no valor do tamanho
            return true;
        }
        return true;

    }


}
