create table NLQC_FREQUENCY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    QUANTITY varchar(255),
    UNIT varchar(255),
    IS_INFINITY_BIG boolean,
    SHOW_TEXT varchar(255),
    NOTE varchar(255),
    --
    primary key (ID)
);