print "Introduzca un numero para calcular su conjetura de Collatz: "
numero = int(raw_input())
print "resultado"
if numero > 0:
while numero !=1:
    
         if numero%2 == 0:
            numero=numero/2
        
         else:
            numero=numero*3+1
            
         print numero
 else: 
    print "un numero positivo"
