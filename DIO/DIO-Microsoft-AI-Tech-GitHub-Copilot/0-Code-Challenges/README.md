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

Exemplo:

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



```py
# ...
    maior_frequencia = max(frequencias.values()) # [ x ] - Modificar .items() por .values();
# ...
else: # [ x ] - Adicionar ":";
# ...
```

> Alternativas de soluções otimizadas nos arquivos dos códigos.

