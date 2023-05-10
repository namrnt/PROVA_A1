def divisao(dividendo, divisor):
    contador = 0
    resultado = 0
    while ( contador <= dividendo):
        contador = contador + divisor
        if (contador <= dividendo):
            resultado = resultado + 1
    print('O resultado de ', dividendo, ' / ', divisor, ' é ', resultado)
    print('O resto de ', dividendo, ' / ', divisor, ' é ', (dividendo - contador) + divisor)

num1 = int(input("Digite um número qualquer: "))
num2 = int(input("Digite um outro número qualquer: "))

divisao(num1, num2)

