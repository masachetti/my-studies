package collections.set.practice;

/*
- Criar uma class Lang com: Nome, ano de criação e IDE
- Ordenar e apresentar por:
-- Ordem de inserção
-- Ordem natural
-- IDE
-- Ano de criação e nome
-- Nome, ano de criação e IDE
*/

import java.util.*;

public class LangOrdering {
    public static void main(String[] args) {
        Set<Lang> langSet = new LinkedHashSet<>() {{
            add(new Lang("Python", "PyCharm", 1990));
            add(new Lang("Python", "PyCharm", 2010));
            add(new Lang("Python", "VSCode", 2010));
            add(new Lang("JavaScript", "VSCode", 1980));
            add(new Lang("Java", "IntelliJ", 1975));
            add(new Lang("Ruby", "VSCode", 2000));
        }};

        System.out.println("Ordem de inserção: " + langSet);

        Set<Lang> langSetOrderedByName = new TreeSet<>(new Comparator<Lang>() {
            @Override
            public int compare(Lang o1, Lang o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        langSetOrderedByName.addAll(langSet);
        System.out.println("Ordered by name: " + langSetOrderedByName);

        Set<Lang> langSetOrderedByIde = new TreeSet<>(Comparator.comparing(Lang::getIde));
        langSetOrderedByIde.addAll(langSet);
        System.out.println("Ordered by IDE: " + langSetOrderedByIde);

        Comparator<Lang> langComparator = Comparator.comparing(Lang::getName).thenComparing(Lang::getCreationYear);

        Set<Lang> langSetOrderedByNameAndYear = new TreeSet<>(langComparator);
        langSetOrderedByNameAndYear.addAll(langSet);
        System.out.println("Ordered by Name and Year: " + langSetOrderedByNameAndYear);

        Comparator<Lang> langComparator2 = langComparator.thenComparing(Lang::getIde);
        Set<Lang> langSetOrderedByNameYearIDE = new TreeSet<>(langComparator2);
        langSetOrderedByNameYearIDE.addAll(langSet);
        System.out.println("Ordered by Name>Year>IDE: " + langSetOrderedByNameYearIDE);

    }
}

class Lang {
    private String name;
    private String ide;
    private int creationYear;

    public Lang(String name, String ide, int creationYear) {
        this.name = name;
        this.ide = ide;
        this.creationYear = creationYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lang lang = (Lang) o;
        return creationYear == lang.creationYear && Objects.equals(name, lang.name) && Objects.equals(ide, lang.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ide, creationYear);
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", ide='" + ide + '\'' +
                ", creationYear=" + creationYear +
                '}';
    }
}