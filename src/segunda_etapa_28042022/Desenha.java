package segunda_etapa_28042022;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;



public class Desenha extends JFrame {

    private double[] soma= new double[10];

    private double menor = 100.0;

    private String ci1, ci2 ;

    private int menorIndex = -1;

    private int x1 = -1, x2 = -1, y1 = -1, y2 =-1;

    private double distanciaTotal=0;

    private String caminho = "";

    private int encontrado = -1;

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
        this.setSize(900, 900);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        ci1 = cidade1;
        ci2 = cidade2;

    }




    @Override
    public void paint(Graphics g) {

        selecionandoPontos(ci1, ci2);
        resultados[0]=pontoInicial;
        Caminhos(pontoEscolhido1, pontoEscolhido2, ci1, ci2);
        g.setColor(Color.blue);
        DesenhaLinhas(g);

    }

    public void DesenhaLinhas(Graphics g) {
        for(int m =0 ; m<10 ; m++)

        for(int i=0; i< resultados.length; i++){
            if(resultados[i] != -1){
                if(resultados[i] == 0) {
                    if(i == 0 || i%2 == 0) {
                        x1 = pontoA[0] * 40;
                        y1 = pontoA[1] * 40;
                        if(i>1){
                            calculoLinha(g,x1,y1,x2,y2);
                        }
                    }else{
                        x2 = pontoA[0] * 40;
                        y2 = pontoA[1] * 40;
                        calculoLinha(g, x2,y2,x1,y1);
                    }
                    }
                }
                if(resultados[i] == 1) {
                    if(i == 0 || i%2 == 0) {
                        x1 = pontoB[0] * 40;
                        y1 = pontoB[1] * 40;
                        if(i>1){
                            calculoLinha(g,x1,y1,x2,y2);
                        }
                    }else{
                        x2 = pontoB[0] * 40;
                        y2 = pontoB[1] * 40;
                        calculoLinha(g, x2,y2,x1,y1);
                    }
                }
                if(resultados[i] == 2) {
                    if(i == 0 || i%2 == 0) {
                        x1 = pontoC[0] * 40;
                        y1 = pontoC[1] * 40;
                        if(i>1){
                            calculoLinha(g,x1,y1,x2,y2);
                        }
                    }else{
                        x2 = pontoC[0] * 40;
                        y2 = pontoC[1] * 40;
                        calculoLinha(g, x2,y2,x1,y1);
                    }
                }
                if(resultados[i] == 3) {
                    if(i == 0 || i%2 == 0) {
                        x1 = pontoD[0] * 40;
                        y1 = pontoD[1] * 40;
                        if(i>1){
                            calculoLinha(g,x1,y1,x2,y2);
                        }
                    }else{
                        x2 = pontoD[0] * 40;
                        y2 = pontoD[1] * 40;
                        calculoLinha(g, x2,y2,x1,y1);
                    }
                }
                if(resultados[i] == 4) {
                    if(i == 0 || i%2 == 0) {
                        x1 = pontoE[0] * 40;
                        y1 = pontoE[1] * 40;
                        if(i>1){
                            calculoLinha(g,x1,y1,x2,y2);
                        }
                    }else{
                        x2 = pontoE[0] * 40;
                        y2 = pontoE[1] * 40;
                        calculoLinha(g, x2,y2,x1,y1);
                    }
                }
                if(resultados[i] == 5) {
                    if(i == 0 || i%2 == 0) {
                        x1 = pontoF[0] * 40;
                        y1 = pontoF[1] * 40;
                        if(i>1){
                            calculoLinha(g,x1,y1,x2,y2);
                        }
                    }else{
                        x2 = pontoF[0] * 40;
                        y2 = pontoF[1] * 40;
                        calculoLinha(g, x2,y2,x1,y1);
                    }
                }
                if(resultados[i] == 6) {
                    if(i == 0 || i%2 == 0) {
                        x1 = pontoG[0] * 40;
                        y1 = pontoG[1] * 40;
                        if(i>1){
                            calculoLinha(g,x1,y1,x2,y2);
                        }
                    }else{
                        x2 = pontoG[0] * 40;
                        y2 = pontoG[1] * 40;
                        calculoLinha(g, x2,y2,x1,y1);
                    }
                }
                if(resultados[i] == 7) {
                    if(i == 0 || i%2 == 0) {
                        x1 = pontoH[0] * 40;
                        y1 = pontoH[1] * 40;
                        if(i>1){
                            calculoLinha(g,x1,y1,x2,y2);
                        }
                    }else{
                        x2 = pontoH[0] * 40;
                        y2 = pontoH[1] * 40;
                        calculoLinha(g, x2,y2,x1,y1);
                    }
                }
                if(resultados[i] == 8) {
                    if(i == 0 || i%2 == 0) {
                        x1 = pontoI[0] * 40;
                        y1 = pontoI[1] * 40;
                        if(i>1){
                            calculoLinha(g,x1,y1,x2,y2);
                        }
                    }else{
                        x2 = pontoI[0] * 40;
                        y2 = pontoI[1] * 40;
                        calculoLinha(g, x2,y2,x1,y1);
                    }
                }
                if(resultados[i] == 9) {
                    if(i == 0 || i%2 == 0) {
                        x1 = pontoJ[0] * 40;
                        y1 = pontoJ[1] * 40;
                        if(i>1){
                            calculoLinha(g,x1,y1,x2,y2);
                        }
                    }else{
                        x2 = pontoJ[0] * 40;
                        y2 = pontoJ[1] * 40;
                        calculoLinha(g, x2,y2,x1,y1);
                    }
                }

        }
        System.out.println("Distância Percorrida: " + distanciaTotal);
    }

    public void Caminhos(int[] p1, int[] p2, String c1, String c2) {
        for (int x = 0; x < 10 && encontrado < 0; x++) {
            if (vizinhoA.indexOf(c1) != -1 && !repetidos(resultados, 0)) {
                soma[0] = distancia(p1[0] * 1.0, p1[1] * 1.0, pontoA[0] * 1.0, pontoA[1] * 1.0);
            }
            if (vizinhoB.indexOf(c1) != -1 && !repetidos(resultados, 1)) {
                soma[1] = distancia(p1[0] * 1.0, p1[1] * 1.0, pontoB[0] * 1.0, pontoB[1] * 1.0);
            }
            if (vizinhoC.indexOf(c1) != -1 && !repetidos(resultados, 2)) {
                soma[2] = distancia(p1[0] * 1.0, p1[1] * 1.0, pontoC[0] * 1.0, pontoC[1] * 1.0);
            }
            if (vizinhoD.indexOf(c1) != -1 && !repetidos(resultados, 3)) {
                soma[3] = distancia(p1[0] * 1.0, p1[1] * 1.0, pontoD[0] * 1.0, pontoD[1] * 1.0);
            }
            if (vizinhoE.indexOf(c1) != -1 && !repetidos(resultados, 4)) {
                soma[4] = distancia(p1[0] * 1.0, p1[1] * 1.0, pontoE[0] * 1.0, pontoE[1] * 1.0);
            }
            if (vizinhoF.indexOf(c1) != -1 && !repetidos(resultados, 5)) {
                soma[5] = distancia(p1[0] * 1.0, p1[1] * 1.0, pontoF[0] * 1.0, pontoF[1] * 1.0);
            }
            if (vizinhoG.indexOf(c1) != -1 && !repetidos(resultados, 6)) {
                soma[6] = distancia(p1[0] * 1.0, p1[1] * 1.0, pontoG[0] * 1.0, pontoG[1] * 1.0);
            }
            if (vizinhoH.indexOf(c1) != -1 && !repetidos(resultados, 7)) {
                soma[7] = distancia(p1[0] * 1.0, p1[1] * 1.0, pontoH[0] * 1.0, pontoH[1] * 1.0);
            }
            if (vizinhoI.indexOf(c1) != -1 && !repetidos(resultados, 8)) {
                soma[8] = distancia(p1[0] * 1.0, p1[1] * 1.0, pontoI[0] * 1.0, pontoI[1] * 1.0);
            }
            if (vizinhoJ.indexOf(c1) != -1 && !repetidos(resultados, 9)) {
                soma[9] = distancia(p1[0] * 1.0, p1[1] * 1.0, pontoJ[0] * 1.0, pontoJ[1] * 1.0);
            }
            menor = 100;

            for (int a = 0; a < 10; a++) {
                if (soma[a] < menor && soma[a] > 0) {
                    menor = soma[a];
                    menorIndex = a;
                }
            }
            for (int j = 0; j < 10; j++) {
                soma[j] = 0;
            }

            if (menorIndex != -1) {
                resultados[x+1] = menorIndex;
                distanciaTotal = distanciaTotal + menor;
                switch (menorIndex) {
                    case 0:
                        c1 = "a";
                        break;
                    case 1:
                        c1 = "b";
                        break;
                    case 2:
                        c1 = "c";
                        break;
                    case 3:
                        c1 = "d";
                        break;
                    case 4:
                        c1 = "e";
                        break;
                    case 5:
                        c1 = "f";
                        break;
                    case 6:
                        c1 = "g";
                        break;
                    case 7:
                        c1 = "h";
                        break;
                    case 8:
                        c1 = "i";
                        break;
                    case 9:
                        c1 = "j";
                        break;
                }
                if (menorIndex == pontoFinal) {
                    encontrado++;
                }

                menorIndex = -1;
            }
        }
        }

    public boolean repetidos(int[] resultados, int valor)
    {
        boolean teste = false;
        for (int element : resultados) {
            if (element == valor) {
                teste = true;
                break;
            }
        }
    return teste;
    }

    public void calculoLinha(Graphics g, int xi, int yi, int xf, int yf) {
        int x = xi, y = yi, d=0, dx = xf-xi, dy = yf-yi, c, m, incX=1, incY=1;

        if(dx < 0) {incX = -1; dx = -dx;}
        if(dy < 0) {incY = -1; dy = -dy;}

        if(dy <= dx) {
            c = 2 * dx; m = 2 * dy;
            if(incX < 0) dx++;
            for(;;) {
                putPixel(g,x,y);
                if (x == xf) break;
                x += incX;
                d += m;
                if(d >= dx) {y += incY; d -= c;}
            }
        } else {
            c = 2 * dy; m = 2 * dx;
            if(incY < 0) dy++;
            for(;;) {
                putPixel(g,x,y);
                if (y == yf) break;
                y += incY;
                d += m;
                if(d >= dy) {x += incX; d -= c;}
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
