package segunda_etapa_28042022;

import javax.swing.*;

import java.util.Arrays;

public class Janela {



        private String cidade1, cidade2;

         private char[] todasCidades = {'a','b','c','d','e','f','g','h','i','j'};

         private int entradaInvalida = -1;
         private int encontrouCidade1 = -1;
         private int encontrouCidade2 = -1;

        public Janela() {
            System.out.println(todasCidades.length);
            cidade1 = JOptionPane.showInputDialog("Digite a letra correspondete a primeira cidade");
            cidade2 = JOptionPane.showInputDialog("Digite a letra correspondete a segunda cidade");
            for(int x = 0;  x < todasCidades.length; x++) {


                System.out.println(cidade1);
                System.out.println(cidade2);
                System.out.println(todasCidades.getClass().getSimpleName());


               if (cidade1.indexOf(todasCidades[x]) != -1 && !cidade1.equals(cidade2)  && encontrouCidade1 != 0){
                   entradaInvalida++;
                  // x = 0;
                   encontrouCidade1++;
               }

               if (cidade2.indexOf(todasCidades[x]) != -1 && !cidade1.equals(cidade2) && encontrouCidade2 != 0) {
                   entradaInvalida++;
                  // x = 0;
                   encontrouCidade2++;
               }
            }
            System.out.println(entradaInvalida);
            if( entradaInvalida < 1) {
                JOptionPane.showMessageDialog(null,"Entrada inválida. Tente novamente.");
            }else if(entradaInvalida> 0 ){
                new Desenha(cidade1, cidade2);
            }


        }

}

