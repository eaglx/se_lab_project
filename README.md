# se_lab_project
Software engineering lab project

## Vision of the project
### [EN]
For building administrators who want to optimize the costs of building management, our Building Info application will allow to obtain information about the building's parameters at the level of rooms, storeys and entire buildings. The application will be available through the GUI and also as a remote API so that it can be integrated with existing tools.
### [PL]
Dla administratorów budynków, którzy pragną optymalizować koszty zarządzania budynkami nasza aplikacja Building Info umożliwi pozyskanie informacji o parametrach budynku na poziomie pomieszczeń, kondygnacji oraz całych budynków. Aplikacja będzie dostępna poprzez GUI a także jako zdalne API dzięki czemu można ją zintegrować z istniejącymi narzędziami.

## Design pattern
### [EN]
Composite for the representation of the structure of rooms and for calling operations directly related to the data structure (calculations: area, volume, energy consumption, lighting power). Visitor for reporting functions.
### [PL]
Kompozyt do reprezentacji struktury pomieszczeń oraz wywoływania operacji mających bezpośredni związek ze strukturą danych (obliczenia powierzchni, kubatury, zużycia energii, mocy oświetlenia). Wizytator do funkcji raportujących.

## Information objects
### [EN]
Structure data about the building:
* The location is a building, level, or room
* The building can consist of levels and those of rooms
* Each location is characterized by:
  * id - unique identifier
  * name - optional name of the location
* The room is additionally characterized by:
  * area = area in m ^ 2
  * cube = room volume in m ^ 3
  * heating = level of heating energy consumption (float)
  * light - total lighting power
### [PL]
Struktura danych o budynku:
* Lokacja to budynek, poziom, lub pomieszczenie
* Budynek może składać się z poziomów a te z pomieszczeń
* Każda lokalizacja jest charakteryzowana przez:
  * id – unikalny identyfikator
  * name – opcjonalna nazwa lokalizacji
* Pomieszczenie dodatkowo jest charakteryzowane przez:
  * area = powierzchnia w m^2
  * cube = kubatura pomieszczenia w m^3
  * heating = poziom zużycia energii ogrzewania (float)
  * light – łączna moc oświetlenia
