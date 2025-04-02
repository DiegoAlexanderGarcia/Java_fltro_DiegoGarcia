create database aldeaKonoha;
use aldeaKonoha;

create table Ninja(
ID_Ninja int auto_increment primary key,
Nombre varchar(225) not null,
Rango varchar(225) not null,
Aldea varchar(225)not null
);

create table Mision(
ID_Mision int auto_increment primary key,
Descripcion varchar(225)not null,
Rango varchar(225)not null,
Recompensa int not null
);

create table MisionNinja(
ID int primary key auto_increment,
ID_Ninja int,
ID_Mision int,
Fecha_inicio date,
Fecha_fin date,
foreign key (ID_Ninja) references Ninja(ID_Ninja),
foreign key (ID_Mision) references Mision(ID_Mision)
);

create table Habilidad(
ID int primary key auto_increment,
ID_Ninja int,
Nombre varchar(225) not null,
Descripcion varchar(225),
foreign key (ID_Ninja) references Ninja(ID_Ninja)
);
