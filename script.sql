create table gebruikers
(
    gebruikersID   int auto_increment
        primary key,
    naam           varchar(256) null,
    email          varchar(256) null,
    telefoonnummer int          null,
    wachtwoord     varchar(256) null,
    constraint gebruikers_gebruikersID_uindex
        unique (gebruikersID)
);

create table medewerkers
(
    medewerkID    int auto_increment
        primary key,
    naam          varchar(256) null,
    tussenvoegsel varchar(256) null,
    achternaam    varchar(256) null,
    email         varchar(256) null,
    adres         varchar(256) null,
    postcode      varchar(256) null,
    woonplaats    varchar(256) null,
    constraint medewerkers_medewerkID_uindex
        unique (medewerkID)
);

create table orders
(
    orderID           int auto_increment
        primary key,
    gebruikersID      int          null,
    status            varchar(256) null,
    prebuild          varchar(256) null,
    verzendadress     varchar(256) null,
    verzendpostcode   varchar(256) null,
    verzendwoonplaats varchar(256) null,
    constraint orders_orderID_uindex
        unique (orderID)
);

create table order_Products
(
    ordersID             int null,
    productid_case       int null,
    productid_fan        int null,
    fan_amount           int null,
    productid_cpu        int null,
    productid_cpucooler  int null,
    productid_moederbord int null,
    productid_ram        int null,
    productid_gpu        int null,
    productid_opslag     int null,
    productid_psu        int null,
    kabelsincluded       int null,
    constraint table_name_orders_orderID_fk
        foreign key (ordersID) references orders (orderID)
);

create table producten
(
    productID     int auto_increment
        primary key,
    naam          varchar(256) null,
    typecomponent varchar(256) null,
    merk          varchar(256) null,
    prijs         double       null,
    imgurl        varchar(256) null,
    constraint orders_productID_uindex
        unique (productID)
);


