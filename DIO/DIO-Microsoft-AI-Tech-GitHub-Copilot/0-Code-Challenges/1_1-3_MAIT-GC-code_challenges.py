# Challenger I. 1/3 - Debugando um Conversor de Data Simples

# Solução Padrão

data_input = input() 

def converter_para_dia_mes_ano(data_str):
    ano, mes, dia = data_str.split("-") # 
    return f"{dia}/{mes}/{ano}"  

if "-" in data_input: #
    print(converter_para_dia_mes_ano(data_input))
else:
    print("Formato de data inválido")


# Versão otimizada

'''
 TODO
	[ x ] - Modificar a sequência de recepção dos valores;
	[ x ] - Adicionar ":" para estruturar o "if";
	[ x ] - Estrutura do código para um Padrão de Produção - PEP;
'''
