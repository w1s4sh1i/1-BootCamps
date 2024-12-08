# Code Challenges - Santander Bootcamp Cibersegurança #2

I. Explorando Fundamentos de Cibersegurança com Desafios de Código em Python [2]

II. [2]

## I.	1/2 Code Challenge - Verificação de Integridade de Arquivos com Hashes

###  Desafio da Verificação de Integridade de Arquivos

Ao valiar o contexto do desafio é possivel imaginar que um arquivo importante da internet foi baixado, para um um jogo ou um programa. Para validar a legibilidade do arquivo, se não foi corrompido durante o processo de envio ou modificado durante o download, talvez por um erro ou até mesmo intencionalmente. A verificação da hash é uma técnica usada para garantir que o arquivo que foi baixado é exatamente igual ao original.

O desafio propõe o desenvolvimento de um sistema simplificado que realiza essa verificação. O processo será mediante o recebimento uma lista de hashes - códigos gerados a partir do conteúdo do arquivo, e precisará compará-los com os valores esperados para garantir a integridade dos arquivos.

> **Estratégias de Resolução**

Vamos realizar um comparativo das hashes com "impressões digitais" - identificadores únicos, dos arquivos. Logo, se dois arquivos são idênticos, suas impressões digitais também serão.

**Entendendo a entrada** - A entrada é uma lista de pares de hashes. Cada par contém o hash calculado (a impressão digital do arquivo que você baixou) e o hash esperado (a impressão digital do arquivo original). Os pares são separados por ponto e vírgula (;), e os hashes dentro de cada par são separados por vírgula (,).

Este desafio envolve o processamento de strings e a comparação de hashes para verificação de integridade.  A solução pode ser implementada em diversas linguagens de programação, utilizando diferentes abordagens.

1. **Processando a entrada**: Imagine que você tem uma lista de impressões digitais em papeizinhos. Você precisa pegar um papelzinho de cada vez, separar a impressão digital calculada da esperada e compará-las.

**Parsing da entrada** - A string de entrada contendo os pares de hashes deve ser analisada (parsed) para extrair os valores individuais.  Técnicas como split() (em Python) ou funções similares em outras linguagens podem ser utilizadas para dividir a string com base nos delimitadores (vírgula e ponto e vírgula).

2. **Comparando os hashes**:  Se as impressões digitais (hashes) calculada e esperada forem iguais, o arquivo está íntegro.  Caso contrário, o arquivo foi modificado ou corrompido.

**Comparação de strings** -  A comparação dos hashes deve ser feita de forma case-sensitive (ou seja, diferenciando maiúsculas de minúsculas), pois mesmo uma pequena diferença entre os hashes indica que os arquivos são diferentes.  Em algumas linguagens, pode ser necessário normalizar os hashes antes da comparação para garantir consistência.

3. **Imprimindo o resultado**: Para cada par de hashes comparado, o sistema deve imprimir "Correto" se os hashes forem iguais e "Inválido" se forem diferentes.

> **PONTOS DE ATENÇÃO**

**Tratamento de erros** -  A solução deve ser robusta o suficiente para lidar com entradas inválidas, como formatos incorretos ou hashes ausentes. Implementar tratamento de exceções é um processo importante para evitar que o programa pare inesperadamente. Considerações sobre codificação de caracteres (UTF-8, por exemplo) também são importantes para garantir a correta interpretação dos hashes.

**Otimização** -  Para grandes volumes de dados, a eficiência da comparação de strings pode ser otimizada utilizando algoritmos de hash ou estruturas de dados apropriadas, como conjuntos (sets) ou dicionários (dictionaries/maps), dependendo da natureza da verificação.

**Case sensitivity** - A comparação de hashes deve ser sensível a maiúsculas e minúsculas.
Formato da entrada: Certificar-se de que o código consegue interpretar corretamente o formato da entrada, incluindo o tratamento de possíveis erros.
Eficiência:  Para grandes quantidades de dados, considerar a otimização do processo de comparação.

