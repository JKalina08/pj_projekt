## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

- - -  
# Zadání
## 	U1:
Bod ve 2D prostoru je dán souřadnicemi x a y. Je umožńěno měnit polohu bodu, resp. přenastavovat polohu bodu. 
Definujte třídu Bod2D na objektových principech a dle uvedeného popisu. Objekt třídy poskytujte stav objektu ve formátu '[x;y]', souřadnice bodu jsou reálným číslem. 
Jak se změní jednouše uvedená definice třídy (úpravou z Bod2D), aby se zabránilo dodatečné změně polohy bodu? Dokladujte jako třídu Bod2Db.
	
Barva v barevném modelu RGB je dána hodnotami složky červené (r), zelené (g) a modré (b). Intenzita barvy je dány průměrem těchto složek. Hodnota barvy je v rozsahu <0; 255>, použijme datový typ unsigned byte :);.
Definujte třídu BarvaRGB na objektových principech dle uvedeného popisu. Hodnotu barvy lze měnit. Objekt třídy poskytuje stav objektu ve formátu r:HH;g:HH,b:HH (nebo #HHHHHH), kde HH znamená hexadecimální vyjádření hodnoty barvy.
Jak se jednoduše změní definice třídy (úpravou z BarvaRGB), pokud již nepůjde hodnotu barvy měnit? Dokladujte změnu třídou BarvaRGBb. 
	
Bod ve 2D prostoru může mít navíc informaci o barvě, například bod z barevného obrazu. Bod může měnit polohu o absolutní posun vzhledem k aktulnímu bodu dx, dy. 
Definujte třídu Bod2D_Extend na objektových principech jako potomka třídy Bod2D a doplňujte uvedenou specializaci. Metoda move(dx : double, dy : double) : void. Objekt třídy poskytuje stav objektu ve formátu '[x;y]:#HHHHHH'.
Definujte třídu Bod2Db_Extend na objektových principtech jako potomka třídy Bod2Db a dtto. Jak je nutné úpravit (změnit) definici třídy Bod2Db?
	
Vytvořte instance tříd a pracujte s nimi.    