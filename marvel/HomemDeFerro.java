package marvel;

import generics.Personagem;

public class HomemDeFerro extends Personagem {
    String nome = "Homem de Ferro";

    @Override
    public String toString() {
        return nome;
    }

    public HomemDeFerro(double forca, double vida) {
        super(forca, vida);
    }

}