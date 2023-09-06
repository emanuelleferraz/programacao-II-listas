package exercicio02;

public class Jogador {

    private int tabela[][] = new int[3][3];
    private int rodada=1;
    private int vez=1;
    private int opcao;

    public void verificaVencedor(){
        if(getTabela()[0][0]==-1 && getTabela()[1][0]==-1 && getTabela()[2][0]==-1 ||
                getTabela()[0][1]==-1 && getTabela()[1][1]==-1 && getTabela()[2][1]==-1 ||
                getTabela()[0][2]==-1 && getTabela()[1][2]==-1 && getTabela()[2][2]==-1 ||
                getTabela()[0][0]==-1 && getTabela()[0][1]==-1 && getTabela()[0][2]==-1 ||
                getTabela()[1][0]==-1 && getTabela()[1][1]==-1 && getTabela()[1][2]==-1 ||
                getTabela()[2][0]==-1 && getTabela()[2][1]==-1 && getTabela()[2][2]==-1 ||
                getTabela()[0][0]==-1 && getTabela()[1][1]==-1 && getTabela()[2][2]==-1 ||
                getTabela()[0][2]==-1 && getTabela()[1][1]==-1 && getTabela()[2][0]==-1){
            System.out.println("Jogador 1 é o vencedor!!!");
            setOpcao(99);
        }

        else if(getTabela()[0][0]==0 && getTabela()[1][0]==0 && getTabela()[2][0]==0 ||
                getTabela()[0][1]==0 && getTabela()[1][1]==0 && getTabela()[2][1]==0 ||
                getTabela()[0][2]==0 && getTabela()[1][2]==0 && getTabela()[2][2]==0 ||
                getTabela()[0][0]==0 && getTabela()[0][1]==0 && getTabela()[0][2]==0 ||
                getTabela()[1][0]==0 && getTabela()[1][1]==0 && getTabela()[1][2]==0 ||
                getTabela()[2][0]==0 && getTabela()[2][1]==0 && getTabela()[2][2]==0 ||
                getTabela()[0][0]==0 && getTabela()[1][1]==0 && getTabela()[2][2]==0 ||
                getTabela()[0][2]==0 && getTabela()[1][1]==0 && getTabela()[2][0]==0){
            System.out.println("\nJogador 2 é o vencedor!!!");
            setOpcao(99);
        }
        else if(getRodada()==10){
            System.out.println("Houve um empate!!!");
            setOpcao(99);
        }
    }

