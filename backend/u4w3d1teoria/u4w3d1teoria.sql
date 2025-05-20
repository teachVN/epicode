/*questa esercitazione della teoria è stata applicata ad un db in cui sono state create le 
tabelle studenti ed esami*/


/* select per estrarre il nome di tutti gli studenti. Il distinct serve
per eliminare eventuali duplicati*/
select distinct nome, cognome
from Studenti;

select nome, cognome
from studenti
where cognome='Bianchi';
/*
* sta per estrai tutti i campi della tabella
*/
select *
from studenti;

select *
from studenti
where cognome='Bianchi' and genere='M';

select *
from studenti
where cognome like 'B%' ;

/*
un cognome che comincia con B ed è lungo 4 caratteri
*/
select *
from studenti
where cognome like 'B______' ;

select *
from studenti
where nome like '%i%' ;

select *
from studenti
where matricola>=1 and matricola<=4;

select *
from studenti
where matricola between 1 and 4;

select *
from studenti
where matricola in (1,3,5);

select *
from studenti
where data_nascita is not null;

/*
funzioni di aggregazione
sum
avg
min
max
count l'unico a non essere obbligatoriamente applicato a tipi numerici

Non possono essere inserite nella where condition
*/

select count(data_nascita) as conta_studenti /* alias è il nome alternativo al campo che comparirà solo nella tabella risutato*/
from studenti;
/* count(*) conta le righe, count(nome del campo) conta tutti i valori diversi da null
*/
select max(matricola)
from studenti;

select min(matricola)
from studenti;

select sum(matricola)
from studenti;

select avg(matricola)
from studenti;

/*la group by suddivide il contenuto della tabella per i valori del campo che indico
nella group by. Le funzioni di aggregazione verranno eseguite su ogni gruppo e non
su tutta la tabella*/
select nome, count(*)
from studenti
group by nome;

select nome, count(*)
from studenti
where nome not like 'S%' /* filtro che viene applicato su tutta la tabella*/
group by nome;

select nome, cognome, count(*)
from studenti
where nome not like 'S%' 
group by nome,cognome
having count(*)>=2; /*la having serve per fare un filtro sui gruppi*/

select *
from studenti
order by nome DESC;
/*
select
from
where
group by
having
order by è sempre l'ultimo comando
*/

