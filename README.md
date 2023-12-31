Projeto em Java Programação Orientada a Objetos

    Conceitos aplicados:
    
       - Diagrama de Classe
       - Algorítmo
       - Pilar Encapsulamento
       - Herança
       - Polimorfismo de Sobreposição

    Polimorfismo
    ------------
    Poli = muitas
    Morfo = formas
      
Diagrama de Classe

    |-----------------------------|
    |     [abs] Animal            |
    |-----------------------------|
    | - peso                      |
    | - idade                     |
    | - membros                   |
    |-----------------------------|
    | +  [abs] locomover()        |
    | +  [abs] alimentar()        |
    | +  [abs] emitirSom()        |
    |                             |
    | + getLocomover()            |
    | + setLocomover()            |
    | + getAlimentar()            |
    | + setAlimentar()            |
    | + getEmitirSom()            |
    | + setEmitirSom()            |
    |-----------------------------|

Algorítmo

    classe abstrata Animal
        protegido peso: Real
        protegido idade: Inteiro
        protegido membros: Inteiro
        publico metodo abstrato locomover()
        publico metodo abstrato alimentar()
        publico metodo abstrato emitirSom()
    FimClasse
    
    classe Mamifero estende Animal
        privado corPelo: Caractere
        @Sobrepor
        publico metodo locomover()
            Escreva("Correndo")
        fimMetodo
    
        @Sobrepor
        publico metodo alimentar()
            Escreva("Mamando")
        fimMetodo
        
        @Sobrepor
        publico metodo emitirSom()
            Escreva("som de Mamífero")
        fimMetodo
    FimClasse
    
    
    classe Reptil estende Animal
    privado corEscama: Caractere
        @Sobrepor
        publico metodo locomover()
            Escreva("Rastejando")
        fimMetodo
    
        @Sobrepor
        publico metodo alimentar()
            Escreva("Comendo Vegetais")
        fimMetodo
        
        @Sobrepor
        publico metodo emitirSom()
            Escreva("som de Réptil")
        fimMetodo
    FimClasse
    
    
    classe Peixe estende Animal
    privado corEscama: Caractere
        @Sobrepor
        publico metodo locomover()
            Escreva("Nadando")
        fimMetodo
    
        @Sobrepor
        publico metodo alimentar()
            Escreva("Comendo substâncias")
        fimMetodo
        
        @Sobrepor
        publico metodo emitirSom()
            Escreva("Peixe não faz som")
        fimMetodo
        
        publico metodo soltarBolha()
            Escreva("Soltou uma bolha")
        fimMetodo
    FimClasse
    
    
    classe Ave estende Animal
    privado corPena: Caractere
        @Sobrepor
        publico metodo locomover()
            Escreva("Voando")
        fimMetodo
    
        @Sobrepor
        publico metodo alimentar()
            Escreva("Comendo frutas")
        fimMetodo
        
        @Sobrepor
        publico metodo emitirSom()
            Escreva("som de Ave")
        fimMetodo
        
        publico metodo fazerNinho()
            Escreva("Construiu um ninho")
        fimMetodo
    FimClasse
