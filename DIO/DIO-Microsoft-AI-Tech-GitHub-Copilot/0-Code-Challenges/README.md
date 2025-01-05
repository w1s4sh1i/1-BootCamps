# Code Challenges - Bootcamp Microsoft AI for Tech - GitHub Copilot

I. [Debugando com o GitHub Copilot](https://web.dio.me/coding/debugando-com-o-github-copilot/algorithm/debugando-um-conversor-de-data-simples?back=/track/github-copilot#state=ba0e1292-2763-4561-8227-32a491fdad4f&session_state=a851604b-8180-44ae-8e36-a5e9a88ca2e5&code=9f259c6b-1e58-4709-a390-35b5ddd9517b.a851604b-8180-44ae-8e36-a5e9a88ca2e5.a889d5a2-0d02-46df-83a5-28a1b4ac39ab) [3]

## I	Debugando um Conversor de Data Simples [1/3]

Neste exercício, vamos desmistificar um desafio comum para quem está começando a programar: **a conversão de datas entre diferentes formatos**. Imagine que recebeu um código com bugs ou desformatado, que deveria transformar datas do formato americano ("yyyy-mm-dd") para o brasileiro ("dd/mm/yyyy"). Nosso objetivo é entender o problema e estruturar uma estratégia de solução e testar o código, para validar nossa resposta.

> **Entendendo o Desafio**

O código defeituoso recebe uma data em formato de texto **("yyyy-mm-dd")** e deve formatar para "dd/mm/yyyy". Se a data de entrada não conter indicadores internos de separação: "-" para separar os dados, o código precisa retornar a mensagem **"Formato de data inválido."**

> **Pontos de Análise**

- Validação da Entrada - Antes de qualquer conversão, é crucial verificar se a data de entrada está correta. Afinal, não queremos que nosso código tente processar algo como "2024/12/25" ou "janeiro-01-2023". Precisamos garantir que o formato "yyyy-mm-dd" seja respeitado.

- Extração dos Componentes - Uma vez validada a entrada, precisamos extrair o ano, o mês e o dia da string original. Python oferece diversas maneiras de fazer isso, como o método split().

- Reformatação da Data - Com os componentes da data em mãos, precisamos reorganizá-los e formatá-los de acordo com o padrão brasileiro "dd/mm/yyyy".

> **Estratégia de Solução**

- Validação com Expressões Regulares (Regex) - Usar regex é uma forma eficiente de validar o formato da data. Uma expressão regular pode descrever o padrão "yyyy-mm-dd" e verificar se a entrada corresponde a ele. __(estratégia opcional)__ 

- `.split()` para Extração - O método `.split('-')` pode dividir a string de data em uma lista de três elementos: ano, mês e dia.

- F-strings para Formatação - As f-strings em Python facilitam a construção da string de saída no formato desejado.

**Exemplo**

Se a entrada for "2024-12-25", a saída esperada é "25/12/2024". Se a entrada for "25.12.2024", a saída deve ser "Formato de data inválido."

**Dicas para rastrear boas respostas**

Use um debugger (IDE para análise) ou imprima valores intermediários para acompanhar o fluxo do código e identificar os erros.

- O GitHub Copilot pode ser um aliado poderoso, sugerindo correções e otimizações.

- Explore a documentação do Python e bibliotecas como datetime para aprofundar seus conhecimentos sobre manipulação de datas.


```py
# ...
    ano, mes, dia = data_str.split("-") # [ x ] - Modificar a sequência de recepção dos valores.   
# ...
if "-" in data_input: # [ x ] - Adicionar ":" para estruturar o "if"
# ...
```

> Alternativas de soluções otimizadas nos arquivos dos códigos.

## I	Debugando um Verificador de Anagrama [2/3]

Esse exercício vamos avaliar outro desafio clássico de programação: verificar se duas palavras são anagramas. Anagramas são palavras formadas pelas mesmas letras, mas em ordens diferentes. Recebemos um código com erros que realizaremos as verificações necessárias com o objetivo de depurar e fazer o código funcionar corretamente.

> **Entendendo o Desafio**

O programa recebe duas palavras como entrada (fornecidas pelo servidor), separadas por um espaço. A saída deve ser "Verdadeiro" se as palavras forem **anagramas** e "Falso" caso contrário. Simples, correto? Mas, o código fornecido tem alguns bugs que iremos corrigir.

> **Pontos de Análise**

- Tratamento da Entrada - O programa precisa ler a linha de entrada contendo as duas palavras e separá-las corretamente.

- Lógica de Comparação - O núcleo do desafio está em comparar as letras das duas palavras. Precisamos de uma maneira eficiente de verificar se elas contêm as mesmas letras, independentemente da ordem.

- Saída Correta - O programa deve imprimir "Verdadeiro" ou "Falso" de acordo com o resultado da comparação. Atenção à capitalização ("V" e "F" maiúsculos).

> **Estratégia de Solução**

- `input().split()` para a Entrada - A função `input()` lê a linha de entrada, e o método `.split()` a divide em uma lista de palavras, usando o espaço como separador.

- Ordenação e Comparação - Uma estratégia eficaz é ordenar as letras de cada palavra e compará-las. Se as palavras ordenadas forem iguais, elas são anagramas. Python facilita isso com a função `sorted()`.

- `print()` para a Saída: A função `print()` exibe o resultado. Podemos usar uma estrutura condicional `(if/else)` para imprimir "Verdadeiro" ou "Falso".

**Exemplo**

Se a entrada for "ouvir virou", a saída esperada é "Verdadeiro". Se a entrada for "gato pato", a saída esperada é "Falso".

```py
# ...
    return sorted(palavra1) == sorted(palavra2) # [ x ] - Adicionar a ordenação na palavra2;
# ...
        print("Verdadeiro") # [ x ] - Adicionar os parênteses;
# ...
        print("Falso") # [ x ] - Adicionar os parênteses;
# ...
```

> Alternativas de soluções otimizadas nos arquivos dos códigos.

## I	Debugando uma Calculadora de Moda [3/3]

Neste 3º desafio, vamos encarar um desafio prático: depurar uma calculadora de moda escrita em Python. A moda, em estatística, representa o valor que aparece com mais frequência em um conjunto de dados. Recebemos um código com defeitos, e nossa missão é encontrar e corrigir os erros para que a calculadora funcione como esperado.

> **Entendendo o Desafio**

A calculadora recebe uma sequência de números inteiros separados por espaços. Ela deve processar esses números e identificar qual deles aparece com maior frequência, imprimindo esse valor como resultado (a moda).

> **Pontos de Análise**

- Processamento da Entrada - A calculadora precisa ler a string de entrada, separar os números e convertê-los para o tipo inteiro.

- Contagem de Frequências - O código deve contar quantas vezes cada número aparece na sequência. Estruturas de dados como dicionários são úteis para isso.

- Identificação da Moda - Após contar as frequências, o programa precisa determinar qual número tem a maior contagem, ou seja, a moda.

> **Estratégia de Solução**

- `input().split()` e `map()` para a Entrada - `input().split()` divide a entrada em uma lista de strings. `map(int, ...)` converte cada string da lista para um inteiro.

- Dicionário para Contagem - Um dicionário pode armazenar as frequências de cada número. A chave do dicionário é o número, e o valor é a sua contagem.

- Encontrando a Moda - Podemos iterar pelo dicionário para encontrar a chave (número) com o maior valor (contagem).

**Exemplo**

Se a entrada for "1 2 2 3 3 3 4", a saída esperada é 3. Se a entrada for "1 1 4 2 3 3 4 4", a saída esperada é 4.

```py
# ...
    maior_frequencia = max(frequencias.values()) # [ x ] - Modificar .items() por .values();
# ...
else: # [ x ] - Adicionar ":";
# ...
```

> Alternativas de soluções otimizadas nos arquivos dos códigos.

