# Code Challenges - Santander Bootcamp Cibersegurança #2

I. Explorando Fundamentos de Cibersegurança com Desafios de Código em Python [2]

II. Busca por Vulnerabilidades com Desafios de Código em Python [2]

## I	Verificação de Integridade de Arquivos com Hashes [1/2]

Ao valiar o contexto do desafio é possivel imaginar que um arquivo importante da internet foi baixado, para um um jogo ou um programa. Para validar a legibilidade do arquivo, se não foi corrompido durante o processo de envio ou modificado durante o download, talvez por um erro ou até mesmo intencionalmente. A verificação da hash é uma técnica usada para garantir que o arquivo que foi baixado é exatamente igual ao original.

O desafio propõe o desenvolvimento de um sistema simplificado que realiza essa verificação. O processo será mediante o recebimento uma lista de hashes - códigos gerados a partir do conteúdo do arquivo, e precisará compará-los com os valores esperados para garantir a integridade dos arquivos.

> **Estratégias de Resolução**

Vamos realizar um comparativo das hashes com "impressões digitais" - identificadores únicos, dos arquivos. Logo, se dois arquivos são idênticos, suas impressões digitais também serão.

**Entendendo a entrada** - A entrada é uma lista de pares de hashes. Cada par contém o hash calculado (a impressão digital do arquivo que você baixou) e o hash esperado (a impressão digital do arquivo original). Os pares são separados por ponto e vírgula (;), e os hashes dentro de cada par são separados por vírgula (,).

Este desafio envolve o processamento de strings e a comparação de hashes para verificação de integridade.  A solução pode ser implementada em diversas linguagens de programação, utilizando diferentes abordagens.

1. **Processando a entrada** - Imagine que você tem uma lista de impressões digitais em papeizinhos. Você precisa pegar um papelzinho de cada vez, separar a impressão digital calculada da esperada e compará-las.

**Parsing da entrada** - A string de entrada contendo os pares de hashes deve ser analisada (parsed) para extrair os valores individuais.  Técnicas como split() (em Python) ou funções similares em outras linguagens podem ser utilizadas para dividir a string com base nos delimitadores (vírgula e ponto-e-vírgula).

2. **Comparando os hashes** - Se as impressões digitais (hashes) calculada e esperada forem iguais, o arquivo está íntegro.  Caso contrário, o arquivo foi modificado ou corrompido.

**Comparação de strings** -  A comparação dos hashes deve ser feita de forma case-sensitive (ou seja, diferenciando maiúsculas de minúsculas), pois mesmo uma pequena diferença entre os hashes indica que os arquivos são diferentes.  Em algumas linguagens, pode ser necessário normalizar os hashes antes da comparação para garantir consistência.

3. **Imprimindo o resultado** - Para cada par de hashes comparado, o sistema deve imprimir "Correto" se os hashes forem iguais e "Inválido" se forem diferentes.

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

## I	Simulação de Enumeração de Serviços em um Servidor [2/2]

Vamos imaginar que um servidor é um prédio com várias portas. Cada porta oferece um serviço diferente, como HTTP para acessar páginas web, FTP para transferir arquivos ou SSH para acesso remoto. Este desafio simula a identificação do serviço oferecido por cada porta em um servidor. Ao receber uma lista de números de portas se faz necessário retornar o serviço correspondente a cada uma delas.

> **Estratégias de Resolução**

Este desafio envolve o mapeamento de portas para serviços, utilizando um dicionário (ou estrutura de dados similar) para armazenar as associações.

1. **Criando um dicionário de serviços** - Imagine uma tabela com duas colunas: a primeira com o número da porta e a segunda com o serviço correspondente.  Essa tabela é o nosso dicionário de serviços.

**Estrutura de dados** - Um dicionário é a estrutura ideal para armazenar o mapeamento porta-serviço, permitindo buscas eficientes.  A chave do dicionário é o número da porta (como inteiro) e o valor é o nome do serviço (como string).

2. **Recebendo a lista de portas** - Imagine que você recebe uma lista de números de portas escritas em um papel.

**Processamento da entrada** - A string de entrada contendo as portas deve ser processada para extrair os números das portas.  A função split(',') pode ser usada para dividir a string em uma lista de strings, e em seguida, cada string deve ser convertida para um número inteiro.

