# dojo169_Escrevendo_no_Celular

## Identificação
  **Objetivo**: teste unitário em Java com JUnit
 
  **Problema**: http://dojopuzzles.com/problemas/exibe/escrevendo-no-celular/
  
## Membros
  Thomas Nogueira
  
  Yuri Jordan
  
## Plano de Teste

| **Entrada** | **Condição** | **Entradas válidas** | **Entradas inválidas** | 
|-------------|--------------|----------------------|------------------------|
|mensagem|mensagem é do tipo String|"As arveres some nozes"|123456|
|||" "|@!#|
|||"AS ARVERES SOME NOZES"|\n \t|

```java
public String digitar(String mensagem){
  return sequênciaNumérica;
}
```

### 1° caso de teste

## Como executar os testes 

1.Crie um novo projeto

2.Adicione uma biblioteca JUnit V4.x, ao classpath dele

3.Para poder testar é preciso fazer a classe de teste compilar. Então crie a classe "TradutorAlfaNumerico" e implemente os casos de teste, o mais simples possível, até que passem.

4.Como forma de ajuda, já existe uma implementação para os testes, porém melhore-a, refatorando etc...