    public void player1(){
        if(getOpcao() != 99){
            switch (getOpcao()){
                case 1:
                    if(getTabela()[0][0]==-1 || getTabela()[0][0]==0){
                        System.out.println("Posição já preenchida!");
                    }
                    else{
                        getTabela()[0][0] = -1;
                        setVez(getVez()+1);
                        setRodada(getRodada()+1);
                    }
                    break;
                case 2:
                    if(getTabela()[0][1]==-1 || getTabela()[0][1]==0){
                        System.out.println("Posição já preenchida!");
                    }
                    else{
                        getTabela()[0][1] = -1;
                        setVez(getVez()+1);
                        setRodada(getRodada()+1);
                    }
                    break;
                case 3:
                    if(getTabela()[0][2]==-1 || getTabela()[0][2]==0){
                        System.out.println("Posição já preenchida!");
                    }
                    else{
                        getTabela()[0][2] = -1;
                        setVez(getVez()+1);
                        setRodada(getRodada()+1);
                    }
                    break;
                case 4:
                    if(getTabela()[1][0]==-1 || getTabela()[1][0]==0){
                        System.out.println("Posição já preenchida!");
                    }
                    else{
                        getTabela()[1][0] = -1;
                        setVez(getVez()+1);
                        setRodada(getRodada()+1);
                    }
                    break;
                case 5:
                    if(getTabela()[1][1]==-1 || getTabela()[1][1]==0){
                        System.out.println("Posição já preenchida!");
                    }
                    else{
                        getTabela()[1][1] = -1;
                        setVez(getVez()+1);
                        setRodada(getRodada()+1);
                    }
                    break;
                case 6:
                    if(getTabela()[1][2]==-1 || getTabela()[1][2]==0){
                        System.out.println("Posição já preenchida!");
                    }
                    else{
                        getTabela()[1][2] = -1;
                        setVez(getVez()+1);
                        setRodada(getRodada()+1);
                    }
                    break;
                case 7:
                    if(getTabela()[2][0]==-1 || getTabela()[2][0]==0){
                        System.out.println("Posição já preenchida!");
                    }
                    else{
                        getTabela()[2][0] = -1;
                        setVez(getVez()+1);
                        setRodada(getRodada()+1);
                    }
                    break;
                case 8:
                    if(getTabela()[2][1]==-1 || getTabela()[2][1]==0){
                        System.out.println("Posição já preenchida!");
                    }
                    else{
                        getTabela()[2][1] = -1;
                        setVez(getVez()+1);
                        setRodada(getRodada()+1);
                    }
                    break;
                case 9:
                    if(getTabela()[2][2]==-1 || getTabela()[2][2]==0){
                        System.out.println("Posição já preenchida!");
                    }
                    else{
                        getTabela()[2][2] = -1;
                        setVez(getVez()+1);
                        setRodada(getRodada()+1);
                    }
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }
    }

    public void player2(){
        if(getOpcao()!=99){
            switch (getOpcao()){
                case 1:
                    if(getTabela()[0][0]==-1 || getTabela()[0][0]==0){
                        System.out.println("Posição já preenchida!");
                    }
                    else{
                        getTabela()[0][0] = 0;
                        setVez(getVez()+1);
                        setRodada(getRodada()+1);
                    }
                    break;
                case 2:
                    if(getTabela()[0][1]==-1 || getTabela()[0][1]==0){
                        System.out.println("Posição já preenchida!");
                    }
                    else{
                        getTabela()[0][1] = 0;
                        setVez(getVez()+1);
                        setRodada(getRodada()+1);
                    }
                    break;
                case 3:
                    if(getTabela()[0][2]==-1 || getTabela()[0][2]==0){
                        System.out.println("Posição já preenchida!");
                    }
                    else{
                        getTabela()[0][2] = 0;
                        setVez(getVez()+1);
                        setRodada(getRodada()+1);
                    }
                    break;
                case 4:
                    if(getTabela()[1][0]==-1 || getTabela()[1][0]==0){
                        System.out.println("Posição já preenchida!");
                    }
                    else{
                        getTabela()[1][0] = 0;
                        setVez(getVez()+1);
                        setRodada(getRodada()+1);
                    }
                    break;
                case 5:
                    if(getTabela()[1][1]==-1 || getTabela()[1][1]==0){
                        System.out.println("Posição já preenchida!");
                    }
                    else{
                        getTabela()[1][1] = 0;
                        setVez(getVez()+1);
                        setRodada(getRodada()+1);
                    }
                    break;
                case 6:
                    if(getTabela()[1][2]==-1 || getTabela()[1][2]==0){
                        System.out.println("Posição já preenchida!");
                    }
                    else{
                        getTabela()[1][2] = 0;
                        setVez(getVez()+1);
                        setRodada(getRodada()+1);
                    }
                    break;
                case 7:
                    if(getTabela()[2][0]==-1 || getTabela()[2][0]==0){
                        System.out.println("Posição já preenchida!");
                    }
                    else{
                        getTabela()[2][0] = 0;
                        setVez(getVez()+1);
                        setRodada(getRodada()+1);
                    }
                    break;
                case 8:
                    if(getTabela()[2][1]==-1 || getTabela()[2][1]==0){
                        System.out.println("Posição já preenchida!");
                    }
                    else{
                        getTabela()[2][1] = 0;
                        setVez(getVez()+1);
                        setRodada(getRodada()+1);
                    }
                    break;
                case 9:
                    if(getTabela()[2][2]==-1 || getTabela()[2][2]==0){
                        System.out.println("Posição já preenchida!");
                    }
                    else{
                        getTabela()[2][2] = 0;
                        setVez(getVez()+1);
                        setRodada(getRodada()+1);
                    }
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }
    }

    public int[][] getTabela() {
        return tabela;
    }

    public void setTabela(int[][] tabela) {
        this.tabela = tabela;
    }

    public int getRodada() {
        return rodada;
    }

    public void setRodada(int rodada) {
        this.rodada = rodada;
    }

    public int getVez() {
        return vez;
    }

    public void setVez(int vez) {
        this.vez = vez;
    }

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }
}
