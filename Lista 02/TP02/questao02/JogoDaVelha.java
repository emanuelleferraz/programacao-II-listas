package lista02;

import java.util.Scanner;

public class JogoDaVelha {
    static Scanner sc = new Scanner(System.in);

    Jogador jogador = new Jogador();

    public void iniciarJogo(){
        jogador.setOpcao(10);

        while (jogador.getOpcao()!=99){
            System.out.println("\nJOGO DA VELHA");
            System.out.println("RODADA "+jogador.getRodada());
            imprimeTabela();
            System.out.println("\nDigite 99 para sair!");
            if(vez()==1){
                System.out.println("Vez do jogador 1: ");
                jogador.setOpcao(sc.nextInt());
                jogador.player1();
                jogador.verificaVencedor();
            }
            else if(vez()==2){
                System.out.println("Vez do jogador 2: ");
                jogador.setOpcao(sc.nextInt());
                jogador.player2();
                jogador.verificaVencedor();
            }
        }
        
        imprimeTabela();
        System.out.println("Jogo finalizado!");
    }

    public int vez(){
        if(jogador.getVez()%2==1)
            return 1;
        else
            return 2;
    }

    public void imprimeTabela(){
        //System.out.println();

        for(int i =0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                if(j==2 || j==5 || j==8){
                    if(jogador.getTabela()[i][j]==-1){
                        System.out.println(" X");
                    }
                    else if (jogador.getTabela()[i][j]==0){
                        System.out.println(" O");
                    }
                    else{
                        System.out.println(" "+jogador.getTabela()[i][j]);
                    }
                }
                else{
                    if(jogador.getTabela()[i][j]==-1){
                        System.out.print(" X |");
                    }
                    else if (jogador.getTabela()[i][j]==0){
                        System.out.print(" O |");
                    }
                    else {
                        System.out.print(" "+jogador.getTabela()[i][j]+" |");
                    }
                }
            }
        }
    }

    public void iniciarTabela(){
        int a = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a++;
                jogador.getTabela()[i][j] = a;
            }
        }
    }

//    public int[][] getTabela() {
//        return tabela;
//    }
//
//    public void setTabela(int[][] tabela) {
//        this.tabela = tabela;
//    }
//
//    public int getRodada() {
//        return rodada;
//    }
//
//    public void setRodada(int rodada) {
//        this.rodada = rodada;
//    }
//
//    public int getVez() {
//        return vez;
//    }
//
//    public void setVez(int vez) {
//        this.vez = vez;
//    }
//
//    public int getOpcao() {
//        return opcao;
//    }
//
//    public void setOpcao(int opcao) {
//        this.opcao = opcao;
//    }
}
