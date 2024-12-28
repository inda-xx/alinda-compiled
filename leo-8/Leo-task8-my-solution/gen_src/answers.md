Exercise 1: 

1. Dataintegritet innebär att den data vi läser från en fil är korrekt och oförändrad, vilket är avgörande för att systemet ska fungera på ett tillförlitligt sätt. Om dataintegriteten inte säkerställs kan informationen bli felaktig eller korrupt, vilket kan leda till buggar, felaktiga beräkningar och i vissa fall även säkerhetsrisker. För att säkerställa dataintegritet används validering och felhantering vid filinläsning, vilket gör att programmet kan hantera oväntade data eller formatfel på ett säkert sätt.

2. - CSV (Comma-Separated Values): Ett enkelt textformat där värden separeras med kommatecken. Det är lätt att läsa och skriva, men saknar stöd för komplex datastruktur och typkontroll. Bra för enklare data, som tabeller.
   - JSON (JavaScript Object Notation): Ett lättviktsformat för strukturerad data som används för att representera objekt och arraystrukturer. JSON är mer flexibelt än CSV och har stöd för inbäddade data. Det är även relativt lätt att läsa och skriva för både människor och datorer.
   - XML (Extensible Markup Language): Ett format som liknar JSON men som är mer robust och stöder komplexa data- och hierarkistrukturer. XML är självbeskrivande och används ofta för att representera mer komplex data. Nackdelen är att det kan vara mer verbost och svårare att läsa för människor.

3. När en applikation ska kunna hantera dynamiskt innehåll som förändras över tid är det mer flexibelt att lagra data i filer. Till exempel, i ett spel som laddar olika nivåer, kan varje nivåkonfiguration lagras i en fil som läses in vid uppstart. På så sätt kan vi ändra nivåns data utan att behöva ändra källkoden. Hårdkodad data kan vara svår att uppdatera och kräver omkompilering av applikationen, medan data i en fil kan uppdateras eller bytas ut enkelt.


 Exercise 2: 

1.  - Enkel ansvarsprincipen (Single Responsibility Principle, SRP): En klass ska endast ha ett enda ansvar, vilket gör den lättare att förstå, underhålla och utöka. Detta minskar beroenden och gör klassen mer flexibel.
   - Öppen/stängd-principen (Open/Closed Principle, OCP): Klasser bör vara öppna för utbyggnad men stängda för förändringar. Det innebär att vi ska kunna lägga till ny funktionalitet utan att behöva ändra existerande kod, vilket minskar risken för buggar i redan testad kod.
   - Liskov Substitution Principle (LSP): Subklasser bör kunna ersätta sina basklasser utan att ändra beteendet i applikationen. Detta säkerställer att arv och polymorfism används korrekt och att klasser kan utbytas på ett säkert sätt.

2. Ett exempel är ett bibliotekssystem. Klasser som skulle kunna ingå i systemet är:
   - Bok: Hanterar information om en bok, som titel, författare och ISBN.
   - Bibliotekarie: Hanterar böcker, lånar ut och tar emot återlämnade böcker.
   - Låntagare: Representerar en person som kan låna böcker från biblioteket.
   - Lån: Representerar själva lånet, inklusive information om låntagarens ID, bokens ID och lånets start- och slutdatum.
   
   Interaktioner kan inkludera att en bibliotekarie lånar ut en bok till en låntagare och skapar en lånepost i systemet. Låntagaren kan se sina aktuella lån och förfallodatum, medan bibliotekarien hanterar boklagret och låneinformationen.

3. Singleton-mönstret är ett designmönster som säkerställer att en klass endast har en enda instans och ger global åtkomst till den instansen. Det används ofta för klasser som hanterar resurser, till exempel en databasanslutning eller ett logger-objekt. I ett bibliotekssystem kan Singleton-mönstret användas för att skapa en enda instans av en Databasanslutning-klass, som alla andra klasser kan använda för att komma åt databasen på ett enhetligt och kontrollerat sätt. Detta sparar resurser och säkerställer att alla dataförfrågningar hanteras via samma anslutning.
Exercise 1: 

