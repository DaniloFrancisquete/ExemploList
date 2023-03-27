import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {

       System.out.println("Crie uma Lista e adicione as sete notas: ");
       List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: "+ notas.indexOf(5d));

        System.out.println("Adicione na Lista a nota 8.0 na posição 4: ");
        notas.add(4 ,8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d),6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na LISTA: " + notas.contains(5d));

        //System.out.println("Exiba todas as notas ordem em que foram informados: ");
        //for (Double nota: notas) System.out.println(nota);

            System.out.println("Exiba a terceira nota adicionada: "+notas.get(2));
            System.out.println(notas.toString());

            System.out.println("Exiba a menor nota : " + Collections.min(notas));

            System.out.println("Exiba a maior nota : "+ Collections.max(notas));

        Iterator<Double>iterator = notas.iterator();
                Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
            System.out.println("Exiba a soma dos valores " + soma);

            System.out.println("Exiba a mádia das notas: " + (soma/notas.size()));

            System.out.println("Remova a nota 0 :");
            notas.remove(0d);
            System.out.println(notas);

        System.out.println("Remova a nota 0 :");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas que 7 e exiba a lsita: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next< 7)iterator1.remove();

        }
        System.out.println(notas);

      /*  System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);
        */

        System.out.println("Confira se a Lista está vazia: " + notas.isEmpty());
    }
}