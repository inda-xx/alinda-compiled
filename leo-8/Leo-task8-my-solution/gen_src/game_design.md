Game Design Documentation
Spelets titel: KTH Adventure

1. Introduktion
KTH Adventure är ett textbaserat spel där spelaren navigerar genom olika byggnader på KTH-campus och möter olika utmaningar. Målet är att utforska campus och undvika att "förlora" hälsa genom att undvika farliga händelser.
2. Designbeslut
a. Rum och Navigering
Varje byggnad på KTH representeras som ett rum, och spelaren kan navigera mellan dessa rum genom kommandon som go north, go south, osv. Varje rum har en beskrivning och potentiella utgångar som spelaren kan använda för att förflytta sig. 

b. Fiender och Interaktioner
Jag skapade olika "fiender" som representerar typiska studentproblem och stressfaktorer, såsom obligatorisk närvaro klockan 08:00 och resultat som släpps på Canvas. Varje fiende har en viss mängd hälsa och en position i rummet. När spelaren är på samma plats som en fiende, sker en interaktion där spelarens poäng eller hälsa kan påverkas.

c. Poängsystem
Ett enkelt poängsystem lades till för att registrera spelarens prestation. Poängen kan uppdateras när spelaren besegrar en fiende. Vid spelets slut jämförs spelarens poäng med tidigare högsta poäng som lagras i filen scores.txt.

d. Spelets instruktioner
En hjälpsektion (help-kommando) lades till för att ge spelaren information om spelets kommandon, såsom go, move, look, och quit. Hjälptexten visas även i början av spelet.

