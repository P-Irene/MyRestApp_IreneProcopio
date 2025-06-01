# README.md

## Descrizione
Quest'applicazione permette ad un utente, dopo aver effettuato l'accesso, di scelezionare da un menù 3 possibili scelte:  
+ **Cerca**: cercare un film attraverso il suo titolo
+ **Guarda**: aprire Netflix per poter guardare i film
+ **Gestione**: CRUD (che ancora non è stata implementata)

## Utilizzo
+ **1ª Activity (LoginActivity)**  
  Questa è la prima activity. L'utente deve accedere utilizzando il proprio username e la propria password. Una volta verificato che i campi siano stati inseriti correttamente, la password dell'utente viene cifrata attraverso il cifraruo di Vigenenère. Dopodiché, cliccando sul bottone sarà possibile aceedere alla seconda Acitivity.  
  ![LoginActivity](https://github.com/user-attachments/assets/429b88ee-ac80-41b5-ad0b-d1cc695fbecd)  


+ **2ª Activity (MenuActivity)**  
  In questa seconda Activity sarà possibile per l'utente selezionare una delle possibili voci del menù.
  + **Search**
  + **Watch**
  + **Dashboard** (dove comparirà un Toast di avviso che la seguente Activity non è stata ancora creata)  
  ![MenuActivity](https://github.com/user-attachments/assets/9d922aca-8279-40c1-ade4-207ebc89b9a0)
  ![DashboardActivity (1)](https://github.com/user-attachments/assets/60549266-52bc-45e3-affa-291ff9feb2e4)  

+ **3ª Activity (SearchActivity)**  
  Quasta terza Activity permette all'utente di cercare dei film attraverso il loro titolo, come in questo esempio:  
  ![SearchActivity](https://github.com/user-attachments/assets/7d45d82e-c105-4fc5-8bb7-4ad7c229601f)  
  Sfruttando una web service RESTful-> [OMDb API](https://www.omdbapi.com/)

+ **4ª Activity (WebViewActivity)**
  In quest'ultima Activity viene aperto il browser Chrome che porterà l'utente al sito di Netflix per poter guaradre comodamente i propri film preferiti.  
  ![WebViewActivity](https://github.com/user-attachments/assets/40c3b8b8-458a-43b8-a447-2b768cb87849)


## Contributi
[SearchActivity - Prof. Amendola](https://github.com/amendola-scuola/FilmSearch.git)  
[WebViewActivity - Prof.ssa Ciuchetti](https://github.com/mciuchetti/MyRESTApp.git)
