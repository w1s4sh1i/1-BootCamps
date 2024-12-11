# Challenger II.1 / 2 - Detecção de Phishing por Padrões de E-mail

# Solução Padrão

def verificar_phishing(mensagem):
    # Lista de palavras que indicam possíveis e-mails de phishing
    palavras_suspeitas = ["ganhe", "prêmio", "urgente", "desconto", "click",  "promoção"]
    
    # TODO: Verifique se alguma palavra suspeita está presente no corpo do e-mail:
    analise = 'Seguro'
    for palavra in mensagem:
        palavra = ''.join(letra for letra in palavra if letra.isalnum()) # remover caracteres especiais
        if palavra.lower() in palavras_suspeitas: # letras minúsculas
            analise = 'Phishing'
            break
    return analise
        
email_usuario = input()

email_usuario = email_usuario.split() # Definir uma lista de palavras

resultado = verificar_phishing(email_usuario)

print(f"Classificação: {resultado}")


# Pontos de Melhorias

'''
1. Função para verificar se o corpo do e-mail contém palavras suspeitas de phishing
2. Lista de palavras que indicam possíveis e-mails de phishing
[ X ] - TODO: Verifique se alguma palavra suspeita está presente no corpo do e-mail:
'''
 
def verificar_phishing(mensagem):

    palavras_suspeitas = ["ganhe", "prêmio", "urgente", "desconto", "click",  "promoção"]
    palavras_confirmacao = ['Seguro','Phishing']
   
    for palavra in mensagem:
       
        palavra = ''.join(letra for letra in palavra if letra.isalnum()).lower() # remover caracteres especiais
       
        if palavra in palavras_suspeitas: # letras minúsculas
            
            analise = palavras_confirmacao[1]
            
            break
        
        else: analise = palavras_confirmacao[0] 
    
    return analise
        
email_usuario = input().split() # Definir uma lista de palavras

print('Classificação:', verificar_phishing(email_usuario) )


# Versão Otimizada

def verificar_phishing(mensagem):

    palavras_suspeitas = ["ganhe", "prêmio", "urgente", "desconto", "click",  "promoção"]
    palavras_confirmacao = ['Seguro','Phishing']
     
    for palavra in mensagem:
       
        palavra = ''.join(letra for letra in palavra if letra.isalnum()).lower() # remover caracteres especiais
       
        confirmar = palavra in palavras_suspeitas
        
        if confirmar: break
        
    return palavras_confirmacao[confirmar]

print('Classificação:', verificar_phishing(input().split()) )

