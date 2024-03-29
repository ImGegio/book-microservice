# Bookstore
online bookstore simple project

1 - Il Master viene lasciato in uno stato iniziale per vitare EVENTUALI build di pipeline ad ogni aggiornamento. Le features richieste vengono sviluppate in un ramo di questo.

2 - Si potrebbe considerare la creazione di schema dedicati ad ogni microservizio di modo da non interferire negli sviluppi di altri colleghi

3 - Considerare l'utilizzo di controlli di validazione offerti direttamente da springframework

4 - In alcuni metodi dei controller, si può evitare di specificare path diversi in quanto i method sono già differenti fra loro e quindi distinguibili a livello di chiamata http

5 - Mapper creato con BeanUtils, per esigenze piu' specifiche si consideri l'implementazione di Mapstruct

