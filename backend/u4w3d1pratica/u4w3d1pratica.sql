/*estrarre tutti i clienti di nome Mario*/

select *
from clienti
where nome='Mario';

/*estrarre nome e cognome dei clienti nati nel 1982*/
select nome, cognome
from clienti
where anno_nascita=1982;


/*il numero di fatture con iva al 20%*/
select count(*) as numero_fatture
from fatture
where iva=20;

/*i prodotti in commercio o in produzione con data di attivazione al 2017*/
select *
from prodotti
where (in_commercio=true or in_produzione=true) and extract(year from data_attivazione)=2017;

/*i dati delle fatture con importo inferiore a 1000 e i dati dei clienti corrispondenti*/
select *
from fatture f, clienti c
where f.id_cliente=c.numero_cliente and f.importo<1000;

/*estrarre i dati della fattura con il nome del fornitore*/
select numero_fattura, importo, iva, data_fattura, denominazione
from fatture fa, fornitori fo
where fa.numero_fornitore=fo.numero_fornitore;

/*per ogni anno estrarre il conteggio delle fatture con iva al 20%*/
select extract(year from data_fattura) as anno, count(*) as numero_fatture
from fatture
where iva=20
group by extract(year from data_fattura);

/*il numero di fatture e il totale degli importi delle fatture suddivise per anno*/
select extract(year from data_fattura) as anno, count(*) as numero_fatture, sum(importo) as somma_importi
from fatture
group by extract(year from data_fattura);

/*il numero di fatture di tipologia A suddivise per anno in quantità maggiore di 2*/
select extract(year from data_fattura) as anno, count(*) as numero_fatture
from fatture
where tipologia='A'
group by extract(year from data_fattura)
having count(*)>2;

/*la somma degli importi delle fatture suddivisi per regione di residenza dei clienti*/
select sum(f.importo) as totale_fatture, regione_residenza
from fatture f, clienti c
where f.id_cliente=c.numero_cliente
group by c.regione_residenza;

/*il numero di clienti che hanno fatture con importo >50*/
select count(*)
from clienti c
where c.numero_cliente in(

select distinct f.id_cliente 
from fatture f
where importo>50);
