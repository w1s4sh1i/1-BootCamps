# Code Challenges - Santander Bootcamp Cibersegurança #2

I > Explorando Fundamentos de Cibersegurança com Desafios de Código em Python [2]

II > [2]

## I.1/2 Code Challenge - Verificação de Integridade de Arquivos com Hashes

###  Desafio da Verificação de Integridade de Arquivos

Ao valiar o contexto do desafio é possivel imaginar que um arquivo importante da internet foi baixado, para um um jogo ou um programa. Para validar a legibilidade do arquivo, se não foi corrompido durante o processo de envio ou modificado durante o download, talvez por um erro ou até mesmo intencionalmente. A verificação da hash é uma técnica usada para garantir que o arquivo que foi baixado é exatamente igual ao original.

O desafio propõe o desenvolvimento de um sistema simplificado que realiza essa verificação. O processo será mediante o recebimento uma lista de hashes - códigos gerados a partir do conteúdo do arquivo, e precisará compará-los com os valores esperados para garantir a integridade dos arquivos.

> **Estratégias de Resolução**

Vamos realizar um comparativo das hashes com "impressões digitais" - identificadores únicos, dos arquivos. Logo, se dois arquivos são idênticos, suas impressões digitais também serão.

**Entendendo a entrada**
A entrada é uma lista de pares de hashes. Cada par contém o hash calculado (a impressão digital do arquivo que você baixou) e o hash esperado (a impressão digital do arquivo original). Os pares são separados por ponto e vírgula (;), e os hashes dentro de cada par são separados por vírgula (,).

Este desafio envolve o processamento de strings e a comparação de hashes para verificação de integridade.  A solução pode ser implementada em diversas linguagens de programação, utilizando diferentes abordagens.

1. Processando a entrada: Imagine que você tem uma lista de impressões digitais em papeizinhos. Você precisa pegar um papelzinho de cada vez, separar a impressão digital calculada da esperada e compará-las.

Parsing da entrada - A string de entrada contendo os pares de hashes deve ser analisada (parsed) para extrair os valores individuais.  Técnicas como split() (em Python) ou funções similares em outras linguagens podem ser utilizadas para dividir a string com base nos delimitadores (vírgula e ponto e vírgula).

2. Comparando os hashes:  Se as impressões digitais (hashes) calculada e esperada forem iguais, o arquivo está íntegro.  Caso contrário, o arquivo foi modificado ou corrompido.

Comparação de strings -  A comparação dos hashes deve ser feita de forma case-sensitive (ou seja, diferenciando maiúsculas de minúsculas), pois mesmo uma pequena diferença entre os hashes indica que os arquivos são diferentes.  Em algumas linguagens, pode ser necessário normalizar os hashes antes da comparação para garantir consistência.

3. Imprimindo o resultado: Para cada par de hashes comparado, o sistema deve imprimir "Correto" se os hashes forem iguais e "Inválido" se forem diferentes.

**PONTOS DE ATENÇÃO**

**Tratamento de erros** -  A solução deve ser robusta o suficiente para lidar com entradas inválidas, como formatos incorretos ou hashes ausentes. Implementar tratamento de exceções é um processo importante para evitar que o programa pare inesperadamente. Considerações sobre codificação de caracteres (UTF-8, por exemplo) também são importantes para garantir a correta interpretação dos hashes.

**Otimização** -  Para grandes volumes de dados, a eficiência da comparação de strings pode ser otimizada utilizando algoritmos de hash ou estruturas de dados apropriadas, como conjuntos (sets) ou dicionários (dictionaries/maps), dependendo da natureza da verificação.

**Case sensitivity** - A comparação de hashes deve ser sensível a maiúsculas e minúsculas.
Formato da entrada: Certificar-se de que o código consegue interpretar corretamente o formato da entrada, incluindo o tratamento de possíveis erros.
Eficiência:  Para grandes quantidades de dados, considerar a otimização do processo de comparação.

**Próximos Passos** -> Desafio I.2/2 

## I.2/2 Code Challenge - 

> Descrição: 
'''

'''

## II.1/2 Code Challenge - 

> Descrição: 
'''

'''

## II.2/2 Code Challenge -


