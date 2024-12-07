# Challenger I.1 / 2 - Verificação de Integridade de Arquivos com Hashes
 
# Solução Padrão

def verificar_hashes(lista_hashes):
  
    for hash_comparacao in lista_hashes:
        
        hash_calculado, hash_esperado = hash_comparacao.split(",")
        
        # TODO: Verifique se o hash calculado é igual ao hash esperado:
        if hash_calculado.strip() == hash_esperado.strip():
            comparacao = 'Correto'
        else:
            comparacao = 'Inválido'
        
        print(comparacao)
            
hashes_usuario = input()

lista_hashes = hashes_usuario.split(";")
    
verificar_hashes(lista_hashes)

# Pontos de Melhorias

def verificar_hashes(lista_hashes):
  
    for hash_comparacao in lista_hashes:
        
        hash_calculado, hash_esperado = hash_comparacao.split(",")
        
        # TODO: Verifique se o hash calculado é igual ao hash esperado:
        print('Correto' if hash_calculado == hash_esperado else 'Inválido')
            
        
hashes_usuario = input().replace(" ", "") # Remover os espaços em branco
    
verificar_hashes( hashes_usuario.split(";") )


# Versão otimizada

'''
 TODO
 [1] - Verifique se o hash calculado é igual ao hash esperado;
 	[A] - Utilização de um ternário e concaternação das análises
 [2] - Capturar dados;
 [3] - Remover os espaços em branco;
 [4] - Separar usuários .split(";") e definir lista;
 [5] - Impressão única das respostas
'''

def verificar_hashes(lista_hashes):
    
    avaliacao = ''
    
    for hash_comparacao in lista_hashes:
        
        comparativo = hash_comparacao.split(",")[0] == hash_comparacao.split(",")[1]
        
        # [1][A]
        avaliacao += ('Correto' if comparativo else 'Inválido') + '\n' 
    
    return avaliacao
    
checagem = verificar_hashes( input().replace(" ", "").split(";") ) # [2][3][4]

print(checagem) # [5]
