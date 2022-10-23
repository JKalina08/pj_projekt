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
## 2. Vytvořte jeden program konzolové aplikace s metodami (static metoda základní třídy) řešící uvedneé problémy:  
    1. Metoda provede pro existujících primitivní datové typy deklaraci proměnné s inicializací. Jaké všechny datové typy jsme identifikovali?
    2. Metoda v přehledové tabulce zobrazí datové typy jazyka Java: název datového typu, název obalovací třídy, velikost proměnné v paměti a to jak v bytech, tak i bitech (použijte atribut obalovací třídy a pro přepočet si nadefinujte vlastní konstantu(!)).U číselných datových typů bude uveden rozsah.
    3. Jaký je výsledek výrazu 6 + 4 a výrazu "" + 6 + 4 ? Vyzkoušejte (ověřte) výsledek v aplikaci, např. s využitím zobrazení výsledků na konzolovém výstupu.
    4. S využitím nástrojů Javy, vytvořte metodu void TiskCislo(int cislo) s celočíselným parametrem. Tato funkce zobrazí hodnotu čísla předaného parametrem v dekadickém tvaru, v binárním tvaru, v hexadecimálním tvaru a v osmičkovém tvaru. Funkci vyzkoušejte na několika číslech zadaných v programu.
    5. Vytvořte statickou třídu s metodami realizující následující problém: "Pro zadaný znak zobrazí jeho ASCII kód a v desítkové (dekadické) a šestnáctkové (hexadecimální) soustavě." 
	    - Vytvořte metodu, která bude mít jako parametr znak a tato metoda zajístí zobrazení potřebných informací. 
	    - Vytvořte metodu, která poskytne návratovou hodnotu sestavený výsledek. 
	    - Upravte první metodu tak, aby využila druhé metody. 
    6. Metoda v přehledová tabulce vytiskne ASCII kódy písmen anglické abecedy (velká a malá písmena) a ASCII kódy znaků cifer (dekadicky a hexadecimálně). A to tak, aby příslušná velká a malá písmena byla na stejném řádku, tedy více sloupcová tabulka. Pozn: použijte pro zarovnání tabulátor a speciální znaky pro orámování "tabulky", které najdeme v ASCII tabulce. Implementaci řešte ve static metodě.
	    - Řešte to přímým tiskem.
	    - Metoda, která sestaví řetězec a vrátí jej v návratové hodnotě. Další metoda s využitím této metody výsledek vytiskne. 
	