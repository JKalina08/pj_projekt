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
## 3. Konverze datových typů:  
Nastudujte 
- Jednoduchá konverze mezi číselnými datovými typy a mezi typem char a celočíselným číselným datovým typem. 
- Konverze primitivního datového typu na řetězec, konverze řetězce na primitivní datový typ. 
- Uplatnění konverze v objektech a jeho metodách (.clone, .equals)

**(Úkol):** 
- Realizace operace načtení údaje ze standardního vstupu. Obsluha chybových stavů a ošetření chybového stavu.   
Vytvořte modul (třídu) NacteniHodnot se statickými metodami, které zajistí načtení hodnoty určitého typu ze standardního vstupu.  
Definujte metody pro načtení hodnoty typu: short, int, float, double, String a char. 
Metody pojmenujte například: nacti_short() : Short, nacti_int() : Integer,  
 … Vyzkoušejte funkčnost metod tak, že se hodnota uchová do proměnné datového typu.  
 Jaký je využití toho, že třída vrací proměnnou typu obalovací třídy?