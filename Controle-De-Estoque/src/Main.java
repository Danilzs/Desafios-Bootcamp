import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        ///  A entrada deve receber uma string contendo os códigos das lojas e a quantidade de produtos, separados por vírgulas.
        ///Cada loja e sua quantidade devem ser representadas no formato "codigo:quantidade". A entrada terá no máximo 1000 caracteres.

        Scanner dado = new Scanner(System.in);

        String[] lojas = dado.nextLine().split(",");

        /// Hashmap é uma coleção que armazena pares de chave-valor (key-value), onde cada chave é única.
        ///É como um dicionário onde você busca uma palavra (chave) para encontrar seu significado (valor).
        /// LinkedHashmap apenas mantem a ordem de inserção.

        Map<String, Integer> mapaQuantidades = new LinkedHashMap<>();

        for(String loja : lojas){
            String[] partes = loja.split(":");
            String codigo =  partes[0].trim();
            int quantidade = Integer.parseInt(partes[1].trim());


            //Se a loja já existe no Map: getOrDefault(codigo, 0) retorna o valor atual
            //Se a loja não existe: getOrDefault(codigo, 0) retorna 0 (valor padrão)
            //Soma a nova quantidade ao valor existente (ou ao zero)
            mapaQuantidades.put(codigo,
                    mapaQuantidades.getOrDefault(codigo, 0) +  quantidade);

        }
        int count = 0;
        for(Map.Entry<String, Integer> entry : mapaQuantidades.entrySet()){

            if(count>0){
                System.out.print(",");
            }
            System.out.print(entry.getKey() + ":" + entry.getValue());
            count++;
        }

        }
    }
