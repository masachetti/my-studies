package collections.map.practice;

import java.util.*;

public class PopulationWithObjects {
    public static void main(String[] args) {
        Map<State, Integer> populationMap = new HashMap<>(){{
           put(new State("Pernambuco", "PE", "Nordeste"), 9616621);
           put(new State("Alagoas", "AL", "Nordeste"), 3351543);
           put(new State("Mato Grosso", "MT", "Centro-Oeste"),3035122);
           put(new State("Santa Catarina", "SC", "Sul"), 7252502);
        }};

        Optional<Map.Entry<State, Integer>> searchedEntry = populationMap
                .entrySet().stream().filter(entry -> entry.getKey().getName().equals("Mato Grosso")).findFirst();

        searchedEntry.ifPresent(entry -> System.out.println("Population of Mato Grosso: " + entry.getValue()));

        Comparator<State> comparingByName = Comparator.comparing(State::getName);

        TreeMap<State, Integer> stateTreeMapByName = new TreeMap<>(comparingByName);
        stateTreeMapByName.putAll(populationMap);
        System.out.println("Ordered by name: ");
        stateTreeMapByName.keySet().forEach(System.out::println);

        Comparator<State> comparingByRegion = Comparator.comparing(State::getRegion);
        TreeMap<State, Integer> stateTreeMapByRegion = new TreeMap<>(comparingByRegion);
        stateTreeMapByRegion.putAll(populationMap);
        System.out.println("Ordered by region: " );
        stateTreeMapByRegion.keySet().forEach(System.out::println);

        Comparator<State> comparingByRegionAndName = comparingByRegion.thenComparing(State::getName);
        TreeMap<State, Integer> stateTreeMapByRegionAndName = new TreeMap<>(comparingByRegionAndName);
        stateTreeMapByRegionAndName.putAll(populationMap);
        System.out.println("Ordered by region and name: ");
        stateTreeMapByRegionAndName.keySet().forEach(System.out::println);



    }
}

class State{
    private String name;
    private String abbreviation;
    private String region;

    public State(String name, String abbreviation, String region) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.region = region;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", region='" + region + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        State state = (State) o;
        return Objects.equals(name, state.name) && Objects.equals(abbreviation, state.abbreviation) && Objects.equals(region, state.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, abbreviation, region);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
