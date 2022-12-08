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
## 		U3:
Rozšiřte model realizující hru z předchozího cvičení. Hra bude v rámci metody .Execute realizovat dva způsoby realizace hry – ruční ovládání (dle předchozího cvičení) a automatizovaný náhodný pohyb po šachovnici.
Nápověda: Vytvořte abstraktní třídu HraSachovnice s abstraktní metodou .Execute. Třída navíc obsahuje vše, co jsem společné pro dále uvedené specializace tříd.
Potomky HraSachovniceManual a HraSachovniceRandom implementující metodu .Execute. Oba objekty vyzkoušejte. 
V hlavním program vytvořte metodu hra s parametrem objektu třídy HraSachovnice. Tato metoda zajistí spuštění hry objektu předaného parametrem.
Pozn:Automatizovaný náhodný pohyb může být realizován jako sekvence zvoleného počtu kroků (pokusů) nebo stiskem klávesy a <Enter>.
 