
Exerc�cio -  F�brica Abstrata  - Modelo de classe tema interface. 


Ao executar a classe TelaInicial aparecer� um tema a ser escolhido. Como na imagem abaixo.

![alt text](https://github.com/felipefo/poo2/blob/master/Padroes_de_Projeto/Cria��o/fabrica_abstrata/FabricaAbstrataTemaInterface/tela_inicial.png)

Ao selecionar o tema o usu�rio pode acessar o menu "Edi��o" abrir� a tela abaixo:

![alt text](https://github.com/felipefo/poo2/blob/master/Padroes_de_Projeto/Cria��o/fabrica_abstrata/FabricaAbstrataTemaInterface/tela_edicao.png)


Altera a classe EditorTexto para que sejam utilizadas as classes BotaoOK e BotaoCancel.
Esses bot�es s�o diferenciados por possuir um �cone. Como destacado na imagem abaixo:


![alt text](https://github.com/felipefo/poo2/blob/master/Padroes_de_Projeto/Cria��o/fabrica_abstrata/FabricaAbstrataTemaInterface/tela_tema2.png)


Dessa forma, o usu�rio pode configurar sua tela para utilizar com ou sem �cones.
Al�m das classes BotaoOK e BotaoCancel utilize tamb�m a classe FabricaAbstrataBotoes como base para criar suas F�bricas concretas.
Crie classe FabricaPadr�o utilizando a classe JButton e para os bot�es com �cones crie a classe FabricaBotoesIcones utilizando BotaoOK e BotaoCancel.
Fa�a tamb�m o diagrama de classe da sua solu��o.