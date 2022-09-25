create table syain (
    id number generated always as identity
    ,name varchar2(20)
    ,romaji varchar2(20)
    ,created_At date
    ,updated_At date
);
insert into syain (name,romaji,created_at,updated_at) values ('寺','てら', sysdate, sysdate);
insert into syain (name,romaji,created_at,updated_at) values ('寺1','てら1', sysdate, sysdate);