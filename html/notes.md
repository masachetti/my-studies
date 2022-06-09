# Anotações sobre HTML

## Elementos

O HTML é construido por elementos HTML.

Cada elemento é composto por uma Tag, Atributos e Conteúdo. A Tag define o tipo do elemento, como header, body, divs, etc.

``` HTML
<h1 class="titulo"> Título</h1>
```

No exemplo, "h1" é Tag, class é um atributo e "Título" é o conteúdo.

## Estrutura

``` HTML
<!DOCTYPE html>
<html>
    <head>
    </head>
    <body>
    </body>
</html>
```

## Semântica

No HTML existem diversas tags que podem (e devem) ser utilizadas para finalidades expecíficas. Por exemplo:

- Header: Cabeçalho da página
- Footer: Rodapé da página
- h1-h6: Hierarquia de títulos.
- etc.

## Elemento \<p>

A tag \<p> representa um paragrafo que pode ser utilizada para mostrar textos, imagens, links, videos, codigos, etc.

## Elemento \<a>

A tag \<a> serve para inserirmos links dentro do HTML. Os dois principais atributos dessa tag são:

- href: indica o link que será aberto
- target: indica como o link será aberto
  - "_blank" abre o link em uma nova aba

``` HTML
<a href="www.google.com.br">Google</a>
<a href="mailto:some.email@whatever.com">email</a>
<a href="tel:6666-6666">tel number</a>
<a tagert="_blank">Link</a>
```

## Elemento \<img>

O elemento \<img> mostra uma imagem. Os atributos principais são:

- src: o caminho para a imagem, pode ser uma URL ou um caminho dentro da pasta do site.
- alt: descrição da imagem para fins de acessibilidade.

## Listas

Os elementos para representar uma lista podem ser:

- \<ul>: Lista não ordenad (unordered)
- \<ol>: Lista ordenada (ordered)
- \<li>: Elemento da lista