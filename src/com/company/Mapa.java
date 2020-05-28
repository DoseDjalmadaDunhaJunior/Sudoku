package com.company;

public class Mapa {
    Mapa(){
        limpa();
    }

    public void popula(){
        posicaoDesejada();

    }

    //aqui imprime um codigo para cada posição, permitindo assim escolher onde popular e imprime o que ja tem
    private void posicaoDesejada(){
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                if(i == 0 && j == 0 && gg[i][j] == 0){
                    System.out.print(" A1 ");
                }
                else if(i == 0 && j == 1 && gg[i][j] == 0){
                    System.out.print(" B1 ");
                }
                else if(i == 0 && j == 2 && gg[i][j] == 0){
                    System.out.print(" C1 ");
                }
                else if(i == 0 && j == 3 && gg[i][j] == 0){
                    System.out.print(" D1 ");
                }
                else if(i == 0 && j == 4 && gg[i][j] == 0){
                    System.out.print(" E1 ");
                }
                else if(i == 0 && j == 5 && gg[i][j] == 0){
                    System.out.print(" F1 ");
                }
                else if(i == 0 && j == 6 && gg[i][j] == 0){
                    System.out.print(" G1 ");
                }
                else if(i == 0 && j == 7 && gg[i][j] == 0){
                    System.out.print(" H1 ");
                }
                else if(i == 0 && j == 8 && gg[i][j] == 0){
                    System.out.print(" I1 ");
                }
                else if(i == 1 && j == 0 && gg[i][j] == 0){
                    System.out.print(" A2 ");
                }
                else if(i == 1 && j == 1 && gg[i][j] == 0){
                    System.out.print(" B2 ");
                }
                else if(i == 1 && j == 2 && gg[i][j] == 0){
                    System.out.print(" C2 ");
                }
                else if(i == 1 && j == 3 && gg[i][j] == 0){
                    System.out.print(" D2 ");
                }
                else if(i == 1 && j == 4 && gg[i][j] == 0){
                    System.out.print(" E2 ");
                }
                else if(i == 1 && j == 5 && gg[i][j] == 0){
                    System.out.print(" F2 ");
                }
                else if(i == 1 && j == 6 && gg[i][j] == 0){
                    System.out.print(" G2 ");
                }
                else if(i == 1 && j == 7 && gg[i][j] == 0){
                    System.out.print(" H2 ");
                }
                else if(i == 1 && gg[i][j] == 0){
                    System.out.print(" I2 ");
                }
                else if(i == 2 && j == 0 && gg[i][j] == 0){
                    System.out.print(" A3 ");
                }
                else if(i == 2 && j == 1 && gg[i][j] == 0){
                    System.out.print(" B3 ");
                }
                else if(i == 2 && j == 2 && gg[i][j] == 0){
                    System.out.print(" C3 ");
                }
                else if(i == 2 && j == 3 && gg[i][j] == 0){
                    System.out.print(" D3 ");
                }
                else if(i == 2 && j == 4 && gg[i][j] == 0){
                    System.out.print(" E3 ");
                }
                else if(i == 2 && j == 5 && gg[i][j] == 0){
                    System.out.print(" F3 ");
                }
                else if(i == 2 && j == 6 && gg[i][j] == 0){
                    System.out.print(" G3 ");
                }
                else if(i == 2 && j == 7 && gg[i][j] == 0){
                    System.out.print(" H3 ");
                }
                else if(i == 2 && gg[i][j] == 0){
                    System.out.print(" I3 ");
                }
                else if(i == 3 && j == 0 && gg[i][j] == 0){
                    System.out.print(" A4 ");
                }
                else if(i == 3 && j == 1 && gg[i][j] == 0){
                    System.out.print(" B4 ");
                }
                else if(i == 3 && j == 2 && gg[i][j] == 0){
                    System.out.print(" C4 ");
                }
                else if(i == 3 && j == 3 && gg[i][j] == 0){
                    System.out.print(" D4 ");
                }
                else if(i == 3 && j == 4 && gg[i][j] == 0){
                    System.out.print(" E4 ");
                }
                else if(i == 3 && j == 5 && gg[i][j] == 0){
                    System.out.print(" F4 ");
                }
                else if(i == 3 && j == 6 && gg[i][j] == 0){
                    System.out.print(" G4 ");
                }
                else if(i == 3 && j == 7 && gg[i][j] == 0){
                    System.out.print(" H4 ");
                }
                else if(i == 3 && gg[i][j] == 0){
                    System.out.print(" I4 ");
                }
                else if(i == 4 && j == 0 && gg[i][j] == 0){
                    System.out.print(" A5 ");
                }
                else if(i == 4 && j == 1 && gg[i][j] == 0){
                    System.out.print(" B5 ");
                }
                else if(i == 4 && j == 2 && gg[i][j] == 0){
                    System.out.print(" C5 ");
                }
                else if(i == 4 && j == 3 && gg[i][j] == 0){
                    System.out.print(" D5 ");
                }
                else if(i == 4 && j == 4 && gg[i][j] == 0){
                    System.out.print(" E5 ");
                }
                else if(i == 4 && j == 5 && gg[i][j] == 0){
                    System.out.print(" F5 ");
                }
                else if(i == 4 && j == 6 && gg[i][j] == 0){
                    System.out.print(" G5 ");
                }
                else if(i == 4 && j == 7 && gg[i][j] == 0){
                    System.out.print(" H5 ");
                }
                else if(i == 4 && j == 8 && gg[i][j] == 0){
                    System.out.print(" I5 ");
                }
                else if(i == 5 && j == 0 && gg[i][j] == 0){
                    System.out.print(" A6 ");
                }
                else if(i == 5 && j == 1 && gg[i][j] == 0){
                    System.out.print(" B6 ");
                }
                else if(i == 5 && j == 2 && gg[i][j] == 0){
                    System.out.print(" C6 ");
                }
                else if(i == 5 && j == 3 && gg[i][j] == 0){
                    System.out.print(" D6 ");
                }
                else if(i == 5 && j == 4 && gg[i][j] == 0){
                    System.out.print(" E6 ");
                }
                else if(i == 5 && j == 5 && gg[i][j] == 0){
                    System.out.print(" F6 ");
                }
                else if(i == 5 && j == 6 && gg[i][j] == 0){
                    System.out.print(" G6 ");
                }
                else if(i == 5 && j == 7 && gg[i][j] == 0){
                    System.out.print(" H6 ");
                }
                else if(i == 5 && j == 8 && gg[i][j] == 0){
                    System.out.print(" I6 ");
                }
                else if(i == 6 && j == 0 && gg[i][j] == 0){
                    System.out.print(" A7 ");
                }
                else if(i == 6 && j == 1 && gg[i][j] == 0){
                    System.out.print(" B7 ");
                }
                else if(i == 6 && j == 2 && gg[i][j] == 0){
                    System.out.print(" C7 ");
                }
                else if(i == 6 && j == 3 && gg[i][j] == 0){
                    System.out.print(" D7 ");
                }
                else if(i == 6 && j == 4 && gg[i][j] == 0){
                    System.out.print(" E7 ");
                }
                else if(i == 6 && j == 5 && gg[i][j] == 0){
                    System.out.print(" F7 ");
                }
                else if(i == 6 && j == 6 && gg[i][j] == 0){
                    System.out.print(" G7 ");
                }
                else if(i == 6 && j == 7 && gg[i][j] == 0){
                    System.out.print(" H7 ");
                }
                else if(i == 6 && j == 8 && gg[i][j] == 0){
                    System.out.print(" I7 ");
                }
                else if(i == 7 && j == 0 && gg[i][j] == 0){
                    System.out.print(" A8 ");
                }
                else if(i == 7 && j == 1 && gg[i][j] == 0){
                    System.out.print(" B8 ");
                }
                else if(i == 7 && j == 2 && gg[i][j] == 0){
                    System.out.print(" C8 ");
                }
                else if(i == 7 && j == 3 && gg[i][j] == 0){
                    System.out.print(" D8 ");
                }
                else if(i == 7 && j == 4 && gg[i][j] == 0){
                    System.out.print(" E8 ");
                }
                else if(i == 7 && j == 5 && gg[i][j] == 0){
                    System.out.print(" F8 ");
                }
                else if(i == 7 && j == 6 && gg[i][j] == 0){
                    System.out.print(" G8 ");
                }
                else if(i == 7 && j == 7 && gg[i][j] == 0){
                    System.out.print(" H8 ");
                }
                else if(i == 7 && j == 8 && gg[i][j] == 0){
                    System.out.print(" I8 ");
                }
                else if(i == 8 && j == 0 && gg[i][j] == 0){
                    System.out.print(" A9 ");
                }
                else if(i == 8 && j == 1 && gg[i][j] == 0){
                    System.out.print(" B9 ");
                }
                else if(i == 8 && j == 2 && gg[i][j] == 0){
                    System.out.print(" C9 ");
                }
                else if(i == 8 && j == 3 && gg[i][j] == 0){
                    System.out.print(" D9 ");
                }
                else if(i == 8 && j == 4 && gg[i][j] == 0){
                    System.out.print(" E9 ");
                }
                else if(i == 8 && j == 5 && gg[i][j] == 0){
                    System.out.print(" F9 ");
                }
                else if(i == 8 && j == 6 && gg[i][j] == 0){
                    System.out.print(" G9 ");
                }
                else if(i == 8 && j == 7 && gg[i][j] == 0){
                    System.out.print(" H9 ");
                }
                else if(i == 8 && j == 8 && gg[i][j] == 0){
                    System.out.print(" I9 ");
                }
                else{
                    System.out.print(" "+ gg[i][j]+ " ");
                }
            }
            System.out.println("");
        }
    }

    //matriz que seria o mapa completo
    private int gg[][] = new int[9][9];

    //limpa todas as posições, assim evitando lixo de memoria
    private void limpa(){
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                gg[i][j] = 0;
            }
        }
    }
}
