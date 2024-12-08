# Challenger I.2 / 2 - Simulação de Enumeração de Serviços em um Servidor

# Solução Padrão

# Dicionário que mapeia números de portas aos serviços correspondentes
port_services = {
    21: "FTP",      # Serviço de transferência de arquivos
    22: "SSH",      # Secure Shell (acesso remoto seguro)
    23: "Telnet",   # Protocolo de acesso remoto inseguro
    25: "SMTP",     # Serviço de envio de emails
    53: "DNS",      # Serviço de tradução de nomes de domínio
    80: "HTTP",     # Protocolo de transferência de hipertexto (web)
    110: "POP3",    # Serviço de recebimento de emails
    143: "IMAP",    # Serviço de recebimento de emails com suporte a pastas
    443: "HTTPS",   # Protocolo seguro de transferência de hipertexto
    3306: "MySQL",  # Banco de dados MySQL
    3389: "RDP",    # Remote Desktop Protocol (Acesso remoto ao Windows)
    5432: "PostgreSQL", # Banco de dados PostgreSQL
    6379: "Redis"   # Banco de dados Redis
}

# Função que realiza a enumeração de serviços
def enumerate_services(ports):
    # Inicializamos uma lista para armazenar os serviços correspondentes
    services = []
    
    # TODO: Itere sobre cada porta fornecida na lista de portas
    for code in ports:
        # TODO: Verifique se a porta existe no dicionário de serviços
        if code in port_services:
            # TODO: Se existir, adicione o serviço correspondente à lista de serviços
            services.append(port_services[code])
        # TODO: Se a porta não estiver mapeada, adicione "Desconhecido"
        else:    
            services.append('Desconhecido')
    
    return services

# Função principal que lida com a entrada do usuário e exibe o resultado:
def main():
    ports_input = input()
    
    # TODO: Converta a string de entrada para uma lista de inteiros (números de portas)
    # Utilize a função strip() para remove espaços em branco, e o split() para separar por vírgula
    lista_inteiros = list(map(int, ports_input.split(',')))
    
    # TODO: Chame a função de enumeração para obter a lista de serviços correspondentes:
    services = enumerate_services(lista_inteiros)
    
    print(services)
    
if __name__ == "__main__":
    main()
    
# Pontos de Melhorias

# Utilizar o mesmo dicionário port_services

# Função que realiza a enumeração de serviços
def enumerate_services(ports):
    # Inicializamos uma lista para armazenar os serviços correspondentes
    services = []
    
    # TODO: Itere sobre cada porta fornecida na lista de portas
    for code in ports:
        '''TODO
        Verifique se a porta existe no dicionário de serviços:
        > Se existir, adicione o serviço correspondente à lista de serviços
        > Se a porta não estiver mapeada, adicione "Desconhecido"
        '''
        services.append(port_services[code] if code in port_services else 'Desconhecido')
        
    
    return services

# Função principal que lida com a entrada do usuário e exibe o resultado:
def main():
    ports_input = input()
    
    ''' TODO
    > Converta a string de entrada para uma lista de inteiros (números de portas)
    > Utilize a função strip() para remove espaços em branco, e o split() para separar por vírgula
    '''
    lista_inteiros = list(map(int, ports_input.split(',')))
    
    # TODO: Chame a função de enumeração para obter a lista de serviços correspondentes:
    print( enumerate_services(lista_inteiros) )
    
if __name__ == "__main__":
    main()

# Versão Otimizada

# Utilizar o mesmo dicionário port_services

'''TODO
    [ x ] - Itere sobre cada porta fornecida na lista de portas
    [ x ] - Verifique se a porta existe no dicionário de serviços:
    > Se existir, adicione o serviço correspondente à lista de serviços
    > Se a porta não estiver mapeada, adicione "Desconhecido"
    [ x ] - Converta a string de entrada para uma lista de inteiros (números de portas)
    [ x ] - Utilize a função strip() para remove espaços em branco, e o split() para separar por vírgula
'''
# Função que realiza a enumeração de serviços
def enumerate_services(ports):
    # Inicializamos uma lista para armazenar os serviços correspondentes
    services = []
    
    for code in ports:
        services.append(port_services[code] if code in port_services else 'Desconhecido')
        
    return services

# Função principal que lida com a entrada do usuário e exibe o resultado:
def main():
    
    lista_inteiros = list(map(int, input().split(',')))
    
    # TODO: Chame a função de enumeração para obter a lista de serviços correspondentes:
    print( enumerate_services(lista_inteiros) )
    
if __name__ == "__main__":
    main()

 
