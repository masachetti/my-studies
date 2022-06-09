# Anotações CSS

## Estrutura

Um arquivo CSS define um conjunto de regras para estilizar uma página HTML.

Uma regra é composta por seletores e atribuição de atributos.

``` css
a, p, h1, h3{
    color: blue;
    font-size: 14px;
}
```

No caso apresentados, os seletores são as tags a,p, h1 e h3. As atribuições são as declarações dentro das chaves.

## Id x Classe

Enquanto no HTML um ID e uma Class diferem apenas pela atribuição dentro do elemento HTML, no CSS uma class é precedida por um ponto (.) e o Id por uma hashtag (#).

```css
.header{
    padding: 10px;
}

#header{
    padding: 10px;
}
```

## Box model

Cada elemento HTML é representado como um retangulo dentro da pagina. Esse retangulo (box) possui 4 atributos que o "ajustam" ao layout.

- Margin: É o espaçamento entre elementos.
- Border: É o que aparece entre a margin e o padding.
- Padding: Espaçamento entre a margin e o padding.
- Content: É o conteúdo do elemento.

## Localização do espaçamento

Quando é definido um valor de unico para o espaçamento (margin, padding), este valor é atribuido a todas as direções (top, right, bottom, left).

Pode-se utilizar da atribuição por 2 valores para setar os valores de top+bottom e right+left, nesta ordem.

Pode-se utilizar a atribuição por 4 balores para setar cada um dos espaçamentos separadamente, na ordem: top, right, bottom, left.

Por fim, pode-se setar cada espaçamento separadamente setando o valor específico (padding-top, padding-right, ...)

