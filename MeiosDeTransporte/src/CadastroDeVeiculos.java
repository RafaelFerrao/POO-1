import java.util.Arrays;

public class CadastroDeVeiculos {
    private int tamanhoLista;
    private int nVeiculos;
    private Veiculo[] lista;

    CadastroDeVeiculos(int tamanhoLista) {
        this.tamanhoLista = tamanhoLista;
        this.lista = new Veiculo[tamanhoLista];
    }

    public void inserir(Veiculo v) {
        if (nVeiculos >= lista.length) {
            tamanhoLista *= 2;
            Veiculo novaLista[] = new Veiculo[tamanhoLista];
            for (int i = 0; i < nVeiculos; i++)
                novaLista[i] = lista[i];
            lista = novaLista;
        }
        lista[nVeiculos] = v;
        nVeiculos++;
    }

    public Veiculo retornaItem(int i){
        if(i > nVeiculos || i < 0){
            return null;
        }
        return lista[i];
    }

    public int tamanho(){
        return nVeiculos;
    }

    public void imprimir(){
        for(int i = 0; i < nVeiculos; i++)
            lista[i].imprimir();
    }

    public void ordena(){
        int i;
        String[] modelos = new String[nVeiculos];
        for(i = 0; i < nVeiculos; i++)
            modelos[i] = lista[i].getModelo();
        Arrays.sort(modelos);
        Veiculo aux;
        for(i = 0; i < nVeiculos; i++)
            for(int j = 0; j < nVeiculos; j++){
                if(modelos[i] == lista[j].getModelo()){
                    aux = lista[i];
                    lista[i] = lista[j];
                    lista[j] = aux;
                }
            }

    }
    

}