1. Dataintegritet innebär att den data vi läser från en fil är korrekt och oförändrad, vilket är avgörande för att systemet ska fungera på ett tillförlitligt sätt. Om dataintegriteten inte säkerställs kan informationen bli felaktig eller korrupt, vilket kan leda till buggar, felaktiga beräkningar och i vissa fall även säkerhetsrisker. För att säkerställa dataintegritet används validering och felhantering vid filinläsning, vilket gör att programmet kan hantera oväntade data eller formatfel på ett säkert sätt.

2. - CSV (Comma-Separated Values): Ett enkelt textformat där värden separeras med kommatecken. Det är lätt att läsa och skriva, men saknar stöd för komplex datastruktur och typkontroll. Bra för enklare data, som tabeller.
   - JSON (JavaScript Object Notation): Ett lättviktsformat för strukturerad data som används för att representera objekt och arraystrukturer. JSON är mer flexibelt än CSV och har stöd för inbäddade data. Det är även relativt lätt att läsa och skriva för både människor och datorer.
   - XML (Extensible Markup Language): Ett format som liknar JSON men som är mer robust och stöder komplexa data- och hierarkistrukturer. XML är självbeskrivande och används ofta för att representera mer komplex data. Nackdelen är att det kan vara mer verbost och svårare att läsa för människor.

3. När en applikation ska kunna hantera dynamiskt innehåll som förändras över tid är det mer flexibelt att lagra data i filer. Till exempel, i ett spel som laddar olika nivåer, kan varje nivåkonfiguration lagras i en fil som läses in vid uppstart. På så sätt kan vi ändra nivåns data utan att behöva ändra källkoden. Hårdkodad data kan vara svår att uppdatera och kräver omkompilering av applikationen, medan data i en fil kan uppdateras eller bytas ut enkelt.


 Exercise 2: 

1.  - Enkel ansvarsprincipen (Single Responsibility Principle, SRP): En klass ska endast ha ett enda ansvar, vilket gör den lättare att förstå, underhålla och utöka. Detta minskar beroenden och gör klassen mer flexibel.
   - Öppen/stängd-principen (Open/Closed Principle, OCP): Klasser bör vara öppna för utbyggnad men stängda för förändringar. Det innebär att vi ska kunna lägga till ny funktionalitet utan att behöva ändra existerande kod, vilket minskar risken för buggar i redan testad kod.
   - Liskov Substitution Principle (LSP): Subklasser bör kunna ersätta sina basklasser utan att ändra beteendet i applikationen. Detta säkerställer att arv och polymorfism används korrekt och att klasser kan utbytas på ett säkert sätt.

2. Ett exempel är ett bibliotekssystem. Klasser som skulle kunna ingå i systemet är:
   - Bok: Hanterar information om en bok, som titel, författare och ISBN.
   - Bibliotekarie: Hanterar böcker, lånar ut och tar emot återlämnade böcker.
   - Låntagare: Representerar en person som kan låna böcker från biblioteket.
   - Lån: Representerar själva lånet, inklusive information om låntagarens ID, bokens ID och lånets start- och slutdatum.
   
   Interaktioner kan inkludera att en bibliotekarie lånar ut en bok till en låntagare och skapar en lånepost i systemet. Låntagaren kan se sina aktuella lån och förfallodatum, medan bibliotekarien hanterar boklagret och låneinformationen.

3. Singleton-mönstret är ett designmönster som säkerställer att en klass endast har en enda instans och ger global åtkomst till den instansen. Det används ofta för klasser som hanterar resurser, till exempel en databasanslutning eller ett logger-objekt. I ett bibliotekssystem kan Singleton-mönstret användas för att skapa en enda instans av en Databasanslutning-klass, som alla andra klasser kan använda för att komma åt databasen på ett enhetligt och kontrollerat sätt. Detta sparar resurser och säkerställer att alla dataförfrågningar hanteras via samma anslutning.