```py
# ...
# TODO: Verifique se o hash calculado é igual ao hash esperado:
        if hash_calculado.strip() == hash_esperado.strip():
            comparacao = 'Correto'
        else:
            comparacao = 'Inválido'
        print(comparacao)
# ...
```

## I	2/2 Code Challenge - Simulação de Enumeração de Serviços em um Servidor

Vamos imaginar que um servidor é um prédio com várias portas. Cada porta oferece um serviço diferente, como HTTP para acessar páginas web, FTP para transferir arquivos ou SSH para acesso remoto. Este desafio simula a identificação do serviço oferecido por cada porta em um servidor. Ao receber uma lista de números de portas se faz necessário retornar o serviço correspondente a cada uma delas.

**Estratégias de Resolução**

Este desafio envolve o mapeamento de portas para serviços, utilizando um dicionário (ou estrutura de dados similar) para armazenar as associações.

**Criando um dicionário de serviços** - Imagine uma tabela com duas colunas: a primeira com o número da porta e a segunda com o serviço correspondente.  Essa tabela é o nosso dicionário de serviços.

	**Estrutura de dados** - Um dicionário é a estrutura ideal para armazenar o mapeamento porta-serviço, permitindo buscas eficientes.  A chave do dicionário é o número da porta (como inteiro) e o valor é o nome do serviço (como string).

**Recebendo a lista de portas** - Imagine que você recebe uma lista de números de portas escritas em um papel.

	**Processamento da entrada** - A string de entrada contendo as portas deve ser processada para extrair os números das portas.  A função split(',') pode ser usada para dividir a string em uma lista de strings, e em seguida, cada string deve ser convertida para um número inteiro.

**Consultando o dicionário** - Para cada porta na lista, você procura o número da porta na sua tabela (dicionário). Se encontrar, você anota o serviço correspondente.

	**Busca no dicionário** -  Para cada porta, utilize o operador in ou o método get() do dicionário para verificar se a porta existe no mapeamento.  O método get() permite definir um valor padrão (como "Desconhecido") caso a chave não seja encontrada.

**Lidando com portas desconhecidas**: Se uma porta não estiver na sua tabela, significa que o serviço é desconhecido. Nesse caso, você anota "Desconhecido".

	**Tratamento de erros** - Implemente tratamento de exceções para lidar com entradas inválidas, como números de porta não numéricos.

**Retornando a lista de serviços** -  No final, você terá uma nova lista com os serviços correspondentes às portas fornecidas, incluindo "Desconhecido" para as portas que não estavam na tabela.

Considerações de performance - Para um grande número de portas, a busca no dicionário é eficiente.  No entanto, se o mapeamento porta-serviço for extremamente grande, outras estruturas de dados, como árvores de busca, podem ser consideradas para otimizar ainda mais o desempenho.

> PONTOS DE ATENÇÃO

**Tipo de dados das portas** - As portas devem ser tratadas como números inteiros para garantir a correta comparação no dicionário.

**Tratamento de entradas inválidas** - O código deve ser robusto o suficiente para lidar com entradas que não seguem o formato esperado.

**Case sensitivity** - Dependendo dos requisitos, a comparação dos nomes dos serviços pode ser sensível a maiúsculas e minúsculas.

```py
...
# TODO: Itere sobre cada porta fornecida na lista de portas
    for code in ports:
        # TODO: Verifique se a porta existe no dicionário de serviços
        if code in port_services:
            # TODO: Se existir, adicione o serviço correspondente à lista de serviços
            services.append(port_services[code])
        # TODO: Se a porta não estiver mapeada, adicione "Desconhecido"
        else:    
            services.append('Desconhecido')
...
# TODO: Converta a string de entrada para uma lista de inteiros (números de portas)
    # Utilize a função strip() para remove espaços em branco, e o split() para separar por vírgula
    lista_inteiros = list(map(int, ports_input.split(',')))
    
    # TODO: Chame a função de enumeração para obter a lista de serviços correspondentes:
    services = enumerate_services(lista_inteiros)
...
```

## II	1/2 Code Challenge - 

> Descrição: 


```py
#
```

## II	2/2 Code Challenge -

> Descrição: 

```py
#
```
