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
## 	U2: Objekt "nádrže" má stav nádrže, maximální objem (kapacita nádrže), typ obsahu, je umožněno odebírat z nádrže a plnit nádrž. Při odběru nelze odebrat více než je stav nádrže (nelze jít do mínusu), 
	lze doplňovat nádrž v rámci povolené kapacity a vzhledem k aktuálním stavu nádrže. 
	Definujte třídu Nadrz na objektových principech a dle uvedeného popisu. Pro typ obsahu použijme vámi definovaný výčtový typ. Objekt nádrže poskytuje stav objektu ve formátu 'stav/kapacita(míra zaplnění),typ nádrže', 
	kde míra zaplnění je procentuální naplnění nádrže, např. 25 %. Předpokládejme, že kapacita nádrže a aktuální stav nádrže je celým číslem. Adekvátně definujte všechny potřebné metody. Pokus o přeplnění je indikován výjimkou 
	MyException_PlnaNadrz a pokus o nadměrné odebrání je indikován výjimkou MyException_PrazdnaNadrz. Textem výjimky je informace o dotčené nádrži.
	
	todo:něco vedoucí na použití rozhraní
	
	----
	
	Vytvořte kolekci tříd modulu MatematickeFunkce. 
	Definování problému: Uvažujem objekt přímky dané parametry přímky k, q a objekt kvadratick rovnice dané parametry a, b, c. Parametry jsou typu reálné číslo. Objekt přímky a objekt kvadratické rovnice umí spočítat hodnotu y pro x, resp. y = f(x).
	a. Vytvořte abstraktní třídu Funkce s abstraktní metodou metodou double calc_y(double x) a string nazev_objektu(). První metoda má za úkol pro hodnotu x spočítát hodnoty y funkce, druhá metoda vrací označní objektu (např. přímka, kvadratická rovnice, ...).
	b. Vytvořte třídu Funkce_Primka jako potomka třídy Funkce. Třída Funkce_Primka bude mít jako atribut směrnici přímky k a posunutí q (oba atributy typu reálné číslo double), a bude počítat hodnotu y = kx + q v metodě calc_y. 
	Parametry přímky budou inicializovány v konstruktoru podle hodnot předanými do konstruktoru parametry. Již nepůjde měnit parametry objektu přímky. Definujte metodu equals pro porovnání objektů přímek a metodu toString poskytující 
	stav objektu ve tvaru 'f(x) = kx + q'. Označení objektu je uložené v konstantě třídy.
	c. Vytvořte třídu Funkce_Kvadraticka jako potomka třídy Funkce. Třída Funkce_Kvadraticka bude mít jako atribut parametry funkce a, b, c (typu reálné číslo double). V metodě calc_y bude počítat hodnotu y = ax^2 + bx + c. 
	Parametry kvadratické funkce budou inicializovány v metodě konstruktoru. Tato třída bude mít navíc metodu vracející počet kořenů kvadratické rovnice int pocet_korenu() 
	a metodu vracející hodnotu dikrimintantu diskriminant() : double. Definujte metodu equals pro porovnání objektů kvadratické rovnice a metodu toString vracející stav objektu ve formátu 'f(x) = ax^2 + bx + c'. 
	Označení objektu je uložené v konstantě třídy.
		
	Vytvořte instance tříd a pracujte s nimi. Ověřte správnou funkčnost. 
	Přetypujte objekt třídy na rodiče a pracujte s objektem na úrovni rodičovské třídy.    