3. **Consultando o dicionário** - Para cada porta na lista, você procura o número da porta na sua tabela (dicionário). Se encontrar, você anota o serviço correspondente.

**Busca no dicionário** -  Para cada porta, utilize o operador in ou o método get() do dicionário para verificar se a porta existe no mapeamento.  O método get() permite definir um valor padrão (como "Desconhecido") caso a chave não seja encontrada.

4. **Lidando com portas desconhecidas**: Se uma porta não estiver na sua tabela, significa que o serviço é desconhecido. Nesse caso, você anota "Desconhecido".

**Tratamento de erros** - Implemente tratamento de exceções para lidar com entradas inválidas, como números de porta não numéricos.

5. **Retornando a lista de serviços** -  No final, você terá uma nova lista com os serviços correspondentes às portas fornecidas, incluindo "Desconhecido" para as portas que não estavam na tabela.

**Considerações de performance** - Para um grande número de portas, a busca no dicionário é eficiente.  No entanto, se o mapeamento porta-serviço for extremamente grande, outras estruturas de dados, como árvores de busca, podem ser consideradas para otimizar ainda mais o desempenho.

> **PONTOS DE ATENÇÃO**

1. **Tipo de dados das portas** - As portas devem ser tratadas como números inteiros para garantir a correta comparação no dicionário.

2. **Tratamento de entradas inválidas** - O código deve ser robusto o suficiente para lidar com entradas que não seguem o formato esperado.

3. **Case sensitivity** - Dependendo dos requisitos, a comparação dos nomes dos serviços pode ser sensível a maiúsculas e minúsculas.

```py
# ...
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
# ...
```

## II	Detecção de Phishing por Padrões de E-mail [1/2]

Nesse desafio podemos analisar a situação de inúmeros e-mails todos os dias. Alguns são legítimos, como mensagens de amigos ou familiares, enquanto outros podem ser tentativas de __phishing__, que são mensagens fraudulentas que tentam roubar suas informações pessoais. O desafio propõe a criação de um sistema que analisa o conteúdo de um e-mail e identifica se a mensagem é suspeito de ser maliciosa.

> **Estratégias de Resolução**

Este desafio envolve a análise de texto e a busca por padrões para identificar potenciais e-mails de phishing.

1. **Lista de palavras suspeitas** - Com base em uma lista de palavras que costumam aparecer em e-mails de maliciosos/phishing, como "ganhe", "prêmio", "urgente", "desconto", "click" e "promoção" (referências fornecidas no contexto do desafio).

2. **Recebendo o e-mail** - Ao recebe o texto do e-mail enviar para análise.

**Pré-processamento do texto** - Converter o texto do e-mail para letras minúsculas (ou maiúsculas) para garantir que a comparação de palavras seja case-insensitive. Remover pontuação e caracteres especiais que possam interferir na análise.

3. **Procurando palavras suspeitas** - Analisar o texto do e-mail com atenção. Para cada palavra na sua lista de palavras suspeitas, verifique se ela aparece no e-mail.

**Tokenização** - Dividir o texto do e-mail em palavras individuais (tokens).  Isso pode ser feito usando a função split() ou bibliotecas de processamento de linguagem natural (NLP).

4. **Classificando o e-mail** - Encontrar alguma palavra suspeita no e-mail, marque-o como "Phishing". Caso contrário, marque-o como "Seguro".

**Busca por palavras-chave** - Criar uma lista (ou conjunto, para maior eficiência) de palavras-chave associadas a phishing.  Iterar pelos tokens do e-mail e verificar se algum deles está presente na lista de palavras-chave.  Utilizar expressões regulares pode ser útil para buscar padrões mais complexos.

> **PONTOS DE ATENÇÃO**

**Análise de Falsos**

A. Positivos - É possível que um e-mail legítimo contenha alguma palavra suspeita, sendo classificado incorretamente como phishing.

B. Negativos - E-mails de phishing sofisticados podem evitar o uso de palavras-chave óbvias, tornando a detecção mais difícil.

**Manutenção da lista de palavras-chave** -  A lista de palavras-chave precisa ser atualizada regularmente para acompanhar as novas técnicas de phishing.

```py
# ...
	analise = 'Seguro'
    for palavra in mensagem:
        palavra = ''.join(letra for letra in palavra if letra.isalnum()) # remover caracteres especiais
        if palavra.lower() in palavras_suspeitas: # letras minúsculas
            analise = 'Phishing'
            break
    return analise
#...
        
```

