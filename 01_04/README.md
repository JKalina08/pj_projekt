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
## 4. Vytvořte program v konzolové aplikaci, který bude simulovat pohyb po šachovnici. Realizace bude provedena na objektových principeh. Definujte třídu HraPosunPoSachovnici, která bude realizovat problém a bude nezávislá na typu uživatelského rozhraní. Třída RealizaceHryKonzola bude realizovat hru v konzolové aplikaci. 
Nejdříve proveďte návrh tříd a následně jejich implementaci. Vstupem bude velikost šachovnice (výška = počet řádků nx, šířka = počet sloupců ny). Aktuální umistění na šachovnici je dáno atributy x, y. Bude umožněno realizovat pohyb vlevo, vpravo, nahoru a dolů. Pokud bude aktuální poloha na okraji šachovnice, nebude možné se posunout ve směru přes okraj. 
Ve výchozím stavu bude poloha [0;0]. Bude zobrazována aktuální poloha ve formě souřadnice a pohyb (historie) bude uchováván v poli. Kdykoliv bude možné získat aktuální historii pohybu. 

V konzolové aplikaci pak bude realizace posunu na základě stisku kláves <L>, <R>, <U>, <D>, Historie pohybu bude vytisknuta při každém posunu. Klávesou <K> bude "hra" ukončena.  
Využijte modul NacteniHodnot realizovaný v předchozím úkolu.  

Pozn: Využijte a použijte vámi definovaný výčtový typ - indikace směru pohybu {left,right,up,down}.   

Jaké bude mít třída HraPosunPoSachovnici atributy a metody?   
Jaké bude mít třída RealizaceHryKonzola atributy a metody?   