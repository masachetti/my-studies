package collections.map.practice;

/*
- Criar um Map {Estado : População}
-- PE : 9616621
-- AL : 3351543
-- CE : 9187103
-- RN : 3534265
- Substituir a população do RN por 3534165
- Conferir se PB está no Map, caso não, adicionar PB: 4039277
- Exibir a população do PE
- Exibir todos os estados e suas populações na ordem que foi informado
- Exiba os estados e suas populações em ordem alfabética
- Exiba o estado com menor população e sua quantidade
- O mesmo para a maior população
- SOma da população
- Media
- Remover os estados com pop. < 4000000
- Limpar o map
- Checar se ta vazio
*/

/*
Para 'apimentar' a tarefa:
- Fazer o estado ser um Object
- Criar uma ordenação multinivel para o object
*/

import java.util.*;

public class Population {
    public static void main(String[] args) {
        Map<String, Integer> populationByState = new HashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println("Original map: " + populationByState);

        populationByState.put("RN", 3534165);
        System.out.println("Replacing RN value: " + populationByState);

        System.out.println("Map has 'PB'? " + populationByState.containsKey("PB"));
        if (!populationByState.containsKey("PB"))
            populationByState.put("PB", 4039277);
        System.out.println("Map with PB: " + populationByState);

        System.out.println("'PE' population: " + populationByState.get("PE"));

        LinkedHashMap<String, Integer> linkedPopulationByState = new LinkedHashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        System.out.println("Map in added order: ");
        linkedPopulationByState.forEach((key, value) -> System.out.println(key + " : " + value));

        TreeMap<String, Integer> populationTreeMap = new TreeMap<>(linkedPopulationByState);
        System.out.println("Map ordered by state (key): " + populationTreeMap);

        Optional<Map.Entry<String, Integer>> biggestEntry = populationByState.entrySet()
                .stream().max(Map.Entry.comparingByValue());
        Optional<Map.Entry<String, Integer>> smallerEntry = populationByState.entrySet()
                .stream().min(Map.Entry.comparingByValue());

        biggestEntry.ifPresent(entry ->
                System.out.println("Biggest population > " + entry.getKey() + " : " + entry.getValue()));

        smallerEntry.ifPresent(entry ->
                System.out.println("Smaller population > " + entry.getKey() + " : " + entry.getValue()));

        int totalPopulation = populationByState.values().stream().mapToInt(i -> i).sum();
        System.out.println("Total population : " + totalPopulation);
        OptionalDouble averagePopulation = populationByState.values().stream().mapToInt(i -> i).average();
        averagePopulation.ifPresent(value -> System.out.println("Average population : " + value));

        Iterator<Map.Entry<String, Integer>> iterator = populationByState.entrySet().iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getValue() < 4000000)
                iterator.remove();
        }
        System.out.println("Map without state with <4000000 population: " + populationByState);
        populationByState.clear();
        System.out.println("Empty map? " + populationByState.isEmpty());

    }
}
