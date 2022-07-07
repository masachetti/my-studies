package collections.set.practice;


import java.util.*;

/*
- Criar um conjunto com as cores do arco-iris
- Exibir as cores
- Exibir qnts cores há no conjunto
- Exibir em ordem alfabética
- Exibir na ordem inversa da informada
- Exiba Todas as cores que começam com V
- Remover as cores que não começam com V
- Limpar o conjunto
- Conferir se o conjunto está vazio
*/
public class Rainbow {
    public static void main(String[] args) {
        Set<String> rainbowColors = new HashSet<>(){{
            add("Red");
            add("Orange");
            add("Yellow");
            add("Green");
            add("Blue");
            add("Indigo");
            add("Violet");
        }};

        System.out.println("Rainbow Colors: ");
        rainbowColors.forEach(System.out::println);

        System.out.println("How many colors: "+ rainbowColors.size());

        Set<String> orderedRainbowColors = new TreeSet<>(rainbowColors);
        System.out.println("Ordered rainbow colors: " + orderedRainbowColors);

        LinkedHashSet<String> linkedRainbowColors = new LinkedHashSet<>(){{
            add("Red");
            add("Orange");
            add("Yellow");
            add("Green");
            add("Blue");
            add("Indigo");
            add("Violet");
        }};
        List<Object> reversedColors = Arrays.asList(linkedRainbowColors.toArray());
        Collections.reverse(reversedColors);
        System.out.println("Reverse colors: " + reversedColors);

        System.out.println("Colors that start with 'V': ");
        rainbowColors.forEach((String item) -> {
            if(item.startsWith("V")||item.startsWith("v"))
                System.out.println(item);
        });

        Iterator<String> iterator = rainbowColors.iterator();
        while (iterator.hasNext()){
            String temp = iterator.next();
            if(temp.startsWith("V") || temp.startsWith("v"))
                iterator.remove();
        }
        System.out.println("Rainbow without colors that stars with 'V': " + rainbowColors);

        rainbowColors.clear();

        System.out.println("Empty? " + rainbowColors.isEmpty());

    }
}
