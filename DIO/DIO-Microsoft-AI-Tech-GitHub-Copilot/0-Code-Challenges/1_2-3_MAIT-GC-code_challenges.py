# Challenger I. 2/3 - Debugando um Verificador de Anagrama

# Solução Padrão

def verificar_anagrama(palavra1, palavra2):
    palavra1 = palavra1.replace(" ", "").lower()
    palavra2 = palavra2.replace(" ", "").lower()

    return sorted(palavra1) == sorted(palavra2) #

def main():
    entrada = input().strip()

    palavras = entrada.split()
    
    palavra_a, palavra_b = palavras[0], palavras[1]

    if verificar_anagrama(palavra_a, palavra_b):
        print("Verdadeiro") #
    else:
        print("Falso") #

if __name__ == "__main__":
    main()

# Versão otimizada

'''
 TODO
	[ x ] - Adicionar o `.sorted()` na palavra2;
	[ x ] - Adicionar os parêntes;
	[ x ] - Adicionar os parêntes;
'''