## II	Detecção de Tentativas de Invasão em Logs [2/2]

Vamos analisar um sistema para suporte a um guarda de segurança monitorando as entradas de um prédio.  Existem registros de quem entra e sai, é necessário ficar atento a qualquer atividade suspeita, como alguém tentando entrar várias vezes sem sucesso. Este desafio simula esse cenário, onde você precisa analisar registros de log de tentativas de acesso para detectar possíveis invasores.

> **Estratégias de Resolução**

Este desafio envolve o processamento de logs e a contagem de eventos consecutivos para detectar anomalias.

1. **Lendo os registros** - Imagine que você tem uma lista de entradas no seu caderno, cada uma com o nome da pessoa e se ela conseguiu entrar ou não.

**Parsing dos logs** - Os registros de log devem ser processados para extrair o ID do usuário e o status da tentativa de acesso.  A função split(':') pode ser usada para separar as informações em cada registro.

2. **Contando as falhas** - Para cada pessoa na lista, você conta quantas vezes seguidas ela tentou entrar e falhou.  Se ela conseguir entrar, você zera a contagem de falhas para ela.

**Armazenamento das contagens de falhas** - Um dicionário é uma estrutura de dados eficiente para armazenar a contagem de falhas consecutivas para cada usuário. A chave do dicionário é o ID do usuário e o valor é a contagem atual de falhas.

3. **Disparando o alerta** - Se a contagem de falhas para uma pessoa chegar a mais de 3, você dispara um alerta com o nome dela.

**Lógica de contagem** - Iterar pelos registros de log. Para cada registro:

I. Se o status for "falha", incrementar a contagem de falhas para o usuário correspondente no dicionário.
II. Se o status for "sucesso", zerar a contagem de falhas para o usuário.
III. Se a contagem de falhas para um usuário ultrapassar 3, retornar o ID do usuário como um possível invasor.

4. **Nenhum invasor** - Se você chegar ao final da lista e ninguém tiver mais de 3 falhas seguidas, você anota "Nenhum invasor detectado".

**Retorno do resultado** - Após processar todos os registros, se nenhum usuário tiver atingido mais de 3 falhas consecutivas, retornar "Nenhum invasor detectado".

> **PONTOS DE ATENÇÃO**

A. **Contagem consecutiva** - O sistema deve contar apenas falhas consecutivas.  Uma tentativa bem-sucedida deve zerar a contagem de falhas para o usuário.

B. **Tratamento de erros** - O código deve ser robusto para lidar com registros de log mal formatados ou com informações faltantes.

C. **Performance** - Para grandes volumes de logs, a eficiência do processamento é uma atividade fundamental para viabilizar a aplicação. Em futuras melhorias no código podemos considerar o uso de estruturas de dados otimizadas e algoritmos eficientes.

```py
# ...
# TODO: Percorra cada registro de log:
    for registro in registros:
        
        # TODO: Separe o ID do usuário e o status do registro (sucesso ou falha):
        usuario, status = registro.split(":")
        
        # TODO: Verifique se o usuário atual é o mesmo da iteração anterior:
        if usuario_atual != usuario:
            
            # Se o status é "falha", incremente o contador de tentativas falhas
            # Se a tentativa foi bem-sucedida, resete o contador de falhas 
            tentativas_consecutivas = (tentativas_consecutivas+1) if status == "falha" else 0
        
        # TODO: Se mudar de usuário, verifique se o usuário anterior teve mais de 3 falhas consecutivas:
        else:
            usuario_atual = usuario
            
            # TODO: Atualize para o novo usuário e reinicie a contagem de tentativas falhas:
            # Se a nova tentativa for "falha", inicie a contagem em 1; caso contrário, inicie em 0
            tentativas_consecutivas = 1 if status == "falha" else 0            
    
		# TODO: Após o loop, verifique se o último usuário teve mais de 3 tentativas de falha:
		if tentativas_consecutivas >= 3: 
		    invasor_detectado = usuario
    
    # Retorna o resultado final
    return invasor_detectado if invasor_detectado else "Nenhum invasor detectado"
# ...
# TODO: Chama a função para detectar tentativas de invasão:
    resultado = detectar_invasao(registros)    
# ...
```
