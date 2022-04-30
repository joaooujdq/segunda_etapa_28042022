package segunda_etapa_28042022;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;


public class Desenha extends JFrame {

    private double[] soma= new double[10];

    private double menor = 100.0;

    private int menorIndex;

    private double distanciaTotal=0;

    private String caminho = "";

    private int encontrado = -1;

    private String repetidos="";

    private int[] pontoEscolhido1 = {0, 0}, pontoEscolhido2 = {0, 0};

    private int[] pontoA = {2, 4}, pontoB = {4, 1}, pontoC = {6, 7}, pontoD = {5, 4}, pontoE = {12, 2}, pontoF = {10, 6}, pontoG = {12, 9},
            pontoH = {8, 11}, pontoI = {3, 8}, pontoJ = {2, 11};

    private String vizinhoA = "hcb", vizinhoB ="ae", vizinhoC = "aijgd", vizinhoD = "cfe",
            vizinhoE = "bdfg", vizinhoF = "dge", vizinhoG = "cfe", vizinhoH = "ja",
            vizinhoI = "c", vizinhoJ = "hc";

    private int[] resultados = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};

    private int pontoInicial;
    private int pontoFinal;
    

    public Desenha(String cidade1, String cidade2) {
        this.setTitle("Segunda Etapa Teste");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        selecionandoPontos(cidade1, cidade2);
        resultados[0]=pontoInicial;
        Caminhos(pontoEscolhido1, pontoEscolhido2, cidade1, cidade2);
        resultados[resultados.length -1] = pontoFinal;
    }




    @Override
    public void paint(Graphics g) {

        g.setColor(Color.red);
        DesenhaLinhas(g);
    }

    public void DesenhaLinhas(Graphics g) {
        System.out.println(menor);

        System.out.println(caminho);

        for(int i=0; i< resultados.length; i++){
            if(resultados[i] != -1){
                switch (resultados[i]){
                    case 0:
                        putPixel(g, pontoA[0], pontoA[1]);
                        break;
                    case 1:
                        putPixel(g, pontoB[0], pontoB[1]);
                        break;
                    case 2:
                        putPixel(g, pontoC[0], pontoC[1]);
                        break;
                    case 3:
                        putPixel(g, pontoD[0], pontoD[1]);
                        break;
                    case 4:
                        putPixel(g, pontoE[0], pontoE[1]);
                        break;
                    case 5:
                        putPixel(g, pontoF[0], pontoF[1]);
                        break;
                    case 6:
                        putPixel(g, pontoG[0], pontoG[1]);
                        break;
                    case 7:
                        putPixel(g, pontoH[0], pontoH[1]);
                        break;
                    case 8:
                        putPixel(g, pontoI[0], pontoI[1]);
                        break;
                    case 9:
                        putPixel(g, pontoJ[0], pontoJ[1]);
                        break;
                }
            }

        }

    }

    public void Caminhos(int[] p1, int[] p2, String c1, String c2) {
        for (int x = 0; x < 10 && encontrado < 0; x++) {
                if(vizinhoA.indexOf(c1) != -1 ){
                    soma[0] =  distancia(p1[0] * 1.0, p1[1] * 1.0, pontoA[0] * 1.0, pontoA[1] * 1.0);
                }
                if(vizinhoB.indexOf(c1) != -1){
                    soma[1] =  distancia(p1[0] * 1.0, p1[1] * 1.0, pontoB[0] * 1.0, pontoB[1] * 1.0);
                }
                if(vizinhoC.indexOf(c1) != -1){
                    soma[2] =  distancia(p1[0] * 1.0, p1[1] * 1.0, pontoC[0] * 1.0, pontoC[1] * 1.0);
                }
                if(vizinhoD.indexOf(c1) != -1){
                    soma[3] =  distancia(p1[0] * 1.0, p1[1] * 1.0, pontoD[0] * 1.0, pontoD[1] * 1.0);
                }
                if(vizinhoE.indexOf(c1) != -1){
                    soma[4] = distancia(p1[0] * 1.0, p1[1] * 1.0, pontoE[0] * 1.0, pontoE[1] * 1.0);
                }
                if(vizinhoF.indexOf(c1) != -1){
                    soma[5] = distancia(p1[0] * 1.0, p1[1] * 1.0, pontoF[0] * 1.0, pontoF[1] * 1.0);
                }
                if(vizinhoG.indexOf(c1) != -1){
                    soma[6] = distancia(p1[0] * 1.0, p1[1] * 1.0, pontoG[0] * 1.0, pontoG[1] * 1.0);
                }
                if(vizinhoH.indexOf(c1) != -1){
                    soma[7] = distancia(p1[0] * 1.0, p1[1] * 1.0, pontoH[0] * 1.0, pontoH[1] * 1.0);
                }
                if(vizinhoI.indexOf(c1) != -1){
                    soma[8] = distancia(p1[0] * 1.0, p1[1] * 1.0, pontoI[0] * 1.0, pontoI[1] * 1.0);
                }
                if(vizinhoJ.indexOf(c1) != -1){
                    soma[9] = distancia(p1[0] * 1.0, p1[1] * 1.0, pontoJ[0] * 1.0, pontoJ[1] * 1.0);
                }


            
            for(int a =0; a<10;a++){
                if(soma[a] < menor && soma[a] > 0){
                    menor = soma[a];
                    menorIndex = a;
                }
            }
            resultados[x] = menorIndex;
            distanciaTotal = distanciaTotal + menor;
            System.out.println(menorIndex);


            if(menorIndex == 0 ){
                c1="a";
                repetidos = "a" + repetidos;
            }
            if(menorIndex == 1 ){
                c1="b";
                repetidos = "b" + repetidos;
            }
            if(menorIndex == 2 ){
                c1="c";
                repetidos = "c" + repetidos;
            }
            if(menorIndex == 3 ){
                c1="d";
                repetidos = "d" + repetidos;
            }
            if(menorIndex == 4 ){
                c1="e";
                repetidos = "e" + repetidos;
            }
            if(menorIndex == 5 ){
                c1="e";
                repetidos = "e" + repetidos;
            }
            if(menorIndex == 6 ){
                c1="f";
                repetidos = "f" + repetidos;
            }
            if(menorIndex == 7 ){
                c1="g";
                repetidos = "g" + repetidos;
            }
            if(menorIndex == 8 ){
                c1="h";
                repetidos = "h" + repetidos;
            }
            if(menorIndex == 9 ){
                c1="i";
                repetidos = "i" + repetidos;
            }
            if(menorIndex == 10 ){
                c1="j";
                repetidos = "j" + repetidos;
            }


            for(int j =0 ; j<10 ; j++){
                soma[j] = 0;
            }
            System.out.println(resultados[0]);
            System.out.println(resultados[1]);
            System.out.println(resultados[2]);
            System.out.println(resultados[3]);
            System.out.println(resultados[4]);
            System.out.println(resultados[5]);
            System.out.println(resultados[6]);
            System.out.println(resultados[7]);
            System.out.println(resultados[8]);
            System.out.println(resultados[9]);
            if(menorIndex == pontoFinal){
                encontrado++;
            }
            }
        }



        public double distancia( double x1, double y1, double x2, double y2){

            return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
        }

        public void selecionandoPontos (String cidade1, String cidade2){
            switch (cidade1) {
                case "a":
                    pontoEscolhido1[0] = 2;
                    pontoEscolhido1[1] = 4;
                    pontoInicial=0;
                    break;
                case "b":
                    pontoEscolhido1[0] = 4;
                    pontoEscolhido1[1] = 1;
                    pontoInicial=1;
                    break;
                case "c":
                    pontoEscolhido1[0] = 6;
                    pontoEscolhido1[1] = 7;
                    pontoInicial=2;
                    break;
                case "d":
                    pontoEscolhido1[0] = 5;
                    pontoEscolhido1[1] = 4;
                    pontoInicial=3;
                    break;
                case "e":
                    pontoEscolhido1[0] = 12;
                    pontoEscolhido1[1] = 2;
                    pontoInicial=4;
                    break;
                case "f":
                    pontoEscolhido1[0] = 10;
                    pontoEscolhido1[1] = 6;
                    pontoInicial=5;
                    break;
                case "g":
                    pontoEscolhido1[0] = 12;
                    pontoEscolhido1[1] = 9;
                    pontoInicial=6;
                    break;
                case "h":
                    pontoEscolhido1[0] = 8;
                    pontoEscolhido1[1] = 11;
                    pontoInicial=7;
                    break;
                case "i":
                    pontoEscolhido1[0] = 3;
                    pontoEscolhido1[1] = 8;
                    pontoInicial=8;
                    break;
                case "j":
                    pontoEscolhido1[0] = 2;
                    pontoEscolhido1[1] = 11;
                    pontoInicial=9;
                    break;
            }

            switch (cidade2) {
                case "a":
                    pontoEscolhido2[0] = 2;
                    pontoEscolhido2[1] = 4;
                    pontoFinal=0;
                    break;
                case "b":
                    pontoEscolhido2[0] = 4;
                    pontoEscolhido2[1] = 1;
                    pontoFinal=1;
                    break;
                case "c":
                    pontoEscolhido2[0] = 6;
                    pontoEscolhido2[1] = 7;
                    pontoFinal=2;
                    break;
                case "d":
                    pontoEscolhido2[0] = 5;
                    pontoEscolhido2[1] = 4;
                    pontoFinal=3;
                    break;
                case "e":
                    pontoEscolhido2[0] = 12;
                    pontoEscolhido2[1] = 2;
                    pontoFinal=4;
                    break;
                case "f":
                    pontoEscolhido2[0] = 10;
                    pontoEscolhido2[1] = 6;
                    pontoFinal=5;
                    break;
                case "g":
                    pontoEscolhido2[0] = 12;
                    pontoEscolhido2[1] = 9;
                    pontoFinal=6;
                    break;
                case "h":
                    pontoEscolhido2[0] = 8;
                    pontoEscolhido2[1] = 11;
                    pontoFinal=7;
                    break;
                case "i":
                    pontoEscolhido2[0] = 3;
                    pontoEscolhido2[1] = 8;
                    pontoFinal=8;
                    break;
                case "j":
                    pontoEscolhido2[0] = 2;
                    pontoEscolhido2[1] = 11;
                    pontoFinal=9;
                    break;
            }
        }

        public void putPixel (Graphics g, int x, int y){
            g.drawLine(x, y, x, y);
        }

    }
