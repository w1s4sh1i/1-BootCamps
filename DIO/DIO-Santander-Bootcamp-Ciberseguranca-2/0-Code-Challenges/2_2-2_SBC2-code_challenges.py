# Challenger II.2 / 2 - Detecção de Tentativas de Invasão em Logs

# Função para detectar tentativas de invasão em registros de log
def detectar_invasao(registros):
    # Variáveis para rastrear o ID do usuário atual e suas falhas consecutivas
    usuario_atual = None
    tentativas_consecutivas = 0
    invasor_detectado = None

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
            
            if tentativas_consecutivas >= 3:
                invasor_detectado = usuario
            
            # TODO: Atualize para o novo usuário e reinicie a contagem de tentativas falhas:
            # Se a nova tentativa for "falha", inicie a contagem em 1; caso contrário, inicie em 0
            tentativas_consecutivas = 1 if status == "falha" else 0            
    
    # TODO: Após o loop, verifique se o último usuário teve mais de 3 tentativas de falha:
    if tentativas_consecutivas >= 3: 
        invasor_detectado = usuario
    
    # Retorna o resultado final
    return invasor_detectado if invasor_detectado else "Nenhum invasor detectado"

# Função principal para executar o programa
def main():
    # Solicita ao usuário que insira os registros de log
    entrada = input()
    
    registros = [registro.strip('"') for registro in entrada.split(",")]

    # TODO: Chama a função para detectar tentativas de invasão:
    resultado = detectar_invasao(registros)    

    # Imprime o resultado
    print(resultado)

# Chama a função principal para executar o programa
if __name__ == "__main__":
    main()
    
# Pontos de Melhorias

'''
A. Função para detectar tentativas de invasão em registros de log
B. Variáveis para rastrear o ID do usuário atual e suas falhas consecutivas
    TODO 
    [ X ] - Percorra cada registro de log:
	[ X ] - Separe o ID do usuário e o status do registro (sucesso ou falha):
	[ X ] - Verifique se o usuário atual é o mesmo da iteração anterior:
	[ X ] - Se o status é "falha", incremente o contador de tentativas falhas
    [ X ] - Se a tentativa foi bem-sucedida, resete o contador de falhas 
    [ X ] - Se mudar de usuário, verifique se o usuário anterior teve mais de 3 falhas consecutivas:
    [ X ] - Atualize para o novo usuário e reinicie a contagem de tentativas falhas:
    [ X ] - Se a nova tentativa for "falha", inicie a contagem em 1; caso contrário, inicie em 0
    [ X ] - Após o loop, verifique se o último usuário teve mais de 3 tentativas de falha:
    [ X ] - Chama a função para detectar tentativas de invasão:
    
C. Retorna o resultado final;
D. Função principal para executar o programa;       
E. Solicita ao usuário que insira os registros de log;
F. Imprime o resultado;
E. Chama a função principal para executar o programa;

'''

def detectar_invasao(registros):
    
    usuario_atual = None
    tentativas_consecutivas = 0
    invasor_detectado = None

    for registro in registros:
        
        usuario, status = registro.split(":")

        if usuario_atual != usuario:
            
            tentativas_consecutivas = (tentativas_consecutivas+1)*(status == "falha")
        
        else:
            usuario_atual = usuario
            
            if tentativas_consecutivas >= 3:
                invasor_detectado = usuario
            
            tentativas_consecutivas = status == "falha"            
    
    if tentativas_consecutivas >= 3: 
        invasor_detectado = usuario
    
    return invasor_detectado if invasor_detectado else "Nenhum invasor detectado"

def main():
    
    registros = [registro.strip('"') for registro in input().split(",")]

    resultado = detectar_invasao(registros)    

    print(resultado)

if __name__ == "__main__":
    main()


# Versão Otimizada

def detectar_invasao(registros):
    
    usuario_atual = None
    tentativas_consecutivas = 0
    invasor_detectado = None
    
    invasor_detectado = 'Nenhum invasor detectado'
    
    for registro in registros:

        usuario, status = registro.split(":")
        
        if usuario_atual != usuario:
            
            tentativas_consecutivas = (tentativas_consecutivas+1) * (status == "falha")
        
        else:
            usuario_atual = usuario
            
            tentativas_consecutivas = status == "falha"            
    
        if tentativas_consecutivas > 3: 
            invasor_detectado = usuario
    
    return invasor_detectado

def main():
    
    registros = [registro for registro in input().split(",")]

    print( detectar_invasao(registros) )

if __name__ == "__main__":
    main()    
    
