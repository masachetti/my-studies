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

## Flex box

Permite o alinhamento de elementos dentro de um container setando o atributo 'display' como 'flex'.

### Flex direction

Define a direção e o sentido em que o flex box vai alinhar os elementos. Pode receber os valores row, column, row-reverse e column-reverse

### Flex wrap

Define quebras de linha caso os elementos ultrapassem o tamanho do container. O valor default é o 'nowrap'.
Para setar as quebras de linha basta setar como wrap. Pode-se também utilizar o 'warp-reverse' para inverter a logica de quebra de linhas.

### Flex flow

O flex flow seta o flex direction e o flex wrap em um unico atributo.
Os valores são os mesmos.

### Justify Content

Justify content faz com que o conteúdo do container seja distribuido de uma maneira especifica:

- flex-start: default value, alinha os elementos começando pela esquerda do container.
- flex-end: alinha os elementos começando pela direita do container.
- center: alinha os elementos ao centro do container.
- space-between: alinha os elementos com o mesmo espaço entre os elementos (o elemento mais a esquerda e o elemento mais a direita ficam sem espaçamento com o começo e o final do container).
- space-around: cria um espaçamento entre os elementos onde os espaçamentos centrais são o dobro dos espaçamentos das extremidades.

### Align Items

Trata do alinhamento dos itens dentro do container em relação ao eixo vertical.

- center: alinahmento ao centro
- stretch: (default) Os flex itens crescem igualmente
- flex-start: alinhamento dos itens no início do container
- flex-end: alinhamento ao final do container
- baseline: alinhamento de acordo com a linha base do texto dos itens

### Align Content

Trata do alinhamento das linhas co container em relação ao eixo vertical.
Para isso, é necessário que o flex blox implemente as quebras de linhas (wrap) e o container tenha uma altura maior que q soma das linhas.

- center: alinhamento ao centro
- stretch: (default) Os flex itens crescem igualmente na linha.
- flex-start: alinhamento dos itens no início do container
- flex-end: alinhamento dos itens ao final
- space-between: espaçamento igual entre os elementos
- space-around: os espaçamentos do meio são duas vezes maiores que os das extremidades

### Percepções proprias

Testando e vendo os resultados, entendi que o flex-direction altera o fluxo do flex box, ou seja, o flex-direction altera como o align-items funciona também.

Por exemplo: Quando flex-direction=row (default) o align-items alinha os itens no sentido vertical, pois o flex-direction=row indica um fluxo de itens no sentido horizontal; E quando flex-direction=column, o align-items alinha os itens no sentido horizontal, pois agora o flex-direction define um fluxo de itens vertical.

Não apenas altera o align-items, como também altera o align-content e o justify-content. Porém, no caso do justify-content, acontece o contrário pois o mesmo já apresenta um comportamento ao contrário dos aligns. Ou seja, o justify-content alinha horizontalmente quando flex-direction=row e verticalmente quando =column.

### Flex grow

Define como o item vai crescer dentro do container. O valor do atributo é um numero que define quantas vezes mais aquele item vai crescer em relação aos demais dentro do container.

Obs: O 'crescimento' diz respeito ao quanto de espaçamento será inserido "dentro" do item. Ou seja, dois items que possuem o mesmo valor de flex-grow mas que possuam conteudos de tamanhos diferentes irão apresentaram tamanhos finais diferentes. Somente o espaçamento interno deles será igual.